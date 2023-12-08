package labjavas.labPoo2.aplications;

import java.util.Scanner;

import labjavas.labPoo2.entities.Pessoas;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas: ");
        int n = sc.nextInt();

        Pessoas[] lista = new Pessoas[n];
        
        for (int i=0; i<lista.length; i++){
            System.out.printf("Digite a %sº pessoa: ", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            lista[i] = new Pessoas(nome, idade);
        }

        int maisVelho = 0;
        int verific = lista[0].getIdade();

        for (int i=0; i<lista.length; i++){
            if (lista[i].getIdade() > verific){
                verific = lista[i].getIdade();
                maisVelho = i;
            }
        }

        
        System.out.println("Pessoa mais velha: "+ lista[maisVelho].getNome());

        sc.close();
    }
    
}
