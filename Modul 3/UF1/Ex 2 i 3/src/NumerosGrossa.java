//Poso NumerosGrossa perquè em dona error si poso Ex3
// En el fitxer Exercici 3 argumento l'ús d'Array List
// Aquest codi mostra l'estructura per fer una llista dels números de la Grossa i la seva comprovació:

import java.util.ArrayList;
public class NumerosGrossa {
    private ArrayList<Integer> numeros; // Llista de números de la Grossa
    public NumerosGrossa() { // Constructor
        this.numeros = new ArrayList<>(); // Inicialitza la llista
    }
    public void afegirNumero(int numero) { // Afegeix un número a la llista
        if (!this.numeros.contains(numero)) {
            this.numeros.add(numero);
        }
    }
    public boolean teNumero(int numero) { // Comprova si un número existeix a la llista
        return this.numeros.contains(numero);
    }
    public int obtenirNumero(int index) { // Obté el número de la posició indicada
        return this.numeros.get(index);
    }
    public int getNumerosRestants() {// Obté el nombre de números restants a la llista
        return this.numeros.size();
    }


    public static void main(String[] args) { // Comprova els números
        NumerosGrossa numeros = new NumerosGrossa();

        //Poso tres números a la llista per comprovar
        numeros.afegirNumero(93213);
        numeros.afegirNumero(12345);
        numeros.afegirNumero(78901);

        if (numeros.teNumero(93213)) { //Comprova si existeix el número 93213 per exemple
            System.out.println("El número 93213 existeix a la llista");
        } else {
            System.out.println("El número 93213 no existeix a la llista");
        }

        int numero = numeros.obtenirNumero(1); //Obté el primer número de la llista
        System.out.println("El primer número de la llista és " + numero);

        System.out.println("Queden " + numeros.getNumerosRestants() + " números a la llista"); // **Comprovem quants números queden a la llista**
        numeros.numeros.forEach(System.out::println); //Imprimeix els números de la Grossa, és opcional
    }
}
