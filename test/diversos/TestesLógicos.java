/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

/**
 *
 * @author Raul
 */
public class TestesLógicos {
    public static void main(String[] args) {
        String senha = "painelb";
        
     senha = senha.toUpperCase().replace("PAINEL", "");
     
        System.out.println(senha);
    }
}
