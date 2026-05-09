
import java.time.LocalDate;

public class Prestec {

	//Propiedades
	private Usuari usuari; 
	private Llibre llibre; 
	private LocalDate dataPrestec; 
	private LocalDate dataRetorn; 

	//Constructors de clase
	public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) { 
		this.usuari = usuari; 
		this.llibre = llibre; 
		this.dataPrestec = dataPrestec; 
		this.dataRetorn = dataPrestec.plusWeeks(2); 
	} 

	// Getters de attributos de clase
	public Usuari getUsuari() { return usuari; } 
	public Llibre getLlibre() { return llibre; } 
	public LocalDate getDataRetorn() { return dataRetorn; }

	// El ToString para mostrar informaciones del prestado
	@Override
	public String toString() {
		return "Usuari: " + usuari.getNom() +
				" | Llibre: " + llibre.getTitol() +
				" | Prestec: " + dataPrestec +
				" | Retorn: " + dataRetorn;
	}
}
