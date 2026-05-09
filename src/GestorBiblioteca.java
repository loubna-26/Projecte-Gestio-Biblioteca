import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gestiona els préstecs de la biblioteca.
 * S'encarrega de prestar llibres, retornar-los i mostrar
 * els préstecs actius. Treballa amb usuaris i llibres.
 * @author Loubna
 * @version 1.0
 */
public class GestorBiblioteca {

    /** Llista de tots els préstecs realitzats */
    private List<Prestec> prestecs;

    /**
     * Constructor del gestor.
     * Inicialitza la llista de préstecs buida.
     */
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /**
     * Presta un llibre a un usuari si:
     * - el llibre està disponible
     * - l'usuari no supera el límit de llibres prestats
     *
     * També crea un objecte Prestec i l'afegeix a l'historial.
     *
     * @param usuari Usuari que vol agafar el llibre
     * @param llibre Llibre que es vol prestar
     */
    public void prestarLlibre(Usuari usuari, Llibre llibre) {

        // Si el llibre ja està prestat, no es pot agafar
        if (!llibre.estaDisponible()) {
            System.out.println("El llibre '" + llibre.getTitol() + "' ja està prestat.");
            return;
        }

        // Comprovar si l'usuari pot agafar més llibres
        boolean afegit = usuari.agafarLlibre(llibre);
        if (!afegit) {
            System.out.println(usuari.getNom() + " ja té el màxim de llibres permesos.");
            return;
        }

        // Marcar el llibre com a prestat
        llibre.prestar();

        // Crear el préstec amb la data actual
        Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());

        // Afegir-lo a la llista general i a l'historial de l'usuari
        prestecs.add(prestec);
        usuari.getHistorial().add(prestec);

        System.out.println("Prestat correctament. Data retorn: " + prestec.getDataRetorn());
    }

    /**
     * Retorna un llibre prestat per un usuari.
     * Elimina el llibre de la seva llista i el marca com a disponible.
     *
     * @param usuari Usuari que retorna el llibre
     * @param llibre Llibre que es vol retornar
     */
    public void retornarLlibre(Usuari usuari, Llibre llibre) {
        usuari.retornarLlibre(llibre);
        llibre.retornar();
        System.out.println("Llibre '" + llibre.getTitol() + "' retornat correctament.");
    }

    /**
     * Mostra tots els préstecs actius.
     * Si no n'hi ha cap, mostra un missatge informatiu.
     */
    public void llistarPrestecs() {
        if (prestecs.isEmpty()) {
            System.out.println("No hi ha préstecs actius.");
            return;
        }

        for (Prestec p : prestecs) {
            System.out.println(p);
        }
    }
}
