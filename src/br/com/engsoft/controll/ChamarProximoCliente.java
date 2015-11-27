/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import br.com.engsoft.controll.ControleDeFila;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class ChamarProximoCliente implements Runnable {

    ControleDeFila c = new ControleDeFila();

    @Override

    public void run() {
        while (true) {
            try {
                c.chamaProximoFila();
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChamarProximoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
