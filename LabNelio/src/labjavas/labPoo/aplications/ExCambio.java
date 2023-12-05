package labjavas.labPoo.aplications;

import java.util.Scanner;
import labjavas.labPoo.entities.Cambio;

public class ExCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor do dolar atual? ");
        double dolar = sc.nextDouble();
        System.out.println("Quantos dolares quer comprar? ");
        double real = sc.nextDouble();

        System.out.printf("Valor a ser pago com IOF de 6 porcento: %.2f", Cambio.dolares(real, dolar));



        sc.close();
    }
    
}
