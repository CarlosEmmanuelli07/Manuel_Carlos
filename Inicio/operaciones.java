import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce un numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Introduce un numero");
        num2 = leer.nextInt();
        int suma = num2 + num1;
        int producto = num1 * num2;
        int resta = num1 - num2;
        int cociente = num1 / num2;
        int modulo = num1 % num2;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(cociente);
        System.out.println(modulo);
        leer.close();
    }   
    
}
