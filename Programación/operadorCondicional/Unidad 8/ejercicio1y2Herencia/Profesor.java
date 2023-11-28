/**
 * Implementa estas 3 clases con los atributos especificados y los métodos setters y getters que sean necesarios.
 */

package ejercicio1y2Herencia;

public class Profesor extends Persona{

	private double salario;
	private String especialidad;
	
	
	public Profesor () {
		
	}
	
	public Profesor (String nombre, String apellidos, int fechaNacim, double salario, String especialidad) {
		super (nombre, apellidos, fechaNacim);
		this.salario = salario;
		this.especialidad = especialidad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
