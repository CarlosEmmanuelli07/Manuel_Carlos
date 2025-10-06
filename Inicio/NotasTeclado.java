package unidad3;
import java.util.Scanner;
public class NotasTeclado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero_alumnos;
        System.out.println("Introduce la cantidad de alumnos que tengas");
        numero_alumnos = leer.nextInt();
        int[] notas;
        notas = new int[numero_alumnos];
        int suma = 0;
        double media = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Introduce las notas: ");
            notas[i] = leer.nextInt();
            suma = suma + notas[i];
        }

        media = (double) suma / numero_alumnos;

        for (int i = 0; i < notas.length; i++){
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }else{
                System.out.println( notas[i] + " no esta por encima de la media");
            }
        }
        
        leer.close();
    }
}
