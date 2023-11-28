package tarea;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Conductor {

	// Atributos
	private String nombre;
	private int aExperiencia;
	
	/**
	 * Constructor por defecto.
	 */
	public Conductor () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param Nombre -> Parámetro que almacena el nombre del conductor.
	 * @param AExperiencia -> Parámetro que almacena los años de experiencia del conductor.
	 */
	public Conductor (String nombre, int aExperiencia) {
		this.nombre = nombre;
		this.aExperiencia = aExperiencia;
	}
	

	/**
	 * Metodo GET
	 * @return nombre -> Devuelve un *String* con el valor de nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo SET
	 * @param nombre nombre -> Define el valor *String* que tendrá nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo GET
	 * @return aExperiencia -> Devuelve un *INT* con el valor de aExperiencia.
	 */
	public int getaExperiencia() {
		return aExperiencia;
	}

	/**
	 * Metodo SET
	 * @param aExperiencia aExperiencia -> Define el valor *INT* que tendrá aExperiencia.
	 */
	public void setaExperiencia(int aExperiencia) {
		this.aExperiencia = aExperiencia;
	}
	
	public void mostrar () {
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Años de experiencia: " +this.aExperiencia);
	}
	
}
