package unidad2;

public class DosCadenas {
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        String d;
        int numeroletrasB;
        int numeroletrasA;
        a = "Esto es un String";
        b = " Y esto también";
        c = a.concat(b);
        System.out.println(c);
        d = a.concat(b);
        System.out.println(d);
        if (c.compareTo(d) == 0) {
            numeroletrasB = a.length();
            numeroletrasA = b.length();
            System.out.println(numeroletrasA);
            System.out.println(numeroletrasB);
        }
        a = b;
        System.out.println(a);
        System.out.println(b);
    }
}
