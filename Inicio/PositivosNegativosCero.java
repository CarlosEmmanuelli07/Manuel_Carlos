package unidad3;
import java.util.Scanner;
public class PositivosNegativosCero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        int positivos = 0;
        int negativos = 0;
        int cero = 0;


        for (int i = 0; i < num.length; i++){
            System.out.println("introduce un numero: ");
            num[i] = leer.nextInt();
            if (num[i] > 0) {
                positivos++;
            }else if (num[i] == 0) {
                cero++;
            }else if (num[i] < 0) {
                negativos++;
            }
        }

        
        System.out.println("Has introducido: " + positivos + " positivos");
        System.out.println("Has introducido: " + negativos + " negativos");
        System.out.println("Has introducido: " + cero + " ceros");
        leer.close();
    }
}
