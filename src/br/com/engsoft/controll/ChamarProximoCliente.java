/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.main.refactor.TelaGuichePadrao;
import br.com.engsoft.utils.utilitarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


        
/**
 *
 * @author Raul
 */
public class ChamarProximoCliente implements Runnable {

    ControleDeFila c = new ControleDeFila();
    //public String senhaAtual;
    //public String telaChamada;
    public FilaAtendimento fila = new FilaAtendimento();

    public void run() {
        String tela = fila.getTela();
        String senhaAtual;
        while (true) {

            if (fila.getSenha() == null) {
                if (tela != null) {
                    if (tela.equals("TelaGuichePadrao")) {
                        try {
                            Thread.sleep(5000);
                            senhaAtual = TelaGuichePadrao.senhaAtual;
                            if ( senhaAtual == null || "".equals(senhaAtual)) {
                                c.chamaProximoFila("");
                            }
                            
                                   

                        } catch (InterruptedException ex) {
                            Logger.getLogger(ChamarProximoCliente.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(ChamarProximoCliente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (tela.equals("TelaPainel")) {
                        try {
                            Thread.sleep(5000);
                            c.chamarPainelCliente(new utilitarios().dataAtual("dd/MM/yyyy"));                            
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ChamarProximoCliente.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(ChamarProximoCliente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }
        }

    }

}
