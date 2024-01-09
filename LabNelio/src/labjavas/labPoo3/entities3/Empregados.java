package labjavas.labPoo3.entities3;

public class Empregados {

    private Integer id;
    private String nome;
    private Double salario;

    public Empregados(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void maisSalario(double porcentagem){
        salario += salario*porcentagem/100;
    }

    
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public String toString(){
        return id + ", " + nome + ", R$" + salario;
    }
}
