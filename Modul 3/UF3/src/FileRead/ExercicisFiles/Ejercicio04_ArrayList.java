package FileRead.ExercicisFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04_ArrayList { // Mitja de números en un arxiu
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file);

        ArrayList<Double> numbers = new ArrayList<>();
        double sum = 0;

        if (file.exists()) {
            while (sc.hasNextLine()) {
                String[] numberStrings = sc.nextLine().split(" ");
                for (String numberString : numberStrings) {
                    if (!numberString.isEmpty()) {
                        double number = Double.parseDouble(numberString);
                        numbers.add(number);
                        sum += number;
                    }
                }
            }
            if (!numbers.isEmpty()) {
                double average = sum / numbers.size();
                System.out.println("La media de todos los valores es: " + average);
            } else {
                System.out.println("No hay números en el archivo para calcular la media.");
            }
        } else {
            System.out.println("El fitxer no existeix");
        }
        sc.close();
    }
}