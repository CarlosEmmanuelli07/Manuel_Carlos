package unidad3;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        int num;
        int[] dias = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] nombre_mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo" , "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        System.out.println("Introduce el mes");
        num = leer.nextInt();
        System.out.println("\nLa cantidad de dias que tiene el mes " + nombre_mes[num-1] + " son: " + dias[num-1]);

        leer.close();
    }
    

}
