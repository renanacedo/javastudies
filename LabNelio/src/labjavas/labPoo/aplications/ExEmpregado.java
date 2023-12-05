package labjavas.labPoo.aplications;

import java.util.Scanner;

import labjavas.labPoo.entities.Empregado;

public class ExEmpregado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Empregado emp = new Empregado();

        System.out.print("Nome do empregado: ");
        emp.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.taxa = sc.nextDouble();

        System.out.println("Empregado: " + emp);

        System.out.print("Porcentagem de aumento: ");
        double porcentagem = sc.nextDouble();
        emp.aumentoSal(porcentagem);

        System.out.println("Salário atualizado: " + emp);

        sc.close();
    }
    
}
