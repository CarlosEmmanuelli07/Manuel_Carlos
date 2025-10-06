import java.util.Scanner;
public class evalu2 {
    public static void main(String[] args) {
        int a;
        int b;
        int suma;
        int resta;
        int producto;
        int cociente;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        a = leer.nextInt();
        System.out.println("Introduce un numero");
        b = leer.nextInt();
        suma =  a + b;
        resta = a - b;
        producto = a * b;
        cociente = a / b;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(cociente);
        if (a<b) {
            System.out.println(b + " Es mayor");
        }else{
            System.out.println(a + " Es mayor");
        }
        leer.close();
    }
}
