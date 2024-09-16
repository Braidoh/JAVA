import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creación del array inventario con 40 filas y 3 columnas
        String[][] inventario = new String[40][3];
        String opcion, nombre, codigo, cantidad;
        int productos, columna = 0;
        boolean encontrado = false;

        do {
            // Imprime el menú del programa
            System.out.println("""
                    Menú del Programa:
                    1. Añadir producto
                    2. Eliminar producto
                    3. Buscar producto
                    4. Listar inventario
                    5. Modificar cantidad
                    6. Salir del programa""");

            opcion = sc.next();
            // Validación de la entrada del usuario
            while (!opcion.matches("[1-6]")) {
                System.out.println("Entrada no válida. Por favor, elige una opción del 1 al 6.");
                opcion = sc.next();
            }

            switch (opcion) {
                case "1": // Añadir producto
                    System.out.println("Has elegido la opción 1: Añadir producto\n¿Cuántos productos quieres añadir?");
                    productos = sc.nextInt(); // Pones las veces que se repetirá el proceso
                    for (int i = 0; i < productos; i++) { // Bucle para añadir productos
                        System.out.println("Pon el nombre del producto:");
                        nombre = sc.next();
                        System.out.println("Pon el código del producto:");
                        codigo = sc.next();
                        System.out.println("Pon la cantidad del producto:");
                        cantidad = sc.next();
                        // Guarda el nombre, código y cantidad en las columnas correspondientes
                        inventario[columna][0] = nombre;
                        inventario[columna][1] = codigo;
                        inventario[columna][2] = cantidad;
                        columna++; // Pasa a la siguiente columna
                    }
                    break;
                case "2": // Eliminar producto
                    System.out.println("Has elegido la opción 2: Eliminar producto\n¿Cuántos productos quieres eliminar?");
                    productos = sc.nextInt(); // Pones las veces que se repetirá el proceso
                    for (int i = 0; i < productos; i++) { // Bucle para eliminar productos
                        System.out.println("Pon el código del producto que quieres eliminar:");
                        codigo = sc.next();
                        for (int j = 0; j < inventario.length; j++) { // Bucle para buscar el producto
                            if (inventario[j][1].equals(codigo)) { // Si el código coincide
                                // Elimina el nombre, código y cantidad
                                inventario[j][0] = null;
                                inventario[j][1] = null;
                                inventario[j][2] = null;
                                break; // Finaliza el bucle
                            }
                        }
                    }
                    break;
                case "3": // Buscar producto
                    System.out.println("Has elegido la opción 3: Buscar producto\n¿Qué producto quieres buscar?");
                    do {
                        codigo = sc.next();
                        for (int i = 0; i < inventario.length; i++) { // Bucle para buscar el producto
                            if (inventario[i][1] != null && inventario[i][1].equals(codigo)) { // Si el nombre coincide
                                // Imprime el nombre, código y cantidad del producto
                                System.out.println("Nombre: " + inventario[i][0] + "\nCódigo: " + inventario[i][1] + "\nCantidad: " + inventario[i][2]);
                                encontrado = true; // Encontrado
                                break; // Finaliza el bucle
                            }
                        }
                        if (!encontrado) { // Si no encuentra el producto
                            System.out.println("No se ha encontrado el producto, vuelve a intentarlo:");
                        }
                    } while (!encontrado); // Si no encuentra el producto, vuelve a pedir el código
                    break;
                case "4": // Listar inventario
                    System.out.println("Has elegido la opción 4: Listar inventario");
                    for (int i = 0; i < inventario.length; i++) { // Bucle para listar el inventario
                        if (inventario[i][0] != null) { // Si el nombre no es null
                            // Imprime el nombre, código y cantidad del producto
                            System.out.println("Nombre: " + inventario[i][0] + "\nCódigo: " + inventario[i][1] + "\nCantidad: " + inventario[i][2]);
                        }
                    }
                    break;
                case "5": // Modificar cantidad
                    System.out.println("Has elegido la opción 5: Modificar cantidad\n¿Qué producto quieres modificar?");
                    codigo = sc.next();
                    for (int i = 0; i < inventario.length; i++) { // Bucle para buscar el código
                        if (inventario[i][1] != null && inventario[i][1].equals(codigo)) { // Si el nombre coincide
                            System.out.println("Pon la nueva cantidad:");
                            cantidad = sc.next();
                            inventario[i][2] = cantidad; // Cambia la cantidad
                            break; // Finaliza el bucle
                        }
                    }
                    break;
                case "6": // Salir
                    System.out.println("Saliendo del programa...");
                    sc.close(); // Cierra scanner
                    System.exit(0); // Finaliza programa
                    break;
            }
        }while (!opcion.matches("6")); // Si el usuario pone 6, sale del bucle y finaliza el programa
    }
}