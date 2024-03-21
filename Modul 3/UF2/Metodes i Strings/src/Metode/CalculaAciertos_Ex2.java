package Metode;
import java.util.Scanner;

public class CalculaAciertos_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix 6 números:");
        sc.close();
        int[] numUser = new int[6];
        int[] primitiva = new int[6];

        for (int i : numUser) {
            numUser[i] = sc.nextInt();
        }

        for (int i :primitiva) {
            primitiva[i] = (int) (Math.random() * 50);
        }

        int encerts = calcularEncerts(numUser, primitiva); // Llamamos al método para calcular el número de aciertos
        System.out.println("Has acertado " + encerts + " números.");
    }

    public static int calcularEncerts(int[] numUser, int[] primitiva) {
        int encerts = 0;
        for (int k : numUser) {
            for (int i : primitiva) {
                if (k == i) {
                    encerts++;
                    break;
                }
            }
        }
        return encerts;
    }
}
