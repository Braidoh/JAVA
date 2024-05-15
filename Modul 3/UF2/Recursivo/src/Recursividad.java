import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu(sc);
    }

    public static void Menu(Scanner sc) {
        String option;

        do {
            System.out.println("""
                    Escoge una de estas opciones:
                    1. Dividir
                    2. Sumar dígitos
                    3. Sumar los elementos vector
                    4. Multiplicar los elementos de un vector
                    5. Sumar los elementos de una matriz
                    6. Mostrar numero menor de un vector
                    7. Salir""");

            option = sc.next();
            switch (option) {
                case "1":
                    Dividir(sc);
                    break;
                case "2":
                    SumarDigitos(sc);
                    break;
                case "3":
                    SumarVector(sc);
                    break;
                case "4":
                    MultiplicarVector(sc);
                    break;
                case "5":
                    SumarMatriz(sc);
                    break;
                case "6":
                    MostrarVector(sc);
                    break;
                case "7":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida");
            }
        } while (!option.matches("1"));
        Menu(sc);
    }

    private static void MostrarVector(Scanner sc) {
        int menor = 0;
        System.out.println("Introduce el tamaño del vector");
        int size = sc.nextInt();
        int[] vector = new int[size];
        System.out.println("Introduce los elementos del vector");
        for (int i = 0; i < size; i++) {
            vector[i] = sc.nextInt();
            if (i == 0) {
                menor = vector[i];
            } else if (vector[i] < menor) {
                menor = vector[i];
            }
        } System.out.println("El número menor del vector es: " + menor);
    }

    /*private static void SumarMatriz(Scanner sc) {
        System.out.println("Introduce el número de filas de la matriz");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz");
        int columnas = sc.nextInt();
        System.out.println("Introduce los elementos de la matriz");
        int[][] matriz = new int[filas][columnas];
        int suma = 0;
        for (int[] fila : matriz) {
            for (int[] columna : matriz) {
                suma += sc.nextInt();
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }*/

    private static void SumarMatriz(Scanner sc) {
        System.out.println("Introduce el número de filas de la matriz");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz");
        int columnas = sc.nextInt();
        int size = filas * columnas;
        int[] matriz = new int[size];
        System.out.println("Introduce los elementos de la matriz");
        int resultado = 0;
        for (int i : matriz) {
            resultado += sc.nextInt();
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + resultado);
    }

    private static void MultiplicarVector(Scanner sc) {
        System.out.println("Introduce el tamaño del vector");
        int size = sc.nextInt();
        int[] vector = new int[size];
        System.out.println("Introduce los elementos del vector");
        int resultado = 1; // Inicializa el resultado en 1
        for (int i : vector) {
            resultado *= sc.nextInt(); // Multiplica el resultado por cada valor del vector
        } System.out.println("El resultado es: " + resultado);
    }

    private static void SumarVector(Scanner sc) {
        System.out.println("Introduce el tamaño del vector");
        int size = sc.nextInt();
        int[] vector = new int[size];
        System.out.println("Introduce los elementos del vector");
        int resultado = 0; // Inicializa la suma en 0
        for (int i : vector) {
            resultado += sc.nextInt(); // Suma el valor leído a la variable suma
        } System.out.println("La suma de todos los elementos del vector es: " + resultado);
    }

    private static void SumarDigitos(Scanner sc) {
        int sum = 0;
        System.out.println("Pon los dígitos");
        int num = sc.nextInt();
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los dígitos es: " + sum);
    }

    private static void Dividir(Scanner sc) {
        System.out.println("Pon el numero dividendo");
        int num1 = sc.nextInt();
        System.out.println("Pon el numero divisor");
        int num2 = sc.nextInt();
        System.out.println("El resultado es: " + num1 / num2);
    }
}





