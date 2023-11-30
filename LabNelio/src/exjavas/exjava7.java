package exJavas;

import java.util.Scanner;

public class ExJava7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Realize a divisão de 2 numero, porem o denominador não pode ser 0 \nIndique quantas contas quer fazer: ");

        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            System.out.println("Numerador:");
            int x = sc.nextInt();
            System.out.println("Denominador");
            int y = sc.nextInt();
            
            switch (y) {
                case 0:
                    System.out.println("Divisão Impossivel");
                    break;
            
                default:
                    double resultado = (double) x/y;
                    System.out.printf("Resultado: %.1f%n", resultado);
                    break;
            }
            
        }



        sc.close();
    }
    
}
