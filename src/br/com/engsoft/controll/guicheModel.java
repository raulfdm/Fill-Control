package br.com.engsoft.controll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class guicheModel {
   
    String guiche;
    String senha;

    public guicheModel(String guiche, String senha) {
        this.guiche = guiche;
        this.senha = senha;
    }

    public guicheModel() {
    }    

    public String getGuiche() {
        return guiche;
    }

    public void setGuiche(String guiche) {
        this.guiche = guiche;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
     
    
}
