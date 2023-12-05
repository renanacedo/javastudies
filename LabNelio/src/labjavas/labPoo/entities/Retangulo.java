package labjavas.labPoo.entities;

public class Retangulo {

    public double altura;
    public double largura;

    public double areaRetangulo(){ 
        double p = altura * largura;
        return p;
    }

    public double perimetroRetangulo(){
        double p = 2*(altura+largura);
        return p;
    }

    public double diagonalRetangulo(){
        double p = Math.sqrt(altura*altura+largura*largura);
        return p;
    }
    
    
}
