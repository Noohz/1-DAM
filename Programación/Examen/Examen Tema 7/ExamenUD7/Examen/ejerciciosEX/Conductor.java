package ejerciciosEX;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Conductor {

	private String nombre;
	private int anyosExperiencia;
	
	
	public Conductor () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre -> Almacena el nombre del conductor.
	 * @param anyosExperiencia -> Almacena los años de experiencia del conductor.
	 */
	public Conductor (String nombre, int anyosExperiencia) {
		this.nombre = nombre;
		this.anyosExperiencia = anyosExperiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}

	public String toString() {
		return "Nombre del conductor: " + nombre + "\nAños de experiencia del conductor: " + anyosExperiencia;
	}
	
	
	
}
