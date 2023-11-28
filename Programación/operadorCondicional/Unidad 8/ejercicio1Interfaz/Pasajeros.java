package ejercicio1Interfaz;

public class Pasajeros implements InterfazBarcos {

	private double mEslora;
	private int numCamas;
	
	public Pasajeros () {
		
	}
	
	public Pasajeros (double mEslora, int numCamas) {
		this.mEslora = mEslora;
		this.numCamas = numCamas;
		System.out.println("Se ha creado un barco de Pasajeros con " +numCamas+ " pasajeros y tiene " +mEslora+ " metros de eslora.");
	}
	
	public double getmEslora() {
		return mEslora;
	}

	public void setmEslora(double mEslora) {
		this.mEslora = mEslora;
	}

	public int getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

	public void alarma() {
		
		System.out.println("La alarma se ha enviado desde el barco de pasajeros.");
		
	}
	
	public void mensajeSocorro(String m) {
		
		alarma();
		
		System.out.println("#- Mensaje de Socorro -#");
		System.out.println(m);
	}
}
