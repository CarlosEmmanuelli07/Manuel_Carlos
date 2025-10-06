package unidad2;
import java.util.Scanner;
public class Cinco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Introduce un numero: ");
        num = leer.nextInt();

        for ( int i = 1; i <= 5; i++){
            System.out.println("El numero inrtoducido es: " + num);
        }
        leer.close();
    }
}
