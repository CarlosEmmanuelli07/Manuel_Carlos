import java.util.Scanner;
public class perfecto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int i;
        i = 1;
        System.out.print("Introduce un numero: ");
        num = leer.nextInt();
        while (i <= num) {
            if (num % i == 0) {
                i++;
            }else{
                System.out.println("No es perfecto");
            }
        }
        System.out.println("El numero" + num + "Es perfecto");
        leer.close();
    }
}
