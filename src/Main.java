import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		GestorBiblioteca gestor = new GestorBiblioteca();
		Scanner sc = new Scanner(System.in);

		// Datos de prueba
		biblioteca.afegirLlibre(new Llibre(1, "1984", "George Orwell", " Novel·la"));
		biblioteca.afegirLlibre(new Llibre(2, "El petit princep", "Antoine de Saint-Exupery", " Novel·la corta"));
		biblioteca.afegirLlibre(new Llibre(3, "Don Quijote", "Cervantes", " Clàssic"));
		biblioteca.afegirLlibre(new Llibre(4, "AYUSO", "David Fernández", " Historic"));

		Usuari usuari = new Usuari(1, "Ainhoa Valles");        

		int opcio;
		do {
			System.out.println("\n===== GESTIO BIBLIOTECA =====");
			System.out.println("1. Llistar llibres");
			System.out.println("2. Buscar llibre");
			System.out.println("3. Prestar llibre");
			System.out.println("4. Retornar llibre");
			System.out.println("5. Veure prestecs actius");
			System.out.println("6. Veure historial usuari");
			System.out.println("0. Sortir");
			System.out.print("Opcio: ");
			opcio = sc.nextInt();
			sc.nextLine();

			switch (opcio) {
			case 1:
				biblioteca.llistarLlibres();
				break;

			case 2:
				System.out.print("Titol: ");
				String titol = sc.nextLine();
				Llibre trobat = biblioteca.buscarLlibreSenseAccents(titol);
				if (trobat != null) System.out.println(trobat);
				else System.out.println("Llibre no trobat.");
				break;

			case 3:
				System.out.print("Titol del llibre a prestar: ");
				String tp = sc.nextLine();
				Llibre lp = biblioteca.buscarLlibreSenseAccents(tp);
				if (lp != null) gestor.prestarLlibre(usuari, lp);
				else System.out.println("Llibre no trobat.");
				break;

			case 4:
				System.out.print("Titol del llibre a retornar: ");
				String tr = sc.nextLine();
				Llibre lr = biblioteca.buscarLlibreSenseAccents(tr);
				if (lr != null) gestor.retornarLlibre(usuari, lr);
				else System.out.println("Llibre no trobat.");
				break;

			case 5:
				gestor.llistarPrestecs();
				break;

			case 6:
				usuari.mostrarHistorial();
				break;

			case 0:
				System.out.println("Fins aviat!");
				break;

			default:
				System.out.println("Opcio no valida.");
			}

		} while (opcio != 0);

		sc.close();
	}
}