package unidad3;
import java.util.Scanner;
public class MediaPares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num;
        num = new int[10];
        int contador;
        contador = 0;
        int suma;
        suma = 0;
        double total;

        for (int i = 0; i <= 9; i++ ){

            System.out.println("Introduce una numero: ");
            num[i] = leer.nextInt();
            suma = suma + num[i];
            if (num[i] % 2 == 0) {
                contador++;
            }
        }
        total = (double) suma / contador;

        System.out.println("La media de los numeros pares son: " + total);
        leer.close();

    
    }
}
