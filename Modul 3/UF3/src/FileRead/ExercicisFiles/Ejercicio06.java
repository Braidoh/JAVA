package FileRead.ExercicisFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ejercicio06 { // Mitjanes
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/src/FileRead/ExercicisFiles/scores.txt");
        Scanner sc = new Scanner(file);
        PrintWriter writer = new PrintWriter("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/src/FileRead/ExercicisFiles/medias.txt");

        while (sc.hasNextLine()) { // Mentre hi hagi línies
            String linia = sc.nextLine();
            String[] element = linia.split(" "); // Separa la línia per espais
            String nom = element[0]; // Agafa el primer element de la línia
            double suma = 0;

            for (int i = 1; i < element.length; i++) { // Suma tots els elements de la línia excepte el primer
                suma += Double.parseDouble(element[i]); // Converteix l'element a double i el suma
            }
            double mitja = suma / (element.length - 1); // Calcula la mitjana
            // Posa el nom i la mitjana
            writer.println(nom + " " + mitja);
            System.out.println(nom + " " + mitja);
        }
        sc.close();
        writer.close();
    }
}