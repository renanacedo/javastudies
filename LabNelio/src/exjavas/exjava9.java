package exjavas;

import java.util.Scanner;

public class exjava9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra os divisores de um numero \nQual numero deseja descobrir?");
        int N = sc.nextInt();

        for (int i=0; i<=N; i++){
         6   int x = N&i;
            switch (x) {
                case 0:
                    System.out.println(i);
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
    
}
