package unidad2;
import java.util.Scanner;
public class Suma_impares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        num1 = leer.nextInt();
        int num2; 
        num2 = leer.nextInt();
        int suma1;
        suma1 = 0;
        int suma2;
        suma2 = 0;
        for ( int i = 1; i <= num1; i++){
            if (i % 2 != 0) {
                suma1 = suma1 + i;
            }
        }
        System.out.println("la suma de los numeros impares del numero: " + num1 + "es: " + suma1);
        for (int i = 1; i <= num2; i++){
            if (i % 2 != 0 ) {
                suma2 = suma2 + i;   
            }
            System.out.println("la suma de los numeros impares del numero: " + num2 + "es: " + suma2 );
        }
        leer.close();
    }    
}
