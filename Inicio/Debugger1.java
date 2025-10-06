package unidad2;
import java.util.Scanner;
public class Debugger1{ 
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra = 'A';
        int contador;
        contador = 0;

        while(letra != 'z'){
            System.out.print("Introduce una letra: ");
            letra = scanner.next().charAt(0);

            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    System.out.println("Es una vocal.");
                    break;
                default:
                    System.out.println("No es una vocal.");
            }
        }
        System.out.println("Número total de vocales: " + contador);
        scanner.close();
    }
}

