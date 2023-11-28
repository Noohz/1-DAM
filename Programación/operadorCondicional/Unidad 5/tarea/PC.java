package tarea;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class PC {

	// Atributos
	private String identificador;
	private static final int num_max = 15;
	private static int num_actual = 0;
	
	// Métodos
	
	/**
	 * Constructor sin parámetros.
	 */
	public PC () {
		num_actual++;
	}
	
	/**
	 * Constructor parametrizado solo usando el String "IDENTIFICADOR" ya que el resto no hace falta información.
	 * @param IDENTIFICADOR -> Parámetro que contiene el identificador el equipo.
	 */
	public PC (String identificador) {
		this.identificador = identificador;
		num_actual++;
	}

	/**
	 * Método GET
	 * @return identificador -> Devuelve un *String* con el valor de identificador.
	 */
	public String getIdentificador() {
		return this.identificador;
	}

	/**
	 * Método SET
	 * @param identificador identificador -> Define el valor *String* que tendrá identificador.
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * Método GET
	 * @return num_actual -> Devuelve un *INT* con el valor de num_actual.
	 */
	public static int getNum_actual() {
		return num_actual;
	}
	
	public void Mostrar () {
		System.out.println("**DATOS DEL EQUIPO** \nIdentificador del equipo: " +this.getIdentificador()+ "\nNúmero máximo: " +this.num_max+ "\nNúmero actual: " +this.num_actual+ "\n");
	}
	
	public static void main(String[] args) {

		PC pc1 = new PC ();
		pc1.Mostrar();
		PC pc2 = new PC ("1930242HF");
		pc2.Mostrar();
		PC pc3 = new PC ("1042041KL");
		pc3.Mostrar();
	}

}

