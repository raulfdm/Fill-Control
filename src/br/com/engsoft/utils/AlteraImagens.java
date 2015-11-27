/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.utils;

import br.com.engsoft.main.refactor.TelaGuichePadrao;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Raul
 */
public class AlteraImagens {

    public ImageIcon continueIcon() {
        try {
//pacote onde estao as imagens no seu projeto
            String diretorio = "/br/com/engsoft/img/continue.png";
            URL resource = getClass().getResource(diretorio);
            File file = new File(resource.toURI());
            //setando o icone
            ImageIcon logo = new ImageIcon(file.getPath());

            return logo;

        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaGuichePadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ImageIcon pauseIcon() {
        try {
            //pacote onde estao as imagens no seu projeto
            String diretorio = "/br/com/engsoft/img/pause.png";
            URL resource = getClass().getResource(diretorio);
            File file = new File(resource.toURI());
            //setando o icone
            ImageIcon logo = new ImageIcon(file.getPath());

            return logo;

        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaGuichePadrao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
