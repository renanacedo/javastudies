package exJavas;

import java.util.Scanner;

public class ExJava3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o combustivel desejado conforme o menu: ");
        System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
        int combus = sc.nextInt();

        while (combus > 4 && combus < 4) {

            System.out.println("Digite o combustivel desejado conforme o menu: ");
            System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
            combus = sc.nextInt();
        }

        while (combus != 4) {
            switch (combus) {
                case 1:
                    alcool += 1;
                    System.out.println("\nAlcool +1");
                    System.out.println("Digite o combustivel desejado conforme o menu: ");
                    System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
                    combus = sc.nextInt();
                    break;
                case 2:
                    gasolina += 1;
                    System.out.println("\nGasolina +1");
                    System.out.println("Digite o combustivel desejado conforme o menu: ");
                    System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
                    combus = sc.nextInt();
                    break;
                case 3:
                    diesel += 1;
                    System.out.println("\nDiesel +1");
                    System.out.println("Digite o combustivel desejado conforme o menu: ");
                    System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
                    combus = sc.nextInt();
                    break;        
                default:
                    System.out.println("Código Invalido");
                    System.out.println("Digite o combustivel desejado conforme o menu: ");
                    System.out.println("Combustiveis \n1- Alcool\n2- Gasolina\n3- Diesel\n4- Sair");
                    combus = sc.nextInt();
                    break;
            }
        }
        
        System.out.println("Muito Obrigado!");
        System.out.printf(" Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);
        
        sc.close();
    }
    
}
