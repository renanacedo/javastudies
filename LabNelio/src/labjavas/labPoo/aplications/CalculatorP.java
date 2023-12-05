package labjavas.labPoo.aplications;

import java.util.Scanner;

import labjavas.labPoo.entities.Calculator;

public class CalculatorP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double radius = sc.nextDouble();

        double circ = Calculator.circumferencia(radius);
        double volum = Calculator.volume(radius);

        System.out.printf("Circunferencia é: %.2f%n", circ);
        System.out.printf("Volume é: %.2f%n", volum);




        sc.close();
    }
    
}
