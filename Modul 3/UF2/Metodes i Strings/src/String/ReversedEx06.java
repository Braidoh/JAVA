import java.util.Scanner;

public class ReversedEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto y pulsa enter:");
        String text = sc.nextLine();

        String reverse = ""; // Cadena buida pel text invertit

        for (int i = text.length() - 1; i >= 0; i--) { // Recorremos el texto original, carácter a carácter
            reverse += text.charAt(i); // Agregamos el carácter actual al texto invertido
        }

        System.out.println("Texto invertido: " + reverse); //Imprimeix el text invertit
    }
}
