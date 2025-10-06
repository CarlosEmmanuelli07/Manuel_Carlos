import java.util.Scanner;
public class pares {
    public static void main(String[] args) {
        int num;
        int suma;
        suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = leer.nextInt();
        for ( int i = 1; i <= num; i++ ){
            if ( i % 2 == 0){
                suma = suma + i;
            }
        }
        System.out.println("los numero pares son:" + suma);
        leer.close();
    }

}
