package Enlace;
import java.util.ArrayList;

public class Local {
    // Declaració de variables
    private String nom;
    private int tamany;
    private String lloc;
    private int preu;

    // Declaració de mètodes (ens ho va ensenyar la professora sustituta en l'exercici Loteria La Grossa)
    public String getNom() {
        return nom;
    }

    public int getTamany() {
        return tamany;
    }

    public String getLloc() {
        return lloc;
    }

    public int getPreu() {
        return preu;
    }

    // Creació d'una classe pròpia per definir 4 paràmetres
    public Local(String nom, int tamany, String lloc, int preu) { //Fa que accepti els 4 paràmetres (nom, tamany, lloc, preu)
        ArrayList<Local> locals = new ArrayList<>(); //Permet fer un llistat dels locals

        // Afegim locals amb diferents noms, tamanys, llocs (districtes) i preus
        locals.add(new Local("Cafetería Vieja Plaza", 30, "Ciutat Vella", 800));
        locals.add(new Local("Bistró Modernista", 100, "Ciutat Vella", 1200));
        locals.add(new Local("Gran Teatro Lírico", 200, "Ciutat Vella", 2500));
        locals.add(new Local("Mercado Central", 300, "Ciutat Vella", 4500));
        locals.add(new Local("Tasca El Rincón", 30, "Eixample", 700));
        locals.add(new Local("Galería Art Noveau", 100, "Eixample", 1100));
        locals.add(new Local("Espacio Polivalente Eixample", 200, "Eixample", 2200));
        locals.add(new Local("Centro Comercial Eixample", 300, "Eixample", 4200));
        locals.add(new Local("Barrio Bistró", 30, "Sants-Montjuïc", 950));
        locals.add(new Local("Librería Montjuïc", 100, "Sants-Montjuïc", 1950));
        locals.add(new Local("Auditorio Montjuïc", 200, "Sants-Montjuïc", 2850));
        locals.add(new Local("Centro de Exposiciones", 300, "Sants-Montjuïc", 4800));
        locals.add(new Local("Pastelería Las Cortes", 30, "Les Corts", 990));
        locals.add(new Local("Restaurante Cortesano", 100, "Les Corts", 1990));
        locals.add(new Local("Galería de Arte Moderno", 200, "Les Corts", 2990));
        locals.add(new Local("Complejo Deportivo Les Corts", 300, "Les Corts", 4990));
        locals.add(new Local("Bodeguita Sarrià", 30, "Sarrià-Sant Gervasi", 980));
        locals.add(new Local("Sant Gervasi Gourmet", 100, "Sarrià-Sant Gervasi", 1890));
        locals.add(new Local("Centro Cultural Sarrià", 200, "Sarrià-Sant Gervasi", 2790));
        locals.add(new Local("Espacio Sarrià Events", 300, "Sarrià-Sant Gervasi", 4590));
        locals.add(new Local("Pizzería Gràcia", 30, "Gràcia", 950));
        locals.add(new Local("Gràcia Lounge", 100, "Gràcia", 1750));
        locals.add(new Local("Teatro de Gràcia", 200, "Gràcia", 2650));
        locals.add(new Local("Mercado de Gràcia", 300, "Gràcia", 4950));
        locals.add(new Local("Cafetería Horta", 30, "Horta-Guinardó", 920));
        locals.add(new Local("Restaurante Horta", 100, "Horta-Guinardó", 1420));
        locals.add(new Local("Centro Cívico Horta", 200, "Horta-Guinardó", 2320));
        locals.add(new Local("Horta Cinemas", 300, "Horta-Guinardó", 4420));
        locals.add(new Local("Bar Nou Barris", 30, "Nou Barris", 890));
        locals.add(new Local("Nou Barris Gastronómico", 100, "Nou Barris", 1690));
        locals.add(new Local("Polideportivo Nou Barris", 200, "Nou Barris", 2590));
        locals.add(new Local("Centro Comercial Nou Barris", 300, "Nou Barris", 4690));
        locals.add(new Local("Heladería San Andrés", 30, "San Andrés", 970));
        locals.add(new Local("San Andrés Delicatessen", 100, "San Andrés", 1970));
        locals.add(new Local("Auditorio San Andrés", 200, "San Andrés", 2970));
        locals.add(new Local("San Andrés Espacio Eventos", 300, "San Andrés", 4970));
        locals.add(new Local("Cervecería San Martín", 30, "San Martín", 850));
        locals.add(new Local("San Martín Bistrot", 100, "San Martín", 1850));
        locals.add(new Local("Centro de Conferencias San Martín", 200, "San Martín", 2850));
        locals.add(new Local("Gran Centro Comercial San Martín", 300, "San Martín", 4850));
    }
}
