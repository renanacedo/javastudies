package labjavas;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos produtos deseja na lista? ");
        int n = sc.nextInt();

        lab4Objeto[] vect = new lab4Objeto[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            System.out.println("Nome do produto "+ i);
            String name = sc.nextLine();
            System.out.println("Preço do produto "+i);
            double price = sc.nextDouble();
            vect[i] = new lab4Objeto(name, price); 
        }

        double sumPreco = 0;
        for (int i=0; i<vect.length; i++){
            sumPreco += vect[i].getPreco();
        }

        double medPreco = sumPreco / vect.length;
        System.out.printf("Preço médio é = %.2f", medPreco);

        sc.close();
    }
    
}
