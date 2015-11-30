/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.main.refactor;

import javax.swing.JFrame;
import br.com.engsoft.controll.ControleDeTelas;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Raul
 */
public class TelaModulos extends javax.swing.JFrame {

    ControleDeTelas controleTela = new ControleDeTelas();

    public TelaModulos() {
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

        gbtnTelas = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        rbtnAdministrador = new javax.swing.JRadioButton();
        rbtnGuicheA = new javax.swing.JRadioButton();
        cbbGuicheA = new javax.swing.JComboBox<>();
        rbtnGuicheB = new javax.swing.JRadioButton();
        cbbGuicheB = new javax.swing.JComboBox<>();
        rbtnGuicheC = new javax.swing.JRadioButton();
        cbbGuicheC = new javax.swing.JComboBox<>();
        rbtnGuicheD = new javax.swing.JRadioButton();
        cbbGuicheD = new javax.swing.JComboBox<>();
        btnAbrir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/engsoft/img/logo64.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        lblTitulo.setText("Selecione o módulo:");

        rbtnAdministrador.setBackground(new java.awt.Color(211, 211, 211));
        gbtnTelas.add(rbtnAdministrador);
        rbtnAdministrador.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        rbtnAdministrador.setText("Administrador");
        rbtnAdministrador.setEnabled(false);

        rbtnGuicheA.setBackground(new java.awt.Color(211, 211, 211));
        gbtnTelas.add(rbtnGuicheA);
        rbtnGuicheA.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        rbtnGuicheA.setText("Guichê A");
        rbtnGuicheA.setEnabled(false);

        cbbGuicheA.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        cbbGuicheA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cbbGuicheA.setEnabled(false);
        cbbGuicheA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGuicheAActionPerformed(evt);
            }
        });

        rbtnGuicheB.setBackground(new java.awt.Color(211, 211, 211));
        gbtnTelas.add(rbtnGuicheB);
        rbtnGuicheB.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        rbtnGuicheB.setText("Guichê B");
        rbtnGuicheB.setEnabled(false);

        cbbGuicheB.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        cbbGuicheB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbbGuicheB.setEnabled(false);

        rbtnGuicheC.setBackground(new java.awt.Color(211, 211, 211));
        gbtnTelas.add(rbtnGuicheC);
        rbtnGuicheC.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        rbtnGuicheC.setText("Guichê C");
        rbtnGuicheC.setEnabled(false);
        rbtnGuicheC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGuicheCActionPerformed(evt);
            }
        });

        cbbGuicheC.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        cbbGuicheC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbbGuicheC.setEnabled(false);
        cbbGuicheC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGuicheCActionPerformed(evt);
            }
        });

        rbtnGuicheD.setBackground(new java.awt.Color(211, 211, 211));
        gbtnTelas.add(rbtnGuicheD);
        rbtnGuicheD.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        rbtnGuicheD.setText("Guichê D");
        rbtnGuicheD.setEnabled(false);

        cbbGuicheD.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        cbbGuicheD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cbbGuicheD.setEnabled(false);
        cbbGuicheD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGuicheDActionPerformed(evt);
            }
        });

        btnAbrir.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnGuicheD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbGuicheD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAbrir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnGuicheC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbGuicheC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnGuicheB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbGuicheB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbtnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbtnGuicheA)
                                    .addGap(5, 5, 5)
                                    .addComponent(cbbGuicheA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblLogo)
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnAdministrador)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnGuicheA)
                    .addComponent(cbbGuicheA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnGuicheB)
                    .addComponent(cbbGuicheB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnGuicheC)
                    .addComponent(cbbGuicheC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbGuicheD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnGuicheD))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnGuicheCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGuicheCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnGuicheCActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (rbtnAdministrador.isSelected()) {
            controleTela.abrirTelaAdm(this);
        } else if (rbtnGuicheA.isSelected()) {
            controleTela.abrirGuicheA(this, "ATENDENTE A" + cbbGuicheA.getSelectedItem(), TelaLogin.atendente);
        } else if (rbtnGuicheB.isSelected()) {
            try {
                int numeroGuiche = Integer.parseInt(cbbGuicheB.getSelectedItem().toString());
                String guiche = "B" + numeroGuiche;
                String titulo = "ATENDENTE " + guiche;
                controleTela.abrirGuicheDefault(this, titulo, TelaLogin.atendente, guiche);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaModulos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (rbtnGuicheC.isSelected()) {
            try {
                int numeroGuiche = (int) cbbGuicheC.getSelectedItem();
                String guiche = "C" + numeroGuiche;
                String titulo = "ATENDENTE " + guiche;
                controleTela.abrirGuicheDefault(this, titulo, TelaLogin.atendente, guiche);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaModulos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (rbtnGuicheD.isSelected()) {
            try {
                int numeroGuiche = (int) cbbGuicheD.getSelectedItem();
                String guiche = "D" + numeroGuiche;
                String titulo = "ATENDENTE " + guiche;
                controleTela.abrirGuicheDefault(this, titulo, TelaLogin.atendente, guiche);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaModulos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        controleTela.abrirLogin(this);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbbGuicheAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGuicheAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbGuicheAActionPerformed

    private void cbbGuicheCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGuicheCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbGuicheCActionPerformed

    private void cbbGuicheDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGuicheDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbGuicheDActionPerformed

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
            java.util.logging.Logger.getLogger(TelaModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaModulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnVoltar;
    public javax.swing.JComboBox<String> cbbGuicheA;
    public javax.swing.JComboBox<String> cbbGuicheB;
    public javax.swing.JComboBox<String> cbbGuicheC;
    public javax.swing.JComboBox<String> cbbGuicheD;
    private javax.swing.ButtonGroup gbtnTelas;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JRadioButton rbtnAdministrador;
    public javax.swing.JRadioButton rbtnGuicheA;
    public javax.swing.JRadioButton rbtnGuicheB;
    public javax.swing.JRadioButton rbtnGuicheC;
    public javax.swing.JRadioButton rbtnGuicheD;
    // End of variables declaration//GEN-END:variables

    private void configuracaoTela() {
        this.getContentPane().setBackground(new Color(211, 211, 211));
        //Bloqueia o redimensionamento
        this.setResizable(false);
        //Coloca o jframe no centro
        this.setLocationRelativeTo(null);
        //Fechar toda a Aplicação ao clicar no botão Fechar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
