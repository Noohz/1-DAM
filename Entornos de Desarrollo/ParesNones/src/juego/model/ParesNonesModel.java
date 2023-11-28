package juego.model;

public class ParesNonesModel {
	public static int obtenerNumAleatorio () {
		return (int) (Math.random() * 100) + 1;
		
	}
	
	/**
	 * Método para comprobar si el número es PAR o IMPAR.
	 * @param num -> Identificador que dirá si el número es PAR o IMPAR.
	 * @return valorRetorno -> Devuelve 
	 */
	public static boolean comprobarParImpar (int num) {
		boolean valorRetorno = false;
		
		if ((num % 2) == 0){
			valorRetorno = true;
		}
		
		return valorRetorno;
		
	}
}
