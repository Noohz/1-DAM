package unidad6;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Asignatura {

	// Atributos
	private String nombre;
	private int numAlumnos;
	private String aula;
	
	/**
	 * Constructor por defecto.
	 */
	public Asignatura () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre -> Identificador que almacena el nombre de la asignatura.
	 * @param numAlumnos -> Identificador que almacena el número de alumnos con esa asignatura.
	 * @param aula -> Identificador que almacena el nombre del aula.
	 */
	public Asignatura (String nombre, int numAlumnos, String aula) {
		this.nombre = nombre;
		this.numAlumnos = numAlumnos;
		this.aula = aula;
	}
		
	/**
	 * @return nombre -> Devuelve un *String* con el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre -> Define el valor *String* que tendrá nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return numAlumnos -> Devuelve un *int* con el valor de numAlumnos
	 */
	public int getNumAlumnos() {
		return numAlumnos;
	}

	/**
	 * @param numAlumnos -> Define el valor *int* que tendrá numAlumnos
	 */
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	/**
	 * @return aula -> Devuelve un *String* con el valor de aula
	 */
	public String getAula() {
		return aula;
	}

	/**
	 * @param aula -> Define el valor *String* que tendrá aula
	 */
	public void setAula(String aula) {
		this.aula = aula;
	}

	public void Mostrar () {
		System.out.println("El nombre de la asignatura es: " +this.nombre);
		System.out.println("El número de alumnos es: " +this.numAlumnos);
		System.out.println("El nombre del aula es: " +this.aula);
	}
	
}
