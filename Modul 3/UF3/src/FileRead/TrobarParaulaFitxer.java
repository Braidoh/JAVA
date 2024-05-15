package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TrobarParaulaFitxer {
    public static void main(String[] args) {
        File file;
        Scanner input;

        try {
            file = new File("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/numbers.txt");
            input = new Scanner(file); // Crear un objecte de tipus Scanner

            while (input.hasNextInt()){
                String paraula = input.next(); // Pot llegir qualsevol tipus de dades
                System.out.println(paraula);
                if (paraula.equals("Hola")) { // Busca la paraula Hola
                    System.out.println("S'ha trobat la paraula Hola");
                } else {
                    System.out.println("No s'ha trobat la paraula Hola");
                }
            }
            input.close();
        } catch (FileNotFoundException e) { // Error de fitxer no trobat
            System.out.println("La ruta del fitxer no és correcta");
        } finally {
            System.out.println("Final del programa");

        }
    }
}

