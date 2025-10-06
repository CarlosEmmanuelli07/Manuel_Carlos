package unidad2;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.print("Introduce un numero: ");
        num1 = leer.nextInt();
        if (num1 % 2 == 0 ) {
            System.out.print(num1 + " Es par");
        }else{
            System.out.print(num1 + " Es impar");
        }
        leer.close();
    }
}
