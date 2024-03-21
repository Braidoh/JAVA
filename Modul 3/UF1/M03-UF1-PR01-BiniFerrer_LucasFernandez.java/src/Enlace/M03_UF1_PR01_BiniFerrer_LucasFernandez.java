package Enlace;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class M03_UF1_PR01_BiniFerrer_LucasFernandez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Local> locals = new ArrayList<>();

        // Declaració de variables
        int tamany;
        String lloc;
        int preu;

        System.out.println("Benvingut al programa de gestió de lloguers de locals"); //Introducció de benvinguda

        // Pregunta els requisits del client
        System.out.println("Quin és el tamany mínim (m2) que ha de tenir el local? (posa nomès el numero sense punts");
        while (!sc.hasNextInt()) { //Bucle per si posa una altre cosa
            System.out.println("El tamany ha de ser un nombre enter");
            sc.next();
        }
        tamany = sc.nextInt(); //Llegeix el tamany que ha posat l'usuari

        System.out.println("En quin districte vol el local? (posa el nom correctament amb els seus espais i majúscules)");
        lloc = sc.next(); //Llegeix el districte que ha posat l'usuari

        System.out.println("Quin és el preu (€) màxim que està disposat a pagar?");
        while (!sc.hasNextInt()) { //Bucle per si posa una altre cosa
            System.out.println("El tamany ha de ser un nombre enter");
            sc.next();
        }
        preu = sc.nextInt(); //Llegeix el preu que ha posat l'usuari

        // Array que busca els requisits que ha posat l'usuari
        int index = -1; //El valor de l'index es negatiu
        for (Local local : locals) { //Busca els requisits demanats per l'usuari
            if (local.getTamany() >= tamany && //Si el tamany del local es igual o superior
                local.getLloc().equals(lloc) && //Si el lloc que és exactament igual
                local.getPreu() <= preu) { //Si el preu del local es igual o inferior
                local = locals.get(index); // Posa el local de l'index a la variable local
                index = locals.indexOf(local); //Busca el local que compleix els requisits
                break;
            }
        }

        // Resposta al client desprès de la búsqueda
        if (index > -1) { // Si l'array si troba un local serà com a mínim 0
            System.out.println("S'ha trobat un local que compleix els seus requisits.");
            for (Local local : locals) { //Imprimeix tots els locals que compleixen els requisits
                if (local.getTamany() >= tamany && local.getLloc().equals(lloc) && local.getPreu() <= preu) {
                    System.out.println("Nom: " + local.getNom()); //Posa el nom del local que ha trobat l'array
                    System.out.println("Tamany: " + local.getTamany()); //Posa el tamany del local que ha trobat l'array
                    System.out.println("Districte: " + local.getLloc()); //Posa el districte del local que ha trobat l'array
                    System.out.println("Preu: " + local.getPreu()); //Posa el preu del local que ha trobat l'array
                }
            }
        } else {
            System.out.println("No s'ha trobat cap local que compleixi els seus requisits");
        }

        System.out.println("""
                Quin tipus de pagament vol utilitzar?
                Opció 1: Efectiu
                Opció 2: Transferència bancària
                Opció 3: Cancelar
                """);

        while (!sc.hasNextInt()) { //Bucle per si posa una altre cosa
            System.out.println("Escull una opció:");
            sc.next();
        }

        int option = sc.nextInt();
        switch (option) { //Menú del tipus de pagament
            case 1: //Pagament en efectiu
                System.out.println("El local costa" + local.getPreu() + "€ al mes"); //Posa el preu del local
                double diners = sc.nextInt(); //Valor dels diners que té el client
                if (diners > local.getPreu()) { // Si els diners és major que el preu del local
                    System.out.println("Import suficient. El canvi és de " + diners - local.getPreu + "€");
                }
                if (diners == local.getPreu()) { // Si els diners és igual que el preu del local
                    System.out.println("Import suficient.");
                }
                if (diners < local.getPreu()) { // Si els diners és menor que el preu del local
                    System.out.println("Import insuficient. Es retornen els diners. Ingressa la quantitat de diners demanada");
                }
                break;
            case 2: //Transferència bancària
                System.out.println("Introdueix el número del compte bancari (6-34 dígits), ha de ser tot junt:");
                String compte = sc.next();
                if (compte.length() >= 6 && compte.length() <= 34) { //Els comptes bancaris tenen entre 6 i 34 dígits
                    System.out.println("S'ha completat la transacció");
                } else {
                    System.out.println("El número del compte no és vàlid");
                }
                break;
            case 3: //Sortir
                break;
        } sc.close();
        System.exit(0);
    }
}
