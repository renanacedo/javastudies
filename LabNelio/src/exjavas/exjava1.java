package exJavas;
import java.util.Scanner;

public class ExJava1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            System.out.println("Digite novamente");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");


        sc.close();
    }
}
