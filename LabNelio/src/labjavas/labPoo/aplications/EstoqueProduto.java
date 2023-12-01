package labJavas.labPoo.aplications;

import java.util.Scanner;

import labJavas.labPoo.entities.Produto;

public class EstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto tenis = new Produto();
        System.out.print("Digite nome do produto: ");
        tenis.nome = sc.next();
        System.out.print("Digite o preço unitário: ");
        tenis.preco = sc.nextDouble();
        System.out.print("Digite a quantidade atual em estoque: ");
        tenis.quantidade = sc.nextInt();

        System.out.println(tenis);
        System.out.printf("Valor total em estoque %.2f", tenis.totalValueStock());

        System.out.println("\n\nQuantos Produtos entraram em estoque?");
        int add = sc.nextInt();
        tenis.addProducts(add);

        System.out.println(tenis);
        System.out.printf("Valor total em estoque %.2f", tenis.totalValueStock());

        System.out.println("\n\nQuantos produtos foram retirados do estoque?");
        int exc = sc.nextInt();
        tenis.removeProducts(exc);

        System.out.println(tenis);
        System.out.printf("Valor total em estoque %.2f", tenis.totalValueStock());



        sc.close();
    }
    
}
