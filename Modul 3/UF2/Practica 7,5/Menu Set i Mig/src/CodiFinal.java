import java.util.Scanner;
import java.util.Random;

public class CodiFinal {
    // Variables Globals
    private static String option; // Opció seleccionada per l'usuari.
    private static int torn = 0; // Torn actual del jugador.
    private static final double[] SumaCartesJugadors = new double[5]; // Array per guardar la suma de les cartes de cada jugador.
    private static final double[] ApostesJugadors = new double[4]; // Array per guardar les apostes de cada jugador.
    private static final double[] CarteraJugadors = { // Array per guardar el saldo de cada jugador.
            100, // Saldo inicial del jugador 1
            100, // Saldo inicial del jugador 2
            100, // Saldo inicial del jugador 3
            100  // Saldo inicial del jugador 4
    };
    private static final String[] jugadors = { // Array amb els noms dels jugadors.
            "Jugador 1", // Jugador 1
            "Jugador 2", // Jugador 2
            "Jugador 3", // Jugador 3
            "Jugador 4", // Jugador 4
            "Banca"  // Jugador Banca
    };
    private static final String[] resultat = { // Array per guardar el resultat de cada jugador.
            "", // Jugador 1
            "", // Jugador 2
            "", // Jugador 3
            "", // Jugador 4
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
    private static final boolean[] jugadorsActius = { // És per descartar jugadors que han superat el 7,5
            true, // Estat del Jugador 1
            true, // Estat del Jugador 2
            true, // Estat del Jugador 3
            true, // Estat del Jugador 4
            true // Estat de la Banca
    };

    public static void main(String[] args) { // Mètode principal
        Scanner sc = new Scanner(System.in); // Crea un objecte Scanner per llegir l'entrada de l'usuari
        Inici(sc); // Crida al mètode Menu
    }

    private static void Inici(Scanner sc) { // Mètode que mostra el menú principal
        do { // Bucle
            System.out.println("""
                    INICI:
                    a) 2 Jugadors
                    b) 3 Jugadors
                    c) 4 Jugadors
                    d) 5 Jugadors
                    e) Sortir
                    _________________________________________________________________
                    Escull una opció:""");

            option = sc.next().toUpperCase(); // Fa que accepti qualsevol caràcter a més dels números
            switch (option) {
                case "A": // 2 Jugadors
                    jugadorsActius[1] = false; // Desactiva el jugador 2
                    jugadorsActius[2] = false; // Desactiva el jugador 3
                    jugadorsActius[3] = false; // Desactiva el jugador 4
                    Menu(sc);
                    break;
                case "B": // 3 Jugadors
                    jugadorsActius[2] = false; // Desactiva el jugador 3
                    jugadorsActius[3] = false; // Desactiva el jugador 4
                    Menu(sc);
                    break;
                case "C": // 4 Jugadors
                    jugadorsActius[3] = false; // Desactiva el jugador 4
                    Menu(sc);
                    break;
                case "D": // 5 Jugadors
                    Menu(sc);
                    break;
                case "E": //Sortir
                    sc.close(); // Tanca el Scanner
                    System.exit(0); // Tanca el programa
                    break;
                default: // Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("5")); // Surta del bucle si l'usuari posa 5
    }

    private static void Menu(Scanner sc) { // Mètode que mostra el menú principal
        do { // Bucle
            System.out.println("""
                    Menu Principal:
                    1. Jugar Partida.
                    2. Modificar Cartera dels Jugadors.
                    3. Reinicia Partida (esborra totes les dades i tornes al menu inici).
                    4. Inici.
                    _________________________________________________________________
                    Escull una opció:""");

            option = sc.next(); // Fa que accepti qualsevol caràcter a més dels números
            switch (option) {
                case "1": // Jugar Partida
                    Partida(sc);
                    break;
                case "2": // Modificar el saldo de la Cartera dels Jugadors
                    System.out.println("Posa la quantitat de diners que tindrà cada jugador.");
                    ModificarCartera(sc);
                    Menu(sc);
                case "3": // Reinicia partida
                    Reset(); // Mètode que reinicia tots els valors
                    Inici(sc); // Torna al menú Inici
                case "4": //Sortir
                    Inici(sc); // Torna al menú Inici
                    break;
                default: // Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("3")); // Surta del bucle si l'usuari posa 3
    }

    private static void ModificarCartera(Scanner sc) {
        int diners = 0; // Variable per guardar el saldo
        boolean valorCorrecte = false; // Variable per comprovar si l'entrada és correcta

        while (!valorCorrecte) {
            System.out.println("Posa el nou saldo per tots els jugadors (ha de ser en double):");
            if (sc.hasNextInt()) { // Comprova si l'entrada és un número enter
                diners = sc.nextInt(); // Guarda el valor que posa l'usuari
                valorCorrecte = true; // Si l'entrada és correcta, surt del bucle
            } else { // Si l'entrada no és un número enter
                System.out.println("Posa un número enter");
                sc.next(); // Torna a demanar un altre cop
            }
        }
        double money = diners; // convert the integer to double
        for (int i = 0; i < CarteraJugadors.length; i++) { // Recorre la llista de CarteraJugadors
            CarteraJugadors[i] = money; // Canvia el saldo de tots els jugadors
        }

        System.out.println("El saldo de tots els jugadors ara es: " + money + " €.");
    }
    private static void Reset() { //Mètode que reinicia tots els valors
        for (int i = 0; i < 5; i++) { // Recorre la llista de jugadors
            SumaCartesJugadors[i] = 0; //Restableix la suma de cartes per jugador
            jugadorsActius[i] = true; //Restableix l'estat dels jugadors
            resultat[i] = ""; //Restableix el resultat dels jugadors
        }
        for (int i = 0; i < 4; i++) { // Recorre la llista de jugadors
            ApostesJugadors[i] = 0; //Restableix les apostes per jugador
            CarteraJugadors[i] = 100; //Restableix el saldo inicial dels jugadors
        }
        torn = 0; //Restableix el torn
        System.out.println("El joc s'ha reiniciat.");
    }

    private static void Partida(Scanner sc) { //Mètode que controla el desenvolupament a la partida
        for (int i = torn; i < jugadorsActius.length; i++) { // Comença amb el jugador actual i recorre la llista de jugadors
            if (!jugadorsActius[i]) { // Si el jugador no està actiu
                continue; // Salta a la següent iteració del bucle
            }
            if (torn >= jugadors.length) { // Evita que els torns sobrepassin la quantitat de jugadors
                torn = 0; // Si s'arriba al final de la llista, torna al primer jugador
                Pantalla(); // Neteja la pantalla
                Resultats(sc); // Recorre al mètode dels resultats
            }
            torn = i; // Actualitza el torn al jugador actiu actual
            Pantalla(); // Neteja la pantalla
            CartaInicial(); // Mètode per repartir les cartes inicials
            EstatJugadors(); // Mètode per mostrar l'estat dels jugadors
            System.out.println("_____________________________________________________________");
            System.out.println("Torn: " + jugadors[torn]); // Posa el jugador actual

            if (torn != 4) { // Si l'actual torn no es la Banca
                Aposta(sc); // Recorre al mètode per apostar
            }
            Carta(sc); // Mètode per escollir si vols rebre una carta
        }
    }

    private static void EstatJugadors() { // Mètode que mostra l'estat dels jugadors
        for (int i = 0; i < jugadorsActius.length; i++) { // Recorre la llista de jugadors
            if (!jugadorsActius[i]) { // Si el jugador (i) no està actiu
                continue; // Ignora el seu estat
            }
            if (i < 4) { // Comprova si el jugador (i) és menor que 4 abans d'accedir CarteraJugadors
                System.out.println("El " + jugadors[i] + " té " + SumaCartesJugadors[i] + " punts i el saldo es: " + CarteraJugadors[i] + "€");
            } else { // Si el jugador (i) és igual o major que 4
                System.out.println("La " + jugadors[4] + " té " + SumaCartesJugadors[4] + " punts"); // Mostra l'estat únic de la Banca
            }
        }
    }

    private static void CartaInicial() { // Mètode que reparteix les cartes inicials
        Random random = new Random(); // Defineix el valor random
        int indexCarta = random.nextInt(carta.length); // Genera carta aleatòria
        String nom = carta[indexCarta][0]; // Nom de la carta
        double numero = Double.parseDouble(carta[indexCarta][1]); // Converteix la columna 2 a double
        SumaCartesJugadors[torn] += numero; // Afegeix el valor de la carta a la suma total del jugador actual
        System.out.println("La carta es: " + nom + " " + numero);
    }

    private static void Resultats(Scanner sc) { // Mètode que calcula i mostra els resultats

        for (int i = 0; i < 5; i++) { // Recorre la llista de jugadors
            if (SumaCartesJugadors[i] > 7.5 ) { // Si el jugador supera 7,5
                resultat[i] = "perdut"; // El jugador perd
            } else if(SumaCartesJugadors[i] < SumaCartesJugadors[3] && SumaCartesJugadors[i] <= 7.5) { // Si el jugador té menys punts que la banca y no supera 7.5
                resultat[i] = "perdut"; // El jugador perd
            } else if (SumaCartesJugadors[i] > SumaCartesJugadors[3] && SumaCartesJugadors[i] <= 7.5) { // Si el jugador té més punts que la banca y no supera 7.5
                resultat[i] = "guanyat"; // El jugador guanya
                CarteraJugadors[i] += ApostesJugadors[i] * 2; // El saldo es multiplica per 2

            } else if (SumaCartesJugadors[4] < SumaCartesJugadors[i] && SumaCartesJugadors[4] <= 7.5) { // Si la banca no supera 7,5 i té menys punts que el jugador
                resultat[4] = "perdut"; // La banca perd
            } else if (SumaCartesJugadors[4] > SumaCartesJugadors[i] && SumaCartesJugadors[4] <= 7.5) { // Si la banca supera 7,5
                resultat[4] = "guanyat"; // La banca guanya
            } else if (SumaCartesJugadors[i] == SumaCartesJugadors[4]) { // Si el jugador empata amb la banca
                if (!resultat[i].equals("empatat")) { // Si el jugador no s'ha marcat empatat
                    CarteraJugadors[i] += ApostesJugadors[i]; // Se li retorna l'aposta
                }
                resultat[i] = "empatat"; // El jugador i la banca empaten
            }
            if (jugadorsActius[i]) { // Si el jugador (i) està actiu
                System.out.println(jugadors[i] + " ha " + resultat[i]); // Posa el resultat del jugador
            }        }
        EstatJugadors(); // Mètode per mostrar l'estat dels jugadors
        ResetGuanyador(sc); // Mètode per reiniciar els valors
    }

    private static void ResetGuanyador(Scanner sc) { // Mètode que reinicia alguns valors
        for (int i = 0; i < 5; i++) { // Recorre la llista de jugadors
            SumaCartesJugadors[i] = 0; // Restableix la suma de cartes per jugador
            resultat[i] = ""; // Restableix el resultat dels jugadors
        }
        for (int i = 0; i < 4; i++) { // Recorre la llista de jugadors que han apostat
            ApostesJugadors[i] = 0; // Restableix les apostes per jugador
        }
        System.out.println("S'han establert els valors inicials. Posa qualsevol tecla per continuar.");
        sc.next(); // Tecla per continuar
        Partida(sc); // Torna a la partida
    }

    private static void Aposta(Scanner sc) { // Mètode que permet a l'usuari apostar
        do { // Bucle
            System.out.println("Vols apostar? S/N");

            option = sc.next().toUpperCase(); //Qualsevol caràcter per defecte és en majúscula
            switch (option) {
                case "S": //Agafa una altre carta
                    System.out.println("Posa la quantitat de diners.");
                    double aposta = sc.nextDouble(); //Agafa l'aposta
                    if (aposta > CarteraJugadors[torn]) { // Si l'aposta supera el saldo
                        System.out.println("No tens prou diners.");
                        Aposta(sc); // Torna a apostar
                    }
                    ApostesJugadors[torn] = aposta; // Guarda l'aposta del jugador
                    CarteraJugadors[torn] -= aposta; // Resta l'aposta de la cartera del jugador
                    Carta(sc); // Mètode per escollir si vols rebre una carta
                    break;
                case "N": //Passar al següent torn
                    Carta(sc); // Mètode per escollir si vols rebre una carta
                    break;
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("N")); // Surta del bucle si l'usuari posa N
    }

    private static void Carta(Scanner sc) { // Mètode que permet a l'usuari decidir si vol rebre una carta
        do { // Bucle
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
                case "3": // Torna al Menú
                    Menu(sc);
                default: // Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida.");
            }
        } while (!option.matches("3")); // Surt del bucle si l'usuari posa 3
    }

    private static void NextTorn(Scanner sc) { // Mètode per passar al següent torn
        if (torn == jugadorsActius.length - 1) { // Si el jugador actual és la Banca
            Resultats(sc); // Mostra els resultats
        } else torn++; // Passa al següent jugador
        Partida(sc); // Torna a la partida
    }

    private static void CartaDescoberta(Scanner sc) { //Mètode que mostra la carta descoberta
        CartaInicial(); // Agafa una carta
        System.out.println("La suma total de les cartes de " + jugadors[torn] + " es: " + SumaCartesJugadors[torn]);

        if (SumaCartesJugadors[torn] >= 7.5) { // Si el jugador arriba o supera el 7,5 passa al següent torn
            NextTorn(sc); // Passa al següent torn
        }
    }
    private static void Pantalla() { // Mètode que neteja la pantalla
        for (int i = 0; i < 20; ++i) { // Repeteix 20 vegades
            System.out.println(); // Posa un salt de línia
        }
    }
}