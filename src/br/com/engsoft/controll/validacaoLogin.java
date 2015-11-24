/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class validacaoLogin {

    String usuario;
    String senha;
    UsuarioModelo m = new UsuarioModelo();

    public void cadastroGuiche() {

    }

    public UsuarioModelo validarSenha(String usuario, String senha) {
        String sql = "select * from usuario where usuario = '" + usuario
                + "' and senha = '" + senha + "'";
       
        Connection con;
        Statement st;

        try {
            con = DataBase.getConnection();
            st = con.createStatement();
            st.execute(sql);
            ResultSet rt = st.getResultSet();

            while (rt.next()) {
                long idusuario = rt.getLong("idusuario");
                String usuarioBanco = rt.getString("usuario");
                String senhaBanco = rt.getString("senha");
                String admin = rt.getString("adm");
                String guicheA = rt.getString("guichea");
                String guicheB = rt.getString("guicheb");
                String guicheC = rt.getString("guichec");
                String guicheD = rt.getString("guiched");

                if (usuarioBanco.equals(usuario) && senhaBanco.equals(senha)) {
                    m.setIdusuario(idusuario);
                    m.setUsuario(usuario);
                    m.setSenha(senha);
                    m.setAdmin(admin.charAt(0));
                    m.setGuicheA(guicheA.charAt(0));
                    m.setGuicheB(guicheB.charAt(0));
                    m.setGuicheC(guicheC.charAt(0));
                    m.setGuicheD(guicheD.charAt(0));
                    m.setValidado(true);
                    return m;
                } else {                    
                    JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos");
                }

            }

            rt.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDeFila.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

}
