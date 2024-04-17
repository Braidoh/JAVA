

// Importamos las clases necesarias para el programa
import java.util.ArrayList;
import java.util.Scanner;


// Definimos la clase principal Main
public class Main {
    // Definimos el método principal main
    public static void main(String[] args) {
        // Creamos una nueva instancia de la clase Tienda
        Tienda tienda = new Tienda();
        // Llamamos al método mostrarMenu de la instancia tienda
        tienda.mostrarMenu();
    }


    // Definimos la clase Reparacion
    public static class Reparacion {
        // Definimos las variables de la clase Reparacion
        int numeroReparacion; // Número de reparación (entero)
        String imeiMovil; // IMEI del móvil (cadena de texto)
        String dniCliente;  // DNI del cliente (cadena de texto)


        // Definimos el constructor de la clase Reparacion
        public Reparacion(int numeroReparacion, String imeiMovil, String dniCliente) {
            // Asignamos los valores de los parámetros a las variables de la clase
            this.numeroReparacion = numeroReparacion; //this se usa para referirse a la variable de instancia.
            this.imeiMovil = imeiMovil; // this se usa para referirse a la variable de instancia.
            this.dniCliente = dniCliente; // this se usa para referirse a la variable de instancia.
        }
    }


    // Definimos la clase Trabajador
    public static class Trabajador {
        // Definimos las variables de la clase Trabajador
        int numeroTrabajador; // Número de trabajador (entero)
        Integer numeroReparacionAsignada; // Número de reparación asignada (entero) //¿Que es un integer?
        // Integer es una clase envoltorio que contiene un campo de tipo primitivo int.


        // Definimos el constructor de la clase Trabajador
        public Trabajador(int numeroTrabajador, Integer numeroReparacionAsignada) {
            // Asignamos los valores de los parámetros a las variables de la clase
            this.numeroTrabajador = numeroTrabajador; //this se usa para referirse a la variable de instancia.
            this.numeroReparacionAsignada = numeroReparacionAsignada; //this se usa para referirse a la variable de instancia.
        }
    }


    // Definimos la clase Tienda
    public static class Tienda {
        // Definimos las listas de reparaciones y trabajadores
        ArrayList<Reparacion> reparaciones = new ArrayList<>(); //ArrayList es una clase de Java que implementa la interfaz List.
        ArrayList<Trabajador> trabajadores = new ArrayList<>();


        // Definimos el método para dar de alta una reparación
        public void altaReparacion() {
            // Creamos un nuevo scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            // Pedimos al usuario que introduzca los datos de la reparación
            System.out.println("Introduce el número de reparación:");
            int numeroReparacion = scanner.nextInt(); // nextInt() lee el siguiente entero.
            System.out.println("Introduce el IMEI del móvil:");
            String imeiMovil = scanner.next();
            System.out.println("Introduce el DNI del cliente:");
            String dniCliente = scanner.next(); // next() lee la siguiente cadena de texto completa.
            // Añadimos la nueva reparación a la lista de reparaciones
            reparaciones.add(new Reparacion(numeroReparacion, imeiMovil, dniCliente));
        }


        // Definimos el método para dar de alta un trabajador
        public void altaTrabajador() {
            // Creamos un nuevo scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            // Pedimos al usuario que introduzca los datos del trabajador
            System.out.println("Introduce el número de trabajador:");
            int numeroTrabajador = scanner.nextInt();
            System.out.println("Introduce el número de reparación asignada:");
            Integer numeroReparacionAsignada = scanner.nextInt();
            // Añadimos el nuevo trabajador a la lista de trabajadores
            trabajadores.add(new Trabajador(numeroTrabajador, numeroReparacionAsignada));
        }


        // Definimos el método para mostrar el menú
        public void mostrarMenu() {
            // Mostramos las opciones del menú
            System.out.println("Menú del Programa:");
            System.out.println("1. Alta reparación");
            System.out.println("2. Alta trabajador");
            System.out.println("3. Salir");
            // Creamos un nuevo scanner para leer la opción seleccionada por el usuario
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            // Ejecutamos la acción correspondiente a la opción seleccionada
            switch (opcion) { // switch se usa para seleccionar una de las múltiples opciones.
                case 1: // case se usa para comparar una expresión con múltiples valores.
                    altaReparacion();
                    mostrarMenu();
                    break; // break se usa para salir de la estructura de control.
                case 2:
                    altaTrabajador();
                    mostrarMenu();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default: // default se usa para ejecutar un bloque de código si no se cumple ninguna de las condiciones anteriores.
                    System.out.println("Opción no válida");
                    mostrarMenu();
                    break;
            }
        }
    }
}


// Output:
// 1. Alta reparación
// 2. Alta trabajador
// 3. Salir
// 1
// Introduce el número de reparación: // 1
// Introduce el IMEI del móvil: // 123456789
// Introduce el DNI del cliente: // 12345678A
// 1. Alta reparación
// 2. Alta trabajador
// 3. Salir
// 2
// Introduce el número de trabajador: // 1
// Introduce el número de reparación asignada: // 1
// 1. Alta reparación
// 2. Alta trabajador
// 3. Salir
// 3
// Saliendo...
// Process finished with exit code 0

