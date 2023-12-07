package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numero para verificar: ");
        int n = sc.nextInt();

        int[] lista = new int[n];
        int quantPares = 0;
        for (int i=0; i<lista.length; i++){
            System.out.printf("Digite o %sº numero: ", i+1);
            lista[i] = sc.nextInt();
            double verific = lista[i] % 2;
            if (verific == 0){
                quantPares += 1;
            }
        }

        System.out.println("Numeros pares: ");
        for (int i=0; i<lista.length; i++){
            double verific = lista[i] % 2;
            if (verific == 0){
                System.out.println(lista[i]);
            }
        }

        System.out.print("Quantidade de pares: " + quantPares);





        sc.close();
    }
    
}
