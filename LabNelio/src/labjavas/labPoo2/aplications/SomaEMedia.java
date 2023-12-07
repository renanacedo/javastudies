package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja listar: ");
        int n = sc.nextInt();
        double[] lista = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite o valor: ");
            lista[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i=0; i<lista.length; i++){
            sum += lista[i];
        }

        double med = sum / lista.length;

        System.out.print("Valores: ");
        for (int i=0; i<lista.length; i++){
            System.out.printf("%.2f, ", lista[i]);
        }
        System.out.printf("%nSoma = %.2f%nMedia = %.2f", sum, med);



        sc.close();
    }
    
}
