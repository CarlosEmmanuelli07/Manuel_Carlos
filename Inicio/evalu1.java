import java.util.Scanner;
public class evalu1 {
    public static void main(String[] args) {
        final double desc = 0.10;
        double precio;
        double menosdesc;
        double preciofinal;
        Scanner leer = new Scanner(System.in);
        precio = leer.nextDouble();
        menosdesc = precio * desc;
        preciofinal = precio - menosdesc;
        System.out.println("El precio final es: " + preciofinal);
        leer.close();
    }
}
