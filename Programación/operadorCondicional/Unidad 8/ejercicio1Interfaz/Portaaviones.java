package ejercicio1Interfaz;

public class Portaaviones implements InterfazBarcos {

	private int numAviones;
	private int numMarinos;
	
	public Portaaviones () {
		
	}
	
	public Portaaviones (int numAviones, int numMarinos) {
		this.numAviones = numAviones;
		this.numMarinos = numMarinos;
		System.out.println("Se ha creado un barco de Pasajeros con " +numMarinos+ " marineros y tiene " +numAviones+ " aviones almacenados.");
	}
	
	public int getNumAviones() {
		return numAviones;
	}

	public void setNumAviones(int numAviones) {
		this.numAviones = numAviones;
	}

	public int getNumMarinos() {
		return numMarinos;
	}

	public void setNumMarinos(int numMarinos) {
		this.numMarinos = numMarinos;
	}

	public void alarma() {
		
		System.out.println("La alarma se ha enviado desde el Portaaviones.");
		
	}

	
	public void mensajeSocorro(String m) {
	
		alarma();
		System.out.println("#- Mensaje de Socorro -#");
		System.out.println(m);
		
	}

	
	
}
