package unidad2;


import java.util.Scanner;

public class DebuggerSumaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        int suma = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {      
                suma += i;
            }
        }
        System.out.println("La suma de los números impares es: " + suma);
        scanner.close();
    }
}