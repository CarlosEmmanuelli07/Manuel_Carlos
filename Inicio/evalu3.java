import java.util.Scanner;
public class evalu3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a;
        System.out.print("Introduce un numero decimal: ");
        a = leer.nextDouble();
        int b;
        b = (int) a;
        System.out.println(a);
        System.out.println(b);
        leer.close();
    }
}
/*En el ejercicio se ve el traspaso de un tipo a otro se ve como en los enteros se elimina el apartado decimal
 * y en la inicial se mantiene el aparatado decimal sin ningun error*/