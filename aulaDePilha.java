public class aulaDePilha{
    private int valores[];
    private int topo;

    public aulaDePilha(){ // Função que cria (famoso construtor).
        valores = new int[10]; // Esse [10] indica que pode ter 10 elementos
        topo = -1; // Aqui só indica a posição do vetor (Indice), se o topo retorna -1 
                // é porque esta vazia (porque não 0? Porque os vetores/arrays 
                // começam da posição 0, nessa posição já pode ter um elemento. 
                // Por isso sempre o limite de um vetor/array sempre é v=n-1 
                // (no caso dessa pilha seria v=10-1 que é 9)).

    }
    public void push(int elemento){ // Função que insere item.
        topo = topo++; // Acrescenta uma posição a variavel topo.
        valores[topo] = elemento; // Acrescente o item ELEMENTO do push na 
                                // posição da array VALORES que o TOPO está indicando

    }
    public boolean isEmpty(){ // Função que verifica se esta vazia
        return(topo == -1); // Retorna se topo esta na posição indicada para vazio

    }
    public boolean isFull(){ // Função que verifica se esta cheia
        return(topo == 9); // Retorna se topo esta na posição indicada para cheio

    }
    public int pop(){ // Função que desempilha
        int elem = valores[topo]; // Acessa o elemento no topo da pilha/vetor/array 
                                // utilizando o indice (variavel topo)
        topo--; // Diminui valor do indice para acertar a posição da array indicando o novo topo
        return elem; // Retorna o elemento que foi removido pelo metodo pop.
    }
    // Nesse caso é uma pilha de int - os nomes das funções não é lei
}