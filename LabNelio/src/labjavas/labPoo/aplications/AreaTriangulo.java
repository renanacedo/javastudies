package labjavas.labPoo.aplications;

import java.util.Scanner;
import labjavas.labPoo.entities.Triangulo;

public class AreaTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c  = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area é do Triangulo X ");
        } else {
            System.out.println("Maior area é do triangulo Y");
        }

        sc.close();
    }
    
}
