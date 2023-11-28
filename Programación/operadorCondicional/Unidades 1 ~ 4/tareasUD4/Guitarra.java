package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Guitarra {

	int numero_cuerdas;
	String tono, color, nombre_dueño;
	
	/**
	 * Constructor por defecto.
	 */
	public Guitarra () {
		
	}
	
	/**
	 * Constructor con los 3 primeros parámetros.
	 * @param numero_cuerdas -> Identificador que muestra el numero de cuerdas de Guitarra.
	 * @param tono -> Identificador que muestra el tono de Guitarra.
	 * @param color -> Identificador que muestra el color de Guitarra.
	 */
	public Guitarra (int numero_cuerdas, String tono, String color) {
		this.numero_cuerdas = numero_cuerdas;
		this.tono = tono;
		this.color = color;
	}
	
	/**
	 * Constructor con los parámetros nombre_dueno y color.
	 * @param nombre_dueño -> Identificador que muestra el nombre del dueño de Guitarra.
	 * @param color -> Identificador que muestra el color de Guitarra.
	 */
	public Guitarra (String nombre_dueño, String color) {
		this.nombre_dueño = nombre_dueño;
		this.color = color;
	}

	/**
	 * Metodo get's
	 * @return numero_cuerdas -> Devuelve un Int con el valor de numero_cuerdas.
	 */
	public int getNumero_cuerdas() {
		return numero_cuerdas;
	}

	/**
	 * Metodo set's
	 * @param numero_cuerdas -> Define el valor Int que tendrá numero_cuerdas.
	 */
	public void setNumero_cuerdas(int numero_cuerdas) {
		this.numero_cuerdas = numero_cuerdas;
	}

	/**
	 * Metodo get's
	 * @return tono -> Devuelve un String con el valor de tono.
	 */
	public String getTono() {
		return tono;
	}

	/**
	 * Metodo set's
	 * @param tono -> Define el valor String que tendrá tono.
	 */
	public void setTono(String tono) {
		this.tono = tono;
	}

	/**
	 * Metodo get's
	 * @return color -> Devuelve un String con el valor de color.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo set's
	 * @param color -> Define el valor String que tendrá color.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo get's
	 * @return nombre_dueño -> Devuelve un String con el valor de nombre_dueño.
	 */
	public String getNombre_dueño() {
		return nombre_dueño;
	}

	/**
	 * Metodo set's
	 * @param nombre_dueño -> Define el valor String que tendrá nombre_dueño.
	 */
	public void setNombre_dueño(String nombre_dueño) {
		this.nombre_dueño = nombre_dueño;
	}
	
}