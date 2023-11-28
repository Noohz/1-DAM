/**
 * Implementa los métodos mostrar en las 3 clases y haz una clase principal donde crees un objeto de cada clase y muestres sus datos.
 */

package ejemploClaseAbstracta;

public abstract class Persona {
	
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
	
	public void Mostrar () {
		System.out.println("Nombre: " +this.nombre+ "\nApellidos: " +this.apellidos+ "\nFecha de Nacimiento: " +this.fechaNacim);
	}
}
