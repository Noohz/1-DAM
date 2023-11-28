package tareaFicheros;

import java.io.Serializable;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class ClaseAlumno implements Serializable{

	private String nombre;
    private int edad;
    private double beca;
    private boolean estudiando;
    
    public ClaseAlumno () {
    	
    }
	
    public ClaseAlumno (String nombre, int edad, double beca, boolean estudiando) {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.beca = beca;
    	this.estudiando = estudiando;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getBeca() {
		return beca;
	}

	public void setBeca(double beca) {
		this.beca = beca;
	}

	public boolean isEstudiando() {
		return estudiando;
	}

	public void setEstudiando(boolean estudiando) {
		this.estudiando = estudiando;
	}

	public String toString() {
		return "Nombre del alumno: " + nombre + " \nEdad del alumno: " + edad + " \nBeca del alumno: " + beca + "€ \n¿Esta estudiando actualmente? " + estudiando + "\n";
	}	
}
