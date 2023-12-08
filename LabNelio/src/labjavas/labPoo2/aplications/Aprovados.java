package labjavas.labPoo2.aplications;

import java.util.Scanner;

import labjavas.labPoo2.entities.Pessoas;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão verificados: ");
        int n = sc.nextInt();

        Pessoas[] lista = new Pessoas[n];

        for (int i=0; i<lista.length; i++){
            System.out.println("Nome do aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Nota 1º sem: ");
            double nota1 = sc.nextDouble();
            System.out.println("Nota 2º sem: ");
            double nota2 = sc.nextDouble();
            double mediaAno = nota1 + nota2 / lista.length;
            lista[i] = new Pessoas(nome, nota1, nota2, mediaAno);
        }

        System.out.println("Alunos Aprovados");
        for (int i=0; i<lista.length; i++){
            if (lista[i].getMediaAno() > 6.0){
                System.out.println(lista[i].getNome());
            }
        }



        sc.close();
    }
    
}
