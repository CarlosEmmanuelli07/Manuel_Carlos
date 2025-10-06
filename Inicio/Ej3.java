package examen;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        n1 = 0;

        System.out.print("Introduce un numero: ");
        n1 = leer.nextInt();
        while (n1 > 0) {
            System.out.println(n1);
            n1--;
        }
        leer.close();
    }
}
