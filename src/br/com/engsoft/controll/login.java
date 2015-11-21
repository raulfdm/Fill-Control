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
public class login {
   
    String usuario;
    String senha;

    public login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public login() {
    }    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  
    
    
     
    
}
