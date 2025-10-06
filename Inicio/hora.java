import java.util.Scanner;
public class hora {
    public static void main(String[] args) {
        int seg;
        int h;
        int min;
        int num;
        int seg2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce en segundos una hora");
        seg = leer.nextInt();
        h = seg / 3600;
        num = seg % 3600;
        min = num / 60;
        seg2 = num % 60;
        System.out.println("La hora es: " + " horas: " + h + " minutos: " + min + " Segundos: " + seg2); 
        leer.close();
    }
}
