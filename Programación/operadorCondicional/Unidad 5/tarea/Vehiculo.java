package tarea;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Vehiculo {

	// Atributos
	private String Matricula;
	private String Color;
	private int nPlazas;
	public Conductor c1;
	
	/**
	 * Constructor por defecto.
	 */
	public Vehiculo () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param Matricula -> Parámetro que indica la matricula del vehículo.
	 * @param Color -> Parámetro que indica el color del vehículo.
	 * @param nPlazas -> Parámetro que indica la cantidad de plazas del vehículo.
	 */
	public Vehiculo (String Matricula, String Color, int nPlazas, Conductor c) {
		this.Matricula = Matricula;
		this.Color = Color;
		this.nPlazas = nPlazas;
		this.c1 = c;
	}
	
	public Vehiculo (Conductor c) {
		this.c1 = c;
	}
	
	/**
	 * @return matricula -> Devuelve un *String* con el valor de matricula
	 */
	public String getMatricula() {
		return Matricula;
	}

	/**
	 * @param matricula matricula -> Define el valor *String* que tendrá matricula
	 */
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	/**
	 * @return color -> Devuelve un *String* con el valor de color
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * @param color color -> Define el valor *String* que tendrá color
	 */
	public void setColor(String color) {
		Color = color;
	}

	/**
	 * @return nPlazas -> Devuelve un *int* con el valor de nPlazas
	 */
	public int getnPlazas() {
		return nPlazas;
	}

	/**
	 * @param nPlazas nPlazas -> Define el valor *int* que tendrá nPlazas
	 */
	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}	
	
	public void mostrar () {
		System.out.println("**Detalles del Vehiculo y Conductor**");
		System.out.println("Matricula: " +this.Matricula);
		System.out.println("Color: " +this.Color);
		System.out.println("Número de plazas: " +this.nPlazas);
		System.out.println("Nombre del conductor: " +this.c1.getNombre());
		System.out.println("Años de experiencia del conductor: " +this.c1.getaExperiencia()+ "\n");
	}
}
