package unidad3;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num;
        num = new int[10];
        int contador;
        contador = 0;

        // bucle para el negativo

        for (int i = 0; i < num.length ; i++){
            System.out.print("introduce un numero: ");
            num[i] = leer.nextInt();
            if (num[i] < 0) {
                System.out.println("No pueden ser introducir negativos");
                break;
            }else{
                contador++;
            }
        }

        // mostrar los numeros introducidos

        for(int i = 0; i < contador ; i++){
            System.out.println("Los numeros introducidos son: " + num[i]);
        }
        leer.close();
        
    }
}
