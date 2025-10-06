package examen;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char letra;
        String frase;
        int cantidad;
        int contador;
        contador = 0;

        // Introducimos la letra y la frase 

        System.out.print("Introduce una letra: ");
        letra = leer.nextLine().charAt(0);
        System.out.print("Introduce una frase: ");
        frase = leer.nextLine();
        cantidad = frase.length();

        //Pasamos a contar cauntas veces sale esa letra en la frase

        for (int i = 0; i <= cantidad - 1; i++){
            if (frase.charAt(i) == letra) {
                contador++;
            }else{
                System.out.println(" No se encuentra la letra en la frase");
            }
        }
        System.out.println("la letra " + letra + "Aparece en la frase: " + contador );
        leer.close();
    }

    
}
