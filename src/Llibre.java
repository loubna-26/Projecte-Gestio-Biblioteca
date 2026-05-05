
public class Llibre {

<<<<<<< HEAD
	//Propiedades
	private int id;
	private String titol;
	private String autor;
	private String categoria;
	private int vecesPrestat = 0;
	private boolean prestat;

	// Constructores
	/**
	 * Constructor de la clase Llibre.
	 * @param id Identificador único del libro
	 * @param titol Título del libro
	 * @param autor Autor del libro
	 */
	public Llibre(int id, String titol, String autor, String categoria) {
		this.id = id;
		this.titol = titol;
		this.autor = autor;
		this.categoria = categoria;
		this.prestat = false;
	}

	// Getters de los attributos
	public int getId() {
		return id;
	}

	public String getTitol() {
		return titol;
	}

	public String getAutor() {
		return autor;
	}

	public int getVecesPrestat() {
		return vecesPrestat ;
	}

	/**
	 * Indica si el libro está prestado.
	 * @return true si está prestado, false si está disponible
	 */
	public boolean esPrestat() {
		return prestat;
	}

	/**
	 * Comprovar disponibilitat del llibre
	 */
	public boolean estaDisponible() {
		return !prestat;
	}

	/**
	 * Marca el libro como prestado.
	 */
	public void prestar() {
		prestat = true;
		vecesPrestat++;
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
		return "[" + id + "] " + titol + " - " + autor + " - " + categoria + (prestat ? " No disponible" : " Disponible");
	}
=======
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
>>>>>>> 000f6bc5644411c28dfbfb5b073bcbd57579c972
}
