import java.util.Scanner;
public class eje1 {
    public static void main(String[] args) {
        final double PI = 3.141539;
        Scanner leer = new Scanner(System.in);
        int r;
        System.out.print("Introduce el radio del circulo: ");
        r = leer.nextInt();
        int area;
        int elevado = (int) Math.pow(r, 2);
        area = (int) (elevado * PI);
        System.out.println("El area del circulo es: " + area);
        leer.close();

    }
}
