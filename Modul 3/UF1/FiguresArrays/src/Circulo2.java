import java.util.Scanner;

public class Circulo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        int radio = scanner.nextInt();
        char[][] array = new char[2 * radio + 1][2 * radio + 1]; // Inicializar el array bidimensional

        // Dibujar el círculo
        for (int i = 0; i < array.length; i++) { //horitzontal
            for (int j = 0; j < array[i].length; j++) { //vertical
                if (Math.sqrt((i - radio) * (i - radio) + (j - radio) * (j - radio)) <= radio) {
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
