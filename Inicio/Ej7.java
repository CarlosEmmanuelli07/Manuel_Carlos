package unidad3;

public class Ej7 {
    public static void main(String[] args) {
        int[] vectores_numeros;

        vectores_numeros = new int[10];
        for(int i = 0; i < vectores_numeros.length; i++){
           vectores_numeros[i] = (int)(Math.random() * 10);
        }
        
        System.out.println("Los números son: "); //si lo haces así te sale mejor, y más bonito :)

        for (int i = 0; i < vectores_numeros.length; i++){
            System.out.print(vectores_numeros[i] + " ");
        }
        
    }
}
