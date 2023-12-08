package labjavas.labPoo2.aplications;

import java.util.Scanner;

import labjavas.labPoo2.entities.Pessoas;

public class Generos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas verificadas: ");
        int n = sc.nextInt();

        Pessoas[] lista = new Pessoas[n];

        double mediaAltura = 0;
        int mulhers = 0;
        int numHomens = 0;

        for (int i=0; i<lista.length; i++){
            System.out.printf("Altura da %sº pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %sº pessoa: ", i+1);
            char genero = sc.next().charAt(0);
            lista[i] = new Pessoas(altura, genero);
            if (lista[i].getGenero() == 'F'){
                mediaAltura += lista[i].getAltura();
                mulhers += 1;
            }
            else if (lista[i].getGenero() == 'M'){
                numHomens += 1;
            }
        }

        double mediaMulheres = mediaAltura / mulhers;
        int menorAltura = 0;
        int maiorAltura = 0;
        double verific = lista[0].getAltura();
        for (int i=0; i<lista.length; i++){
            if (lista[i].getAltura() > verific){
                verific = lista[i].getAltura();
                maiorAltura = i; 
            }
        }

        verific = lista[0].getAltura();
        for(int i=0; i<lista.length; i++){
            if (lista[i].getAltura() < verific){
                verific = lista[i].getAltura();
                menorAltura = i;
            }
        }

        System.out.printf("Menor Altura: %.2f%n", lista[menorAltura].getAltura());
        System.out.printf("Maior Altura: %.2f%n", lista[maiorAltura].getAltura());
        System.out.printf("Média da altura das mulheres: %.2f%n", mediaMulheres);
        System.out.printf("Numero de homens: %s%n", numHomens);



        sc.close();
    }
    
}
