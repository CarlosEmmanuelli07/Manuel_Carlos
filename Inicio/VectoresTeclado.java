package unidad3;
import java.util.Scanner;
public class VectoresTeclado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] notas;
        notas = new int[18];
        for (int i = 0; i <= 4; i++ ){
            System.out.println("Introduce un numero ");
            notas[i] = leer.nextInt();
        }
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
        leer.close();
    }    
}
