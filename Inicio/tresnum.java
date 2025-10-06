import java.util.Scanner;
public class tresnum {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce un numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Introduce un numero");
        num2 = leer.nextInt();
        System.out.println("Introduce un numero");
        num3 = leer.nextInt();
        if ( num1 > num2  &  num1 > num3 ) {
            System.out.println(num1 + " Es mayor");
        }else if ( num2 > num1  & num2 > num3 ) {
            System.out.println(num2 + " Es mayor");
        }else if ( num3 > num1  & num3 > num2 ) {
            System.out.println(num3 + " Es mayor");
        }else if (num3 == num1 & num3 == num2 & num1 == num2 & num1 == num3 & num2 == num1){
            System.out.println("Son todos iguales");
        }
        leer.close();
    }
}
