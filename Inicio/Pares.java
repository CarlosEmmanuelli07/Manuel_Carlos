package unidad3;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] Pares;
        Pares = new int[20];


        for (int i = 0; i <= 20; i++){
            
            if (i % 2 == 0) {
                i = Pares[i];
                System.out.println("Los pares son: " + Pares[i]); 
            }
        }
        leer.close();
    }
}
