package unidad2;
import java.util.Scanner;
public class EntreCero1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Introduce un numero: ");
        num1 = leer.nextInt();
        int num2;
        System.out.println("Introduce un numero: ");
        num2 = leer.nextInt();
        int cociente;
        cociente = 0;
        System.out.println(cociente);
        // El usuario preferentemente introduzca 0
        try {
            cociente = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero ");
        }
        leer.close();

    }
}
