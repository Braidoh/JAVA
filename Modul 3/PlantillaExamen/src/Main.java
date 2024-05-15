import java.io.*;
import java.util.Scanner;

public class Main {
    private static final File txt = new File("transactions.txt"); // Busca el fitxer .txt
    private static String nom;
    public static void main(String[] args) throws FileNotFoundException { // Mètode principal
        Scanner sc = new Scanner(System.in); // Crea un objecte Scanner per llegir l'entrada de l'usuari
        Menu(sc);
    }

    private static void Menu(Scanner sc) throws FileNotFoundException {
        String option;
        System.out.println("""
                    MENÚ PRINCIPAL:
                    a) Enregistrar una transacció
                    b) Veure transaccions
                    c) Sortir
                    _________________________________________________________________
                    Escull una opció:""");

        option = sc.next().toUpperCase(); // Fa que accepti qualsevol caràcter a més dels números
        switch (option) {
            case "A": // Mostrar llista de números bloquejats
                Enregistrar(sc);
                Menu(sc);
                break;
            case "B": // Afegir un número a la llista de números bloquejats
                Llista(sc);
                Menu(sc);
                break;
            case "C": // Treure número de la llista de números bloquejats
                sc.close(); // Tanca el Scanner
                System.exit(0); // Tanca el programa
                break;
            default: // Si l'usuari posa una altre cosa
                System.out.println("Opció no vàlida.");
                Menu(sc);
        }
    }

    private static void Llista(Scanner sc) throws FileNotFoundException { // Llista de transaccions
        if (txt.exists()) { // Si el fitxer no existeix
            try {
                System.out.println("Introdueix el nom del fitxer:");
                nom = sc.next();
                if (!nom.equals("transactions")) { // Si el nom no és transactions
                    System.out.println("El fitxer " + nom + " no és vàlid. Posa un altre:");
                } else {
                    BufferedReader br = new BufferedReader(new FileReader(txt)); // Llegeix el fitxer
                    String linea; // String per guardar les línies
                    while ((linea = br.readLine()) != null) // Mentre hi hagi línies
                        System.out.println(linea); // Printa les línies
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        } else {
            CrearFitxers();
        }
    }

    private static void Enregistrar(Scanner sc) throws FileNotFoundException { // Enregistra una transacció
        if (txt.exists()) { // Si el fitxer no existeix
            String moneda, importe;
            try {
                System.out.println("Introdueix el nom del fitxer:");
                nom = sc.next();
                if (!nom.equals("transactions")) { // Si el nom no és transactions
                    System.out.println("El fitxer "+nom+" no és vàlid. Posa un altre:");
                } else {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(txt));  // Crea un nou fitxer amb el nom que li ha posat l'usuari
                    System.out.println("S'ha accedit a " + nom + ".txt \n Posa el tipus de criptomoneda:");
                    moneda = sc.next();
                    System.out.println("Introdueix l'import:");
                    importe = sc.next();
                    writer.write("Nom: " + nom + " Criptomoneda: " + moneda + " Import: " + importe + " Data: " + java.time.LocalDate.now());
                    writer.newLine();
                }
            } catch (IOException e) { // IOException: excepció que es produeix quan hi ha un error d'entrada/sortida
                System.out.println("Error");
                e.printStackTrace(); // Imprimeix un seguiment d'error detallat
            }
        } else {
            CrearFitxers();
        }
    }
    private static void CrearFitxers () throws FileNotFoundException { // Crea el fitxer si no existeix
        System.out.println("El fitxer que conté l'historial de les transaccions no existeix. \n Creant... ");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(txt));  // Crea un nou fitxer
            System.out.println("S'ha creat el fitxer");
        } catch (IOException e) { // IOException: excepció que es produeix quan hi ha un error d'entrada/sortida
            System.out.println("Error");
            e.printStackTrace(); // Imprimeix un seguiment d'error detallat
        }
    }
}