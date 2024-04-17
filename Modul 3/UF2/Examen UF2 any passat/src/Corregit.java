import java.util.Scanner;

public class Corregit {
    private static final String[][] treballadors = new String[][]{ // Llista dels treballadors
            // ID_Treballador - Número Mobil - Alta
            {"1", "000000001", "N"},
            {"2", "000000002", "N"},
            {"3", "000000003", "N"},
            {"4", "000000004", "N"},
            {"5", "000000005", "N"},
            {"6", "000000006", "N"},
            {"7", "000000007", "N"},
            {"8", "000000008", "N"},
            {"9", "000000009", "N"},
            {"10", "000000010", "N"}
    };
    private static final String[][] movils = new String[][]{ // Llista de reparacions
            // Numero reparació - IMEI - DNI - Alta
            {"1", "000000001", "11111111A", "N"},
            {"2", "000000002", "11111111B", "N"},
            {"3", "000000003", "11111111C", "N"},
            {"4", "000000004", "11111111D", "N"},
            {"5", "000000005", "11111111E", "N"},
            {"6", "000000006", "11111111F", "N"},
            {"7", "000000007", "11111111G", "N"},
            {"8", "000000008", "11111111H", "N"},
            {"9", "000000009", "11111111I", "N"},
            {"10", "000000010", "11111111J", "N"}
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creació scanner
        Menu(sc); // Crida mètode menú
    }

    private static void Menu(Scanner sc) { // Mètode menú
        System.out.println("""
                Menú del Programa:
                1. Donar d'alta una reparació
                2. Donar d'alta un treballador
                3. Sortir""");

        String option = sc.next(); // Accepta qualsevol caràcter
        switch (option) {
            case "1": // Dona d'alta una reparació
                altaReparacion(sc);
                Menu(sc);
                break;
            case "2": // Dona d'alta un treballador
                altaTreballador(sc);
                Menu(sc);
                break;
            case "3": // Sortir
                System.out.println("sortint...");
                sc.close(); // Tanca scanner
                System.exit(0); // Finalitza programa
                break;
            default: // Si l'usuari posa una altre cosa
                System.out.println("Opció no vàlida");
                Menu(sc);
                break;
        }
    }

    private static void altaTreballador(Scanner sc) { // Mètode que dona d'alta un treballador
        System.out.println("Introdueix el número de treballador:");
        String id_treballador = sc.next();

        for (String[] treballador : treballadors) { // Recorre tota la matriu
            String numero = treballador[0]; // Accedeix a la primera columna de cada fila
            if (numero.equals(id_treballador)) { // Comprova si el que ha posat l'usuari coincideix
                System.out.println("Treballador trobat");
                treballador[2] = "S"; // N passa a "S"
                break; // Finalitza la cerca
            } else {
                System.out.println("Treballador no trobat");
            }
        }
    }

    private static void altaReparacion(Scanner sc) { // Mètode que dona d'alta una reparació
        System.out.println("Introdueix el número de reparació:");
        String numero_movil = sc.next();

        for (String[] movil : movils) { // Recorre tota la matriu
            String numero = movil[0]; // Accedeix a la primera columna de cada fila
            if (numero.equals(numero_movil)) { // Comprova si el que ha posat l'usuari coincideix
                System.out.println("Treballador trobat");
                movil[2] = "S"; // N passa a "S"
                break; // Finalitza la cerca
            } else {
                System.out.println("Treballador no trobat");
            }
        }
    }
}