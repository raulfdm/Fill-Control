
import br.com.engsoft.controll.senhasControl;
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

    //Atributos Iniciais da senha
    String senhaPreferencial;
    String senhaNormal;
    Integer senhaP = 0;
    Integer senhaN = 0;

    //FILAS
    protected ArrayList<String> filaNormal = new ArrayList();
    protected ArrayList<String> filaPreferencial = new ArrayList();
    //Transferencias de fila
    protected ArrayList<String> filaGuicheB = new ArrayList();
    protected ArrayList<String> filaGuicheC = new ArrayList();
    protected ArrayList<String> filaGuicheD = new ArrayList();
    protected ArrayList<String> filaAtendida = new ArrayList();

    //Constrole de Filas
    int tamanhoFilaNormal;
    int tamanhoFilaPreferencial;
    int tamanhoFilaGuicheB;
    int tamanhoFilaGuicheC;
    int tamanhoFilaGuicheD;

    //CONSTRUTOR
    public TesteFila() {

    }

    //GETTERS AND SETTERS
    public ArrayList<String> getFilaNormal() {
        return filaNormal;
    }

    public ArrayList<String> getFilaPreferencial() {
        return filaPreferencial;
    }

    public ArrayList<String> getFilaAtendida() {
        return filaAtendida;
    }

    public ArrayList<String> getFilaGuicheB() {
        return filaGuicheB;
    }

    public String proximoDaFila() {

        return null;
    }

    public int getIndexNormal() {
        return filaNormal.indexOf(this);
    }

    public int getTamanhoFilaNormal() {
        return tamanhoFilaNormal;
    }

    public void setTamanhoFilaNormal(int tamanhoFilaNormal) {
        this.tamanhoFilaNormal = tamanhoFilaNormal;
    }
    //FIM GETTERS AND SETTERS

    //MÉTODOS
    public void gerarSenhaPreferencial() {
        senhaP++;
        String senhaGerada;
        if (String.valueOf(senhaP).length() == 1) {
            senhaGerada = "P000" + senhaP;
            filaPreferencial.add(senhaGerada);
        } else if (String.valueOf(senhaP).length() == 2) {
            senhaGerada = "P00" + senhaP;
            filaPreferencial.add(senhaGerada);
        } else if (String.valueOf(senhaP).length() == 3) {
            senhaGerada = "P0" + senhaP;
            filaPreferencial.add(senhaGerada);
        } else if (String.valueOf(senhaP).length() == 4) {
            senhaGerada = "P" + senhaP;
            filaPreferencial.add(senhaGerada);
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
        }

    }

    public void gerarSenhaNormal() {
        senhaN++;
        tamanhoFilaNormal++;
        String senhaGerada;
        if (String.valueOf(senhaN).length() == 1) {
            senhaGerada = "N000" + senhaN;
            filaNormal.add(senhaGerada);
        } else if (String.valueOf(senhaN).length() == 2) {
            senhaGerada = "N00" + senhaN;
            filaNormal.add(senhaGerada);
        } else if (String.valueOf(senhaN).length() == 3) {
            senhaGerada = "N0" + senhaN;
            filaNormal.add(senhaGerada);
        } else if (String.valueOf(senhaN).length() == 4) {
            senhaGerada = "N" + senhaN;
            filaNormal.add(senhaGerada);
        } else {
            System.out.println("Senhas ultrapassaram 4 digitos");
        }
    }

    public void tranfereGuicheB() {
        if (filaPreferencial.isEmpty() != true) {
            while (filaPreferencial.isEmpty() != true) {
                String senha;
                senha = filaPreferencial.get(0);
                filaGuicheB.add(senha);
                filaPreferencial.remove(0);
                tamanhoFilaPreferencial--;
                tamanhoFilaGuicheB++;
            }
        } else if (filaNormal.isEmpty() != true) {
            while (filaNormal.isEmpty() != true) {
                String senha;
                senha = filaNormal.get(0);
                filaGuicheB.add(senha);
                filaNormal.remove(0);
                tamanhoFilaNormal--;
                tamanhoFilaGuicheB++;
            }
        }

    }

    public void tranfereGuicheC(String senha) {
        for (int i = 0; i < filaGuicheB.size(); i++) {

            if (filaGuicheB.get(i).equals(senha)) {
                filaGuicheB.remove(i);
                filaGuicheC.add(senha);
                tamanhoFilaGuicheB--;
                tamanhoFilaGuicheC++;
            }
        }
    }

    public void tranfereGuicheD(String senha) {

        for (int i = 0; i < filaGuicheC.size(); i++) {

            if (filaGuicheC.get(i).equals(senha)) {
                filaGuicheC.remove(i);
                filaGuicheD.add(senha);
                tamanhoFilaGuicheC--;
                tamanhoFilaGuicheD++;
            }
        }
    }

    public void fimDoAtendimento(String senha) {
        for (int posicao = 0; posicao < tamanhoFilaNormal; posicao++) {
            if (filaNormal.get(posicao).equals(senha)) {
                filaNormal.remove(posicao);
                tamanhoFilaNormal--;
                filaAtendida.add(senha);
            }
        }
    }

    //TESTE
    public static void main(String[] args) {
        TesteFila t = new TesteFila();

        //GERA 1000 SENHAS
        for (int i = 0; i < 60; i++) {
            t.gerarSenhaNormal();
            // String senha = "N0009";
            // t.fimDoAtendimento(senha);
            t.gerarSenhaPreferencial();
            if (t.getFilaNormal().get(i).equals("N0009")) {
                System.out.println("N0009 na posição: " + i);

            }
        }

        //PROCURA SENHA E FINALIZA ATENDIMENTO
        for (int x = 0; x < t.getTamanhoFilaNormal(); x++) {
            String senha = "N0009";
            t.fimDoAtendimento(senha);
        }

        t.tranfereGuicheB();
        t.tranfereGuicheB();
        t.tranfereGuicheB();
        
        System.out.println("Fila normal: " + t.getFilaNormal().isEmpty());
        System.out.println("Fila preferencial: " + t.getFilaPreferencial().isEmpty());
        System.out.println("Fila Guiche B: " + t.getFilaGuicheB().isEmpty());

        t.tranfereGuicheC("P0050");
        t.tranfereGuicheC("P0051");
        t.tranfereGuicheC("N0050");
        t.tranfereGuicheD("N0005");
        t.tranfereGuicheC("N0042");
        t.tranfereGuicheD("N0042");
        
        for (int i = 0; i < t.filaPreferencial.size(); i++) {
            System.out.println("FilaPreferencial: " + t.filaPreferencial.get(i));
        }
        
        for (int i = 0; i < t.filaNormal.size(); i++) {
            System.out.println("FilaNormal: " + t.filaNormal.get(i));
        }
        
        for (int i = 0; i < t.filaGuicheB.size(); i++) {
            System.out.println("FilaB: " + t.filaGuicheB.get(i));
        }
        
        for (int i = 0; i < t.filaGuicheC.size(); i++) {
            System.out.println("Fila C: " + t.filaGuicheC.get(i));
        }
        
        for (int i = 0; i < t.filaGuicheD.size(); i++) {
            System.out.println("Fila D: " + t.filaGuicheD.get(i));
        }
        
            
            
            

//        Iterator<String> iterator = t.getFila().iterator();
//        while(iterator.hasNext()){
//            
//            System.out.println(iterator.+""+iterator.next());
//            
//        }
    }
}
