package unidad5;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class ObtenerDNI {
	
	// Cadena con las letras posibles del DNI ordenados para el cálculo de DNI.
	static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	// Atributos.
	private int numDNI;
	
	
	/**
	 * Método utilizado para obtener el NIF.
	 * @return cadenaNIF -> Devuelve el valor de los números del NIF concatenando la letra.
	 */
	public String obtenerNIF () {
		
		// NIF con letra para devolver.
		String cadenaNIF;
		
		// Letra del número NIF calculado.
		char letraNIF;
		
		// Cálculo de la letra del NIF.
		letraNIF = calcularLetraNIF (numDNI);
		
		// Concatenar la letra con el DNI.
		cadenaNIF = Integer.toString(numDNI) + String.valueOf(letraNIF);
		
		return cadenaNIF;
	}
	
	/**
	 * Método utilizado para obtener el DNI
	 * @return numDNI -> Devuelve el valor del DNI.
	 */
	public int obtenerDNI () {
		
		
		return numDNI;
	}
	
	/**
	 * Método sobrecargado que establece si el NIF es válido o no.
	 * @param nif -> Almacena en forma de String el valor del NIF.
	 * @throws Exception -> Muestra una excepción si el NIF no cumple con los requisitos.
	 */
	public void establecer (String nif) throws Exception {
		
		// Si es válido se almacena.
		if (ObtenerDNI.validarNIF (nif)) {
			this.numDNI = ObtenerDNI.extraerNumeroNIF(nif);
		}
		
		// Si no es válido saltará la excepción.
		else {
			throw new Exception ("NIF inválido: " +nif);
		}
	}
	
	/**
	 * Método sobrecargado que establece si el DNI es válido o no.
	 * @param dni -> Almacena el valor del DNI para comprobar si está entre los parámetros correctos.
	 * @throws Exception -> Lanzará una excepción si la composición del DNI no es válida.
	 */
	public void establecer (int dni) throws Exception {
		
		// Comprobar que el DNI está entre los parámetros necesarios.
		if (dni >999999 && dni <99999999) {
			
			// Si es válido se almacena.
			this.numDNI = dni;	
		}
		
		// Si no es válido saltará la excepción.
		else {
			throw new Exception ("DNI inválido " + String.valueOf(dni));
		}
	}
	
	/**
	 * Método utilizado para calcular la letra del NIF.
	 * @param dni -> Almacena el valor del DNI que se utilizará para calcular la letra correcta.
	 * @return letra -> Devuelve el valor correspondiente del DNI introducido.
	 */
	private static char calcularLetraNIF (int dni) {
		
		char letra;
		
		// Calcular letra del NIF.
		letra = LETRAS_DNI.charAt (dni % 23);
		
		return letra;
	}
	
	/**
	 * Método utilizado para extraer la letra del NIF.
	 * @param nif -> Almacena el valor String del NIF sin contar la letra.
	 * @return letra -> Devuelve el valor de la letra del NIF correspondiente.
	 */
	private static char extraerLetraNIF (String nif) {
		
		char letra = nif.charAt(nif.length()-1);
		return letra;
	}
	
	/**
	 * Método utilizado para extraer el número del NIF.
	 * @param nif -> Almacena el valor String del nif convertido a Int sin contar la letra.
	 * @return numero -> Devuelve el valor del NIF sin la letra.
	 */
	private static int extraerNumeroNIF (String nif) {
		
		int numero = Integer.parseInt(nif.substring (0, nif.length()-1));
		return numero;
	}
	
	/**
	 * Método utilizado para validar el NIF.
	 * @param nif -> Almacena el valor String del NIF.
	 * @return valido -> Devuelve true o false si pasa las comprobaciones o no.
	 */
	private static boolean validarNIF (String nif) {
		
		// NIF válido si no se encuentra ningún fallo.
		boolean valido = true;
		
		char letra_calculada;
		char letra_leida;
		int dni_leido;
		
		// El parámetro debe ser un objeto no vacío.
		if (nif == null) {
			valido = false;
			
		} else if (nif.length() <8 || nif.length() >9) {
			// La cadena debe estar entre 8 y 9 carácteres.
			valido = false;
			
		} else {
			// Extraemos la letra del NIF.
			letra_leida = ObtenerDNI.extraerLetraNIF (nif);
			dni_leido = ObtenerDNI.extraerNumeroNIF (nif);
			letra_calculada = ObtenerDNI.calcularLetraNIF (dni_leido);
			
				if (letra_leida == letra_calculada) {
					// El NIF es válido si pasa todas las comprobaciones.
					valido = true;
					
				} else {
					valido = false;
				}
		}
		
		return valido;
	}
}
