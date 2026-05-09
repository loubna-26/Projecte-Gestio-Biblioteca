import java.util.Scanner;

/**
 * Classe principal del programa.
 * Mostra un menú perquè l'usuari pugui gestionar la biblioteca:
 * llistar llibres, buscar, prestar, retornar i veure l'historial.
 * Aquesta classe crea els objectes principals i controla el flux del programa.
 * 
 * @author Loubna
 * @version 1.0
 */
public class Main {

    /**
     * Mètode principal del programa.
     * Crea una biblioteca, un gestor i un usuari de prova.
     * Mostra un menú amb diferents opcions fins que l'usuari decideix sortir.
     */
    public static void main(String[] args) {

        // Crear els objectes principals
        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();
        Scanner sc = new Scanner(System.in);

        // Afegir llibres de prova
        biblioteca.afegirLlibre(new Llibre(1, "1984", "George Orwell", "Novel·la"));
        biblioteca.afegirLlibre(new Llibre(2, "El petit princep", "Antoine de Saint-Exupery", "Novel·la curta"));
        biblioteca.afegirLlibre(new Llibre(3, "Don Quijote", "Cervantes", "Clàssic"));
        biblioteca.afegirLlibre(new Llibre(4, "AYUSO", "David Fernández", "Històric"));

        // Crear un usuari de prova
        Usuari usuari = new Usuari(1, "Ainhoa Valles");

        int opcio;

        // Bucle del menú principal
        do {
            System.out.println("===== GESTIO BIBLIOTECA =====");
            System.out.println("1. Llistar llibres");
            System.out.println("2. Buscar llibre");
            System.out.println("3. Prestar llibre");
            System.out.println("4. Retornar llibre");
            System.out.println("5. Veure prestecs actius");
            System.out.println("6. Veure historial usuari");
            System.out.println("0. Sortir");
            System.out.print("Opcio: ");

            opcio = sc.nextInt();
            sc.nextLine(); // Netejar buffer

            switch (opcio) {

                case 1:
                    // Mostrar tots els llibres
                    biblioteca.llistarLlibres();
                    break;

                case 2:
                    // Buscar llibre pel títol
                    System.out.print("Titol: ");
                    String titol = sc.nextLine();
                    Llibre trobat = biblioteca.buscarLlibreSenseAccents(titol);

                    if (trobat != null)
                        System.out.println(trobat);
                    else
                        System.out.println("Llibre no trobat.");
                    break;

                case 3:
                    // Prestar un llibre
                    System.out.print("Titol del llibre a prestar: ");
                    String tp = sc.nextLine();
                    Llibre lp = biblioteca.buscarLlibreSenseAccents(tp);

                    if (lp != null)
                        gestor.prestarLlibre(usuari, lp);
                    else
                        System.out.println("Llibre no trobat.");
                    break;

                case 4:
                    // Retornar un llibre
                    System.out.print("Titol del llibre a retornar: ");
                    String tr = sc.nextLine();
                    Llibre lr = biblioteca.buscarLlibreSenseAccents(tr);

                    if (lr != null)
                        gestor.retornarLlibre(usuari, lr);
                    else
                        System.out.println("Llibre no trobat.");
                    break;

                case 5:
                    // Mostrar préstecs actius
                    gestor.llistarPrestecs();
                    break;

                case 6:
                    // Mostrar historial de l'usuari
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
