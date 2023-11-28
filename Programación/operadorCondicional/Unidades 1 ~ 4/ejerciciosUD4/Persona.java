package ejerciciosUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Persona {

	String nombre, genero;
	int idPersona, edad;
	
	/**
	 * Constructor por defecto.
	 */
	public Persona () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre -> Muestra el nombre de la persona.
	 * @param genero -> Muestra el genero de la persona.
	 * @param idPersona -> Muestra la id de la persona.
	 * @param edad -> Muestra la edad de la persona.
	 */
	public Persona (String nombre, String genero, int idPersona, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.idPersona = idPersona;
		this.edad = edad;
	}
	
	/**
	 * 
	 * @param valor -> Permite cargar datos.
	 */
	public void setIdPersona(int valor) {
		this.idPersona = valor;
	}
}
