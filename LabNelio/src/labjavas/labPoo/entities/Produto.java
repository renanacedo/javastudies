package labjavas.labPoo.entities;

public class Produto {

    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor Padrão - Caso não tenho info dos dados para os atributos e quero instanciar com valor padrão.
    public Produto(){

    }
    //Construtor 1 - Personalisa todas os atributos
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Construtor 2 - Sobrecarga onde não tenho 1 dos atributos
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }

    //Métodos get e set
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
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
