package unidad2;
import java.util.Scanner;
public class RestoTry {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int divisor;
        System.out.print(" Introduce un numero: ");
        divisor  = leer.nextInt();
        int dividendo;
        System.out.print(" Introduce un numero: ");
        dividendo  = leer.nextInt();
        int modulo; 
        try {
            modulo = divisor % dividendo;
            System.out.println(modulo);
        } catch (Exception e) {
            System.out.println("DD");
        }
        leer.close();
    }

}
