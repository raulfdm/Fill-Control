/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Raul
 */
public class utilitarios {
    
    
    public String dataAtual(String mascara) {
        DateFormat df = new SimpleDateFormat(mascara);
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);

        return reportDate;
    }
    
    

   
}
