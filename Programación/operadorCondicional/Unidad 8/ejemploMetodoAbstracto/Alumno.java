package ejemploMetodoAbstracto;

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
	
	// Redefinición del método abstracto mostrar en la Clase Alumno.
	public void Mostrar () {
		System.out.println("Nombre: " +this.getNombre()+ "\nApellidos: " +this.getApellidos()+ "\nFecha de Nacimiento: " +this.getFechaNacim());
		System.out.println("Grupo: " +this.grupo+ "\nNota Media: " +this.notaMedia+ "\n");
	}
}
