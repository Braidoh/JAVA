import java.util.Scanner;

public class Circulo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        int radio = scanner.nextInt();
        char[][] array = new char[2 * radio + 1][2 * radio + 1]; // Inicializar el array bidimensional


        for (int i = 0; i < array.length; i++) { // Itera sobre las filas del array
            for (int j = 0; j < array[i].length; j++) {  // Itera sobre las columnas de la fila actual
                double distancia = Math.sqrt((i - radio) * (i - radio) + (j - radio) * (j - radio)); // Calcula la distancia desde el punto central usando el teorema de Pitágoras
                if (distancia <= radio) {  // Si la distancia es menor o igual al radio, coloca un '*' en esa posición
                    array[i][j] = '*';
                }
                else { // De lo contrario, coloca un espacio en esa posición
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
