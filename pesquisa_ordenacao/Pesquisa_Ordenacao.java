package pesquisa_ordenacao;

import jdk.nashorn.internal.scripts.JO;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;

public class Pesquisa_Ordenacao {
    public static void main(String[] args){
        //define a qtd de elementos do vetor
        int qtdelementos = 10000;
        //cria vetor com o tamanho desejado.
        int v[] = new int[qtdelementos];
        //preencher o vetor com um valor randomizado
        //entre 0 e a qtdelementos
        for (int i =0; i < v.length ; i++){
            //colocar o novo valor na posicao i do vetor
            v[i] = (int) (Math.random() * qtdelementos);
        }

        //criar objeto buscador
        Buscador b = new Buscador(v);

        //procruar um numero
        String valor = JOptionPane.showInputDialog("Digite um numero");
        int retorno = b.buscaSeq(Integer.parseInt(valor));
        if(retorno == -1){
            JOptionPane.showMessageDialog(null,"Elemento nao encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "Elemento encontrado na posição "+String.valueOf(retorno) + " do vetor");
        }
        //medir tempo
        long tinicio = System.currentTimeMillis();
        //criar objeto ordenador
        Ordenador o = new Ordenador(v);
        o.bubbleSort();
        //colocar a difenrenca
        long tfinal = System.currentTimeMillis();
        System.out.println("Gastou "+(tfinal-tinicio));
    }
}
