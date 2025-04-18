import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Pruebas {
    public static int[] apuesta, reintegroApuesta, reintegro, combinacion; //Lista que contiene los valores
    public static int cantidadApuesta, aciertos, premio;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        main.init(sc);
    }

    public void init(Scanner sc) {
        System.out.println("***** PRIMITIVA ******");
        Menu(sc); //Ejecuta el método Menu
    }

    public void Menu(Scanner sc) { //Método que muestra el menu
        String option;

        do {
            System.out.println("""
                    Loteria
                    1. Hacer apuesta
                    2. Girar el bombo
                    3. Juego nuevo
                    4. Salir""");

            option = sc.next();
            switch (option) { //Menu
                case "1": //Hacer apuesta
                    introducirApuesta(sc);
                    break;
                case "2": //Girar el bombo
                    combinacion = calcularCombinacionGanadora();
                    comprobarAciertos(); //Objeto llamado resultados que mezcla aciertos y premio
                    System.out.println("Has acertado "+aciertos+" tu premio es: " + premio + " €");
                    break;
                case "3": //Juego nuevo
                    apuesta = null;
                    reintegro = null;
                    combinacion = null;
                    cantidadApuesta = 0;
                    aciertos = 0;
                    premio = 0;
                    System.out.println("Juego reiniciado.");
                    init(sc);
                    break;
                case "4": //Salir
                    sc.close();
                    System.exit(0);
                default: //Si l'usuari posa una altre cosa
                    System.out.println("Opción no válida");
            }
        } while (!option.matches("4")); // Bucle per si l'usuari posa una opció no vàlida
        Menu(sc); //Menu recursivo
    }

    public int comprobarAciertos() { //Crea un objeto que permite que haya dos valores distintos (int y int[])
        aciertos = 0;

        /* Compara los numeros de los arrays. Asegura que no sean nulos para evitar errores.
        Compara los números individualmente para ver si el usuario ha acertado.*/
        if (apuesta != null && combinacion != null) { //Si la apuesta y la combinación ganadora no son nulas...
            for (int i = 0; i < apuesta.length - 1; i++) { //Array para calcular
                if (apuesta[i] == combinacion[i]) { //Mira si coincide la apuesta y la combinación ganadora
                    aciertos++; // Suma +1 por cada acierto
                }
            }
        }

        //Comprobar reintegro
        boolean retorno; //Por defecto es false

        if (reintegro != null && Arrays.equals(apuesta, reintegroApuesta)) { //Si en el array las apuestas y el reintegro coincide
            retorno = true;
        }

        if (retorno = false) { //Calcula el premio
            premio = 20 * aciertos;
        } else if (retorno = true) { //Suma el cambio si ha acertado el reintegro
            premio = 20 * aciertos + (6 * cantidadApuesta); //Le devuelve el dinero pagado + el premio
        }
        return premio; //Pone los resultados en el objeto creado para que no de error en premio y aciertos al tener dos valores distintos
    }

    // Corregir
    public int[] calcularCombinacionGanadora() { //Metodo para calcular la combinación ganadora
        Random random = new Random();
        combinacion = new int[6]; //Hay 6 combinaciones ya que la de reintegro va aparte (1-10)
        System.out.println("La combinacion ganadora es: ");
        for (int i = 0; i < 6; i++) { //Genera 6 numeros diferents
            combinacion[i] = random.nextInt(48) + 1; //El numero aleatorio es entre 1-49
        }
        reintegro = new int[cantidadApuesta]; //La cantidad de apuestas definen la cantidad de reintegros que hay
        for (int i = 0; i < cantidadApuesta; i++) { //Array que se ejecuta por la cantidad de apuestas
            reintegro[i] = random.nextInt(10); //Calcula del 0-9
        }
        System.out.println("Reintegro: " + Arrays.toString(reintegro)); //
        return combinacion;
    }

    //Corregir
    public void introducirApuesta(Scanner sc) {
        int sumaApuesta = cantidadApuesta*6; //Calcula el coste de la apuesta

        System.out.println("¿Cuántas veces quieres apostar? (6€ por apuesta)");
        cantidadApuesta = sc.nextInt(); // Lee la cantidad de números que vas a apostar
        System.out.println("Has decidido apostar "+cantidadApuesta+", cuesta "+ sumaApuesta +" €"); //Calcula el coste del numero de las apuestas
        System.out.println("Introduce 6 números entre 1 y 49:");
        apuesta = new int[sumaApuesta]; // Crea un array para guardar la apuesta
        reintegroApuesta = new int[cantidadApuesta]; // Crea un array para guardar el reintegro

        for (int i : apuesta) { // Pone las veces que haya en apuesta
            System.out.println("Introduce el número entre 1 y 49:");
            apuesta[i] = sc.nextInt(); // Posa les vegades que hi hagi en sumaApuesta
            if (apuesta[i] >= 1 && apuesta[i] <= 49) {
                if (i == apuesta.length - 1) {
                    ApuestaReintegro(sc);
                }
            } else {
                System.out.println("El valor no es válido");
            }
        }
    }

    private void ApuestaReintegro(Scanner sc) {

        for (int i : reintegroApuesta) { // Pone las veces que haya en reintegro
            System.out.println("Pon el número reintegro (0 y 9)");
            reintegroApuesta[i] = sc.nextInt(); // Posa les vegades que hi hagi en sumaApuesta
            if (reintegroApuesta[i] >= 0 && reintegroApuesta[i] <= 9) {
                if (i == reintegroApuesta.length - 1) {
                    Menu(sc);
                }
            } else {
                System.out.println("El valor no es válido");
            }
        }
    }
}

