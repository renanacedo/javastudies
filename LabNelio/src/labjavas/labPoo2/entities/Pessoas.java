package labjavas.labPoo2.entities;

public class Pessoas {

    private String nome;
    private int idade;
    private double altura;
    private double nota1;
    private double nota2;
    private char genero;

    public Pessoas(String nome, double nota1, double nota2, double mediaAno){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Pessoas(double altura, char genero){
        this.altura = altura;
        this.genero = genero;
    }

    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    
     public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getMediaAno(){
        return nota2;
    }

    public void setMediaAno(double mediaAno){
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }
}
