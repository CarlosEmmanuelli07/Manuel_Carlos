package examen;
import java.util.Scanner;
public class Extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int cantidad;
        System.out.println("Introduce una palabra: ");
        palabra = leer.nextLine();
        cantidad = palabra.length();
        palabra = palabra.toLowerCase();

        // verificamos la palabra

        for (int i = cantidad-1; i >= 0 ; i-- ){
            System.out.print(palabra.charAt(i));
            
            if (palabra) {
                System.out.println("Es palindromo");
            }else{
                System.out.println("no es un palindromo");
            }
        }
        leer.close();
    }
}
