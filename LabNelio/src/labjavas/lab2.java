package labJavas;
import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        System.out.println(higher);


        sc.close();
    }

    public static int max(int x, int y, int z){
        if (x > y && x > z){
            return x;
        } else if (y > z){
            return y;
        } else {
            return z;
        }
    }
}