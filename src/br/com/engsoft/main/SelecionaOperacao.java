/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.main;

import javax.swing.JFrame;
import br.com.engsoft.controll.ControleDeTelas;
import javax.swing.UIManager;

/**
 *
 * @author Raul
 */
public class SelecionaOperacao extends javax.swing.JFrame {

    ControleDeTelas controleTela = new ControleDeTelas();

    public SelecionaOperacao() {
        initComponents();
        configuracaoTela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        rbtnAdministrador = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnGuicheA = new javax.swing.JRadioButton();
        rbtnGuicheC = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnGuicheB = new javax.swing.JRadioButton();
        rbtnGuicheD = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Selecione o módulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 5, 0);
        getContentPane().add(lblTitulo, gridBagConstraints);

        buttonGroup1.add(rbtnAdministrador);
        rbtnAdministrador.setText("Administrador");
        rbtnAdministrador.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 0);
        getContentPane().add(rbtnAdministrador, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(rbtnGuicheA);
        rbtnGuicheA.setText("Guichê A");
        rbtnGuicheA.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(rbtnGuicheA, gridBagConstraints);

        buttonGroup1.add(rbtnGuicheC);
        rbtnGuicheC.setText("Guichê C");
        rbtnGuicheC.setEnabled(false);
        rbtnGuicheC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGuicheCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(rbtnGuicheC, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 8);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(rbtnGuicheB);
        rbtnGuicheB.setText("Guichê B");
        rbtnGuicheB.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(rbtnGuicheB, gridBagConstraints);

        buttonGroup1.add(rbtnGuicheD);
        rbtnGuicheD.setText("Guichê D");
        rbtnGuicheD.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(rbtnGuicheD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel3.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 8);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel4.add(btnVoltar, gridBagConstraints);

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel4.add(btnAbrir, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 7, 6);
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnGuicheCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGuicheCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnGuicheCActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (rbtnAdministrador.isSelected()) {
            controleTela.abrirTelaAdm(this);
        } else if (rbtnGuicheA.isSelected()) {
            controleTela.abrirGuicheA(this, TelaLogin.atendente);
        } else if (rbtnGuicheB.isSelected()) {
            controleTela.abrirGuicheDefault(this, "ATENDENTE B", TelaLogin.atendente);
        } else if (rbtnGuicheC.isSelected()) {
            controleTela.abrirGuicheDefault(this, "ATENDENTE C", TelaLogin.atendente);
        } else if (rbtnGuicheD.isSelected()) {
            controleTela.abrirGuicheDefault(this, "ATENDENTE D", TelaLogin.atendente);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        controleTela.abrirLogin(this);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                break;

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelecionaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SelecionaOperacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JRadioButton rbtnAdministrador;
    public javax.swing.JRadioButton rbtnGuicheA;
    public javax.swing.JRadioButton rbtnGuicheB;
    public javax.swing.JRadioButton rbtnGuicheC;
    public javax.swing.JRadioButton rbtnGuicheD;
    // End of variables declaration//GEN-END:variables

    private void configuracaoTela() {
        //Bloqueia o redimensionamento
        this.setResizable(false);
        //Coloca o jframe no centro
        this.setLocationRelativeTo(null);
        //Fechar toda a Aplicação ao clicar no botão Fechar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
