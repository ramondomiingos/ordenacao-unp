import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;

public class ExemploBuscaSequencial {
    public static void main(String[] args) {
        int[] v = new int [1000];
        for (int i = 0; i < 1000 ; i++ ){
            v[i] = new Random().nextInt(100)+1;
        }
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero de 0 a 100"));

        //procurar vetor
        boolean achou  = false;
        for (int i = 0; i < v.length; i++ ){
            if (v[i] == numero ){
                JOptionPane.showMessageDialog(null, "Achamos o numero "+ numero + " na posicao "+ (i+1) );
                achou = true;
            }
        }
        if(! achou ) {
            JOptionPane.showMessageDialog(null, "Não achamos o numero "+numero);
        }
    }

}
