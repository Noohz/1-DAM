/**
 * Implementa estas 3 clases con los atributos especificados y los métodos setters y getters que sean necesarios.
 */

package ejercicio1y2Herencia;

public class Alumno extends Persona {
	
	private String grupo;
	private double notaMedia;
	
	
	public Alumno () {
		
	}
	
	public Alumno (String nombre, String apellidos, int fechaNacim, String grupo, double notaMedia) {
		super (nombre, apellidos, fechaNacim);
		this.grupo = grupo;
		this.notaMedia = notaMedia;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}	
}
