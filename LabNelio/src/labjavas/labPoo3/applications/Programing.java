package labjavas.labPoo3.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import labjavas.labPoo3.entities3.Empregados;

public class Programing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos empregados serão registrados: ");
        int n = sc.nextInt();

        List<Empregados> listEmpregados = new ArrayList<>();

        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Empregado #"+ (i+1) +": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            //Esse hasId é uma função criada no fim do programa para buscar o ID digitado se já existe na lista
            while (hasId(listEmpregados, id)){
                System.out.println("Esse ID já existe. Digite outro: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            listEmpregados.add(new Empregados(id, nome, salario));
        }

        System.out.println();
        System.out.println(" - Lista de Empregados - ");
        for (Object x : listEmpregados){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Qual o ID do empregado que terá aumento: ");
        int idAumento = sc.nextInt();
        Empregados empre = listEmpregados.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if (empre == null ){
            System.out.println("Esse ID não existe");
            System.out.println();
        } 
        else {
            System.out.println("Qual a porcentagem de aumento: ");
            Double porcentagem = sc.nextDouble();
            empre.maisSalario(porcentagem);
        }

        System.out.println(" - Lista de Empregados - ");
        for (Object x : listEmpregados){
            System.out.println(x);
        }

        sc.close();
        
    }

    public static Boolean hasId (List<Empregados> listEmpregados, int id){
        Empregados empre = listEmpregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return empre != null;
    }
    
}
