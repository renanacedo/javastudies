package labJavas;
import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = 's';
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double cel = sc.nextDouble();
            double fah = ((cel*9)/5)+32;
            System.out.println("Equivalente em Fahrenheit: " + fah);
            System.out.println("Deseja repetir ? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}