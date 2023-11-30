package exjavas;

import java.util.Scanner;

public class exjava5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra quantos numeros estão entre 10 e 20");
        System.out.println("Quantos números deseja verificar?");
        int N = sc.nextInt();

        int dentro = 0;
        int fora = 0;

        for (int i=0; i<N ; i++ ){
            System.out.println("Digite o número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                dentro += 1;
            } else{
                fora += 1;
            }
        }


        System.out.println("Temos: \n" + dentro + " in");
        System.out.println(fora + " out");



        sc.close();
    }
    
}
