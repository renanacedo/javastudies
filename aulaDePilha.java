public class aulaDePilha{
    private int valores[];
    private int topo;

    public aulaDePilha(){ // função que cria (famoso construtor)
        valores = new int[10]; // Esse [10] indica que pode ter 10 elementos
        topo = -1; // Aqui só indica a posição do vetor, se o topo retorna -1 é porque esta vazia (porque não 0? Porque os vetores/arrays começam da posição 0, nessa posição já pode ter um elemento. Por isso sempre o limite de um vetor/array sempre é v=n-1 (no caso dessa pilha seria v=10-1 que é 9))
    }
    public void push(int elemento){ //função que insere item

    }
    boolean isEmpty(){ //função que verifica se esta vazia

    }
    boolean isFull(){ //função que verifica se esta cheia

    }
    public int pop(){ //função que desempilha

    }
    //Nesse caso é uma pilha de int - os nomes das funções não é lei
}