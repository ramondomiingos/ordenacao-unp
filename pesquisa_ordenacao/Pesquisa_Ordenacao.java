package pesquisa_ordenacao;

public class Pesquisa_Ordenacao {
    public static void main(String[] args){
        //define a qtd de elementos do vetor
        int qtdelementos = 100;
        //cria vetor com o tamanho desejado.
        int v[] = new int[qtdelementos];
        //preencher o vetor com um valor randomizado
        //entre 0 e a qtdelementos
        for (int i =0; i < v.length ; i++){
            //colocar o novo valor na posicao i do vetor
            v[i] = (int) (Math.random() * qtdelementos);
        }
        //medir tempo
        long tinicio = System.currentTimeMillis();
        //criar objeto buscador
        Buscador b = new Buscador(v);

        //colocar a difenrenca
        long tfinal = System.currentTimeMillis();
        System.out.println("Gastou "+(tfinal-tinicio));
    }
}
