/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.controll.FilaAtendimento;
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
            rt.getRow();

//                RowId coluna2 = rt.getRowId(0);
//                RowId coluna3 = rt.getRowId(0);
//                RowId coluna4 = rt.getRowId(0);
//                RowId coluna5 = rt.getRowId(0);
//                RowId coluna6 = rt.getRowId(0);
            }


            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }

        return senhaMax;
    }

    private FilaAtendimento chamarProximoCliente(char guiche, String data) throws SQLException {

        String sqlN = "select * from senha where guicheatendimento = '" + guiche + "' "
                + "and status like 'ATENDIMENTO'and datageracao = '" + data + "' and "
                + "senha like '%N%' and rownum = 1 group by idsenha, senha";

        String sqlP = "select * from senha where guicheatendimento = '" + guiche + "' "
                + "and status like 'ATENDIMENTO'and datageracao = '" + data + "' and "
                + "senha like '%P%' and rownum = 1 group by idsenha, senha";

        FilaAtendimento senhaC = new FilaAtendimento();
        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();

            st.execute(sqlP);
            ResultSet rt = st.getResultSet();
           
            while (rt.next()) {                
                senhaC.setIdSenha(rt.getLong("idsenha"));
                senhaC.setSenha(rt.getString("senha"));
                senhaC.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaC.setStatusAtendimento(rt.getString("status"));
                System.out.println(senhaC.toString());
                return senhaC;
            }

            st.execute(sqlN);
            rt = st.getResultSet();
            while (rt.next()) {
                senhaC.setIdSenha(rt.getLong("idsenha"));
                senhaC.setSenha(rt.getString("senha"));
                senhaC.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaC.setStatusAtendimento(rt.getString("status"));
                System.out.println(senhaC.toString());
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

    public void tranfereGuicheC(String senha, String data) {
        String sql = "update senha set guicheatendimento = 'C' where senha = ? "
                + "and datageracao = ?";

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DataBase.getConnection();
            st = con.prepareStatement(sql);

            st.setString(1, senha);
            st.setString(2, data);
            st.executeUpdate();

            //System.out.println(resultado);
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void finaliza(String senha, String data) {
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

            //System.out.println(resultado);
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TesteConsulta() {
    }

    public static void main(String[] args) throws SQLException {

        // new TesteConsulta().gravarSenha("N0002", "B");
        //new TesteConsulta().buscarSenhaExistente('N', new utilitarios().dataAtual("dd/MM/yyyy"));
        //String senha = "N0002";
        //int valor = Integer.parseInt(senha.substring(1, senha.length()));
        //System.out.println(valor);
      // senhasControl senhaC = new senhasControl();
        //senhaC = new TesteConsulta().chamarProximoCliente('B', new utilitarios().dataAtual("dd/MM/yyyy"));
        
        // String n = "atendente B";
        //System.out.println(n.charAt(10));

         new TesteConsulta().finaliza("N0003", "25/11/2015");
    }

}
