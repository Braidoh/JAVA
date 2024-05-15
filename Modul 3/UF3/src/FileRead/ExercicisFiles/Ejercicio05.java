package FileRead.ExercicisFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ejercicio05 { // Crea un fitxer numbers.txt amb 5 línies de 5 números aleatoris entre 1 i 100
    public static void main(String[] args) {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter // BufferedWriter: classe que permet escriure caràcters en un fitxer
                (new FileWriter("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/src/FileRead/ExercicisFiles/numbers.txt"))) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int number = 1 + random.nextInt(100); // Genera un número aleatori entre 1 i 100
                    writer.write(number + " "); // Posa espai entre els números
                }
                writer.newLine(); // Salta de línia
            } System.out.println("S'ha creat numbers.txt");
        } catch (IOException e) { // IOException: excepció que es produeix quan hi ha un error d'entrada/sortida
            System.out.println("Error");
            e.printStackTrace(); // Imprimeix un seguiment d'error detallat
        }
    }
}