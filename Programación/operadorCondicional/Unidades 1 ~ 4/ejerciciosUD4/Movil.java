package ejerciciosUD4;

/**
 * 
 * @author Aitor Ramos Sánchez.
 *
 */
public class Movil {

	String marca;
	int modelo;
	
	// Metodos.

	/**
	 * Constructor por defecto
	 */
	public Movil () {
		
	}
	
	/**
	 * Constructor parametrizado
	 * @param marca -> Muestra la marca del movil.
	 * @param modelo -> Muestra el modelo del movil.
	 */
	public Movil (String marca, int modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/**
	 * Realiza la llamada.
	 */
	public void Llamar () {
		System.out.println("La llamada está en proceso.");
	}
	
	/**
	 * Finaliza la llamada.
	 */
	public void Colgar () {
		System.out.println("La llamada ha finalizado.");
	}
}
