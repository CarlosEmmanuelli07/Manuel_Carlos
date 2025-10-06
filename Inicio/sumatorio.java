import java.util.Scanner;
public class sumatorio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int suma;
        suma = 0;
        int conteo;
        conteo = 0;
        System.out.println("Introduce una serie de numeros: ");
        n = leer.nextInt(); 
        while (n > -1 & n != 0) {
            suma = suma + (n % 10);
            n = n / 10;
            conteo = conteo + 1;
        }
        System.out.println("El resultado de la suma es: " + suma + " y tiene: " + conteo);

        leer.close();
    }
}
