package exJavas;

import java.util.Scanner;

public class exjava9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra os divisores de um numero \nQual numero deseja descobrir?");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
                switch (N%i) {
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
