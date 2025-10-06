package unidad2;
import java.util.Scanner;
public class Iguales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Introduce un numero entero: ");
        n1 = leer.nextInt();
        System.out.print("Introduce un numero entero: ");
        n2 = leer.nextInt();
        if (n1 < n2 ) {
            System.out.println(n2 + " Es mayor");
        }else if (n1 == n2) {
            System.out.println("Son iguales");
        }else {
            System.out.println(n1 + " Es mayor");
        }
        leer.close();
    }
}
