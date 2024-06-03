import java.util.Arrays;
import java.util.Scanner;

public class Exercici3_BonNadal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix l'altura desitjada de l'arbre: "); // Solicita la altura del árbol

        int height = sc.nextInt();
        char[][] array = new char[height][height << 1]; // Crea una matriz bidimensional de caracteres

        for (char[] row : array) {
            Arrays.fill(row, ' ');
        }

        for (int i = 0; i < array.length; i++) { // Dibuja el árbol de Navidad
            for (int j = 0; j < array[i].length; j++) {
                if (j >= height - i - 1 && j <= height + i - 1) {
                    array[i][j] = '*';
                }
            }
        }

        String bon = "BON"; // Centra el texto "BON"
        int center = (height - 1) / 2;
        for (int i = 0; i < bon.length(); i++) {
            array[center][height - 1 + i] = bon.charAt(i);
        }

        String nadal = "NADAL"; // Centra el texto "NADAL"
        int center2 = center + (nadal.length() - 1) / 2;
        for (int i = 0; i < nadal.length(); i++) {
            array[center2][height - 1 + i] = nadal.charAt(i);
        }

        for (char[] row : array) { // Muestra el árbol de Navidad
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
