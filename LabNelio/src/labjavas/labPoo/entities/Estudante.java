package labjavas.labPoo.entities;

public class Estudante {

    public String nome;
    public double tri1;
    public double tri2;
    public double tri3;
    public double notaF;

    public double media(){
        return tri1 + tri2 + tri3;
    }

    public double notaFaltante(){
        if (media() < 60.0){
            return 60.0 - media();
        } else {
            return 0.0;
        }
    }
    

}
