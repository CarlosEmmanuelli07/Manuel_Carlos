package unidad2;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.print("Introduce tu nota: ");
        nota = leer.nextInt();
        while (nota >= 0 & nota <= 10) {
            if (nota >= 5 ) {
                System.out.println("Estas aprovado");
            }else {
                System.out.println("Estas suspenso");
            }
            break;
        }
        leer.close();
    }   
}
