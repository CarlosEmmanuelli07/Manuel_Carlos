package unidad2;
import java.util.Scanner;
public class Secreta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String secreta;
        int contador;
        contador = 0;
        String respuesta;
        respuesta = "";
        System.out.println("Introduce la plabra secreta: ");
        secreta = leer.nextLine();
        // Empieza el adivina
        System.out.println("Introduce la respuesta");
        respuesta = leer.nextLine();
        while (contador != 3) {
            if (secreta.compareTo(respuesta) != 0) {
                System.out.println("No es esta palabra, prueba otra vez");
                respuesta = leer.nextLine();
                contador = contador + 1;
            }else{
                System.out.println("Enhorabuena has hacertado la palabra");
            }
        }
        System.out.println("La palabra era: " + secreta);
        leer.close();
    }
}
