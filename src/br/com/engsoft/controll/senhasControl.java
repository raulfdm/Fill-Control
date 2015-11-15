/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class senhasControl {
    String senhaNormal;
    String senhaPreferencial;
    

    public senhasControl() {
    }


    public void setSenhaNormal(String senhaNormal) {
        this.senhaNormal = senhaNormal;
    }
  

    public void setSenhaPreferencial(String senhaPreferencial) {
        this.senhaPreferencial = senhaPreferencial;
    }
    
    public String gerarSenhaNormal(){
        String senhaGerada = "2015N0001";
               
        return senhaGerada;
    }
    
    public String gerarSenhaPreferencial(){
        String senhaGerada = "2015P0001";
               
        return senhaGerada;
    }
}
