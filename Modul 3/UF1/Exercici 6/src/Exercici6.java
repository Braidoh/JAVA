import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {

        // Crear un array d'enters amb 10 elements
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Introdueix l'element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Introdueix la posició de l'element a eliminar: ");
        int position = scanner.nextInt();

        if (position < 0 || position >= array.length) { // Verificar si la posició proporcionada és vàlida

            System.out.println("La posició ha d'estar entre 0 i 9");
            scanner.close(); // Tancar el Scanner i sortir del programa si la posició no és vàlida
            return;
        }

        for (int i = position; i < array.length - 1; i++) { // Eliminar l'element a la posició indicada, desplaçant els elements restants
            array[i] = array[i + 1];
        }

        array[array.length - 1] = -1; // Establir l'últim element com a -1, ja que s'ha eliminat un element

        System.out.println("Array final:"); // Imprimir l'array resultant després d'eliminar l'element

        for (int valor : array) {
            System.out.print(valor + " ");
        }
        scanner.close();
    }
}
