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
public class SenhasControl {
    
    long idsenha;
    String senha;    
    String guiche;
    String status;
    

    public SenhasControl() {
    }

    public long getIdsenha() {
        return idsenha;
    }

    public void setIdsenha(long idsenha) {
        this.idsenha = idsenha;
    }
    public String getGuiche() {
        return guiche;
    }

    public void setGuiche(String guiche) {
        this.guiche = guiche;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "senhasControl{" + "idsenha=" + idsenha + ", senha=" + senha + ", guiche=" + guiche + ", status=" + status + '}';
    }
    


   
}
