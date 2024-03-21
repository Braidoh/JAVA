import java.util.Arrays;
import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix l'altura desitjada de l'arbre: "); // Demana l'altura de l'arbre

        int height = sc.nextInt();
        char[][] array = new char[height][2 * height - 1]; // Crea un array de caràcters bidimensional

        for (char[] row : array) { // Omple l'array amb espais en blanc
            Arrays.fill(row, ' ');
        }

        for (int i = 0; i < array.length; i++) { // Dibuixa l'arbre de Nadal
            for (int j = 0; j < array[i].length; j++) {
                if (j >= height - i - 1 && j <= height + i - 1) {
                    array[i][j] = '*';
                }
            }
        }

        // Mostra l'arbre de Nadal
        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}