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
        String option;

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
                case "1": // Moure cavall
                    System.out.println("Has escollit la opció 1: Moure cavall");
                    // Mirar posició actual



                    break;
                case "2": // Moure peó
                    System.out.println("Has escollit la opció 2: Moure peó");

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

// 1. Demanar posició actual
// 2. Demanar posició destí
// 3. Comprovar si la posició destí és vàlida
// 4. Comprovar si la posició destí està buida o té una peça contrària
// 5. Moure peça