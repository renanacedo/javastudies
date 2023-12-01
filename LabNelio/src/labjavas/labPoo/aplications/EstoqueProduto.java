package labJavas.labPoo.aplications;

import java.util.Scanner;

import labJavas.labPoo.entities.Produto;

public class EstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto tenis = new Produto();
        System.out.println("Digite nome do produto: ");
        tenis.nome = sc.next();
        System.out.println("Digite o preço unitário: ");
        tenis.preco = sc.nextDouble();
        System.out.println("Digite a quantidade atual em estoque: ");
        tenis.quantidade = sc.nextInt();

        System.out.printf("Produto 1 - %s %nPreço: R$%.2f %nQuantidade: %d%n", tenis.nome, tenis.preco, tenis.quantidade);
        System.out.printf("Valor total em estoque %.2f", tenis.TotalValueStock());

        System.out.println("\n\nQuantos Produtos entraram em estoque?");
        int add = sc.nextInt();
        tenis.AddProducts(add);

        System.out.printf("Produto 1 - %s %nPreço: R$%.2f %nQuantidade: %d%n", tenis.nome, tenis.preco, tenis.quantidade);
        System.out.printf("Valor total em estoque %.2f", tenis.TotalValueStock());

        System.out.println("\n\nQuantos produtos foram retirados do estoque?");
        int exc = sc.nextInt();
        tenis.RemoveProducts(exc);

        System.out.printf("Produto 1 - %s %nPreço: R$%.2f %nQuantidade: %d%n", tenis.nome, tenis.preco, tenis.quantidade);
        System.out.printf("Valor total em estoque %.2f", tenis.TotalValueStock());



        sc.close();
    }
    
}
