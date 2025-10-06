package unidad3;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num1;
        int tamaño = (int)(Math.random() * 10);
        num1 = new int[tamaño];
        
        //creamos el segundo vector

        int[] num2;
        num2 = new int[tamaño];


        //El usuario introduce los valores

        for (int i = 0; i < tamaño; i++){
            System.err.println("Introdice los valores: ");
            num1[i] = leer.nextInt();
        }

        // realizamos la copia de los vectores

        System.arraycopy(num1, 0, num2, 0, tamaño);

        //modificamos un valor

        num1[1] = -5;

        // mostrar los cambios

        for (int i = 0; i < tamaño; i++){
            System.out.println("Los vectores son: " + num1[i]);
            System.out.println("Los vectores son: " + num2[i]);
        }

        leer.close();
    }
    

}
