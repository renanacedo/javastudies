package labjavas.labPoo2.aplications;

import java.util.Scanner;

import labjavas.labPoo2.entities.Pessoas;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serãõ averiguadas: ");
        int n = sc.nextInt();
        Pessoas[] chamada = new Pessoas[n];

        for (int i=0; i<chamada.length; i++){
            sc.nextLine();
            System.out.printf("Nome da %sº pessoa: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Idade da %sº pessoa: ", i+1);
            int idade = sc.nextInt();
            System.out.printf("Altura da %sº pessoa: ", i+1);
            double altura = sc.nextDouble();
            chamada[i] = new Pessoas(nome, idade, altura);
        }

        double sum = 0;
        double maiorIdade = 0;
        for (int i=0; i<chamada.length; i++){
            sum += chamada[i].getAltura();
            if (chamada[i].getIdade() < 16){
                maiorIdade += 1.00;
            }
        }

        double medAltura = sum / chamada.length;
        double maiorPorc = (maiorIdade / chamada.length) * 100;

        System.out.printf("%nAltura média: %.2f%n", medAltura);
        System.out.println("Pessoas maior de 16 anos: " + maiorPorc +"%");

        for (int i=0; i<chamada.length; i++){
            if (chamada[i].getIdade() < 16){
                System.out.println(chamada[i].getNome());
            }
        }


        sc.close();
    }
    
}
