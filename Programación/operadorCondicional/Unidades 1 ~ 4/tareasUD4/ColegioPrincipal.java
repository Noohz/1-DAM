package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class ColegioPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Objeto que instancia al Constructor por defecto.
		 */
		Colegio c1 = new Colegio ();
		
		/**
		 * Objeto que instancia al Constructor Parametrizado.
		 */
		Colegio c2 = new Colegio ("Campo Arañuelo", "c/ni idea", 300);
		
		System.out.println("Colegio por defecto \nEl nombre del colegio es: " +c1.getNombre()+ "\nLa dirección del colegio es: " +c1.getDireccion()+ 
				"\nEl número de alumnos del colegio es: " +c1.getNum_alumnos());
		
		System.out.println("\nColegio Parametrizado \nEl nombre del colegio es: " +c2.getNombre()+ "\nLa dirección del colegio es: " +c2.getDireccion()+ 
				"\nEl número de alumnos del colegio es: " +c2.getNum_alumnos());
		
	}

}