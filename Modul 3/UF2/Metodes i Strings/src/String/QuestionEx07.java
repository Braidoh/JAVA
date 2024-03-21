package String;
import java.util.Scanner;

public class QuestionEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Indica cual de las siguientes opciones no es un tipo primitivo en JAVA:"
                a) int
                b) char
                c) boolean
                d) String""");

        String correcte = "d";
        String input = sc.next();

        if (input.equals(correcte)) { // Validació de la resposta
            System.out.println("Respuesta correcta!"); // Respuesta correcta
        } else if (input.equals("a") || input.equals("b") || input.equals("c")) { // Resposta incorrecta
            System.out.println("Respuesta incorrecta: Respuesta correcta, la respuesta correcta es: " + correcte);
        } else { // Resposta no válida
            System.out.println("Respuesta no válida: a, b, c, d");
        }
    }
}
