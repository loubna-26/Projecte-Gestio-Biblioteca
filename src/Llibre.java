
/**
 * Classe que representa un llibre de la biblioteca.
 * Cada llibre té un identificador, títol, autor,
 * categoria i informació sobre la seva disponibilitat.
 * També guarda el nombre de vegades que ha estat prestat.
 * 
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

	/** Categoria del llibre */
	private String categoria;

	/** Nombre de vegades que el llibre ha estat prestat */
	private int vecesPrestat = 0;

	/** Indica si el llibre està prestat o disponible */
	private boolean prestat;

	/**
	 * Constructor del llibre.
	 * Inicialitza totes les dades del llibre
	 * i el deixa disponible inicialment.
	 * 
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

	/**
	 * Retorna l'identificador del llibre.
	 * 
	 * @return Identificador del llibre
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retorna el títol del llibre.
	 * 
	 * @return Títol del llibre
	 */
	public String getTitol() {
		return titol;
	}

	/**
	 * Retorna l'autor del llibre.
	 * 
	 * @return Autor del llibre
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Retorna el nombre de vegades
	 * que el llibre ha estat prestat.
	 * 
	 * @return Nombre de préstecs del llibre
	 */
	public int getVecesPrestat() {
		return vecesPrestat;
	}

	/**
	 * Indica si el llibre està prestat.
	 * 
	 * @return true si està prestat, false si està disponible
	 */
	public boolean esPrestat() {
		return prestat;
	}

	/**
	 * Indica si el llibre està disponible.
	 * 
	 * @return true si el llibre està disponible
	 */
	public boolean estaDisponible() {
		return !prestat;
	}

	/**
	 * Marca el llibre com a prestat
	 * i incrementa el comptador de préstecs.
	 */
	public void prestar() {
		prestat = true;
		vecesPrestat++;
	}

	/**
	 * Marca el llibre com a retornat
	 * i torna a estar disponible.
	 */
	public void retornar() {
		prestat = false;
	}

	/**
	 * Modifica el títol i l'autor del llibre.
	 * 
	 * @param nouTitol Nou títol del llibre
	 * @param nouAutor Nou autor del llibre
	 */
	public void modificar(String nouTitol, String nouAutor) {
		this.titol = nouTitol;
		this.autor = nouAutor;
	}

	/**
	 * Retorna la informació del llibre en format text.
	 * 
	 * @return Informació completa del llibre
	 */
	@Override
	public String toString() {
		return "[" + id + "] " + titol + " - " + autor + " - " + categoria +
				(prestat ? " No disponible" : " Disponible");
	}
}