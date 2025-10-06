package unidad2;
import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia;
        String diaString;
        System.out.print("Introduce un numero: ");
        dia = leer.nextInt();
        if (dia >= 1 & dia <= 7) {
            switch (dia) {
                case 1: diaString = "lunes"; 
                    break;
                case 2: diaString = "martes";
                    break;
                case 3: diaString = "Miercoles";
                    break;
                case 4: diaString = "Jueves";
                    break;
                case 5: diaString = "Viernes";
                    break;
                case 6: diaString = "Sabado";
                    break;
                case 7: diaString = "Domingo";
                    break;
                default: diaString = "No has introducido ningun dia";
                    break;
            }
            System.out.println("El dia de la semana es: " + diaString);
            leer.close();
        }
    }
}
