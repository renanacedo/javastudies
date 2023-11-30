package labjavas;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros quer somar ?");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N ; i++ ){
            System.out.println("Digite o numero pra soma: ");
            int x = sc.nextInt();
            soma += x;

        }

        System.out.println("A soma é: " + soma);


        sc.close();
    }
    
}
