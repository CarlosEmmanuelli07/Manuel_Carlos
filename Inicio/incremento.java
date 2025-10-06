import java.util.Scanner;
public class incremento {
    public static void main(String[] args) {
        int num1;
        System.out.println("Introduce un numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("El numero introducido es: " + num1);
        num1++;
        System.out.println("El numero introducido es: " + num1);
        leer.close();
    }
}
