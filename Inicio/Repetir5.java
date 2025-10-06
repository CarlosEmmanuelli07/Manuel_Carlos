package unidad2;
import java.util.Scanner;
public class Repetir5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
    System.out.print("Introduce un numero: ");
    num = leer.nextInt();
    for (int i = 1; i <= 5; i++){
        System.out.println(num);
    }
    leer.close();
    }
}
