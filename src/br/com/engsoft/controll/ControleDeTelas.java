/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import br.com.engsoft.main.refactor.TelaGuicheA;
import br.com.engsoft.main.refactor.TelaGuichePadrao;
import br.com.engsoft.main.refactor.TelaAdministrativa;
import br.com.engsoft.main.refactor.TelaModulos;
import br.com.engsoft.main.refactor.TelaLogin;

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
            TelaGuicheA ga = new TelaGuicheA();
            ga.setVisible(true);
            f.setVisible(false);
            ga.lblNomeAtendente.setText(atendente);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirTelaAdm(javax.swing.JFrame f) {
        try {
            TelaAdministrativa ci = new TelaAdministrativa();
            ci.setVisible(true);
            f.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirGuicheDefault(javax.swing.JFrame f, String titulo, String atendente, String guiche) {
        try {
            TelaGuichePadrao gp = new TelaGuichePadrao();
            gp.setVisible(true);
            f.setVisible(false);
            if (guiche == "D") {
                gp.btnTransferir.setEnabled(false);
            }
            gp.guicheAtendente = guiche;
            gp.lblTitulo.setText(titulo);
            gp.lblNomeAtendente.setText(atendente);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void abrirSelecionaOperacao(javax.swing.JFrame f, UsuarioModelo m) {
        try {
            TelaModulos so = new TelaModulos();
            getOperacoesPermitidas(so, m);
            so.setVisible(true);
            f.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getOperacoesPermitidas(TelaModulos at, UsuarioModelo m) {
        if (m.getAdmin() == 'S') {
            at.rbtnAdministrador.setEnabled(true);
        }
        if (m.getGuicheA() == 'S') {
            at.rbtnGuicheA.setEnabled(true);
        }
        if (m.getGuicheB() == 'S') {
            at.rbtnGuicheB.setEnabled(true);
        }
        if (m.getGuicheC() == 'S') {
            at.rbtnGuicheC.setEnabled(true);
        }
        if (m.getGuicheD() == 'S') {
            at.rbtnGuicheD.setEnabled(true);
        }
    }

}
