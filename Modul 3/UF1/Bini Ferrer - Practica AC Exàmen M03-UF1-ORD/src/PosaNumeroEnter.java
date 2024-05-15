import java.util.Scanner;

public class PosaNumeroEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero:");

        // Bucle per si l'usuari ha posat un nombre no enter
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número entero:");
            sc.next();
        }

        int numero = sc.nextInt(); // Guarda l'input en una variable

        if (numero % 3 == 0) { // Comprobamos si el número es múltiplo de 3
            System.out.println("Has introducido un número múltiplo de 3");
        } else {
            System.out.println("Has introducido un número que no es múltiplo de 3");
        }
    }
}
