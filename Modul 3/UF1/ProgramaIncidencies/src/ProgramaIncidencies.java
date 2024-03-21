import java.util.Scanner;

public class ProgramaIncidencies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIncidencias = 0;
        Incidencia ultimaIncidencia = null;

        System.out.println("Menú"); // Mostrar menú
        System.out.println("1. Dar de alta nueva incidencia");
        System.out.println("2. Consultar última incidencia introducida");
        System.out.println("3. Número de incidencias introducidas");
        System.out.println("4. Salir");

        // Leer opción del usuario
        System.out.print("Introduce una opción: ");

        while  (!scanner.hasNextInt()) {
            scanner.next();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Dar de alta nueva incidencia
                    ultimaIncidencia = nuevaIncidencia(scanner);
                    break;
                case 2:
                    // Consultar última incidencia introducida
                    if (ultimaIncidencia != null) {
                        System.out.println("**Datos de la última incidencia**");
                        System.out.println("Aula: " + ultimaIncidencia.aula);
                        System.out.println("Persona: " + ultimaIncidencia.persona);
                        System.out.println("Departamento: " + ultimaIncidencia.departamento);

                        // Incrementar número de incidencias
                        numeroIncidencias++;

                    } else {
                        System.out.println("No hay ninguna incidencia registrada.");
                    }
                    break;
                case 3:
                    // Número de incidencias introducidas
                    System.out.println("Se han registrado " + numeroIncidencias + " incidencias.");
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida.");
                    return;
            }
        }
    }

    private static Incidencia nuevaIncidencia(Scanner scanner) {
        // Leer aula
        System.out.print("Introduce el aula: ");
        int aula = scanner.nextInt();

        // Leer persona que ha informado la incidencia
        System.out.print("Introduce la persona que ha informado la incidencia: ");
        String persona = scanner.nextLine();

        // Leer departamento
        System.out.print("Introduce el departamento: ");
        String departamento = scanner.nextLine();

        // Crea y devuelve incidencia
        return new Incidencia(aula, persona, departamento);
    }
}

class Incidencia {

    int aula;
    String persona;
    String departamento;

    public Incidencia(int aula, String persona, String departamento) {
        this.aula = aula;
        this.persona = persona;
        this.departamento = departamento;
    }
}
