import java.util.Scanner;

public class Escacs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tauler = new String[][] {
                {"T","C","A","K","Q","A","C","T"},
                {"P","P","P","P","P","P","P","P"},
                {"_","_","_", "_", "_", "_", "_", "_"},
                {"_","_","_", "_", "_", "_", "_", "_"},
                {"_","_","_", "_", "_", "_", "_", "_"},
                {"_","_","_", "_", "_", "_", "_", "_"},
                {"p","p","p","p","p","p","p","p"},
                {"t","c","a","q","k","a","c","t"}
        };

        int contador = 1; // Contador per saber quan saltar de linea (comença 1 perquè el primer salt de línia és al 8)
        String option, peon, cavall;

        for (String[] fila : tauler) {
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
                            for (int i = 0; i < tauler.length; i++) {
                                if (tauler[i][columna-1].equals("P")) {
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
                                for (int i  = 0; i < tauler.length; i++) {
                                    for (int j = 0; j < tauler[i].length; j++) {
                                        if (tauler[i][j].equals("p") && tauler[i-1][j].equals("_")) {

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
    }
}

