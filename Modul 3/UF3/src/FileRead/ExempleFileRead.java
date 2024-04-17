package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExempleFileRead {
    public static void main(String[] args) {
        File file;
        Scanner input;

        try {
            file = new File("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/numbers.txt.txt");
            input = new Scanner(file); // Crear un objecte de tipus Scanner

            while (input.hasNextInt()){
                int value = input.nextInt(); // Nomès pot llegir números enters del fitxer
                System.out.println("Valor: " + value);
            }
            input.close();

        } catch (FileNotFoundException e) { // Error de fitxer no trobat
            System.out.println("La ruta del fitxer no és correcta");
        } finally {
            System.out.println("Final del programa");

        }
    }
}

