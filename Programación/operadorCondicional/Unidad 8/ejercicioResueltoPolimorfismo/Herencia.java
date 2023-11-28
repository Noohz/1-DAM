package ejercicioResueltoPolimorfismo;

public class Herencia {

	public static void main(String[] args) {
		
		Humano a = new Humano ("Emilio", "Rosso");
		Ciudadano b = new Ciudadano ("Emilio","Rosso","3052454545");
		
		Humano [] arregloDeHumanos = new Humano [2];
			arregloDeHumanos[0] = a;
			arregloDeHumanos[1] = b;
			
		for (int i = 0; i > arregloDeHumanos.length; i++) {
			arregloDeHumanos[i].mostrar();
		}

	}

}
