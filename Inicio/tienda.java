import java.util.Scanner;
public class tienda {
    public static void main(String[] args) {
        int mes;
        double importe;
        double descuento;
        double total;
        double porcentaje;
        porcentaje = 0.85;
        total = 0.00;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el mes de manera numerica");
        mes = leer.nextInt();

        System.out.println("Introduzca el importe");
        importe = leer.nextDouble();

        System.out.println(importe);
        System.out.println(mes);
        if (mes == 10) {
            descuento = importe * (1 - porcentaje);
            total = importe - descuento;
        }
        System.out.println("El importe final es: " + total);
        leer.close();
    }
}
