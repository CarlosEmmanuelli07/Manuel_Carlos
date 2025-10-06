import java.util.Scanner;

public class BusquedaSecuencial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Crear un vector de tamaño 10 con valores aleatorios entre 1 y 50
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 50) + 1;
        }

        // Mostrar el contenido del vector
        System.out.println("\nVector generado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Preguntar el número a buscar
        System.out.print("Introduce el número que deseas buscar: ");
        int numero_buscado = scanner.nextInt();

        // Búsqueda secuencial
        boolean encontrado = false;
        /* TODO: Implementar la busqueda secuencial. Si se encuentra el numero,
           se debe mostrar un mensaje indicando la posicion en la que se encuentra.
           Tambien se debe poner el valor true a la variable encontrado.
        */

        for(int i = 0; i < numeros.length; i++){
            if (numero_buscado == numeros[i]) {
                System.out.println("La posicion del numero es la: " + i);
                encontrado = true;

                //Lo colocamos ya que solo queremos ver el unico y primer elemento

                break;
            }

        }

        // Si no se encontró el número
        if (!encontrado){
            System.out.println("El número " + numero_buscado + " no se encuentra en el vector.");
        }
        scanner.close();
    }
}