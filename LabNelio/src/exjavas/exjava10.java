package exJavas;

import java.util.Scanner;

public class ExJava10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conte as linhas e o quadro e cubo de cada numero de linha \nDigite quantidade de linhas: ");
        int N = sc.nextInt();
        if (N<0){
            System.out.println("Valor invalido");
        } else {
            for (int i=1; i<=N; i++){
                int quadrado = i*i;
                int cubo = i*i*i;
                System.out.printf("Linha: %d Duadrado: %d Cubo: %d%n", i, quadrado, cubo);
            }
        }

        sc.close();
    }
    
}
