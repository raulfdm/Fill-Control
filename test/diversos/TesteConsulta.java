/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.jdbc.DataBase;
import br.com.engsoft.utils.utilitarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class TesteConsulta {

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
            System.out.println("OK");

            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String buscarSenhaExistente(char tipoSenha, String data) {
        String senhaMax = "hehe";
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

//                RowId coluna2 = rt.getRowId(0);
//                RowId coluna3 = rt.getRowId(0);
//                RowId coluna4 = rt.getRowId(0);
//                RowId coluna5 = rt.getRowId(0);
//                RowId coluna6 = rt.getRowId(0);
                System.out.println(senhaMax);
            }

            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

        return senhaMax;
    }

    public TesteConsulta() {
    }

    public static void main(String[] args) {

        // new TesteConsulta().gravarSenha("N0002", "B");
        //new TesteConsulta().buscarSenhaExistente('N', new utilitarios().dataAtual("24/11/2015"));
        String senha = "N0002";
        int valor = Integer.parseInt(senha.substring(1, senha.length()));
        System.out.println(valor);
    }

}
