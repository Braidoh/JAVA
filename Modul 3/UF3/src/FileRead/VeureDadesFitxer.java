package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class VeureDadesFitxer {
    public static void main(String[] args) throws FileNotFoundException { // throws FileNotFoundException: per si no troba el fitxer
        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file); // Crear un objecte de tipus Scanner

        if (file.exists()) {
            System.out.println("Nom de l'arxiu: "+ file.getName());
            System.out.println("Ruta: "+ file.getPath());
            System.out.println("Ruta absoluta: "+ file.getAbsolutePath());
            System.out.println("Permisos d'escritura: "+file.canRead());
            System.out.println("Permisos de lectura: "+file.canWrite());
            System.out.println("Tamay: "+file.length());
        } else {
            System.out.println("El fitxer no existeix");
        }
        sc.close();
    }
}
