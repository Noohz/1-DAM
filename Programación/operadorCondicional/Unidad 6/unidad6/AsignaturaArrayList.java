/*
 * Implemente una aplicación con una clase Asignatura que tenga como atributos: nombre, número de alumnos y aula.
 * Dicha clase debe tener como métodos: constructores, getters, setters y mostrar.
 */

package unidad6;

public class AsignaturaArrayList {

	// Variables.	
	private String nombre;
	private int numAlumnos;
	private String aula;
	
	// Constructor por defecto.
	public AsignaturaArrayList () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre
	 * @param numAlumnos
	 * @param aula
	 */
	public AsignaturaArrayList (String nombre, int numAlumnos, String aula) {
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
	 * @param nombre nombre -> Define el valor *String* que tendrá nombre
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
	 * @param numAlumnos numAlumnos -> Define el valor *int* que tendrá numAlumnos
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
	 * @param aula aula -> Define el valor *String* que tendrá aula
	 */
	public void setAula(String aula) {
		this.aula = aula;
	}

	public String toString() {
		return "AsignaturaArrayList [Nombre=" + nombre + ", Número de alumnos=" + numAlumnos + ", Aula=" + aula + "]";
	}
	
	
}
