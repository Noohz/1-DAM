package ejercicio1Interfaz;

public class Pesquero implements InterfazBarcos {

	private double mEslora;
	private int potencia;
	private int numPescadores;
	
	public Pesquero () {
		
	}
	
	public Pesquero (double mEslora, int potencia, int numPescadores) {
		this.mEslora = mEslora;
		this.potencia = potencia;
		this.numPescadores = numPescadores;
		System.out.println("Se ha creado un barco de Pasajeros con " +mEslora+ " metros de eslora, " +potencia+ " potencia y " +numPescadores+ " pescadores.");
	}
	
	public double getmEslora() {
		return mEslora;
	}

	public void setmEslora(double mEslora) {
		this.mEslora = mEslora;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumPescadores() {
		return numPescadores;
	}

	public void setNumPescadores(int numPescadores) {
		this.numPescadores = numPescadores;
	}

	public void alarma() {
		
		System.out.println("La alarma se ha enviado desde el barco Pesquero.");
		
	}

	
	public void mensajeSocorro(String m) {
		
		alarma();
		System.out.println("#- Mensaje de Socorro -#");
		System.out.println(m);
	}

}
