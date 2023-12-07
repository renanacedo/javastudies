package labjavas.labPoo2.aplications;

import java.util.Scanner;

public class TresVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de vetor: ");
        int n = sc.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
        int[] vec3 = new int[n];

        System.out.println("Numeros do vetor A");
        for (int i=0; i<vec1.length; i++){
            System.out.println("Digite: ");
            vec1[i] = sc.nextInt();
        }

        System.out.println("Numeros do vetor B");
        for (int i=0; i<vec2.length; i++){
            System.out.println("Digite: ");
            vec2[i] = sc.nextInt();
            vec3[i] = vec1[i]+vec2[i];
        }

        System.out.println("Valor resultante de cada vetor: ");
        for (int i=0; i<vec3.length; i++){
            System.out.println(vec3[i]);
        }




        sc.close();
    }
    
}
