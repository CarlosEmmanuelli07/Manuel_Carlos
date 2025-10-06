package unidad3;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] notas;
        notas = new double[5];
        double media;
        double suma;
        suma = 0;

        //Introducir las notas 

        for (int i = 0; i < notas.length; i++){
            System.out.println("Introduce una notas del 1 al 10");            
            notas[i] = leer.nextInt();
            suma = suma + notas[i];
        }

        // ver todas las notas

        for (int i = 0; i < notas.length; i++){
            System.out.println("La nota es: " + notas[i]);
        }

        // Hacer la media

        media = (double) suma / 10;

        System.out.println("La nota media de la clase es: " + media);


        // Ver cual es la mayor y la menor

        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 0; i < notas.length; i++){
            if (notas[i] > mayor ) {
                mayor = notas[i];
            }else if (notas[i] < menor) {
                menor = notas[i];
                
            }
        }
        System.out.println("el numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        leer.close();
    }
}
