package labjavas.labPoo.entities;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto-taxa;
    }

    public void aumentoSal(double porcentagem){
        salarioBruto += salarioBruto*porcentagem/100;
    }

    public String toString(){
        return nome + ", R$ " + String.format("%.2f",salarioLiquido());
    }
    
}
