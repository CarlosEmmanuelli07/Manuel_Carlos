package unidad2;

public class Cadena {
    public static void main(String[] args) {
        String cadena;
        int cantidad;
        int contador;
        contador = 0;
        cadena = "Siempre se puede aprender java";
        cantidad = cadena.length();
        cadena = cadena.toUpperCase();
        for (int i = 0; i <= cantidad - 1; i++){
            System.out.println(cadena.charAt(i));
            contador = contador + 1;
            System.out.println(contador);
        }
        System.out.println(cadena.charAt(14));
        
    }
}
