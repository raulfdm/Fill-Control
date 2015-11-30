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
public class FilaAtendimento {
    
    long idSenha;
    String senha;
    String data;
    String guicheAtendimento;
    String tela;
    String statusAtendimento;

    public FilaAtendimento() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGuicheAtendimento() {
        return guicheAtendimento;
    }

    public void setGuicheAtendimento(String guicheAtendimento) {
        this.guicheAtendimento = guicheAtendimento;
    }

    public String getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    public long getIdSenha() {
        return idSenha;
    }

    public void setIdSenha(long idSenha) {
        this.idSenha = idSenha;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }        
    
    @Override
    public String toString() {
        return "senhasControl{" + "idsenha=" + idSenha 
                + ", senha=" + senha + ", guiche=" + guicheAtendimento 
                + ", status=" + statusAtendimento + '}';
    }
    
}
