/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.controll.FilaAtendimento;
import br.com.engsoft.jdbc.DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.main.refactor.TelaPainel;

/**
 *
 * @author Raul
 */
public class TestePainel {

    static public ArrayList<FilaAtendimento> filaPainel = new ArrayList<>();
    public String senhaEmAtendimento;
    public String senhaProxima;

    public void alterarPainel() {

    }

    public String pegarSenhaAtendimento() {

        return null;
    }

    public String pegarSenhaProximo() {

        return null;
    }

    public void pegarSenhaPainel(String data, String guiche) {
        String guicheZero = String.valueOf(guiche.charAt(0)) + 0;
        String sqlSenhaAtendimento = "select * from senha where datageracao = '" + data
                + "' and guicheatendimento like '" + String.valueOf(guiche.charAt(0))
                + "%' and guicheatendimento <> '" + guicheZero
                + "' and status = 'ATENDIMENTO'"
                + "and rownum<2"
                + "order by prioritario desc;";

        String sqlSenhaProxima = "select * from senha where datageracao = '" + data
                + "' and guicheatendimento = '" + guicheZero
                + "' and status = 'ATENDIMENTO'"
                + "and rownum<2"
                + "order by prioritario desc;";

        FilaAtendimento senhaAtendimento = new FilaAtendimento();
        FilaAtendimento senhaProxima = new FilaAtendimento();

        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();

            st.execute(sqlSenhaAtendimento);
            ResultSet rt = st.getResultSet();
            System.out.println(sqlSenhaAtendimento);

            while (rt.next()) {
                senhaAtendimento.setIdSenha(rt.getLong("idsenha"));
                senhaAtendimento.setSenha(rt.getString("senha"));
                senhaAtendimento.setGuicheAtendimento(rt.getString("guicheatendimento"));
                senhaAtendimento.setStatusAtendimento(rt.getString("status"));
                filaPainel.add(senhaAtendimento);
                this.senhaEmAtendimento = senhaAtendimento.getSenha();
            }

            st.execute(sqlSenhaProxima);
            rt = st.getResultSet();
            System.out.println(sqlSenhaProxima);
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

    public static void main(String[] args) throws SQLException {

        TestePainel tp = new TestePainel();

        tp.pegarSenhaPainel("29/11/2015", "B1");
        for (int i = 0; i < filaPainel.size(); i++) {
            System.out.println(filaPainel.get(i).toString());
        }

//        ControleDeFila c = new ControleDeFila();
//        FilaAtendimento d = new FilaAtendimento();
//        d = c.chamarProximoCliente("B1", "29/11/2015", 0);
//        System.out.println(d.toString());
        
        

    }
}
