
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {

	//Propiedades
	private List<Llibre> llibres;


	//Constructor

	public Biblioteca() {
		llibres = new ArrayList<>();
	}

	/**
	 * Añadir un libro a la biblioteca
	 */
	public void afegirLlibre(Llibre llibre) {
		llibres.add(llibre);
	}

	/**
	 * Buscar libro
	 */
	public Llibre buscarLlibre(String titol) {
		for (Llibre llibre : llibres) {
			if (llibre.getTitol().equalsIgnoreCase(titol)) {
				return llibre;
			}
		}
		return null;
	}

	/**
	 * Buscar libro ignorando acentos.
	 */
	public Llibre buscarLlibreSenseAccents(String titol) {
		String titolSimple = normalitzar(titol);

		for (Llibre llibre : llibres) {
			if (normalitzar(llibre.getTitol()).equalsIgnoreCase(titolSimple)) {
				return llibre;
			}
		}
		return null;
	}

	/**
	 * Eliminar libro por título 
	 */
	public boolean eliminarLlibre(String titol) {
		Llibre llibre = buscarLlibre(titol);

		if (llibre != null) {
			llibres.remove(llibre);
			return true;
		}
		return false;
	}

	/**
	 * Método sencillo para quitar acentos
	 */
	private String normalitzar(String text) {
		text = text.toLowerCase();

		text = text.replace("á", "a").replace("à", "a");
		text = text.replace("é", "e").replace("è", "e");
		text = text.replace("í", "i").replace("ì", "i");
		text = text.replace("ó", "o").replace("ò", "o");
		text = text.replace("ú", "u").replace("ù", "u");

		return text;
	}

	/**
	 * Listar todos los libros
	 */
	public void llistarLlibres() {
		for (Llibre llibre : llibres) {
			System.out.println(llibre);
		}
	}

	/**
	 * El libro màs prestado
	 */
	public Llibre llibreMesPrestat() {
		Llibre max = null;

		for (Llibre l : llibres) {
			if (max == null || l.getVecesPrestat() > max.getVecesPrestat()) {
				max = l;
			}
		}
		return max;
	}
}