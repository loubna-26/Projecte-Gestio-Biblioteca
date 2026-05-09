
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    /** Llista de llibres que té la biblioteca */
    private List<Llibre> llibres;

    /**
     * Constructor de la biblioteca.
     * Inicialitza la llista de llibres buida.
     */
    public Biblioteca() {
        llibres = new ArrayList<>();
    }

    /**
     * Afegeix un llibre a la biblioteca.
     * @param llibre Llibre que volem afegir
     */
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    /**
     * Busca un llibre pel seu títol.
     * @param titol Títol del llibre a buscar
     * @return El llibre si existeix, o null si no es troba
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
     * Busca un llibre pel títol ignorant accents.
     * @param titol Títol del llibre a buscar
     * @return El llibre si coincideix sense accents, o null si no es troba
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
     * Elimina un llibre pel seu títol.
     * @param titol Títol del llibre a eliminar
     * @return true si s'ha eliminat, false si no existeix
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
     * Converteix un text a una versió sense accents.
     * Serveix per comparar títols de manera més flexible.
     * @param text Text original
     * @return Text sense accents
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
     * Mostra tots els llibres de la biblioteca per pantalla.
     */
    public void llistarLlibres() {
        for (Llibre llibre : llibres) {
            System.out.println(llibre);
        }
    }

    /**
     * Retorna el llibre que ha estat prestat més vegades.
     * @return El llibre més prestat, o null si no hi ha llibres
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