package labJavas.labPoo.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double TotalValueStock(){
        return quantidade*preco;
    }
    
    public void AddProducts(int x){
        quantidade += x;
    }

    public void RemoveProducts(int x){
        quantidade -= x;
    }
}
