import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero:");

        // Bucle per si l'usuari ha posat un nombre no enter
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, introduce un número entero:");
            scanner.next();
        }

        int numero = scanner.nextInt(); // Guarda l'input en una variable

        if (numero % 3 == 0) { // Comprobamos si el número es múltiplo de 3
            System.out.println("Has introducido un número múltiplo de 3");
        } else {
            System.out.println("Has introducido un número que no es múltiplo de 3");
        }
    }
}
