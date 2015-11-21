
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raul
 */
public class TesteFila {

    String senhaPreferencial;
    Integer senhaP = 0;

    String senhaNormal;
    Integer senhaN = 1;
    protected ArrayList<String> fila = new ArrayList();

    public TesteFila() {

    }

    public void gerarSenhaPreferencial() {
        senhaP += 1;
        String senhaGerada;
        if (String.valueOf(senhaP).length() == 1) {
            senhaGerada = "P000" + senhaP;
            fila.add(senhaGerada);
        } else if (String.valueOf(senhaP).length() == 2) {
            senhaGerada = "P00" + senhaP;
            fila.add(senhaGerada);
        } else if (String.valueOf(senhaP).length() == 3) {
            senhaGerada = "P0" + senhaP;
            fila.add(senhaGerada);
        } else {
            senhaGerada = "P" + senhaP;
            fila.add(senhaGerada);
        }

    }

    public ArrayList<String> getFila() {
        return fila;
    }

    public static void main(String[] args) {
        TesteFila t = new TesteFila();

        for (int i = 0; i < 9999; i++) {
            t.gerarSenhaPreferencial();
        }
        
        Iterator<String> iterator = t.getFila().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
