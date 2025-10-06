import java.util.Scanner;
public class ejercicioentornos {

    public static void main(String[] args) {
        int num; 
        int suma;
        int i = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = leer.nextInt();

        suma = 0;
        while (num > -1 & num != 0){
            suma = suma + (num % 10) ;
            num = num / 10;
            i = i + 1  ;
        }
        System.out.println(suma);
        leer.close();
    }
}