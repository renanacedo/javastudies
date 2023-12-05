package labjavas.labPoo.entities;

public class Produto {

    //Atributos
    public String nome;
    public double preco;
    public int quantidade;

    //Construtor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //Métodos
    public double totalValueStock(){
        return quantidade*preco;
    }
    
    public void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome 
            + ", R$"
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " und. Total: R$"
            + String.format("%.2f", totalValueStock());
    }
}
