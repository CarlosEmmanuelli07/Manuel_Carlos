package unidad3;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[5];

        //pedimos numeros
        for(int i = 0; i < num1.length; i++){
            System.out.println("Introduce un numero: ");
            num1[i] = leer.nextInt();
        }
        for(int i = 0; i < num2.length; i++){
            System.out.println("Introduce un numero: ");
            num2[i] = leer.nextInt();
        }
        // realizamos los calculos

        for(int i = 0; i < num2.length; i++){
            num3[i] = num1[i] + num2[i];
            System.out.println("La suma da: " + num3[i]);         
        }
        
        leer.close();
    } 

}
