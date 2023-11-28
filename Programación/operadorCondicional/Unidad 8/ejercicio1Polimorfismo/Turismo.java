package ejercicio1Polimorfismo;

public class Turismo extends Vehiculo {
	
	private Double precioKm; // Precio por kilometro.
	private int kmAlquiler; // Número de km que tiene el coche cuando se alquila.
	private int kmDevolucion; // Número de km que tiene el coche cuando se devuelve.
	private static int numTurismo = 0; // Número total de objetos creado de la clase numTurismo.
	private static int numTurAlquilados = 0; // Número de vehículos de esa clase que están alquilados.
	
	
	public Turismo () {
		
	}
	
	public Turismo (Double precioKm, int kmAlquiler, int kmDevolucion, int numTurismo, int numTurAlquilados) {
		this.precioKm = precioKm;
		this.kmAlquiler = kmAlquiler;
		this.kmDevolucion = kmDevolucion;
		Turismo.numTurismo = numTurismo;
		Turismo.numTurAlquilados = numTurAlquilados;
		numTurismo++;
	}

	public Double getPrecioKm() {
		return precioKm;
	}

	public void setPrecioKm(Double precioKm) {
		this.precioKm = precioKm;
	}

	public int getKmAlquiler() {
		return kmAlquiler;
	}

	public void setKmAlquiler(int kmAlquiler) {
		this.kmAlquiler = kmAlquiler;
	}

	public int getKmDevolucion() {
		return kmDevolucion;
	}

	public void setKmDevolucion(int kmDevolucion) {
		this.kmDevolucion = kmDevolucion;
	}

	public static int getNumTurismo() {
		return numTurismo;
	}

	public static void setNumTurismo(int numTurismo) {
		Turismo.numTurismo = numTurismo;
	}

	public static int getNumTurAlquilados() {
		return numTurAlquilados;
	}

	public static void setNumTurAlquilados(int numTurAlquilados) {
		Turismo.numTurAlquilados = numTurAlquilados;
	}
	
	
		
}
