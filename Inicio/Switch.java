import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Solicitar una opción al usuario
        System.out.print("Introduce un número del 1 al 3: ");
        opcion = scanner.nextInt();

        // Estructura switch para evaluar la opción introducida
        switch(opcion) {
            case 1:
                System.out.println("Has elegido la opción 1.");
                /* break se utiliza para salir del switch una vez ha ejecutado las instrucciones de este case. 
                Si lo quitamos, las instrucciones posteriores se ejecutarán.
                */
                break;
            case 2:
                System.out.println("Has elegido la opción 2.");
                break;
            case 3:
                System.out.println("Has elegido la opción 3.");
                break; 
            default:
                // Esta opción se ejecuta para el resto de casos: el número introducido no es 1, 2 o 3.
                System.out.println("Opción no válida. Debes introducir un número entre 1 y 3.");
                break;
        }

        scanner.close();
    }
}
