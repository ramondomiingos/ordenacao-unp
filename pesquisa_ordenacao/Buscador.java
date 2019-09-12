package pesquisa_ordenacao;

public class Buscador {
    public  int v[];

    public  Buscador(int[] v ){
        this.v = v;
    }

    //criar metodo para fazer a busca sequencial
    public  int buscaSeq(int chave){
        //inicia a busca sequencial
        return buscaSeqRecursivo(v.length, chave);
    }
    //criar sequencial com recursividade
    public int buscaSeqRecursivo(int tamanho, int chave){
        //se tamanho zerado é pq nao encontrou.
        if(tamanho == 0){
            return -1;
        }
        //se a posicao final é a igual a chave, achou, entao retorna a posicao
        if(v[tamanho-1] == chave){
            return (tamanho -1);
         //caso contrario chama a rotina com um tamanho a menos.
        }else{
            return buscaSeqRecursivo(tamanho-1, chave);
        }

    }

}
