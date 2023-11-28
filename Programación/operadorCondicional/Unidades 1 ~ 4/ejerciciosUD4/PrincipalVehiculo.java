package ejerciciosUD4;

public class PrincipalVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear primer objeto. Al ser por defecto se queda con ().
		Vehiculo v1 = new Vehiculo ();
		// Llamar al metodo.
		v1.Mostrar();
		
		Vehiculo v2 = new Vehiculo ("Toyota", "Auris", "Blanco", 180);
		v2.Mostrar();
	}

}
