import java.util.Scanner;

public class Constantes {

    public static void main(String[] args) {
        // Para declarar una constante se utiliza la palabra final al principio de la declaracion.
        // Notación nombrar constantes: letras en mayúscula separadas por guion bajo _
        final int DIAS_SEMANA;

        // En este caso pediremos el valor de la variable por teclado
        System.out.print("Introduce la cantidad de dias que tiene una semana: ");
        Scanner leer = new Scanner(System.in);
        DIAS_SEMANA = leer.nextInt();

        // Prueba a descomentar esta linea ¿Que ocurre?
        //DIAS_SEMANA = 30;

        System.out.println("Los dias que tiene una semana son: " + DIAS_SEMANA);

        // También podemos darle un valor a una constante en su declaracion
        final int DIAS_MES = 28;

        // Prueba a descomentar esta linea ¿Que ocurre?
        //DIAS_MES = 30;
        System.out.println("Los dias que tiene un mes son: " + DIAS_MES);

        leer.close();
    }
}

