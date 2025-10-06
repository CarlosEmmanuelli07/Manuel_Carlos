package unidad2;
import java.util.Scanner;
public class NegPos{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero: ");
        n = leer.nextInt();
        if (n < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es positivo");
        }
        leer.close();
    }
}