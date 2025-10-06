package examen;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        char letra;
        System.out.println("Introduce una letra");
        letra = leer.nextLine().charAt(0);

        // el bucle continua hasta el momento que se introduzca la letra p

        while (letra != 'p') {

            System.out.println("Introduce una letra");
            letra = leer.nextLine().charAt(0);

            //aqui revisamos si es una vocal o no 

            if (letra == 'a' | letra == 'i' | letra == 'e' | letra == 'o' | letra == 'u' ) {
                System.out.println("Has introducido una vocal");
            }else{
                System.out.println("No has introducido una vocal");
            }

        }
        leer.close();
    }
}
