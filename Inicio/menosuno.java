import java.util.Scanner;
public class menosuno {
    public static void main(String[] args) {
        int n;
        int suma;
        int rec;
        double media;
        n = 0;
        media = 0;
        rec = 0;
        suma = 0;
        Scanner leer = new Scanner(System.in);
        while (n > -1) {
            System.out.println("Introduce un numero");
            n = leer.nextInt();
            if ( n != -1 ){
                suma = suma + n;
                rec = rec + 1;
            }
        }
        System.out.println(suma);
        System.out.println(rec);
        media = suma/rec;
        System.out.println("La media es de: " + media);
        leer.close();
    }
}
