/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controll;

/**
 *
 * @author Raul
 */
public class UsuarioModelo {
    long idusuario;
    String usuario;
    String senha;
    char admin;
    char guicheA;
    char guicheB;
    char guicheC;
    char guicheD;
    boolean validado = false;

    public UsuarioModelo() {
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

    public char getAdmin() {
        return admin;
    }

    public void setAdmin(char admin) {
        this.admin = admin;
    }

    public char getGuicheA() {
        return guicheA;
    }

    public void setGuicheA(char guicheA) {
        this.guicheA = guicheA;
    }

    public char getGuicheB() {
        return guicheB;
    }

    public void setGuicheB(char guicheB) {
        this.guicheB = guicheB;
    }

    public char getGuicheC() {
        return guicheC;
    }

    public void setGuicheC(char guicheC) {
        this.guicheC = guicheC;
    }

    public char getGuicheD() {
        return guicheD;
    }

    public void setGuicheD(char guicheD) {
        this.guicheD = guicheD;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }
    
    
    
}
