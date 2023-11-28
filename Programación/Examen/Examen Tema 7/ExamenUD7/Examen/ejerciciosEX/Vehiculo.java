package ejerciciosEX;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Vehiculo {

	private String matricula;
	private String color;
	private int numPlazas;
	Conductor c1;
	
	public Vehiculo () {
		
	}
	
	/**
	 * Constructor parametrizado
	 * @param matricula -> Almacena la matricula del vehículo.
	 * @param color -> Almacena el color del vehículo.
	 * @param numPlazas -> Almacena el número de plazas del vehículo.
	 * @param c1
	 */
	public Vehiculo (String matricula, String color, int numPlazas, Conductor c1) {
		this.matricula = matricula;
		this.color = color;
		this.numPlazas = numPlazas;
		this.c1 = c1;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public Conductor getC1() {
		return c1;
	}

	public void setC1(Conductor c1) {
		this.c1 = c1;
	}

	public String toString() {
		return "Matricula del vehículo: " + matricula + " \nColor del vehículo: " + color + " \nNúmero de plazas del vehículo: " + numPlazas + " \nDatos del conductor: " +c1;
	}
	
	
	
}
