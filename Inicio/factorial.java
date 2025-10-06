import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int i;
        int z;
        System.out.print("Introduce un numero: ");
        n = leer.nextInt();
        i = 1;
        z = 1;
        while (i <= n) {
            z = i * z;
            i++;
        }
        System.out.print("El factorial es: " + z);
        leer.close();
    }
}
