//Guardar valors!
package Metode;
import java.util.Scanner;

public class MaquinaVendaOptimized {
    private static final double[][] llistaZona = { //Llista de preus dels diferents bitllets i zones
            //         Bitllet
            {1.0, 5.0, 10.0, 60.0, 7.5}, // Zona 1      |
            {1.5, 10.0, 20.0, 90.0, 10.0}, // Zona 2    | Zona
            {2.0, 15.0, 30.0, 120.0, 15.0}, // Zona 3   |
    };  //    S     C     U     F      J
    private static final String[] nomBitllet = { //Llista que conté els noms dels bitllets
            "Senzill",
            "T-Casual",
            "T-Usual",
            "T-Familiar",
            "T-Jove"
    };
    private static final String[] nomZona = { //Llista que conté els noms zones
            "Zona 1",
            "Zona 2",
            "Zona 3",
    };

    //Declaració de variables estàtiques
    private static int bitllet, zona, comptador, numeroBitllets; //Declaració de variables de tipus integer, estalvia espai
    private static double preu, preuTotal, total, canvi; //Declaració de variables de tipus double, estalvia espai
    private static String resposta;

    public static void main (String[]args){ //Ordre d'execució de mètodes
        Scanner sc = new Scanner(System.in);
        bitllet = TipusBitllet(sc);
        zona = TipusZona(sc);
        preuTotal = SeguirComprant(sc);
        canvi = Pagament(sc);
        Tiquet(sc);
    }

    private static void Tiquet(Scanner sc) { // Mètode per fer tiquet
        do { //Bucle per si l'usuari posa una altre cosa
            System.out.println("Vols el tíquet? [S/N]");
            resposta = sc.next().toUpperCase(); //Qualsevol caràcter per defecte és en majúscula
            switch (resposta) {
                case "S": //Si l'usuari vol tiquet fa servir el mètode ImprimirTiquet i desprès passa a TipusBitllet
                    ImprimirTiquet();
                    TipusBitllet(sc);
                    break;
                case "N": //Si l'usuari no vol tiquet torna al principi
                    TipusBitllet(sc);
                    break;
                case "4321": //Opció secreta, posa en manteniment
                    Manteniment(sc);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Resposta no vàlida");
                    break;
            }
        } while (!resposta.matches("^[SN4321]$")); // Bucle per si l'usuari posa una opció no vàlida
    }


    private static void ImprimirTiquet() { //Mètode per imprimir tiquet
        System.out.println("______TIQUET______");
        for (int i = 0; i < numeroBitllets; i++) { //Array per mostrar els diferents bitllets
            System.out.println(comptador+" "+nomBitllet[bitllet] + " " + nomZona[zona] + " - Preu: " + total + " €");
        }
        System.out.println("Total: " + preuTotal + " €");
        System.out.println("__________________");
    }

    private static double Pagament (Scanner sc){ // Mètode per pagar
        if (numeroBitllets==1) { //És per fer-ho més bonic
            System.out.println("Ha comprat 1 bitllet, ha de pagar " + preu + " €");
        } else if (numeroBitllets > 1){
            System.out.println("Ha comprat " + numeroBitllets + " bitllets, ha de pagar "+preuTotal);
        }
        System.out.println("Introdueix els diners (nomès accepta EURO)");
        double cartera = sc.nextInt(); //Els diners que posa l'usuari
        canvi = cartera-preuTotal; //Calcul del canvi
        if (canvi == 0) { //Si el canvi és igual a 0 passa al mètode Tiquet
            System.out.println("Ha introduït " + cartera + " €");
            Tiquet(sc);
        } else if (canvi > 0) { //Si el canvi és superior a 0 passa al mètode Tiquet
            System.out.println("Ha introduït " + cartera + " €");
            System.out.println("El canvi es " + canvi + " €");
            Tiquet(sc);
        } else { //Si el canvi és menor que 0 cancel·la l'operació i torna a l'inici
            System.out.println("Import insuficient, ha introduït " + cartera + " €, tornant els diners...");
            System.out.println("__________________");
            TipusBitllet(sc);
        }
        return canvi; //Retorna el valor canvi
    }

    private static double SeguirComprant (Scanner sc){ // Mètode per seguir comprant bitllets
        comptador = 1; //La quantitat de bitllets comença en 1
        total = preu * comptador; //Calcula el preu de varios bitllets del mateix tipus
        numeroBitllets = numeroBitllets + comptador; //Compta el número de bitllets en total
        preuTotal = preuTotal + total; //Compta el preu total de tots els bitllets

        do { //Bucle per si l'usuari posa una altre cosa
            System.out.println("Vols seguir comprant més bitllets? [S/N]");
            resposta = sc.next().toUpperCase(); //La resposta estarà en majúscula automàticament
            switch (resposta) {
                case "S": //Si vol seguir comprant fa servir el mètode comprar
                    comptador = Comprar(sc);
                    break;
                case "N": //Si escull no passa al mètode Pagament
                    Pagament(sc);
                    break;
                case "4321": //Opció secreta, posa en manteniment
                    Manteniment(sc);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Resposta no vàlida");
                    break;
            }
        } while (!resposta.matches("^[SN4321]$")); // Bucle per si l'usuari posa una opció no vàlida
        return preuTotal ; //Retorna el nombre de bitllets
    }

    private static int Comprar(Scanner sc) { // Mètode per comprar el mateix tiquet o un altre
        int comprar;

        do {
            System.out.println(""" 
                    Vols seguir comprant el mateix tipus de bitllet o un altre?
                    1. El mateix tipus
                    2. Un altre""");

            comprar = sc.nextInt();
            switch (comprar) { //Menu comprar bitllet
                case 1: //Zona 2
                    System.out.println("Has triat: El mateix tipus");
                    comptador++; //Suma +1 al comptador de bitllets
                    break;
                case 2: //Zona 3
                    System.out.println("Has triat: Un altre");
                    TipusBitllet(sc); //Fa servir el mètode TipusBitllet
                    break;
                case 4321:
                    Manteniment(sc);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (comprar < 1 || comprar > 2); //Bucle per si l'usuari posa una opció no vàlida
        return comptador; //Retorna la zona escollida
    }

    private static int TipusZona (Scanner sc){ // Mètode per escollir el tipus de zona
        do {
            System.out.println("""
                        Quina zona vol viatjar?
                        0. Zona 1
                        1. Zona 2
                        2. Zona 3""");

            zona = sc.nextInt();
            switch (zona) { //Menu per escollir zona
                case 0: //Zona 1
                case 1: //Zona 2
                case 2: //Zona 3
                    System.out.println("Has triat: "+ nomZona[zona]); //Busca el nom a la llista nomZona
                    preu = llistaZona[zona][bitllet]; //Guarda el preu del bitllet
                    System.out.println("El preu del bitllet " + nomBitllet[bitllet] + " "+nomZona[zona]+" es: " + preu + " €"); //Posa el preu trobat en la llista
                    SeguirComprant(sc);
                    break;
                case 4321: //Opció secreta, posa en manteniment
                    Manteniment(sc);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (zona < 0 || zona > 2); //Bucle per si l'usuari posa una opció no vàlida
        return zona; //Retorna la zona escollida
    }

    private static int TipusBitllet (Scanner sc){ // Mètode per escollir el tipus de bitllet
        do {
            System.out.println("""
                        Quin bitllet desitja adquirir?
                        0. Bitllet senzill
                        1. TCasual
                        2. TUsual
                        3. TFamiliar
                        4. TJove""");

            bitllet = sc.nextInt();
            switch (bitllet) { //Menu per escollir bitllet
                case 0: //Bitllet senzill
                case 1: //TCasual
                case 2: //TUsual
                case 3: //TFamiliar
                case 4: //TJove
                    System.out.println("Has triat: Bitllet "+ nomBitllet[bitllet]); //Busca el nom a la llista nomBitllet
                    TipusZona(sc);
                    break;
                case 4321: //Opció secreta, posa en manteniment
                    Manteniment(sc);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (bitllet < 0 || bitllet > 4); //Bucle per si l'usuari posa una opció no vàlida
        return bitllet; //Retorna el bitllet escollit
    }
    private static void Manteniment(Scanner sc) { //Mètode per posar en manteniment
        System.out.println("Gràcies per utilitzar el nostre servei!");
        sc.close(); //Tancament de l'escàner
        System.exit(0); //Tancament del programa
    }
}

