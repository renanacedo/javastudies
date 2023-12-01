package labJavas.labPoo.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

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
