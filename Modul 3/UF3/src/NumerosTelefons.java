import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class NumerosTelefons {
    private static int numero, prefix;
    private static String telefon; // Ajunta el prefix i el número
    private static final File txt = new File("numerosBloquejats.txt"); // Busca el fitxer .txt

    public static void main(String[] args) throws IOException { // Mètode principal
        Scanner sc = new Scanner(System.in); // Crea un objecte Scanner per llegir l'entrada de l'usuari
        Inici(sc);
    }
    private static void Inici(Scanner sc) throws IOException {

        System.out.println("""
                    Menú Principal:
                    1) Mostrar llista de números bloquejats.
                    2) Afegir un número a la llista de números bloquejats.
                    3) Treure número de la llista de números bloquejats.
                    4) Verificar si un número de telèfon està a la llista de números bloquejats.
                    5) Eliminar el fitxer numerosBloquejats.
                    6) Sortir del programa.
                    __________________
                    Escull una opció:""");

        String option = sc.next(); // Fa que accepti qualsevol caràcter a més dels números
        switch (option) {
            case "1": // Mostrar llista de números bloquejats
                Llista(sc);
                break;
            case "2": // Afegir un número a la llista de números bloquejats
                AfegirTelefons(sc);
                break;
            case "3": // Treure número de la llista de números bloquejats
                TreureTelefons(sc);
                break;
            case "4":  // Verificar si un número està a la llista de números bloquejats
                Verificar(sc);
                break;
            case "5":   // Elimina les llistes
                Delete(sc);
                break;
            case "6": //Sortir
                sc.close(); // Tanca el Scanner
                System.exit(0); // Tanca el programa
                break;
            default: // Si l'usuari posa una altre cosa
                System.out.println("Opció no vàlida.");
                Inici(sc);
        }
    }

    private static void Delete(Scanner sc) throws IOException { // Elimina el fitxer
        if (txt.delete()) { // Si s'eliminen els fitxers
            System.out.println("S'han eliminat els fitxers.");
        } else { // Si no s'eliminen els fitxers
            System.out.println("No s'han pogut eliminar els fitxers.");
        } Inici(sc);
    }

    private static void Verificar(Scanner sc) throws IOException { // Verifica si un número de telèfon està a la llista de números bloquejats.
        if (txt.exists()) { // Si el fitxer no existeix
            Input(sc); // Demana els números
            Path path = Paths.get(txt.toURI());
            boolean trobat = Files.lines(path).anyMatch(line -> line.trim().equals(telefon));
            if (trobat) {
                System.out.println("El número +" + prefix + " " + numero + " es troba a la llista de números bloquejats.");
            } else {
                System.out.println("El número +" + prefix + " " + numero + " no es troba a la llista de números bloquejats.");
            }
            Inici(sc); // Torna a l'inici
        } else CrearFitxers(sc); // Si el fitxer no existeix el crea
    }

    private static void TreureTelefons(Scanner sc) throws IOException { // Treu un de telèfon de la llista
        if (txt.exists()) { // Si el fitxer no existeix
            Input(sc);
            List<String> lines = Files.readAllLines(txt.toPath()); // Llegeix totes les línies del fitxer i les guarda en una llista
            if (lines.contains(telefon)) { // Si la llista conté el telèfon
                lines.remove(telefon); // Elimina el telèfon de la llista
                Files.write(txt.toPath(), lines); // Escriu la llista modificada en el fitxer
                System.out.println("El número +" + prefix + numero + " s'ha eliminat de la llista de números bloquejats.");
            } else { // Si la llista no conté el telèfon simplement torna a l'inici
                System.out.println("El número +" + prefix + numero + " no es troba a la llista de números bloquejats.");
            }
            Inici(sc);
        } else CrearFitxers(sc); // Si el fitxer no existeix el crea
    }

    private static void AfegirTelefons(Scanner sc) throws IOException { // Afegeix un número de telèfon a la llista
        if (txt.exists()) { // Si el fitxer existeix
            Input(sc); // Demana els números
            List<String> lines = Files.readAllLines(txt.toPath()); // Llegeix totes les línies del fitxer i les guarda en una llista
            if (lines.contains(telefon)) { // Si la llista conté el telèfon
                System.out.println("El número +" + prefix + numero + " ja es troba en la llista de números bloquejats.");
            } else { // Si no està en la llista
                BufferedWriter escriu = new BufferedWriter(new FileWriter(txt, true));  // Crea un nou fitxer amb el nom que li ha posat l'usuari
                escriu.newLine(); // Salt de línia
                escriu.write("+" + prefix + " " + numero); // Escriu el prefix i el número de telèfon
                escriu.close(); // Guarda el que ha escrit en el fitxer
                System.out.println("El número s'ha posat a la llista");
            }
            Inici(sc);
        } else {
            CrearFitxers(sc); // Si el fitxer no existeix el crea
        }
    }

    private static void Input(Scanner sc) { // Demana el prefix i el número de telèfon
        System.out.println("Posa el número de prefix: ");
        while (true) { // Bucle infinit
            try {
                String num = sc.next();
                prefix = Integer.parseInt(num); // Converteix num a un enter
                if (prefix > 998 || prefix < 1) { // Posa els requisits que té un prefix
                    System.out.println("Valor incorrecte, torna de nou: ");
                } else break; // Trenca el bucle si el prefix és correcte
            } catch (NumberFormatException e) { // Si el número no és un enter
                System.out.println("Valor incorrecte, torna de nou: ");
            }
        }

        System.out.println("Posa el número de telèfon: ");
        while (true) { // Bucle infinit
            try {
                String num = sc.next(); // Converteix num a un enter
                numero = Integer.parseInt(num); // Converteix num a un enter
                if (numero > 999999999 || numero < 100000000) {   // Posa els requisits que té un telèfon
                    System.out.println("Valor incorrecte, torna de nou: ");
                } else break; // Trenca el bucle si el prefix és correcte
            } catch (NumberFormatException e) { // Si el número no és un enter
                System.out.println("Valor incorrecte, torna de nou: ");
            }
        }
        telefon = "+" + prefix + " " + numero; // Actualitza el valor de telèfon aquí
    }

    private static void Llista(Scanner sc) throws IOException { // Utilitza els fitxers .txt
        if (txt.exists()) { // Si el fitxer no existeix
            BufferedReader llegir = new BufferedReader(new FileReader(txt)); // Llegeix el fitxer
            String linea;
            while((linea =llegir.readLine())!=null) { // Mentre hi hagi línies
                System.out.println(linea); // Printa les línies
            } llegir.close(); // Tanca el fitxer
            System.out.println("Posa qualsevol cosa per continuar tornar a l'inici");
            sc.next();
            Inici(sc);
        } else CrearFitxers(sc); // Si el fitxer no existeix el crea
    }

    private static void CrearFitxers (Scanner sc) throws IOException { // Crea el fitxer
        System.out.println("Els fitxers no existeixen. \n Creant...");
        BufferedWriter escriu = new BufferedWriter(new FileWriter(txt));  // Crea un nou fitxer amb el nom que li ha posat l'usuari
        escriu.write("Llista de números de telèfons bloquejats"); // Escriu el títol
        escriu.close(); // Guarda el que ha escrit en el fitxer
        System.out.println("S'ha creat numerosBloquejats.txt");
        Inici(sc);
    }
}