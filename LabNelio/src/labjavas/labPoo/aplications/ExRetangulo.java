package labJavas.labPoo.aplications;

import java.util.Scanner;

import labJavas.labPoo.entities.Retangulo;

public class ExRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retang = new Retangulo();

        System.out.println("Digite a altura e largura do retangulo: ");
        retang.altura = sc.nextDouble();
        retang.largura = sc.nextDouble();
        System.out.println("Area: " + retang.areaRetangulo());
        System.out.println("Perimetro: " + retang.perimetroRetangulo());
        System.out.println("Diagonal: " + retang.diagonalRetangulo());

        sc.close();
    }
    
}
