package exJavas;

import java.util.Scanner;

public class ExJava2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas");
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");
            } 
            else if (x < 0 && y > 0){
                System.out.println("Segundo Quadrante");
            }
            else if (x > 0 && y < 0){
                System.out.println("Terceiro Quadrante");
            }
            else {
                System.out.println("Quarto Quadrante");
            }
            System.out.println("Enqunto um vetor não for 0: Digite as coordenadas");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
    
}
