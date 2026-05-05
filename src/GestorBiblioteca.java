import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

	private List<Prestec> prestecs;

	public GestorBiblioteca() {
		this.prestecs = new ArrayList<>();

	}

	/**
	 * Presta un libro a un usuario si está disponible y no supera el límite.
	 */
	public void prestarLlibre(Usuari usuari, Llibre llibre) {
		if (!llibre.estaDisponible()) {
			System.out.println("El llibre '" + llibre.getTitol() + "' ja esta prestat.");
			return;
		}
		boolean afegit = usuari.agafarLlibre(llibre);
		if (!afegit) {
			System.out.println(usuari.getNom() + " ja te el maxim de llibres permesos.");
			return;
		}
		llibre.prestar();
		Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
		prestecs.add(prestec);
		usuari.getHistorial().add(prestec);
		System.out.println("Prestat correctament. Data retorn: " + prestec.getDataRetorn());
	}

	/**
	 * Devuelve un libro prestado.
	 */
	public void retornarLlibre(Usuari usuari, Llibre llibre) {
		usuari.retornarLlibre(llibre);
		llibre.retornar();
		System.out.println("Llibre '" + llibre.getTitol() + "' retornat correctament.");
	}

	/**
	 * Muestra todos los préstamos activos.
	 */
	public void llistarPrestecs() {
		if (prestecs.isEmpty()) {
			System.out.println("No hi ha prestecs actius.");
			return;
		}
		for (Prestec p : prestecs) {
			System.out.println(p);
		}
	}
}