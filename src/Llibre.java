/**
 * Classe que representa un llibre de la biblioteca.
 * Conté informació bàsica com el títol, autor, categoria
 * i si està prestat o no. També guarda quantes vegades
 * ha estat prestat.
 * @author Fatima
 * @version 1.0
 */
public class Llibre {

    /** Identificador únic del llibre */
    private int id;

    /** Títol del llibre */
    private String titol;

    /** Autor del llibre */
    private String autor;

    /** Categoria del llibre (novel·la, fantasia, etc.) */
    private String categoria;

    /** Nombre de vegades que el llibre ha estat prestat */
    private int vecesPrestat = 0;

    /** Indica si el llibre està prestat o no */
    private boolean prestat;

    /**
     * Constructor del llibre.
     * Inicialitza totes les dades del llibre i el deixa com a disponible.
     * @param id Identificador únic del llibre
     * @param titol Títol del llibre
     * @param autor Autor del llibre
     * @param categoria Categoria del llibre
     */
    public Llibre(int id, String titol, String autor, String categoria) {
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
    }

    /** @return Identificador del llibre */
    public int getId() {
        return id;
    }

    /** @return Títol del llibre */
    public String getTitol() {
        return titol;
    }

    /** @return Autor del llibre */
    public String getAutor() {
        return autor;
    }

    /** @return Nombre de vegades que ha estat prestat */
    public int getVecesPrestat() {
        return vecesPrestat;
    }

    /**
     * Indica si el llibre està prestat.
     * @return true si està prestat, false si està disponible
     */
    public boolean esPrestat() {
        return prestat;
    }

    /**
     * Indica si el llibre està disponible.
     * @return true si NO està prestat
     */
    public boolean estaDisponible() {
        return !prestat;
    }

    /**
     * Marca el llibre com a prestat i incrementa el comptador.
     */
    public void prestar() {
        prestat = true;
        vecesPrestat++;
    }

    /**
     * Marca el llibre com a retornat (disponible).
     */
    public void retornar() {
        prestat = false;
    }

    /**
     * Modifica el títol i l'autor del llibre.
     * @param nouTitol Nou títol del llibre
     * @param nouAutor Nou autor del llibre
     */
    public void modificar(String nouTitol, String nouAutor) {
        this.titol = nouTitol;
        this.autor = nouAutor;
    }

    /**
     * Retorna una cadena amb la informació del llibre.
     * @return Informació del llibre en format text
     */
    @Override
    public String toString() {
        return "[" + id + "] " + titol + " - " + autor + " - " + categoria +
                (prestat ? " No disponible" : " Disponible");
    }
}
