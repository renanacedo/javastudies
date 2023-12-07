package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos itens no vetor: ");
        int n = sc.nextInt();
        int[] lista = new int[n];
        double sum = 0;
        int vecPar = 0;

        for(int i=0; i<lista.length; i++){
            System.out.println("Digite numero: ");
            lista[i] = sc.nextInt();
            double verific = lista[i] % 2;
            if (verific == 0){
                sum += lista[i];
                vecPar += 1;
            }
        }

        double mediaVec = sum / vecPar;
        switch (vecPar) {
            case 0:
                System.out.println("Nenhum numero par!");
                break;
        
            default:
                System.out.println("Media dos pares: "+mediaVec);
                break;
        }

        sc.close();
    }
    
}
