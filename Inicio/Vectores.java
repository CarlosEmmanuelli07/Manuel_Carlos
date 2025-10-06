package unidad3;

public class Vectores {
    public static void main(String[] args) {
        int []notas = {8, 10, 2, 3, 5};

        System.out.println(notas[3]);
        System.out.println(notas[4]);
        System.out.println(notas[0]);
        System.out.println(notas[1]);

        notas[1] = 9;

        


        System.out.println("ahora iran en orden: ");
        for (int i = 0; i <= 4; i++){
            System.out.println(notas [i]);
        }

        System.out.println(notas);
    }
}
