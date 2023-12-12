package labjavas.labPoo2.aplications;

import java.util.Scanner;

import labjavas.labPoo2.entities.Pencionistas;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nossa pensão tem 9 Quarto \nQuantos quartos serão alugados ?");
        int n = sc.nextInt();

        Pencionistas[] inquilinos = new Pencionistas[10];

        for (int i=0; i<n ; i++){
            System.out.printf("Inquilino %s:%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            inquilinos[quarto] = new Pencionistas(nome, email);
            System.out.println(" ");
        }

        System.out.println("Quartos alugados");
        for (int i=0; i<inquilinos.length; i++){
            if (inquilinos[i] != null){
                System.out.println(i + ": " + inquilinos[i]);
            }
        }


        sc.close();
    }
    
}
