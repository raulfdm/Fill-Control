package br.com.engsoft.controll;

import br.com.engsoft.jdbc.DataBase;
import br.com.engsoft.main.refactor.TelaGuichePadrao;
import static br.com.engsoft.main.refactor.TelaGuichePadrao.guicheAtendente;
import static br.com.engsoft.main.refactor.TelaGuichePadrao.sc;
import static br.com.engsoft.main.refactor.TelaGuichePadrao.senhaAtual;
import static br.com.engsoft.main.refactor.TelaGuichePadrao.txtSenhaAtual;
import br.com.engsoft.main.refactor.TelaPainel;
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
    static public ArrayList<FilaAtendimento> filaPainel = new ArrayList<>();

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
            return gerarSenhaN();
        } else {
            int valor = Integer.parseInt(senhaExistente.substring(1, senhaExistente.length()));
            senhaN = valor;
            senhaN++;
            return gerarSenhaN();
        }

    }

    public void tranfereGuicheC(String senha, String data) {
        String sql = "update senha set guicheatendimento = 'C0', status = 'PENDENTE' where senha = ? "
                + "and datageracao = ?";

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, senha);
            st.setString(2, data);
            st.executeUpdate();
            
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tranfereGuicheD(String senha, String data) {

        String sql = "update senha set guicheatendimento = 'D0', status = 'PENDENTE' where senha = ? "
                + "and datageracao = ?";

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, senha);
            st.setString(2, data);
            st.executeUpdate();
            
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gravarSenha(String senha, String guiche, int normal) {
        String sql = "insert into senha (senha,datageracao,guicheatendimento,status,normal,presenca)"
                + "values (?,?,?,?,?,?)";
        
        Connection con;
        PreparedStatement st;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, senha);
            st.setString(2, new utilitarios().dataAtual("dd/MM/yyyy"));
            st.setString(3, guiche + 0);
            st.setString(4, "PENDENTE");
            st.setInt(5, normal);
            st.setInt(6, 0);

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
        String guicheAtendimento = "B";
        int normal = 1;        

        if (String.valueOf(senhaN).length() == 1) {
            senhaGerada = "N000" + senhaN;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 2) {
            senhaGerada = "N00" + senhaN;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 3) {
            senhaGerada = "N0" + senhaN;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaN).length() == 4) {
            senhaGerada = "N" + senhaN;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
            return null;
        }
    }

    public String gerarSenhaP() {
        String senhaGerada;
        String guicheAtendimento = "B";
        int normal = 0;       

        if (String.valueOf(senhaP).length() == 1) {
            senhaGerada = "P000" + senhaP;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 2) {
            senhaGerada = "P00" + senhaP;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 3) {
            senhaGerada = "P0" + senhaP;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else if (String.valueOf(senhaP).length() == 4) {
            senhaGerada = "P" + senhaP;
            gravarSenha(senhaGerada, guicheAtendimento, normal);
            return senhaGerada;
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
            return null;
        }
    }

    public FilaAtendimento chamarProximoCliente(String guiche, String data, long idSenha) throws SQLException {

        String sqlBuscaSenha = "select * from (select * from senha where guicheatendimento = '" + guiche.charAt(0) + "0' "
                + "and status = 'PENDENTE' "
                + "and datageracao = '" + data + "'"
                + "and presenca = 0" 
                + "order by normal desc) where rownum = 1";

        FilaAtendimento senhaC = new FilaAtendimento();

        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();

            st.execute(sqlBuscaSenha);
            ResultSet rt = st.getResultSet();

            while (rt.next()) {
                senhaC.setIdSenha(rt.getLong("idsenha"));
                senhaC.setSenha(rt.getString("senha"));
                senhaC.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaC.setStatusAtendimento(rt.getString("status"));
                System.out.println(senhaC.toString());
                alterarAtendente(senhaC.getIdSenha(), TelaGuichePadrao.guicheAtendente);
                return senhaC;
            }

            rt.close();
            st.close();
            con.close();

            return senhaC;
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void finalizaAtendimento(String senha, String data) {
        String sql = "update senha set status = 'FINALIZADO' where senha = ? "
                + "and datageracao = ?";

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, senha);
            st.setString(2, data);
            st.executeUpdate();
            
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void chamaProximoFila(String senhaAtual) throws SQLException {
        if ("".equals(senhaAtual.trim())) {
            if (TelaGuichePadrao.emPausa == false) {
                sc = new ControleDeFila().chamarProximoCliente(guicheAtendente, new utilitarios().dataAtual("dd/MM/yyyy"),
                        sc.getIdSenha());
                senhaAtual = sc.getSenha();
                if (senhaAtual != null) {
                    TelaGuichePadrao.senhaAtual = senhaAtual;
                    txtSenhaAtual.setText(senhaAtual);
                } else {
                    System.out.println("NÃO TEM CLIENTE");
                }
            }
        }
    }

    public void chamarPainelCliente(String data) throws SQLException {
        String guiche = TelaPainel.painelGuiche;
        String guicheZero = String.valueOf(guiche) + 0;
        
        String sqlSenhaAtendimento = "select * from senha where datageracao = '" + data
                + "' and guicheatendimento like '" + guiche
                + "%' and guicheatendimento <> '" + guicheZero
                + "' and status = 'ATENDIMENTO'"
                + "and rownum<2"
                + "order by normal desc;";

        String sqlSenhaProxima = "select * from senha where datageracao = '" + data
                + "' and guicheatendimento = '" + guicheZero
                + "' and status = 'PENDENTE'"
                + "and rownum<2"
                + "order by normal desc;";

        FilaAtendimento senhaAtendimento = new FilaAtendimento();
        FilaAtendimento senhaProxima = new FilaAtendimento();

        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();

            st.execute(sqlSenhaAtendimento);
            ResultSet rt = st.getResultSet();            

            while (rt.next()) {
                senhaAtendimento.setIdSenha(rt.getLong("idsenha"));
                senhaAtendimento.setSenha(rt.getString("senha"));
                senhaAtendimento.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaAtendimento.setStatusAtendimento(rt.getString("status"));
                filaPainel.add(senhaAtendimento);
                TelaPainel.lblNumSenha.setText(senhaAtendimento.getSenha());
                TelaPainel.lblNumGuiche.setText(senhaAtendimento.getGuicheAtendimento());
            }

            st.execute(sqlSenhaProxima);
            rt = st.getResultSet();            
            while (rt.next()) {
                senhaProxima.setIdSenha(rt.getLong("idsenha"));
                senhaProxima.setSenha(rt.getString("senha"));
                senhaProxima.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaProxima.setStatusAtendimento(rt.getString("status"));
                filaPainel.add(senhaProxima);
                TelaPainel.lblNumProxSenha.setText(senhaProxima.getSenha());
            }

            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private int pegaNumFila(String guicheAtendimento) {
        String sqlBuscaSenha = "select max(fila) from senha where guicheatendimento = '" + guicheAtendimento + "' and fila is not null";
        int filaAtual = 0;

        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();

            st.execute(sqlBuscaSenha);
            ResultSet rt = st.getResultSet();

            while (rt.next()) {
                filaAtual = rt.getInt(1);
            }

            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filaAtual;
    }

    private void alterarAtendente(long idSenha, String guicheAtendente) {
        String sql = "update senha set guicheatendimento = ?, status = ? where idsenha = ? ";        
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, guicheAtendente);
            st.setString(2,"ATENDIMENTO");
            st.setLong(3, idSenha);
            st.executeUpdate();

            
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void confirmarPresenca(String senha) {
        String sql = "update senha set presenca = ? where senha = ? ";
        
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1, 1);
            st.setString(2,senha);
            
            st.executeUpdate();
            
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
