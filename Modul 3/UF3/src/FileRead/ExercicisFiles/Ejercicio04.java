package FileRead.ExercicisFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ejercicio04 { // Calcular la mitjana de tots els números d'un fitxer
    public static void main(String[] args) throws FileNotFoundException { // throws FileNotFoundException: per si no troba el fitxer
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file); // Crear un objecte de tipus Scanner

        double suma = 0;
        int count = 0;

        if (file.exists()) {
            while (sc.hasNextLine()) {
                String[] numero = sc.nextLine().split(" ");
                for (String num : numero) {
                    if (!num.isEmpty()) {
                        suma += Double.parseDouble(num);
                        count++;
                    }
                }
            }
            if (count != 0) {
                double mitja = suma / count;
                System.out.println("Mitjana: " + mitja);
            } else {
                System.out.println("No hay números en el archivo para calcular la media.");
            }
        } else {
            System.out.println("El fitxer no existeix");
        }
        sc.close();
    }
}

//Print
