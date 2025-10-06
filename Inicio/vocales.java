package unidad2;
import java.util.Scanner;
public class vocales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int letras;
        int contador;
        contador = 0;
        System.out.println("Introduce una palabra o frase: ");
        cadena = leer.nextLine();
        letras = cadena.length();
        System.out.println(letras);
        for ( int i = 0; i <=letras-1; i++){
            if (cadena.charAt(i) == 'a' | cadena.charAt(i) == 'i' | cadena.charAt(i) == 'e' | cadena.charAt(i) == 'o' | cadena.charAt(i) == 'u'){
                contador = contador + 1;
            }
        }
        System.out.println("Tiene " + contador + " vocales");
        leer.close();
    }
}
