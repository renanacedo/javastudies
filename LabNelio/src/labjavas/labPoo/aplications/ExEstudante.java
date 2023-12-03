package labJavas.labPoo.aplications;

import java.util.Scanner;

import labJavas.labPoo.entities.Estudante;

public class ExEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante aluno1 = new Estudante();

        System.out.print("Nome do Aluno: ");
        aluno1.nome = sc.nextLine();
        System.out.print("Trimestre 1: ");
        aluno1.tri1 = sc.nextDouble();
        System.out.print("Trimestre 2: ");
        aluno1.tri2 = sc.nextDouble();
        System.out.print("Trimestre 3: ");
        aluno1.tri3 = sc.nextDouble();

        System.out.println("Nota Final: " + aluno1.media());
        if (aluno1.media() < 60) {
            System.out.println("Reprovado \nNota Faltante: "+ aluno1.notaFaltante());
            
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
