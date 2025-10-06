package unidad2;
import java.util.Scanner;
public class FraccionInversa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int res;
        System.out.println("Introduce un numero. ");
        num = leer.nextInt();
        try {
            res = 1 / num;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("no se puede calcular el inverso de 0");
        }
        leer.close();
    }
}
