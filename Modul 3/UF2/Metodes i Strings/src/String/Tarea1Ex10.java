package String;

public class Tarea1Ex10 {
    public static void main(String[] args) {
        // Declaramos e inicializamos el array
        String[] alumnos = new String[] {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};

        for (int i = 0; i < alumnos.length; i++) { // Iteramos sobre el array
            if (i < alumnos.length - 1) { // Si es el último elemento, no imprimimos la coma
                System.out.print(alumnos[i] + ", ");
            } else {
                System.out.print(alumnos[i]);
            }
        }
    }
}

