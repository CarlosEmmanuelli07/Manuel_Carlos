package unidad2;
import java.util.Scanner;
public class espejo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String palabrafinal;
        palabrafinal = "";
        int letras;
        System.out.print("Introduce una palabra: ");
        palabra = leer.nextLine();
        letras = palabra.length();
        for (int i = 0; i <= letras-1; i-- ){
            System.out.println(palabrafinal);
        }
        leer.close();
    }
    
}
