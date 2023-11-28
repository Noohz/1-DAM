/**
 * Implementa los métodos mostrar en las 3 clases y haz una clase principal donde crees un objeto de cada clase y muestres sus datos.
 */

package ejercicioRedefinicionConMostrar;

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
	
	public void Mostrar () {
		super.Mostrar();
		System.out.println("Grupo: " +this.grupo+ "\nNota Media: " +this.notaMedia+ "\n");
	}
}
