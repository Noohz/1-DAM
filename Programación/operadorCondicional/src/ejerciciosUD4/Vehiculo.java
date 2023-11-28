package ejerciciosUD4;

public class Vehiculo {

	String marca, modelo, color;
	int velocidad_max;
	
	// Metodos
	// Constructor por defecto.
	public Vehiculo() {
		
	}
	
	// Constructor parametrizado.
	public Vehiculo(String marca, String modelo, String color, int velocidad_max) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad_max = velocidad_max;	
	}
	public void Mostrar() {
		System.out.println("\nDetalles del Vehículo \nLa marca del vehículo es: " +this.marca+ "\nEl modelo es: " +this.modelo+ "\nEl color es: " +this.color+ "\nLa velocidad máxima es: " +this.velocidad_max);
	}
}
