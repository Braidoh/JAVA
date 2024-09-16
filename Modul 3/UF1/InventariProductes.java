import java.util.Scanner;

public class InventariProductes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] inventari = new String[100][3]; // Creació de l'array inventari amb 40 files i 3 columnes
        String option, nom, codi, quantitat;
        int productes;
        boolean trobat = false;

        do {
            System.out.println("""
                    Menú del Programa:
                    1. Afegir producte
                    2. Eliminar producte
                    3. Buscar producte
                    4. Llistar inventari
                    5. Modificar quantitat
                    6. Sortir""");

            option = sc.next();
            switch (option) {
                case "1": // Afegir producte
                    System.out.println("Has escollit la opció 1: Afegir producte\nQuants productes vols afegir?");
                    productes = sc.nextInt(); // Poses les vegades que es repetirà el procés
                    for (int i = 0; i < productes; i++) { // Bucle per afegir productes
                        System.out.println("Posa el nom del producte:");
                        nom = sc.next();
                        System.out.println("Posa el codi del producte:");
                        codi = sc.next();
                        System.out.println("Posa la quantitat del producte:");
                        quantitat = sc.next();
                        int j = 0;
                        inventari[j][0] = nom; // Guarda el nom a la columna 0
                        inventari[j][1] = codi; // Guarda el codi a la columna 1
                        inventari[j][2] = quantitat; // Guarda la quantitat a la columna 2, converteix-la a String
                        j++; // Passa a la següent columna
                    }
                    break;
                case "2": // Eliminar producte
                    System.out.println("Has escollit la opció 2: Eliminar producte\nQuants productes vols eliminar?");
                    productes = sc.nextInt(); // Poses les vegades que es repetirà el procés
                    for (int i = 0; i < productes; i++) { // Bucle per eliminar productes
                        System.out.println("Posa el codi del producte que vols eliminar:");
                        codi = sc.next();
                        for (int j = 0; j < inventari.length; j++) { // Bucle per buscar el producte
                            if (inventari[j][1].equals(codi)) { // Si el codi coincideix
                                inventari[j][0] = null; // Elimina el nom
                                inventari[j][1] = null; // Elimina el codi
                                inventari[j][2] = null; // Elimina la quantitat
                                break; // Finalitza el bucle
                            }
                        }
                    }
                    break;
                case "3": // Buscar producte
                    System.out.println("Has escollit la opció 3: Buscar producte");
                    System.out.println("Posa el codi del producte:");
                    codi = sc.next();
                    for (int i = 0; i < inventari.length; i++) { // Bucle per buscar el producte
                        if (inventari[i][1].equals(codi)) { // Si el nom coincideix
                            System.out.println("Nom: " + inventari[i][0] + "\nCodi: " + inventari[i][1] + "\nQuantitat: " + inventari[i][2]);
                            trobat = true; // Trobat
                            break; // Finalitza el bucle
                        }
                    }
                    if (!trobat) { // Si no troba el producte
                        System.out.println("No s'ha trobat el producte, amb el codi "+codi);
                    }
                    break;
                case "4": // Llistar inventari
                    System.out.println("Has escollit la opció 4: Llistar inventari");
                    for (int i = 0; i < inventari.length; i++) { // Bucle per llistar l'inventari
                        if (inventari[i][0] != null) { // Si el nom no és null
                            System.out.println("Nom: " + inventari[i][0] + "\nCodi: " + inventari[i][1] + "\nQuantitat: " + inventari[i][2]);
                        }
                    }
                    break;
                case "5": // Modificar quantitat
                    System.out.println("Has escollit la opció 5: Modificar quantitat\nQuin producte vols modificar?");
                    codi = sc.next();
                    for (int i = 0; i < inventari.length; i++) { // Bucle per buscar el codi
                        if (inventari[i][1].equals(codi)) { // Si el nom coincideix
                            trobat = true;
                            System.out.println("Posa la nova quantitat:");
                            quantitat = sc.next();
                            inventari[i][2] = quantitat; // Canvia la quantitat
                            break; // Finalitza el bucle
                        }
                        if (!trobat) { // Si no troba el producte
                            System.out.println("No s'ha trobat el producte, amb el codi "+codi);
                        }
                    }
                    break;
                case "6": // Sortir
                    System.out.println("Sortint...");
                    sc.close(); // Tanca scanner
                    System.exit(0); // Finalitza programa
                    break;
                default: // Si l'usuari posa una altre cosa
                    System.out.println("Opció no vàlida");
                    break;
            }
        }while (!option.matches("6")); // Si l'usuari posa 6, surt del bucle i finalitza el programa
    }
}
