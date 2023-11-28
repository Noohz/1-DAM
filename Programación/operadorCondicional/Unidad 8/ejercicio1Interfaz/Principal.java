package ejercicio1Interfaz;

public class Principal {

	public static void main(String[] args) {
		
		Pasajeros bp = new Pasajeros (65.3, 43);
		bp.mensajeSocorro("Socorro\n");
		Portaaviones cv = new Portaaviones (65, 150);
		cv.mensajeSocorro("Socorro\n");
		Pesquero ps = new Pesquero (34.1, 40, 7);
		ps.mensajeSocorro("Socorro\n");

	}

}
