
import java.util.ArrayList;
import java.util.List;

public class Usuari {

    private int id;
    private String nom;
    private List <Llibre> llibresPrestats;
    private static final int MAX_LLIBRES = 3;

    /**
     * Constructor de la clase Usuari.
     * @param id Identificador del usuario
     * @param nom Nombre del usuario
     */
    public Usuari(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    //Getters 
    public String getNom() {
        return nom;
    }
    public int getId() {
    	return id;
    }
    public List <Llibre> getLlibresPrestats(){
    	return llibresPrestats;
    }

    /**
     * Añade un libro al usuario si no supera el límite.
     * 
     * @param llibre libro a añadir
     * @return true si se añade correctamente, false si no
     */
    public boolean agafarLlibre(Llibre llibre) {
        if (llibresPrestats.size() < MAX_LLIBRES) {
            llibresPrestats.add(llibre);
            return true;
        }
        return false;
    }

    /**
     * Elimina un libro de la lista del usuario.
     * 
     * @param llibre libro a devolver
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Muestra los libros que tiene el usuario.
     */
    public void mostrarLlibres() {
        for (Llibre l : llibresPrestats) {
            System.out.println(l);
        }
    }
}