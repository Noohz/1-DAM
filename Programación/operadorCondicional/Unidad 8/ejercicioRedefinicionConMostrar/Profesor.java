/**
 * Implementa los métodos mostrar en las 3 clases y haz una clase principal donde crees un objeto de cada clase y muestres sus datos.
 */

package ejercicioRedefinicionConMostrar;

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
	
	public void Mostrar () {
		super.Mostrar();
		System.out.println("Salario: " +this.salario+ "\nEspecialidad: " +this.especialidad+ "\n");
	}
	
}
