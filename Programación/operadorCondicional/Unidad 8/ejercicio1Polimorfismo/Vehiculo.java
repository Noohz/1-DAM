package ejercicio1Polimorfismo;

public class Vehiculo {
	
	protected String matricula;
	protected boolean alquilado;
	
	public Vehiculo () {
		
	}
	
	public Vehiculo (String matricula, boolean alquilado) {
		this.matricula = matricula;
		this.alquilado = alquilado;
	}
	
	public void alquilar () {
		System.out.println("Introduce la matricula del vehículo a alquilar.");
	}
	
	public void devolver () {
		
		if (alquilado == true) {
			alquilado = false;
			System.out.println("El vehículo se ha devuelto.");
		} else {
			System.out.println("El vehículo no está alquilado.");
		}
		
	}
	
	public void showInfo () {
		System.out.println("#- Información del Vehículo");
		System.out.println("La matrícula del vehículo es: " +this.matricula+ ".");
		
		if (alquilado == true) {
			System.out.println("El vehículo está alquilado.");
		} else {
			System.out.println("El vehículo no está alquilado.");
		}
	}
}
