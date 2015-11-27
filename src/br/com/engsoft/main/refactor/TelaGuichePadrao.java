/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.main.refactor;

import br.com.engsoft.controll.ChamarProximoCliente;
import br.com.engsoft.main.refactor.TelaLogin;
import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.utils.AlteraImagens;
import br.com.engsoft.utils.utilitarios;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.com.engsoft.controll.SenhasControl;
import br.com.engsoft.controll.ControleDeTelas;
import javax.swing.UIManager;

/**
 *
 * @author Raul
 */
public class TelaGuichePadrao extends javax.swing.JFrame {

    ControleDeFila controleFila = new ControleDeFila();
    static public String guicheAtendente;
    static public SenhasControl sc = new SenhasControl();
    static public boolean emPausa = true;

    boolean pausado = false;
    static public String senhaAtualB = null;
    String senhaAnteriorB = null;

    String senhaAtualC = null;
    String senhaAnteriorC = null;

    String senhaAtualD = null;
    String senhaAnteriorD = null;

    /**
     * Creates new form AtendenteView
     */
    public TelaGuichePadrao() throws InterruptedException {
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

        lblSenhaAnterior = new javax.swing.JLabel();
        lblSenhaAtual = new javax.swing.JLabel();
        lblAtendente = new javax.swing.JLabel();
        lblNomeAtendente = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblData.setText(dataAtual());
        lblTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        txtSenhaAnterior = new javax.swing.JTextField();
        txtSenhaAtual = new javax.swing.JTextField();

        pnlAcoes = new javax.swing.JPanel();
        btnTransferir = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnProximo.setToolTipText("Próxima Senha da Fila");
        btnFinalizar = new javax.swing.JButton();
        btnFinalizar.setToolTipText("Finalizar Atendimento");  
        tbtnPausarContinuar = new javax.swing.JToggleButton();
        tbtnPausarContinuar.setToolTipText("Pausar/Continuar Atendimento");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblSenhaAnterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenhaAnterior.setText("Anterior");

        lblSenhaAtual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenhaAtual.setText("Atual");

        lblAtendente.setText("Atendente:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("ATENDENTE B");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtSenhaAnterior.setEditable(false);
        txtSenhaAnterior.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSenhaAnterior.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaAnterior.setEnabled(false);
        txtSenhaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaAnteriorActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(txtSenhaAnterior);

        txtSenhaAtual.setEditable(false);
        txtSenhaAtual.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtSenhaAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaAtual.setEnabled(false);
        txtSenhaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaAtualActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(txtSenhaAtual);

        pnlAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        btnProximo.setText("Chamar Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/engsoft/img/Fim.png"))); // NOI18N
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        tbtnPausarContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/engsoft/img/pause.png"))); // NOI18N
        tbtnPausarContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnPausarContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAcoesLayout = new javax.swing.GroupLayout(pnlAcoes);
        pnlAcoes.setLayout(pnlAcoesLayout);
        pnlAcoesLayout.setHorizontalGroup(
            pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAcoesLayout.createSequentialGroup()
                        .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtnPausarContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAcoesLayout.createSequentialGroup()
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        pnlAcoesLayout.setVerticalGroup(
            pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtnPausarContinuar)
                    .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAtendente)
                        .addGap(15, 15, 15)
                        .addComponent(lblNomeAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSenhaAnterior)
                                .addGap(93, 93, 93)
                                .addComponent(lblSenhaAtual)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenhaAnterior)
                    .addComponent(lblSenhaAtual))
                .addGap(6, 6, 6)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(pnlAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnVoltar)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAtendente)
                    .addComponent(lblNomeAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaAtualActionPerformed

    private void tbtnPausarContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnPausarContinuarActionPerformed
        if (tbtnPausarContinuar.isSelected() == false) {
            tbtnPausarContinuar.setIcon(new AlteraImagens().pauseIcon());
            emPausa = false;

        } else if (tbtnPausarContinuar.isSelected() == true) {
            tbtnPausarContinuar.setIcon(new AlteraImagens().continueIcon());
            emPausa = true;
        }

    }//GEN-LAST:event_tbtnPausarContinuarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        System.out.println(guicheAtendente);
        Object[] options = {"Sim", "Não"};
        if (txtSenhaAtual.getText().equals(null) || txtSenhaAtual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não está em atendimento no momento");
        } else {
            int i = JOptionPane.showOptionDialog(null,
                    "Deseja realmente transmitir o cliente\npara o próximo atendente?", "Saída",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (i == JOptionPane.YES_OPTION) {
                if (guicheAtendente == "B") {
                    senhaAnteriorB = txtSenhaAtual.getText();
                    txtSenhaAnterior.setText(senhaAnteriorB);//não vai poder ser definido como B, usar IF
                    txtSenhaAtual.setText("");
                    controleFila.tranfereGuicheC(senhaAnteriorB, new utilitarios().dataAtual("dd/MM/yyyy"));
                } else if (guicheAtendente == "C") {
                    senhaAnteriorC = txtSenhaAtual.getText();
                    txtSenhaAnterior.setText(senhaAnteriorC);//não vai poder ser definido como B, usar IF
                    txtSenhaAtual.setText("");
                    controleFila.tranfereGuicheD(senhaAnteriorC, new utilitarios().dataAtual("dd/MM/yyyy"));
                }

            }
        }


    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        Object[] options = {"Sim", "Não"};
        if (txtSenhaAtual.getText().equals(null) || txtSenhaAtual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não está em atendimento no momento");
        } else {
            int i = JOptionPane.showOptionDialog(null,
                    "Deseja realmente transferir o cliente\npara o próximo atendente?", "Saída",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (i == JOptionPane.YES_OPTION) {

                controleFila.finalizaAtendimento(txtSenhaAtual.getText(), new utilitarios().dataAtual("dd/MM/yyyy"));
                senhaAnteriorB = senhaAtualB;
                txtSenhaAnterior.setText(senhaAnteriorB);//não vai poder ser definido como B, usar IF
                txtSenhaAtual.setText("");
            }
        }


    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        new ControleDeTelas().abrirSelecionaOperacao(this, TelaLogin.usuarioM);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtSenhaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(TelaGuichePadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGuichePadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGuichePadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGuichePadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaGuichePadrao().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaGuichePadrao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnProximo;
    public javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblNomeAtendente;
    private javax.swing.JLabel lblSenhaAnterior;
    private javax.swing.JLabel lblSenhaAtual;
    public javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAcoes;
    public javax.swing.JToggleButton tbtnPausarContinuar;
    private javax.swing.JTextField txtSenhaAnterior;
    public static javax.swing.JTextField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables

    public String dataAtual() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);

        return reportDate;
    }

    private void configuracaoTela() throws InterruptedException {
        //Bloqueia o redimensionamento
        this.getContentPane().setBackground(new Color(211, 211, 211));
        this.setResizable(false);

        //Coloca o jframe no centro
        this.setLocationRelativeTo(null);
        //Fechar toda a Aplicação ao clicar no botão Fechar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jSplitPane1.setDividerLocation(jSplitPane1.getWidth() / 2);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setBackground(new Color(211, 211, 211));
        pnlAcoes.setBackground(new Color(211, 211, 211));
        tbtnPausarContinuar.setSelected(true);
        tbtnPausarContinuar.setIcon(new AlteraImagens().continueIcon());

        ChamarProximoCliente proximo = new ChamarProximoCliente();
        Thread t = new Thread(proximo);
        //Thread.sleep(10000);
        t.start();
    }

}