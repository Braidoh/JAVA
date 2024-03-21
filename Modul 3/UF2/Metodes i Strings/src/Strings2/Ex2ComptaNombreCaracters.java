package Strings2;
import java.util.HashMap;
import java.util.Map;

public class Ex2ComptaNombreCaracters {
    public static void main(String[] args) {
        String cadena = "google.com";

        Map<Character, Integer> frequencia = new HashMap<>(); // Crea variables i guarda la freqüència de cada caràcter de la cadena
        for (char caracter : cadena.toCharArray()) { //Repeteix l'acció sobre tots els caràcters de la cadena
            if (frequencia.containsKey(caracter)) { //Comprova si l'actual caràcter ja existeix al mapa de freqüència
                frequencia.put(caracter, frequencia.get(caracter) + 1); //Si és així, incrementem el seu valor en 1
            } else { //Si no és així, afegeix el caràcter al mapa amb un valor de 1
                frequencia.put(caracter, 1);
            }
        }
        System.out.println(frequencia);
    }
}

