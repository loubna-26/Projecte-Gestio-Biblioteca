
public class Llibre {

    private int id;
    private String titol;
    private String autor;
    private boolean prestat;

    /**
     * Constructor de la clase Llibre.
     * @param id Identificador único del libro
     * @param titol Título del libro
     * @param autor Autor del libro
     */
    public Llibre(int id, String titol, String autor) {
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public int getId() {
        return id;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    /**
     * Indica si el libro está prestado.
     * @return true si está prestado, false si está disponible
     */
    public boolean esPrestat() {
        return prestat;
    }

    /**
     * Marca el libro como prestado.
     */
    public void prestar() {
        prestat = true;
    }

    /**
     * Marca el libro como devuelto.
     */
    public void retornar() {
        prestat = false;
    }

    /**
     * Modifica los datos del libro.
     * @param nouTitol nuevo título
     * @param nouAutor nuevo autor
     */
    public void modificar(String nouTitol, String nouAutor) {
        this.titol = nouTitol;
        this.autor = nouAutor;
    }

    /**
     * Devuelve información del libro en formato texto.
     */
    @Override
    public String toString() {
        return "[" + id + "] " + titol + " - " + autor +
                (prestat ? "  Prestado" : " Disponible");
    }
}
