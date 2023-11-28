package ExamenT4;

/**
 * 
 * @author Raúl Blázquez Ibáñez
 *
 */

public class Instituto {
	/**
	 * Atributos nombre (String) direccion (String) bilingue (boolean)
	 * numero_alumnos (int)
	 */
	String nombre, direccion;
	boolean bilingue;
	int numero_alumnos;

	/**
	 * Constructor por defecto
	 */

	public Instituto() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param direccion
	 * @param bilingue
	 * @param numero_alumnos
	 */

	public Instituto(String nombre, String direccion, boolean bilingue, int numero_alumnos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.bilingue = bilingue;
		this.numero_alumnos = numero_alumnos;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return bilingue
	 */
	public boolean isBilingue() {
		return this.bilingue;
	}

	public void setBilingue(boolean bilingue) {
		this.bilingue = bilingue;
	}

	/**
	 * @return numero_alumnos
	 */
	public int getNumero_alumnos() {
		return this.numero_alumnos;
	}

	public void setNumero_alumnos(int numero_alumnos) {
		this.numero_alumnos = numero_alumnos;
	}


	}


