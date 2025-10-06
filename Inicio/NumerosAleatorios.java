
public class NumerosAleatorios {
    public static void main(String[] args) {
        // Genera números reales entre 0 y 1
        System.out.println("Número real aleatorio: " + Math.random());
        System.out.println("Número real aleatorio: " + Math.random());

        // Para generar números entre un rango y otro
        System.out.println("Número entre 0 a 10: " + (Math.random() * 10));
        System.out.println("Número entre 1 a 11: " + (1 + Math.random() * 10));
        System.out.println("Número entre 0 a 100: " + (Math.random() * 100));

        // Para generar números enteros entre un rango y otro
        System.out.println("Número entre 0 a 9: " + (int)(Math.random() * 10));
        System.out.println("Número entre 1 a 10: " + (int)(1 + Math.random() * 10));
        System.out.println("Número entre 0 a 10: " + (int)(Math.random() * 11));
        System.out.println("Número entre 20 a 100: " + (int)(20 + Math.random() * 81));
    }
}

