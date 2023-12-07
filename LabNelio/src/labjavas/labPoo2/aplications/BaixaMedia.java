package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class BaixaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos: ");
        int n = sc.nextInt();
        double[] lista = new double[n];

        double sum = 0.0;

        for (int i=0; i<lista.length; i++){
            System.out.print("Digite a nota: ");
            lista[i] = sc.nextDouble();
            sum += lista[i];
        }

        double mediaVec = sum / lista.length;
        System.out.println("Média do vetor é: "+mediaVec);
        System.out.println("Elementos abaixo da média: ");
        for (int i=0; i<lista.length; i++){
            if (lista[i] < mediaVec){
                System.out.println(lista[i]);
            }
        }

        sc.close();
    }
    
}
