package String;
import java.util.Scanner;

public class Tarea2Ex05 {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo",
        "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe palabra o palabras del título del libro que quieres buscar:");
        String titulo = sc.nextLine();

        String[] palabras = titulo.split(" "); // Divide las palabras buscadas en un array

        if (contienePalabras(titulo, palabras)) { // Comprueba si la cadena contiene las palabras buscadas
            for (String libro : catalogo) { // Si lo contiene, imprimimos los títulos de los libros
                if (contienePalabras(libro, palabras)) {
                    System.out.println(libro);
                }
            }
        } else {
            // Si no lo contiene, imprimimos un mensaje
            System.out.println("No se han encontrado libros con las palabras buscadas");
        }
    }

    public static boolean contienePalabras(String cadena, String[] palabras) {
        // Recorremos las palabras buscadas
        for (String palabra : palabras) {
            // Si la cadena contiene la palabra, devolvemos true
            if (cadena.contains(palabra)) {
                return true;
            }
        }
        return false; // Si no contiene ninguna palabra, devolvemos false
    }
}
