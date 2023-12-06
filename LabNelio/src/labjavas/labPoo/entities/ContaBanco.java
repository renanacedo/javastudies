package labjavas.labPoo.entities;

public class ContaBanco {

    //Atributos
    private int digito;
    private String nome;
    private double saldo;

    //Construtores
    public ContaBanco(){
    }

    public ContaBanco(int digito, String nome, double dpInicial){
        this.digito = digito;
        this.nome = nome;
        depositoConta(dpInicial);
    }

    public ContaBanco(int digito, String nome){
        this.digito = digito;
        this.nome = nome;
    }
    
    //Getters e Setters 
    public double getDigito(){
        return digito;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    //Métodos
    public void depositoConta(double valor){
        this.saldo += valor;
    }

    public void saqueConta(double valor){
        double taxa = 5.00;
        this.saldo -= valor + taxa;
    }

    public String toString(){
        return "CC: "
            + digito
            + ", Proprietario: "
            + nome
            + ", Saldo: "
            + String.format("%.2f", getSaldo());
    }

}
