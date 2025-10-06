package unidad2;

public class Suma {
    public static void main(String[] args) {
        int contador;
        contador = 0;
        for (int i = 1; i <= 100; i++){
            contador = contador + i;
        }
        System.out.println("El resultado es: " + contador);
    }
}
