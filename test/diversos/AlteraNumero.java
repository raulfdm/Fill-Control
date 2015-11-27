/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class AlteraNumero implements Runnable {

    TesteNumero t = new TesteNumero();

    int numero = 1;

    @Override
    public void run() {

        while (true) {
            try {
                soma();
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AlteraNumero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int soma() {
        TesteNumero.lblNumero.setText(String.valueOf(numero));
        numero++;
        return numero;
    }

}
