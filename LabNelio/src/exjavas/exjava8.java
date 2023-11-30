package exJavas;

import java.util.Scanner;

public class exjava8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando valor fatorial \nIndique qual numero deseja calcular: ");
        int N = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<=N; i++){
            fatorial = fatorial * i;
        }

        System.out.println("O resultado é: " + fatorial);


        sc.close();
    }
    
}
