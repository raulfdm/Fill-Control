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
public class guicheValidation {

    ArrayList<guicheModel> guiche = new ArrayList<guicheModel>();

    //guiche A
    guicheModel ga01 = new guicheModel("ga01", "ga01");
    guicheModel ga02 = new guicheModel("ga02", "ga02");

    //guiche B
    guicheModel gb01 = new guicheModel("gb01", "gb01");
    guicheModel gb02 = new guicheModel("gb02", "gb02");
    guicheModel gb03 = new guicheModel("gb03", "gb03");
    guicheModel gb04 = new guicheModel("gb04", "gb04");
    guicheModel gb05 = new guicheModel("gb05", "gb05");
    guicheModel gb06 = new guicheModel("gb06", "gb06");
    guicheModel gb07 = new guicheModel("gb07", "gb07");
    guicheModel gb08 = new guicheModel("gb08", "gb08");
    guicheModel gb09 = new guicheModel("gb09", "gb09");
    guicheModel gb10 = new guicheModel("gb10", "gb10");

    //guiche C
    guicheModel gc01 = new guicheModel("gc01", "gc01");
    guicheModel gc02 = new guicheModel("gc02", "gc02");
    guicheModel gc03 = new guicheModel("gc03", "gc03");
    guicheModel gc04 = new guicheModel("gc04", "gc04");

    //guiche D
    guicheModel gd01 = new guicheModel("gd01", "gd01");
    guicheModel gd02 = new guicheModel("gd02", "gd02");
    guicheModel gd03 = new guicheModel("gd03", "gd03");

    public void cadastroGuiche() {
        guiche.add(ga01);
        guiche.add(ga02);
        guiche.add(gb01);
        guiche.add(gb02);
        guiche.add(gb03);
        guiche.add(gb04);
        guiche.add(gb05);
        guiche.add(gb06);
        guiche.add(gb07);
        guiche.add(gb08);
        guiche.add(gb09);
        guiche.add(gb10);
        guiche.add(gc01);
        guiche.add(gc02);
        guiche.add(gc03);
        guiche.add(gc04);
        guiche.add(gd01);
        guiche.add(gd02);
        guiche.add(gd03);
    }

    public boolean validarSenha(String usuario, String senha) {
        cadastroGuiche();

        for (guicheModel g : guiche) {
            if (g.getGuiche().toLowerCase().equals(usuario.toLowerCase())
                    && g.getSenha().toLowerCase().equals(senha.toLowerCase())) {
                return true;

            }

        }
        return false;
    }

}
