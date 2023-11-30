package exJavas;

import java.util.Scanner;

public class ExJava6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule a média ponderada de cada aluno  \nQuantos alunos deseja verificar?");
        int N = sc.nextInt();

        System.out.println("Indique as notas de peso 2, 3 e 5 do aluno: ");
        
        for (int i=0; i<N; i++){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            double media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
            System.out.printf("Média = %.1f%n", media);

        }
        sc.close();
    }
    
}
