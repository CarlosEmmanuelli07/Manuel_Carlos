package examen;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int n2;
        char simbolo;
        int suma;
        int resta;
        int producto;
        int cociente;


        //Introducimos dos numeros

        System.out.print("Introduce un numero: ");
        n1 = leer.nextInt();
        System.out.print("Introduce un numero: ");
        n2 = leer.nextInt();

        // Introducimos el Simbolo de operación 

        System.out.println("Introduce un simbolo de operacion: ");
        simbolo = leer.next().charAt(0);

        // procedemos a realizar el menu para la caculadora
        
        switch (simbolo) {
            case '+':
                suma = n1 + n2;
                System.out.println("La suma de los nuemros es: " + suma);
                    break;
                case '-':
                resta = n1 - n2;
                System.out.println("La resta de los nuemros es: " + resta);
                    break;
                case '*': 
                producto = n1 * n2;
                System.out.println("La producto de los nuemros es: " + producto);
                    break;
                case '/': 
                    try {
                        cociente = n1 / n2;
                        System.out.println("La cociente de los nuemros es: " + cociente);
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                default: 
                System.out.println("No has introducido un simbolo");
                    break;
            }
            
            leer.close();
    }
}
