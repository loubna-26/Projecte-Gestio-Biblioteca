import java.time.LocalDate;

/**
 * Classe que representa un préstec d'un llibre.
 * Guarda quin usuari ha agafat el llibre, quin llibre és,
 * la data del préstec i la data prevista de retorn.
 * La data de retorn és automàticament 2 setmanes després.
 * @author Loubna
 * @version 1.0
 */
public class Prestec {

    /** Usuari que ha agafat el llibre */
    private Usuari usuari;

    /** Llibre que s'ha prestat */
    private Llibre llibre;

    /** Data en què s'ha fet el préstec */
    private LocalDate dataPrestec;

    /** Data prevista de retorn (2 setmanes després) */
    private LocalDate dataRetorn;

    /**
     * Constructor del préstec.
     * Crea un préstec amb la data actual i calcula la data de retorn.
     * @param usuari Usuari que agafa el llibre
     * @param llibre Llibre prestat
     * @param dataPrestec Data en què es fa el préstec
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2); // Retorn en 2 setmanes
    }

    /** @return Usuari que ha fet el préstec */
    public Usuari getUsuari() {
        return usuari;
    }

    /** @return Llibre prestat */
    public Llibre getLlibre() {
        return llibre;
    }

    /** @return Data prevista de retorn */
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    /**
     * Retorna la informació del préstec en format text.
     * @return Cadena amb usuari, llibre i dates
     */
    @Override
    public String toString() {
        return "Usuari: " + usuari.getNom() +
                " | Llibre: " + llibre.getTitol() +
                " | Prestec: " + dataPrestec +
                " | Retorn: " + dataRetorn;
    }
}
