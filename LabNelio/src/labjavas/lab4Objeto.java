package labjavas;

public class lab4Objeto {

    private String name;
    private double preco;

    public lab4Objeto(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
}
