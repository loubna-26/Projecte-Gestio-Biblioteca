import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un usuari de la biblioteca.
 * Cada usuari té un id, un nom, una llista de llibres prestats
 * i un historial de préstecs realitzats.
 * L'usuari només pot tenir un màxim de 3 llibres prestats alhora.
 * @author Fatima
 * @version 1.0
 */
public class Usuari {

    /** Identificador únic de l'usuari */
    private int id;

    /** Nom de l'usuari */
    private String nom;

    /** Llibres que l'usuari té actualment prestats */
    private List<Llibre> llibresPrestats;

    /** Historial de tots els préstecs que ha fet */
    private List<Prestec> historial;

    /** Nombre màxim de llibres que pot tenir un usuari */
    private static final int MAX_LLIBRES = 3;

    /**
     * Constructor de la classe Usuari.
     * Inicialitza les llistes de llibres prestats i historial.
     * @param id Identificador de l'usuari
     * @param nom Nom de l'usuari
     */
    public Usuari(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    /** @return Nom de l'usuari */
    public String getNom() {
        return nom;
    }

    /** @return Identificador de l'usuari */
    public int getId() {
        return id;
    }

    /** @return Llista de llibres que té prestats */
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    /** @return Historial de préstecs de l'usuari */
    public List<Prestec> getHistorial() {
        return historial;
    }

    /**
     * Afegeix un llibre a la llista de llibres prestats,
     * sempre que no superi el límit de 3 llibres.
     * @param llibre Llibre que l'usuari vol agafar
     * @return true si s'ha pogut afegir, false si ja té 3 llibres
     */
    public boolean agafarLlibre(Llibre llibre) {
        if (llibresPrestats.size() < MAX_LLIBRES) {
            llibresPrestats.add(llibre);
            return true;
        }
        return false;
    }

    /**
     * Elimina un llibre de la llista de llibres prestats.
     * @param llibre Llibre que l'usuari retorna
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Mostra per pantalla tots els llibres que té l'usuari.
     */
    public void mostrarLlibres() {
        for (Llibre l : llibresPrestats) {
            System.out.println(l);
        }
    }

    /**
     * Mostra per pantalla l'historial de préstecs de l'usuari.
     */
    public void mostrarHistorial() {
        for (Prestec p : historial) {
            System.out.println(p);
        }
    }
}
