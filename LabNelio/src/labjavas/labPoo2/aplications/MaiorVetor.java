package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class MaiorVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos vetores: ");
        int n = sc.nextInt();
        int maiorVec = 0;
        int posiMaior = 0;
        int[] lista = new int[n];

        for (int i=0; i<lista.length; i++){
            System.out.println("Digite o vetor: ");
            lista[i] = sc.nextInt();
            int vec = lista[i];
            if (vec > maiorVec){
                maiorVec = lista[i];
                posiMaior = i;
            }
        }

        System.out.println("Maior valor: "+maiorVec);
        System.out.println("Posição do maior valor: "+posiMaior);


        sc.close();
    }
    
}
