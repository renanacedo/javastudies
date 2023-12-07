package labjavas;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas foram medidas? ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i=0; i<n; ++i ){
            System.out.println("Qual a altura da pessoa: " + i);
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }

        double altMedia = soma / n;
        System.out.printf("Altura média = %.2f", altMedia);




        sc.close();
    }
}
