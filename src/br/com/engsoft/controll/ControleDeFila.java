package br.com.engsoft.controll;

import br.com.engsoft.jdbc.DataBase;
import br.com.engsoft.utils.utilitarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raul
 */
public class ControleDeFila {

    //Atributos Iniciais da senha
    String senhaPreferencial;
    String senhaNormal;
    Integer senhaP = 0;
    Integer senhaN = 0;

    //FILAS
    protected ArrayList<String> filaNormal = new ArrayList();
    protected ArrayList<String> filaPreferencial = new ArrayList();
    //Transferencias de fila
    protected ArrayList<String> filaGuicheB = new ArrayList();
    protected ArrayList<String> filaGuicheC = new ArrayList();
    protected ArrayList<String> filaGuicheD = new ArrayList();
    protected ArrayList<String> filaAtendida = new ArrayList();

    //Constrole de Filas
    int tamanhoFilaNormal;
    int tamanhoFilaPreferencial;
    int tamanhoFilaGuicheB;
    int tamanhoFilaGuicheC;
    int tamanhoFilaGuicheD;

    //CONSTRUTOR
    public ControleDeFila() {

    }

    //GETTERS AND SETTERS
    public ArrayList<String> getFilaNormal() {
        return filaNormal;
    }

    public ArrayList<String> getFilaPreferencial() {
        return filaPreferencial;
    }

    public ArrayList<String> getFilaAtendida() {
        return filaAtendida;
    }

    public ArrayList<String> getFilaGuicheB() {
        return filaGuicheB;
    }

    public String proximoDaFila() {

        return null;
    }

    public int getIndexNormal() {
        return filaNormal.indexOf(this);
    }

    public int getTamanhoFilaNormal() {
        return tamanhoFilaNormal;
    }

    public int getTamanhoFilaPreferencial() {
        return tamanhoFilaPreferencial;
    }

    public int getTamanhoFilaB() {
        return tamanhoFilaGuicheB;
    }

    public int getTamanhoFilaC() {
        return tamanhoFilaGuicheC;
    }

    public int getTamanhoFilaD() {
        return tamanhoFilaGuicheD;
    }

    //FIM GETTERS AND SETTERS
    //MÉTODOS
    public String gerarSenhaPreferencial() {
        String senhaExistente = buscarSenhaExistente('P', new utilitarios().dataAtual("dd/MM/yyyy"));

        if (senhaExistente == null || senhaExistente.equals("")) {
            senhaP++;            
            return gerarSenhaP();
        } else {
            int valor = Integer.parseInt(senhaExistente.substring(1, senhaExistente.length()));
            senhaP = valor;
            senhaP++;
            return gerarSenhaP();
        }

    }

    public String gerarSenhaNormal() {
        String senhaExistente = buscarSenhaExistente('N', new utilitarios().dataAtual("dd/MM/yyyy"));

        if (senhaExistente == null || senhaExistente.equals("")) {
            senhaN++;
            tamanhoFilaNormal++;
            return gerarSenhaN();
        } else {
            int valor = Integer.parseInt(senhaExistente.substring(1, senhaExistente.length()));
            senhaN = valor;
            senhaN++;
            return gerarSenhaN();
        }

    }

    public void tranfereGuicheB() {
        if (filaPreferencial.isEmpty() != true) {
            while (filaPreferencial.isEmpty() != true) {
                String senha;
                senha = filaPreferencial.get(0);
                filaGuicheB.add(senha);
                filaPreferencial.remove(0);
                tamanhoFilaPreferencial--;
                tamanhoFilaGuicheB++;
            }
        } else if (filaNormal.isEmpty() != true) {
            while (filaNormal.isEmpty() != true) {
                String senha;
                senha = filaNormal.get(0);
                filaGuicheB.add(senha);
                filaNormal.remove(0);
                tamanhoFilaNormal--;
                tamanhoFilaGuicheB++;
            }
        }

    }

    public void tranfereGuicheC(String senha) {
        for (int i = 0; i < filaGuicheB.size(); i++) {

            if (filaGuicheB.get(i).equals(senha)) {
                filaGuicheB.remove(i);
                filaGuicheC.add(senha);
                tamanhoFilaGuicheB--;
                tamanhoFilaGuicheC++;
            }
        }
    }

    public void tranfereGuicheD(String senha) {

        for (int i = 0; i < filaGuicheC.size(); i++) {

            if (filaGuicheC.get(i).equals(senha)) {
                filaGuicheC.remove(i);
                filaGuicheD.add(senha);
                tamanhoFilaGuicheC--;
                tamanhoFilaGuicheD++;
            }
        }
    }

    public void fimDoAtendimento(String senha) {
        for (int posicao = 0; posicao < tamanhoFilaNormal; posicao++) {
            if (filaNormal.get(posicao).equals(senha)) {
                filaNormal.remove(posicao);
                tamanhoFilaNormal--;
                filaAtendida.add(senha);
            }
        }

    }

    public void gravarSenha(String senha, String guiche) {
        String sql = "insert into senha (senha,datageracao,horageracao,guicheatendimento,status) values "
                + "(?,?,?,?,?)";

        Connection con;
        PreparedStatement st;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, senha);
            st.setString(2, new utilitarios().dataAtual("dd/MM/yyyy"));
            st.setString(3, new utilitarios().dataAtual("HH:mm:ss"));
            st.setString(4, guiche);
            st.setString(5, "ATENDIMENTO");

            st.execute();

            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String buscarSenhaExistente(char tipoSenha, String data) {
        String senhaMax = null;
        String sql = "select max(senha) from senha where senha like '" + tipoSenha
                + "%' and datageracao = '" + data + "'";

        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();
            st.execute(sql);
            ResultSet rt = st.getResultSet();

            while (rt.next()) {
                senhaMax = rt.getString(1);
            }

            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

        return senhaMax;
    }

    public String gerarSenhaN() {
        String senhaGerada;
        if (String.valueOf(senhaN).length() == 1) {
            senhaGerada = "N000" + senhaN;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 2) {
            senhaGerada = "N00" + senhaN;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 3) {
            senhaGerada = "N0" + senhaN;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 4) {
            senhaGerada = "N" + senhaN;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
            return null;
        }
    }
    
    public String gerarSenhaP() {
        String senhaGerada;
        if (String.valueOf(senhaP).length() == 1) {
            senhaGerada = "P000" + senhaP;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 2) {
            senhaGerada = "P00" + senhaP;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 3) {
            senhaGerada = "P0" + senhaP;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 4) {
            senhaGerada = "P" + senhaP;
            gravarSenha(senhaGerada, "B");
            return senhaGerada;
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
            return null;
        }
    }
}
