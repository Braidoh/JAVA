import java.util.Scanner;

public class Escacs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] taula;
        String[] PECES = {"T", "C", "A", "K", "Q", "A", "C", "T"}; // Peces Blanques
        String[] peces = {"t", "c", "a", "k", "q", "a", "c", "t"}; // Peces Negres
        taula = new String[8][8]; // Crea el tauler amb les files i columnes

        for (int i = 0; i < taula.length; i++) { // files
            for (int j = 0; j < taula[i].length; j++) { // columnes
                if (i == 0) {
                    taula[i][j] = PECES[j]; // Peces Blanques
                } else if (i == 1) {
                    taula[i][j] = "P"; // Peó Blanc
                } else if (i == 6) {
                    taula[i][j] = "p"; // Peó Negre
                } else if (i == 7) {
                    taula[i][j] = peces[j]; // Peces Negres
                } else {
                    taula[i][j] = "_";
                }
                System.out.print(taula[i][j] + " ");
            }
            System.out.println();
        }
    }/*

        int contador = 1; // Contador per saber quan saltar de linea (comença 1 perquè el primer salt de línia és al 8)
        String option, peon, cavall;

        for (String[] fila : taula) {
            for (String columna : fila) {
                System.out.print(columna + " "); // Pint: Ho fa en una sola línia i no ho salta
                if (contador % 8 == 0 && contador != 0) { // Si el contador es divisible per 8, salta de linea
                    System.out.print("\n"); // Salta de linea
                }
                contador++;
            }
        }

        do {
            System.out.println("""                
                Menú del Programa:
                1. Moure cavall
                2. Moure peó
                3. Sortir""");

            option = sc.next();
            switch (option) {
                int columna;

                case "1": // Moure cavall
                    System.out.println("Has escollit la opció 1: Moure cavall");
                    // Mirar posició actual
                    // Mirar si la posició a la que es vol moure està buida
                    // Moure cavall
                    break;
                case "2": // Moure peó
                    System.out.println("Has escollit la opció 2: Moure peó \nQuin peó vols moure? Blanc (P) o negre (p)");
                    peon = sc.next();
                    if (peon.equals("P")) {
                        System.out.println("Has escollit el peó blanc \nDe la columna 1 a la 8, quin vols moure? Posa nomès el número");
                        columna= sc.nextInt();
                        if (columna < 1 || columna > 8) {
                            System.out.println("Columna no vàlida");
                            break;
                        } else {
                            for (int i = 0; i < taula.length; i++) {
                                if (taula[i][columna-1].equals("P")) {
                                    // Moure peó
                                    System.out.println("Peó trobat a la posició " + (i+1) + "," + columna);

                                    break;
                                }
                            }
                        }
                    } else if (peon.equals("p")) {
                        System.out.println("Has escollit el peó negre");
                        peon = sc.next();
                        if (peon.equals("P")) {
                            System.out.println("Has escollit el peó blanc.\nDe la columna 1 a la 8, quin vols moure? Posa nomès el número");
                            columna= sc.nextInt();
                            if (columna < 1 || columna > 8) {
                                System.out.println("Columna no vàlida");
                                break;
                            } else {
                                for (int i  = 0; i < taula.length; i++) {
                                    for (int j = 0; j < taula[i].length; j++) {
                                        if (taula[i][j].equals("p") && taula[i-1][j].equals("_")) {

                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Peó no vàlid");
                    }
                    break;
                case "3": // Sortir
                    System.out.println("Sortint...");
                    sc.close(); // Tanca scanner
                    System.exit(0); // Finalitza programa
                    break;
                default: // Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (!option.matches("3"));
    }*/
}

