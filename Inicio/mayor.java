import java.util.Scanner;

public class mayor {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1 = leer.nextInt();
        System.out.println("Introduce un numero");
        num2 = leer.nextInt();
        System.out.println("Introduce un numero");
        num3 = leer.nextInt();
        if (num1 > num2) {
            mayor=num1;
        } else{
            mayor=num2;
        }
        if (mayor > num3){
            System.out.println(mayor + "Es mayor");
        }else{
            System.out.println(num3 + "Es mayor");
        }
        leer.close();
    }
}