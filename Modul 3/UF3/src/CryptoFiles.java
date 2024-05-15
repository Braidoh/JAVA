import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CryptoFiles {
    private static final File txt = new File("transactions.txt"); // Busca el fitxer .txt
    private static String nom;
    private static int importe;

    public static void main(String[] args) throws FileNotFoundException { // Mètode principal
        Scanner sc = new Scanner(System.in); // Crea un objecte Scanner per llegir l'entrada de l'usuari
        Menu(sc);
    }

    private static void Menu(Scanner sc) throws FileNotFoundException { // Menú principal
        String option;
        System.out.println("""
                Menú Principal:
                a) Enregistrar una transacció.
                b) Veure transaccions.
                c) Sortir del programa.
                ________________
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

    private static void Llista(Scanner sc) { // Llista de transaccions
        System.out.println("Introdueix el nom del fitxer:");
        nom = sc.next();
        File file = new File(nom + ".txt"); // Crea un objeto File con el nombre que el usuario ha introducido
        if (file.exists()) { // Si el fitxer existeix
            try {
                BufferedReader br = new BufferedReader(new FileReader(file)); // Llegeix el fitxer
                String linea; // String per guardar les línies
                while ((linea = br.readLine()) != null) // Mentre hi hagi línies
                    System.out.println(linea); // Printa les línies
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El fitxer " + nom + " no existeix.");
            CrearFitxer();
        }
    }

    private static void Enregistrar(Scanner sc) throws FileNotFoundException { // Enregistra una transacció
        if (txt.exists()) { // Si el fitxer no existeix
            String moneda;
            try {
                System.out.println("Introdueix el nom del fitxer:");
                nom = sc.next();
                if (!nom.equals("transactions")) { // Si el nom no és transactions
                    System.out.println("El fitxer " + nom + " no és vàlid. Posa un altre:");
                } else {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(txt, true));  // Crea un nou fitxer amb el nom que li ha posat l'usuari
                    System.out.println("S'ha accedit a " + nom + ".txt \n Posa el tipus de criptomoneda:");
                    moneda = sc.next();
                    importe(sc);
                    writer.write("Nom: " + nom + " Criptomoneda: " + moneda + " Import: " + importe + " Data: " + java.time.LocalDate.now());
                    writer.newLine();
                    writer.close();
                }
            } catch (IOException e) { // IOException: excepció que es produeix quan hi ha un error d'entrada/sortida
                System.out.println("Error");
                e.printStackTrace(); // Imprimeix un seguiment d'error detallat
            }
        } else {
            CrearFitxer();
        }
    }

    private static void CrearFitxer() {
        System.out.println("El fitxer que conté l'historial de les transaccions no existeix. \n Creant...");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(txt));  // Crea un nou fitxer
            System.out.println("S'ha creat el fitxer");
        } catch (IOException e) { // IOException: excepció que es produeix quan hi ha un error d'entrada/sortida
            System.out.println("Error");
            e.printStackTrace(); // Imprimeix un seguiment d'error detallat
        }
    }

    private static void importe(Scanner sc) { // Control d'errors de l'import        System.out.println("Introdueix l'import:");
        System.out.println("Introdueix l'import:");
        sc.nextLine(); // Consume any invalid token before entering the while loop
        while (!sc.hasNextInt()) { // If the next input is not an integer
            System.out.println("L'import ha de ser un número.");
            sc.nextLine(); // Clear the buffer
        }
        importe = sc.nextInt(); // Now we are sure that the next input is an integer
    }
}



