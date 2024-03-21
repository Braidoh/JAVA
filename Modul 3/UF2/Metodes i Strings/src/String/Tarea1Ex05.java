package String;
import java.util.Scanner;

public class Tarea1Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo",
        "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe el título del libro que quieres buscar:");
        String titulo = sc.nextLine();

        for (String libro : catalogo) { // Array que busca el libro dentro del catálogo
            if (libro.equalsIgnoreCase(titulo)) { // Ignora las mayúsculas y minúsculas
                System.out.println("Se ha localizado el libro");
                return; // Deja de buscar y devuelve un mensaje
            }
        }
        System.out.println("El libro no se encuentra en el catálogo");
    }
}
