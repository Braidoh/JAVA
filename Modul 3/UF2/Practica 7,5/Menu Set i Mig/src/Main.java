import java.util.Scanner;
import java.util.Random;

public class Main {
    // Variables Globals
    private static String option; // Opció seleccionada per l'usuari.
    private static int torn = 0; // Torn actual del jugador.
    private static final double[] SumaCartesJugadors = new double[4]; // Array per guardar la suma de les cartes de cada jugador.
    private static final double[] ApostesJugadors = new double[3]; // Array per guardar les apostes de cada jugador.
    private static final double[] CarteraJugadors = { // Array per guardar el saldo de cada jugador.
            100, // Saldo inicial del jugador 1
            100, // Saldo inicial del jugador 2
            100}; // Saldo inicial del jugador 3
    private static final String[] jugadors = { // Array amb els noms dels jugadors.
            "Jugador 1", // Jugador 1
            "Jugador 2", // Jugador 2
            "Jugador 3", // Jugador 3
            "Banca"  // Jugador Banca
    };
    private static final String[] resultat = { // Array per guardar el resultat de cada jugador.
            "", // Jugador 1
            "", // Jugador 2
            "", // Jugador 3
            ""  //  Banca
    };
    private static final String[][] carta = { // Array amb les cartes i els seus valors.
            {"AS", "1",}, //Carta 1
            {"DOS", "2",}, //Carta 2
            {"TRES", "3"}, //Carta 3
            {"QUATRE", "4"}, //Carta 4
            {"CINC", "5"}, //Carta 5
            {"SIS", "6"}, //Carta 6
            {"SET", "7"}, //Carta 7
            {"SOTA", "0.5"}, //Carta 8
            {"CAVALL", "0.5"}, //Carta 9
            {"REI", "0.5"}, //Carta 10
    };

    public static void main(String[] args) { // Mètode principal
        Scanner sc = new Scanner(System.in); // Crea un objecte Scanner per llegir l'entrada de l'usuari
        Menu(sc); // Crida al mètode Menu
    }

    private static void Menu(Scanner sc) { // Mètode que mostra el menú principal
        do {
            System.out.println("""
                    Menu Principal:
                    1. Jugar Partida
                    2. Nova Partida (esborra totes les dades i tornes al menu inici).
                    3. Sortir del Joc
                    _________________________________________________________________
                    Escull una opció:""");

            option = sc.next(); // Fa que accepti qualsevol caràcter a més dels números
            switch (option) {
                case "1": // Jugar Partida
                    Partida(sc);
                    break;
                case "2": // Reinicia partida
                    Reset(); // Recorre al mètode que reinicia tots els valors
                    Menu(sc); // Torna al menú
                case "3": // Sortir
                    sc.close(); // Tanca scanner
                    System.exit(0); // Tanca el programa
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("3")); // Bucle per si l'usuari posa una altre cosa
    }

    private static void Reset() { //Mètode que reinicia tots els valors
        for (int i = 0; i < 4; i++) { // Recorre la llista de jugadors
            SumaCartesJugadors[i] = 0; //Restableix la suma de cartes per jugador
        }
        for (int i = 0; i < 3; i++) { // Recorre la llista de jugadors
            ApostesJugadors[i] = 0; //Restableix les apostes per jugador
            CarteraJugadors[i] = 100; //Restableix el saldo inicial dels jugadors
        }
        torn = 0; //Restableix el torn
        System.out.println("El joc s'ha reiniciat.");
    }

    private static void Partida(Scanner sc) { //Mètode que controla el desenvolupament a la partida
        for (String jugador : jugadors) { //Recorre la llista de jugadors
            if (torn >= jugadors.length) { // Evita que els torns sobrepassin la quantitat de jugadors
                torn = 0; // Si s'arriba al final de la llista, torna al primer jugador
                Pantalla(); // Neteja la pantalla
                Resultats(sc); // Recorre al mètode dels resultats
            }
            jugador = jugadors[torn]; // Mira els torns dels jugadors
            Pantalla(); // Neteja la pantalla
            CartaInicial(); // Mètode per repartir les cartes inicials
            EstatJugadors(); // Mètode per mostrar l'estat dels jugadors
            System.out.println("_____________________________________________________________");
            System.out.println("Torn: " + jugador); // Posa el jugador actual
            if (torn != 3) { // Si l'actual torn no es la Banca
                Aposta(sc); // Recorre al mètode per apostar
            }
            Carta(sc); // Recorre el mètode que pregunta si vol rebre una altra carta
        }
    }

    private static void EstatJugadors() { // Mètode que mostra l'estat de cada jugador
        System.out.println("El " + jugadors[0] + " té " + SumaCartesJugadors[0] + " punts i el saldo es: " + CarteraJugadors[0] + "€");
        System.out.println("El " + jugadors[1] + " té " + SumaCartesJugadors[1] + " punts i el saldo es: " + CarteraJugadors[1] + "€");
        System.out.println("El " + jugadors[2] + " té " + SumaCartesJugadors[2] + " punts i el saldo es: " + CarteraJugadors[2] + "€");
        System.out.println("La " + jugadors[3] + " té " + SumaCartesJugadors[3] + " punts");
    }

    private static void CartaInicial() { // Mètode per treure una carta aleatòria
        Random random = new Random(); // Estableix el valor random
        int indexCarta = random.nextInt(carta.length); // Genera carta aleatòria
        String nom = carta[indexCarta][0]; //Nom de la carta
        double numero = Double.parseDouble(carta[indexCarta][1]); //Converteix la columna 2 a double
        SumaCartesJugadors[torn] += numero; // Afegeix el valor de la carta a la suma total del jugador actual
        System.out.println("La carta es: " + nom + " " + numero);
    }

    private static void Resultats(Scanner sc) { // Mètode que calcula i mostra els resultats

        for (int i = 0; i < 4; i++) { // Recorre la llista de jugadors
            if (SumaCartesJugadors[i] > 7.5 ) { // Si el jugador supera 7,5
                resultat[i] = "perdut"; // El jugador perd
            } else if(SumaCartesJugadors[i] < SumaCartesJugadors[3] && SumaCartesJugadors[i] <= 7.5) { // Si el jugador té menys punts que la banca y no supera 7.5
                resultat[i] = "perdut"; // El jugador perd
            } else if (SumaCartesJugadors[i] > SumaCartesJugadors[3] && SumaCartesJugadors[i] <= 7.5) { // Si el jugador té més punts que la banca y no supera 7.5
                resultat[i] = "guanyat"; // El jugador guanya
                if (i < CarteraJugadors.length) { // Recorre la llista de les Carteres
                    CarteraJugadors[i] += ApostesJugadors[i] * 2; // El saldo es multiplica per 2
                }
            } else if (SumaCartesJugadors[3] < SumaCartesJugadors[i] && SumaCartesJugadors[3] <= 7.5) { // Si la banca no supera 7,5 i té menys punts que el jugador
                resultat[3] = "perdut"; // La banca perd
            } else if (SumaCartesJugadors[3] > SumaCartesJugadors[i] && SumaCartesJugadors[3] <= 7.5) { // Si la banca supera 7,5
                resultat[3] = "guanyat"; // La banca guanya
            } else if (SumaCartesJugadors[i] == SumaCartesJugadors[3]) { // Si el jugador empata amb la banca
                if (i < CarteraJugadors.length) { // Recorre la llista de les Carteres
                    CarteraJugadors[i] += ApostesJugadors[i]; // Se li retorna l'aposta
                }
                resultat[i] = "empatat"; // El jugador i la banca empaten
            }
            System.out.println("El " + jugadors[i] + " ha " + resultat[i]); // Mostra el resultat de tots els jugadors
        }
        EstatJugadors(); // Mètode per mostrar l'estat dels jugadors
        ResetGuanyador(sc);
    }
    private static void ResetGuanyador(Scanner sc) { //Mètode que reinicia alguns valors
        for (int i = 0; i < 4; i++) { // Recorre la llista de jugadors
            SumaCartesJugadors[i] = 0; //Restableix la suma de cartes per jugador
        }
        for (int i = 0; i < 3; i++) { // Recorre la llista de jugadors que han apostat
            ApostesJugadors[i] = 0; // Restableix les apostes per jugador
        }
        System.out.println("S'han establert els valors inicials. Posa qualsevol tecla per continuar.");
        sc.next(); // Neteja el buffer
        Partida(sc); // Torna a Partida
    }

    private static void Aposta(Scanner sc) { // Mètode que permet a l'usuari apostar
        do {
            System.out.println("Vols apostar? S/N");

            option = sc.next().toUpperCase(); // Qualsevol caràcter per defecte és en majúscula
            switch (option) {
                case "S": // Agafa una altre carta
                    System.out.println("Posa la quantitat de diners.");
                    double aposta = sc.nextDouble(); // Agafa l'aposta
                    if (aposta > CarteraJugadors[torn]) { // Si l'aposta supera el saldo
                        System.out.println("No tens prou diners.");
                        Aposta(sc); // Torna a apostar
                    }
                    ApostesJugadors[torn] = aposta; // Guarda l'aposta del jugador
                    CarteraJugadors[torn] -= aposta; // Resta l'aposta de la cartera del jugador
                    Carta(sc); // Mètode per escollir si vols rebre una carta
                    break;
                case "N": // Passar al següent torn
                    Carta(sc); // Mètode per escollir si vols rebre una carta
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("N")); // Bucle per si l'usuari posa una altre cosa
    }


    private static void Carta(Scanner sc) { // Mètode que permet a l'usuari decidir si vol rebre una carta
        do {
            System.out.println("""
                    Vols rebre una carta
                    1. Carta Descoberta.
                    2. No (plantar-se).
                    3. Menu Jugar.""");

            option = sc.next(); // Fa que accepti qualsevol caràcter a més dels números
            switch (option) {
                case "1": // Agafa una altre carta
                    CartaDescoberta(sc);
                    break;
                case "2": // Passar al següent torn
                    NextTorn(sc);
                    break;
                case "3":
                    Menu(sc); // Torna al Menú
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("3")); // Bucle per si l'usuari posa una altre cosa
    }

    private static void NextTorn(Scanner sc) { // Mètode per passar al següent torn
        torn++; // Passa al següent torn
        Partida(sc); // Torna a la partida
    }

    private static void CartaDescoberta(Scanner sc) { // Mètode que mostra la carta descoberta
        CartaInicial(); // Utilitza el mètode per obtenir la carta
        System.out.println("La suma total de les cartes de " + jugadors[torn] + " es: " + SumaCartesJugadors[torn]);

        if (SumaCartesJugadors[torn] >= 7.5) { // Mira si el jugador ha guanyat o perdut
            NextTorn(sc);
        }
    }

    private static void Pantalla() { // Mètode que neteja la pantalla
        for (int i = 0; i < 25; ++i) { // Repeteix el procés 25 cops
            System.out.println(); // Posa línies buides
        }
    }
}