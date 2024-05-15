package TryCatch.ExercicisTryCatch;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introdueix la ruta del fitxer origen:");
            String ruta = sc.nextLine();
            System.out.println("Introdueix la ruta del fitxer destí:");
            String destino = sc.nextLine();
            String contingut = Llegir(ruta); // Llegeix el fitxer origen
            Escriu(destino, contingut); // Escriu el contingut al fitxer destí
            System.out.println("El programa ha acabat sense incidències.");
            sc.close();
        } catch (NoSuchFileException e) {
            System.out.println("El fitxer origen no existeix.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("El fitxer destí ja existeix.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String Llegir(String ruta) throws IOException {
        File file = new File(ruta);
        StringBuilder contingut = new StringBuilder(); // String mutable
        Scanner sc = new Scanner(file); // Llegeix el fitxer
        String line;
        while (sc.hasNextLine()) { // Mentre hi hagi línies per llegir
            line = sc.nextLine(); // Llegeix la línia
            contingut.append(line.toUpperCase()).append("\n"); // Afegeix la línia al contingut en majúscules
        }
        return contingut.toString(); // Retorna el contingut
    }

    public static void Escriu(String ruta, String contingut) throws IOException {
        File file = new File(ruta);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // Escriu al fitxer

        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("L'arxiu s'ha creat.");
            }
        }
        writer.write(contingut); // Escriu el contingut
        writer.close();
    }
}

