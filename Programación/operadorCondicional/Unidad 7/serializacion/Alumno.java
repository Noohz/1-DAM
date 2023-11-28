package serializacion;

import java.io.*;

public class Alumno implements Serializable {

	String nombre;
	String apellidos;
	String curso;
	
	public Alumno (String nombre, String apellidos, String curso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		
	}

	public String toString() {
		return "\nNombre del alumno: " + nombre + ", \nApellidos del alumno: " + apellidos + ", \nCurso del alumno: " + curso + "\n";
	}
}

