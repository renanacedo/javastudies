package labjavas.labPoo.aplications;

import java.util.Scanner;

import labjavas.labPoo.entities.ContaBanco;

public class ExAppBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int digito = sc.nextInt();
        System.out.print("Digite o nome do proprietario da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja fazer depósito inicial ? (y/n): ");
        char resposta = sc.next().charAt(0);
        ContaBanco conta1;

        if (resposta == 'y'){
                System.out.print("Qual valor a ser depositado: ");
                double dpInicial = sc.nextDouble();
                conta1 = new ContaBanco(digito, nome, dpInicial);
        } 
        else { 
            conta1 = new ContaBanco(digito, nome);
        }

        System.out.println(conta1);

        System.out.print("Digite um valor para depósito: ");
        double deposito = sc.nextDouble();
        conta1.depositoConta(deposito);
        System.out.println("Conta atualizada");
        System.out.println(conta1);

        System.out.print("Digite um valor para saque: ");
        double saque = sc.nextDouble();
        conta1.saqueConta(saque);
        System.out.println("Conta atualizada");
        System.out.println(conta1);




        sc.close();
    }
    
}
