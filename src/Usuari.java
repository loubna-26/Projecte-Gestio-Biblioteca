import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un usuari de la biblioteca.
 * Cada usuari té un identificador, un nom,
 * una llista de llibres prestats i un historial de préstecs.
 * 
 * L'usuari només pot tenir un màxim de 3 llibres prestats alhora.
 * 
 * @author Fatima
 * @version 1.0
 */
public class Usuari {

    /** Identificador únic de l'usuari */
    private int id;

    /** Nom de l'usuari */
    private String nom;

    /** Llista de llibres que l'usuari té actualment prestats */
    private List<Llibre> llibresPrestats;

    /** Historial de préstecs de l'usuari */
    private List<Prestec> historial;

    /** Nombre màxim de llibres prestats per usuari */
    private static final int MAX_LLIBRES = 3;

    /**
     * Constructor de la classe Usuari.
     * Inicialitza les dades de l'usuari,
     * la llista de llibres prestats i l'historial.
     * 
     * @param id Identificador de l'usuari
     * @param nom Nom de l'usuari
     */
    public Usuari(int id, String nom) {

        this.id = id;
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    /**
     * Retorna el nom de l'usuari.
     * 
     * @return Nom de l'usuari
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retorna l'identificador de l'usuari.
     * 
     * @return Identificador de l'usuari
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna la llista de llibres prestats.
     * 
     * @return Llista de llibres prestats
     */
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    /**
     * Retorna l'historial de préstecs de l'usuari.
     * 
     * @return Historial de préstecs
     */
    public List<Prestec> getHistorial() {
        return historial;
    }

    /**
     * Afegeix un llibre a la llista de préstecs
     * si l'usuari no supera el límit màxim.
     * 
     * @param llibre Llibre que es vol prestar
     * @return true si el llibre s'ha afegit correctament,
     * false si l'usuari ja té el màxim de llibres
     */
    public boolean agafarLlibre(Llibre llibre) {

        if (llibresPrestats.size() < MAX_LLIBRES) {

            llibresPrestats.add(llibre);
            return true;
        }

        return false;
    }

    /**
     * Retorna un llibre prestat
     * i l'elimina de la llista de préstecs.
     * 
     * @param llibre Llibre que es retorna
     */
    public void retornarLlibre(Llibre llibre) {

        llibresPrestats.remove(llibre);
    }

    /**
     * Mostra tots els llibres
     * que té actualment l'usuari.
     */
    public void mostrarLlibres() {

        for (Llibre l : llibresPrestats) {
            System.out.println(l);
        }
    }

    /**
     * Mostra l'historial de préstecs de l'usuari.
     */
    public void mostrarHistorial() {

        for (Prestec p : historial) {
            System.out.println(p);
        }
    }
}