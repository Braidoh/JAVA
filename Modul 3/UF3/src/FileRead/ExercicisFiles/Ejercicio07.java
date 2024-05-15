package FileRead.ExercicisFiles;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class Ejercicio07 { // Concesionari
    private static final String file = "concesionario.dat";
    private static String res; // És per estètica
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Menu(sc);
    }
    public static void Menu(Scanner sc) throws IOException {
        String option;

        do {
            System.out.println("""
                    Escull una opció:
                    1. Llistar cotxes
                    2. Afegir cotxes
                    3. Sortir
                    """);
            option = sc.next();
            switch (option) {
                case "1": // Llistar cotxes
                    Llista(sc);
                    Pantalla();
                    Menu(sc);
                    break;
                case "2": // Afegir cotxes
                    System.out.println("Posa una marca:");
                    String marca = sc.next();
                    System.out.println("Posa un model:");
                    String model = sc.next();
                    System.out.println("Posa els seients:");
                    int seats = Integer.parseInt(sc.next().trim());
                    Afegir(new Car(marca, model, seats));
                    Pantalla();
                    Menu(sc);
                    break;
                case "3": // Sortir
                    System.out.println("Sortint...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (!option.matches("3"));
    }
    private static void Llista(Scanner sc) throws IOException {
        ComprovarFitxer();
        RandomAccessFile arxiu = new RandomAccessFile(file, "r"); // Permís de lectura
        while (arxiu.getFilePointer() < file.length()) { // Mentre no arribi al final del fitxer
            String marca = arxiu.readUTF(); // Llegeix la marca
            String model = arxiu.readUTF(); // Llegeix el model
            int seats = arxiu.readInt(); // Llegeix els seients
            System.out.println(new Car(marca, model, seats)); // Printa les dades
        }
        arxiu.close();
        res = sc.next(); // Tornar al menú
    }

    private static void Afegir(Car car) throws IOException {
        ComprovarFitxer();
        RandomAccessFile arxiu = new RandomAccessFile(file, "rw"); // Dona a l'usuari permís de lectura i escriptura
        arxiu.seek(arxiu.length()); // Es posiciona al final del fitxer per afegir el nou cotxe
        arxiu.write(car.toByteArray()); // Escriu el cotxe en format Byte
        arxiu.close(); // Tanca el fitxer
    }

    private static void ComprovarFitxer() throws IOException {
        File file = new File("C:/Users/binif/OneDrive/Documentos/GitHub/JAVA/Modul 3/UF3/src/FileRead/ExercicisFiles/concessionari.dat");
        if (!file.exists()) { // Comprova si el fitxer existeix
            System.out.println("El fitxer no existeix, creant...");
            file.createNewFile();// Crea el fitxer
            if (file.exists()) { // Comprova si el fitxer s'ha creat amb èxit
                System.out.println("Fitxer creat");
            } else {
                System.out.println("El fitxer no s'ha creat");
            }
        }
    }

    private static void Pantalla() { // Mètode que neteja la pantalla
        for (int i = 0; i < 20; ++i) { // Repeteix 20 vegades
            System.out.println(); // Posa un salt de línia
        }
    }
}