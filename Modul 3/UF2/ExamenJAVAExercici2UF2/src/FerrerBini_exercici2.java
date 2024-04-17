import java.util.Scanner;

public class FerrerBini_exercici2 {
    private static final String[][] alumnes = new String[][]{ // Llista d'alumnes
        // ID_alumne - id_examen - Alta
            {"1", "1", "N"},
            {"2", "1", "N"},
            {"3", "1", "N"},
            {"4", "1", "N"},
            {"5", "2", "N"},
            {"6", "2", "N"},
            {"7", "2", "N"},
            {"8", "2", "N"},
            {"9", "3", "N"},
            {"10", "3", "N"},
            {"11", "3", "N"},
            {"12", "3", "N"},
            {"13", "4", "N"},
            {"14", "4", "N"},
            {"15", "4", "N"},
            {"16", "4", "N"},
            {"17", "5", "N"},
            {"18", "5", "N"},
            {"19", "5", "N"},
            {"20", "5", "N"}
    };
    private static final String[][] examens = new String[][]{ // Llista d'exàmens en reserva
        // id_examen - data - Alta
            {"1", "20240105", "N"},
            {"2", "20240110", "N"},
            {"3", "20240115", "N"},
            {"4", "20240120", "N"},
            {"5", "20240125", "N"},
            {"6", "20240130", "N"},
            {"7", "20240205", "N"},
            {"8", "20240210", "N"},
            {"9", "20240215", "N"},
            {"10", "20240220", "N"}
    };

    // Variables que guarden els valors
    static int numero = 0;
    static String num = "";
    static boolean trobat = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creació scanner
        Menu(sc); // Crida mètode menú
    }

    private static void Menu(Scanner sc) { // Mètode menú
        System.out.println("""
                Menú del Programa:
                1. Donar d'alta un alumne
                2. Donar d'alta una reserva d'exàmen
                3. Sortir""");

        String option = sc.next();
        switch (option) {
            case "1": // Dona d'alta un nou alumne
                System.out.println("Has escollit la opció 1: Donar d'alta un alumne");
                altaAlumne(sc);
                Menu(sc); // El fa recursiu
                break;
            case "2": // Dona d'alta una nova reserva d'exàmen
                System.out.println("Has escollit la opció 2: Donar d'alta una reserva d'exàmen");
                altaExamen(sc);
                Menu(sc);
                break;
            case "3": // Sortir
                System.out.println("Sortint...");
                sc.close(); // Tanca scanner
                System.exit(0); // Finalitza programa
                break;
            default: // Si l'usuari posa una altre cosa
                System.out.println("Opció no vàlida");
                Menu(sc);
                break;
        }
    }

    private static void altaAlumne(Scanner sc) { // Mètode que dona d'alta un treballador
        System.out.println("Introdueix el número de l'alumne (1-20):");
        input(sc);

        for (String[] alumne : alumnes) { // Recorre tots els alumnes
            String id_alumne = alumne[0]; // Guarda la ID de l'alumne
            if (id_alumne.equals(num)) { // Comprova si la ID coincideix
                alumne[2] = "S"; // Canvia el valor de la tercera columna a "S"
                System.out.println("Alumne trobat");
                trobat = true; // Marca que s'ha trobat
                break; // Finalitza la cerca per estalviar recursos
            }
        }
        NoTrobat();

        for (String[] alumne : alumnes) { // Imprimeix tots els alumnes
            System.out.println("ID Alumne: " + alumne[0] + ", ID Examen: " + alumne[1] + ", Alta: " + alumne[2]);
        }
    }

    private static void altaExamen(Scanner sc) { // Mètode que dona d'alta una reparació
        System.out.println("Introdueix el número de l'examen (1-10):");
        input(sc);

        for (String[] examen : examens) { // Fa exactament el mateix que el mètode anterior però amb els exàmens
            String id_examen = examen[0];
            if (id_examen.equals(num)) {
                examen[2] = "S";
                System.out.println("Examen trobat");
                trobat = true;
                break;
            } else {
                System.out.println("Examen no trobat");
            }
        }
        NoTrobat();

        for (String[] examen : examens) { // Imprimeix tota la llista d'exàmens
            System.out.println("ID Examen: " + examen[0] + ", Data: " + examen[1] + ", Alta: " + examen[2]);
        }
    }

    private static void input(Scanner sc) { // Mètode per rebre un número entre 1 i 20
        do { // Bucle fins que el número sigui correcte
            numero = sc.nextInt();
            if (numero < 1 || numero > 20) {
                System.out.println("Input incorrecte");
            } else {
                num = String.valueOf(numero);
            }
        } while (numero < 1 || numero > 20); // Si el número no està entre 1 i 10, torna a demanar-lo
    }

    private static void NoTrobat() { // Envia un missatge que no s'ha trobat
        if (!trobat) { // Si no s'ha trobat cap alumne, imprimeix el missatge
            System.out.println("Alumne no trobat");
        }
    }
}