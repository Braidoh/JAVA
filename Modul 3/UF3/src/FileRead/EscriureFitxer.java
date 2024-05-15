package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class EscriureFitxer {
    public static void main(String[] args){
        try {
            File file = new File("numbers.txt");
            PrintStream sc = new PrintStream(file); // Crear un objecte de tipus Scanner
            for (int i = 0; i < 5; i++) {
                sc.print(i + ";"); // Escriu 1;2;3;4 al fitxer
            }
            sc.close();
        } catch (FileNotFoundException e) { // Error de fitxer no trobat
            System.out.println("La ruta del fitxer no és correcta");
        } finally {
            System.out.println("Final del programa");
        }

    }
}








