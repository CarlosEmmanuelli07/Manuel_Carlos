package unidad3;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamaño = (int)(Math.random() * 10);


        // Llenamos el vector

        int[] num;
        num = new int[tamaño];

        for ( int i = 0; i < num.length; i++ ){
            System.out.println("Introduce numeros: ");
            num[i] = leer.nextInt();
        }    

        //pasamos a copiar el vector en el segundo vector

        int[] num2;
        num2 = new int[tamaño];
        
        for( int i = 0; i < num.length; i++){
            num2[i] = num[i];
        }
        

        //cambiamos un dato

        num[1] = 2;


        //mostramos el resultado

        for( int i = 0; i < num.length; i++){
            System.out.println("Los numeros son del primer vector son: " + num[i]);
            System.out.println("Los numeros son del segundo vector son: " + num2[i]);
        }

        leer.close();
    }
}
