package pesquisa_ordenacao;

public class Ordenador {

    //campo do vetor
    public int v[];

    public Ordenador(int[] v){
        this.v = v;
    }

    //ordencao Bubble sort
    public void bubbleSort(){
        for(int i = v.length ; i >= 1 ; i--){
            for(int j = 1; j <i ; j++){
                if(v[j-1] > v[j]){
                    int aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
    }
}
