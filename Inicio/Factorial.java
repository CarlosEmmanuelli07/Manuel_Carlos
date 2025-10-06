package unidad2;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int fact;
        fact = 1;
        System.out.print("Introduce un numero: ");
        num = leer.nextInt();
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.print("El factorial es: " + fact);
        leer.close();
    }
}