package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero serão verificados: ");
        int n = sc.nextInt();
        int[] lista = new int[n];

        for (int i=0; i<lista.length; i++){
            System.out.print("Digite um numero: ");
            lista[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i=0; i<lista.length; i++){
            if (lista[i] < 0){
                System.out.println(lista[i]);
            }
        }


        sc.close();
    }
    
}
