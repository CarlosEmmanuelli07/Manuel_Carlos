package unidad3;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] media;
        int contador;
        contador = 0;
        int suma;
        suma = 0;
        int total;
        media = new int[10];

        
        for (int i = 0; i <= 9; i++ ){
            System.out.println("Introduce una nota: ");
            media[i] = leer.nextInt();
            contador++;
            System.out.println("Llevamos " + contador + " numeros ingresados");
            suma = suma + media[i];
        }


        total = suma / contador;
        System.out.println("La media total es: " + total);
        leer.close();
    }
}
