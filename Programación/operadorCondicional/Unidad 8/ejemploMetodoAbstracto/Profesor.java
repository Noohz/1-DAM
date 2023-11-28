package ejemploMetodoAbstracto;

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
	
	// Redefinición del método abstracto mostrar de la clase Profesor.
	public void Mostrar () {
		System.out.println("Nombre: " +this.getNombre()+ "\nApellidos: " +this.getApellidos()+ "\nFecha de Nacimiento: " +this.getFechaNacim());
		System.out.println("Salario: " +this.salario+ "\nEspecialidad: " +this.especialidad+ "\n");
	}
	
}
