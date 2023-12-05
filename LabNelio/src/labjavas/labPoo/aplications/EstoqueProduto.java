package labjavas.labPoo.aplications;

import java.util.Scanner;

import labjavas.labPoo.entities.Produto;

public class EstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite nome do produto: ");
        String nome = sc.next();
        System.out.print("Digite o preço unitário: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);
        System.out.println(produto1);
        System.out.printf("Valor total em estoque %.2f", produto1.totalValueStock());

        System.out.println("\n\nQuantos Produtos entraram em estoque?");
        int add = sc.nextInt();
        produto1.addProducts(add);

        System.out.println(produto1);
        System.out.printf("Valor total em estoque %.2f", produto1.totalValueStock());

        System.out.println("\n\nQuantos produtos foram retirados do estoque?");
        int exc = sc.nextInt();
        produto1.removeProducts(exc);

        System.out.println(produto1);
        System.out.printf("Valor total em estoque %.2f", produto1.totalValueStock());



        sc.close();
    }
    
}
