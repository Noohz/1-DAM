package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Colegio {

	String nombre, direccion;
	int num_alumnos;
	
	/**
	 * Constructor por defecto
	 */
	public Colegio () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre -> Identificador que muesta el nombre.
	 * @param direccion -> Identificador que muestra la dirección.
	 * @param num_alumnos -> Identificador que muestra la cantidad de alumnos.
	 */
	public Colegio (String nombre, String direccion, int num_alumnos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.num_alumnos = num_alumnos;
	}

	
	/**
	 * Metodo get's
	 * @return nombre -> Devuelve un String del identificador nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set's
	 * @param nombre -> Define el valor String que tendrá nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get's
	 * @return direccion -> Devuelve un String del identificador direccion.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo set's
	 * @param direccion -> Define el valor String que tendrá direccion.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo get's
	 * @return num_alumnos -> Devuelve un int del identificador direccion.
	 */
	public int getNum_alumnos() {
		return num_alumnos;
	}
	
	/**
	 * Metodo set's
	 * @param num_alumnos -> Define el valor Int que tendrá num_alumnos.
	 */
	public void setNum_alumnos(int num_alumnos) {
		this.num_alumnos = num_alumnos;
	}
}