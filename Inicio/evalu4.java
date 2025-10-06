import java.util.Scanner;
public class evalu4 {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        base =leer.nextDouble();

        System.out.println("Introduce la altura: ");
        altura =leer.nextDouble();

        System.out.println(base);
        System.out.println(1/2);
        area = (int) (1.0/2 * base * altura);
        System.out.println((base * altura));
        System.out.println("El area del triangulo es: " + area);
        leer.close();
    }
}
