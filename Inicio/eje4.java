import java.util.Scanner;
public class eje4 {
    public static void main(String[] args) {
       final double conv = 1.08;
        double euro;
        int cambio;
        System.out.print("Introduce un valor: ");
        Scanner leer = new Scanner(System.in);
        euro = leer.nextInt();
        cambio = (int) (euro * conv);
        System.out.print("El cambio es: " + cambio);
        leer.close();
    }
}
