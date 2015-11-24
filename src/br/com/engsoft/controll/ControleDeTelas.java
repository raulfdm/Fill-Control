/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import br.com.engsoft.main.GuicheA;
import br.com.engsoft.main.GuicheDefault;
import br.com.engsoft.main.IndexView;
import br.com.engsoft.main.SelecionaOperacao;
import br.com.engsoft.main.TelaLogin;

/**
 *
 * @author Raul
 */
public class ControleDeTelas {

    public void abrirLogin(javax.swing.JFrame f) {
        try {
            TelaLogin tl = new TelaLogin();
            tl.setVisible(true);
            f.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirGuicheA(javax.swing.JFrame f, String atendente) {
        try {
            GuicheA ga = new GuicheA();
            ga.setVisible(true);
            f.setVisible(false);
            ga.lblNomeAtendente.setText(atendente);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirTelaAdm(javax.swing.JFrame f) {
        try {
            IndexView ci = new IndexView();
            ci.setVisible(true);
            f.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirGuicheDefault(javax.swing.JFrame f, String titulo, String atendente) {
        try {
            GuicheDefault gd = new GuicheDefault();
            gd.setVisible(true);
            f.setVisible(false);
            gd.lblTitulo.setText(titulo);
            gd.lblNomeAtendente.setText(atendente);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirSelecionaOperacao(javax.swing.JFrame f) {
        try {
            SelecionaOperacao so = new SelecionaOperacao();
            so.setVisible(true);
            f.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
