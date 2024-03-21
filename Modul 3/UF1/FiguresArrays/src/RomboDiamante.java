import java.util.Scanner;

public class RomboDiamante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        int radio = scanner.nextInt();
        int arraySize = 2 * radio + 1; // Tamaño del array bidimensional
        char[][] array = new char[arraySize][arraySize];

        // Dibujar el círculo
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (Math.abs(i - radio) + Math.abs(j - radio) <= radio) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (char[] row : array) { // Muestra el circulo
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
