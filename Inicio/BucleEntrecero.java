package unidad2;
import java.util.Scanner;
public class BucleEntrecero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = leer.nextInt();
        int res;
        for ( int i = (-5); i <= 5; i++ ){
            try {
                res = num / i;
                System.out.println(res);
            } catch (ArithmeticException e) {
               System.out.println("se ha intentado dicidir entre 0 en la iteración correspondiente");
            }
        }
        leer.close();
    }
}
