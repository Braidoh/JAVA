import java.util.Scanner;

public class FerrerBini_Exercici2 {
    private static final char[][] TABLERO = new char[8][8];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Coloca las piezas blancas
        for (int i = 0; i < 8; i++) {
            TABLERO[i][1] = 'P'; //Pone los peones
        }
        TABLERO[0][0] = 'T'; // Pone la torre
        TABLERO[0][1] = 'C'; // Pone el caballo
        TABLERO[0][2] = 'A'; // Pone el alfil
        TABLERO[0][3] = 'R'; // Pone el rey
        TABLERO[0][4] = 'D'; // Pone la reina
        TABLERO[0][5] = 'A'; // Pone el otro alfil
        TABLERO[0][6] = 'C'; // Pone el otro caballo
        TABLERO[0][7] = 'T'; // Pone la otra torre

        // Coloca las piezas negras
        for (int i = 0; i < 8; i++) { // Lo mismo con las negras
            TABLERO[i][6] = 'p';
        }
        TABLERO[7][0] = 't';
        TABLERO[7][1] = 'c';
        TABLERO[7][2] = 'a';
        TABLERO[7][3] = 'r';
        TABLERO[7][4] = 'd';
        TABLERO[7][5] = 'a';
        TABLERO[7][6] = 'c';
        TABLERO[7][7] = 't';

        for (int i = 0; i < TABLERO.length; i++) { // Converierte las filas a letras
            for (int j = 0; j < TABLERO[i].length; j++) {
                if (TABLERO[i][j] >= 'a' && TABLERO[i][j] <= 'h') {
                    TABLERO[i][j] = (char) (TABLERO[i][j] - 'a' + 1);
                }
            }
        }

        for (int i = 0; i < TABLERO.length; i++) { // Convierte las columnas a números
            for (int j = 0; j < TABLERO[i].length; j++) {
                if (TABLERO[i][j] >= '1' && TABLERO[i][j] <= '8') {
                    TABLERO[i][j] = (char) (TABLERO[i][j] - '1');
                }
            }
        }
    }

        for (char[] chars : TABLERO) { // Imprime las filas
            for (char aChar : chars) { // Imprime las columnas
                System.out.print(aChar);
            }
            System.out.println();
        }

        while (true) { // Bucle principal del juego
            // Mostrar el menú
            System.out.println("""
                Menú:
                1- Realizar movimiento");
                2- Salir""");

            int opcion = sc.nextInt(); // Lee la opción del usuario


            switch (opcion) { // Menu
                case 1:
                    System.out.println("Las blancas son letras mayusculas y las negras son letras minusculas");
                    int filaOrigen, columnaOrigen;

                    do { //Filas
                        System.out.print("Introduzca la fila de origen (1-8): ");
                        filaOrigen = sc.nextInt();
                    } while (filaOrigen < 1 || filaOrigen > 8);
                    do { //Columnas
                        System.out.print("Introduzca la columna de origen (a-h): ");
                        columnaOrigen = System.console().readLine().charAt(0);
                    } while (columnaOrigen < 'a' || columnaOrigen > 'h');
                    break;
                case 2:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

