package tarea;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Guarderia {

	// Atributos
	private final int PRECIO_MINIMO = 120;
	private int precio;
	private String nombre;
	private String contrasena;
	private static int totalAlumnos = 0;
	
	// Métodos
	
	/**
	 * Constructor por defecto.
	 */
	public Guarderia () {
		totalAlumnos++;	
	}
	
	/**
	 * Constructor parametrizado
	 * @param nombre -> Parámetro que almacena el nombre del alumno.
	 */
	public Guarderia (String nombre) {
		this.precio = Cprecio(precio);
		this.nombre = nombre;
		this.contrasena = Ccontrasena(nombre);
		totalAlumnos++;
	}

	/**
	 * Método GET
	 * @return precio -> Devuelve un *int* con el valor de precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Método SET
	 * @param precio precio -> Define el valor *int* que tendrá precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Método GET
	 * @return nombre -> Devuelve un *String* con el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método SET
	 * @param nombre nombre -> Define el valor *String* que tendrá nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método GET
	 * @return contrasena -> Devuelve un *String* con el valor de contraseña
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Método SET
	 * @param contrasena contraseña -> Define el valor *String* que tendrá contraseña
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	/**
	 * Método GET
	 * @return totalAlumnos -> Devuelve un *int* con el valor de totalAlumnos
	 */
	public static int getTotalAlumnos() {
		return totalAlumnos;
	}

	/**
	 * Método útilizado para calcular la contraseña.
	 * @param contrasena -> Parámetro que almacena la contraseña del alumno.
	 * @return contrasena -> Parámetro que devuelve la contraseña del alumno sin vocales ni espacios.
	 */
	private String Ccontrasena (String contrasena) {
		return contrasena.replaceAll("[AaEeIiOoUu ]", "");
	}
	
	/**
	 * Método utilizado para calcular el precio según el número de alumnos.
	 * @param precio -> Parámetro que almacena el precio de inscripción.
	 * @return -> Devuelve la cantidad a pagar según el número de alumnos inscritos.
	 */
	private int Cprecio (int precio) {
		if (totalAlumnos >= 7 && totalAlumnos <= 10) {
			return PRECIO_MINIMO;
			
		} else if (totalAlumnos >= 4 && totalAlumnos <= 7) {
			return 180;
			
		} else 
			return 200;	
	}
	
	/**
	 * Método utilizado para mostrar los datos.
	 */
	public void Mostrar () {
		System.out.println("El nombre del alumno es: " +this.nombre);
		System.out.println("La contraseña del alumno es: " +this.contrasena);
		System.out.println("El precio a pagar es: " +this.precio);
		System.out.println("El número total de alumnos es: " +Guarderia.totalAlumnos+ "\n");
	}
}
