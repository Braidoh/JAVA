package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class BucleScanners {
    public static void main(String args[]) throws FileNotFoundException {
        try {
            for (;;) { // Bucle infinito
                File file = new File("numbers.txt");
                Scanner sc = new Scanner(file); // Crear un objeto de tipo Scanner infinitamente
            }
        } catch (FileNotFoundException e) { // Error de archivo no encontrado
            System.out.println("La ruta del archivo no es correcta");
        } finally {
            System.out.println("Final del programa"); // Esta línea nunca se alcanzará debido al bucle infinito
        }

    }
}








