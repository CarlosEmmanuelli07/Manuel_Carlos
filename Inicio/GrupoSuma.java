package unidad2;
import java.util.Scanner;
public class GrupoSuma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numgrupo;
        System.out.print("Introduce el numero de grupo: ");
        numgrupo = leer.nextInt();
        int sumatotal;
              // prederentemente que sea 0
        System.out.print("Introduce un numero de suma total: ");
        sumatotal = leer.nextInt();
        int resultado;
        try {
            resultado = numgrupo / sumatotal;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("el total de elementos no puede ser 0");
        }
        leer.close();
    }
}
