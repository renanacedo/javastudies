package exJavas;

import java.util.Scanner;

public class exjava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra os numeros impares num intervalo de valores de 1 a X");
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();

        while (x <= 1 || x > 1000){
            System.out.println("Valor Invalido \nDigite valor de X maior que 1 limite de 1000");
            x = sc.nextInt();
        }

        System.out.println("Ok. Você digitou " + x);
        for ( int i=1; i<x; i+=2){
            System.out.println(i); 
            //tentei fazer subtraindo porem FALHEI e pedi ajuda do GPT que me deu esse resultado simples só somando 2
        }


        sc.close();
    }
    
}
