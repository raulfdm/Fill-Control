/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class validacaoLogin {

    ArrayList<login> usuariosCadastrados = new ArrayList<login>();

    //usuariosCadastrados A
    login usu01 = new login("admin", "admin");

    //usuariosCadastrados A
    login ga01 = new login("ga01", "ga01");
    login ga02 = new login("ga02", "ga02");

    //usuariosCadastrados B
    login gb01 = new login("gb01", "gb01");
    login gb02 = new login("gb02", "gb02");
    login gb03 = new login("gb03", "gb03");
    login gb04 = new login("gb04", "gb04");
    login gb05 = new login("gb05", "gb05");
    login gb06 = new login("gb06", "gb06");
    login gb07 = new login("gb07", "gb07");
    login gb08 = new login("gb08", "gb08");
    login gb09 = new login("gb09", "gb09");
    login gb10 = new login("gb10", "gb10");

    //usuariosCadastrados C
    login gc01 = new login("gc01", "gc01");
    login gc02 = new login("gc02", "gc02");
    login gc03 = new login("gc03", "gc03");
    login gc04 = new login("gc04", "gc04");

    //usuariosCadastrados D
    login gd01 = new login("gd01", "gd01");
    login gd02 = new login("gd02", "gd02");
    login gd03 = new login("gd03", "gd03");

    public void cadastroGuiche() {
        usuariosCadastrados.add(usu01);
        usuariosCadastrados.add(ga01);
        usuariosCadastrados.add(ga02);
        usuariosCadastrados.add(gb01);
        usuariosCadastrados.add(gb02);
        usuariosCadastrados.add(gb03);
        usuariosCadastrados.add(gb04);
        usuariosCadastrados.add(gb05);
        usuariosCadastrados.add(gb06);
        usuariosCadastrados.add(gb07);
        usuariosCadastrados.add(gb08);
        usuariosCadastrados.add(gb09);
        usuariosCadastrados.add(gb10);
        usuariosCadastrados.add(gc01);
        usuariosCadastrados.add(gc02);
        usuariosCadastrados.add(gc03);
        usuariosCadastrados.add(gc04);
        usuariosCadastrados.add(gd01);
        usuariosCadastrados.add(gd02);
        usuariosCadastrados.add(gd03);

    }

    public boolean validarSenha(String usuario, String senha) {
        cadastroGuiche();

        for (login g : usuariosCadastrados) {
            if (g.getUsuario().toLowerCase().equals(usuario.toLowerCase())
                    && g.getSenha().toLowerCase().equals(senha.toLowerCase())) {
                return true;

            }

        }
        return false;
    }
    
}
