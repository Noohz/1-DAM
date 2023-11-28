package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class GuitarraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Objeto que instancia al constructor por defecto.
		 */
		Guitarra g1 = new Guitarra ();
		
		/**
		 * Objeto que instancia al constructor con 3 parámetros.
		 */
		Guitarra g2 = new Guitarra (6, "Sol", "Rojo");
		
		/**
		 * Objeto que instancia al constructor con 2 parámetros.
		 */
		Guitarra g3 = new Guitarra ("Marcos", "Azul");
		
		System.out.println("Guitarra (Constructor por defecto) \nEl número de cuerdas es: " +g1.getNumero_cuerdas()+ "\nEl tono es: " +g1.getTono()+ 
				"\nEl color es: " +g1.getColor()+ "\nEl nombre del dueño es:" +g1.getNombre_dueño());
		
		System.out.println("\nGuitarra (Constructor con parámetros 1) \nEl número de cuerdas es: " +g2.getNumero_cuerdas()+ "\nEl tono es: " +g2.getTono()+
				"\nEl color es: " +g2.getColor());
		
		System.out.println("\nGuitarra (Constructor con parámetros 2) \nEl dueño de la Guitarra es: " +g3.getNombre_dueño()+ "\nEl color es: " +g3.getColor());
		
	}

}