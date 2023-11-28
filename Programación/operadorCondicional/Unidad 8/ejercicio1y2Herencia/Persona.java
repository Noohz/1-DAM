/**
 * Implementa estas 3 clases con los atributos especificados y los métodos setters y getters que sean necesarios.
 */

package ejercicio1y2Herencia;

import java.util.GregorianCalendar;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int fechaNacim;
	
	
	public Persona () {
		
	}
	
	
	public Persona (String nombre, String apellidos, int fechaNacim) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacim = fechaNacim;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getFechaNacim() {
		return fechaNacim;
	}

	public void setFechaNacim(int fechaNacim) {
		this.fechaNacim = fechaNacim;
	}
}
