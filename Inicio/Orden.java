package unidad2;
import java.util.Scanner;
public class Orden {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 , num2, num3;
        int mayor;
        mayor = 0;
        int enmedio;
        enmedio = 0;
        int menor;
        menor = 0;
        System.out.print("Introduce un numero: ");
        num1 = leer.nextInt();
        System.out.print("Introduce un numero: ");
        num2 = leer.nextInt();
        System.out.print("Introduce un numero: ");
        num3 = leer.nextInt();
        //numero uno es mayor
        if (num1 > num2 & num1 > num3) {
            mayor = num1;
            if (num2 > num3){
                enmedio = num2;
                menor = num3;
            }else{
                enmedio = num3;
                menor = num2;
            }
        }
        // numero 2 es el mayor
        if (num1 < num2 & num2 > num3) {
            mayor = num2;
            if (num1 > num3){
                enmedio = num1;
                menor = num3;
            }else{
                enmedio = num3;
                menor = num1;
            }
        }
        // numero 3 es el menor
        if (num1 < num3 & num2 < num3) {
            mayor = num3;
            if (num2 > num1){
                enmedio = num2;
                menor = num1;
            }else{
                enmedio = num1;
                menor = num2;
            }
        }   
        System.out.println("El orden es: " + mayor + enmedio + menor);
        leer.close();
        
    }
}
