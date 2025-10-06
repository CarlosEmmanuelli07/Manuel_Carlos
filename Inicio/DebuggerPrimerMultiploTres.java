package unidad2;
import java.util.Scanner;
public class DebuggerPrimerMultiploTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean encontrado = false;

        for (int i = num; i <= num + 10; i++) {
            if (i % 3 == 0) {
                encontrado = true;
                System.out.println("El primer múltiplo de 3 es: " + i);
                break;
            }
            if (!encontrado) {
                System.out.println("No se encontró un múltiplo de 3 en el rango.");
            }
        }
        
        scanner.close();
    }
}