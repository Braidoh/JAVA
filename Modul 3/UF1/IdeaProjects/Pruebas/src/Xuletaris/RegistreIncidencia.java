package Xuletaris;
import java.util.Scanner;

public class RegistreIncidencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaració de variables
        int opcio;

        // Bucle principal
        do {
            menu();
            opcio = sc.nextInt();

            // Control d'errors
            if (opcio < 1 || opcio > 4) {
                System.out.println("Opció incorrecta.");
            }

            // Implementació de les opcions
            switch (opcio) {
                case 1:
                    // Donar d'alta una nova incidència
                    donarAltaIncidencia(sc);
                    break;
                case 2:
                    // Consultar la última incidència introduïda
                    consultarUltimaIncidencia();
                    break;
                case 3:
                    // Número de incidències introduïdes
                    numeroIncidencies();
                    break;
                case 4:
                    // Sortir del programa
                    System.out.println("Sortint del programa...");
                    break;
                default: //Si l'usuari ha posat una altre opció
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (opcio != 4);
        sc.close();
    }

    // Mètode per mostrar el menú
    private static void menu() {
        System.out.println("Menú d'incidències:");
        System.out.println("1. Donar d'alta nova incidència");
        System.out.println("2. Consultar última incidència introduïda");
        System.out.println("3. Número de incidències introduïdes");
        System.out.println("4. Sortir");
        System.out.print("Opció: ");
    }

    // Mètode per donar d'alta una nova incidència
    private static void donarAltaIncidencia(Scanner sc) {
        // Declaració de variables locals
        int aula;
        String persona;
        String departament;

        // Llegeix les dades de la incidència
        System.out.print("Introduïu l'aula: ");
        aula = sc.nextInt();
        System.out.print("Introduïu la persona que ha informat la incidència: ");
        persona = sc.next();
        System.out.print("Introduïu el departament: ");
        departament = sc.next();

        // Imprimeix les dades de la incidència
        System.out.println("Aula: " + aula);
        System.out.println("Persona: " + persona);
        System.out.println("Departament: " + departament);
    }


    // Mètode per consultar la última incidència introduïda
    private static void consultarUltimaIncidencia() {
        // Imprimeix les dades de la última incidència
        System.out.println("Aula: " + aulaUltima);
        System.out.println("Persona: " + personaUltima);
        System.out.println("Departament: " + departamentUltima);
    }

    // Mètode per obtenir el número de incidències introduïdes
    public static void numeroIncidencies() {
        // Variable local
        int numIncidencies = 0;

        // Recorre totes les incidències introduïdes
        for (Incidencia incidencia : incidencies) {
            numIncidencies++;
        }

        // Imprimeix el número d'incidències introduïdes
        System.out.println("Número d'incidències introduïdes: " + numIncidencies);
    }
    // Variables globals
    private static final int aulaUltima = 0;
    private static final String personaUltima = "";
    private static final String departamentUltima = "";
}
