/*
 * Realiza en el main las siguientes acciones:
 * Declara y crea un vector de 5 posiciones de caracteres que almacene nombres.
 * Inicialízalo con un bucle for pidiendo al usuario los nombres que se han de almacenar en cada posición del vector.
 * Muestra el resultado de cada posición por pantalla.
 */

package unidad6;

import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Array declarado
		String [] Array_Ejer1 = new String [5];
		Scanner teclado = new Scanner (System.in);
		
		// Bucle for para asignar los valores a cada posición del array.
		for (int i = 0; i < Array_Ejer1.length; i++) {
			System.out.println("Introduce un nombre para la posición " +i+ ":");
			Array_Ejer1 [i] = teclado.nextLine();
		}
		
		// Bucle for para mostrar los nombres elegidos.
		for (int i = 0; i < Array_Ejer1.length; i++) {
			System.out.println("Los nombres elegidos son: " +Array_Ejer1 [i]);
		}
		
		teclado.close();
	}

}
