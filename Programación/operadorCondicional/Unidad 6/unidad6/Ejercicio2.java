/*
 * Programa que crea un array de 20 elementos llamado Pares y guarde los 20primeros números pares. Mostrar por pantalla el contenido del array creado.
 */

package unidad6;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Array declarado
		int [] Pares = new int [20];
		
		// Bucle para asignar los 20 número pares
		for (int i = 0; i < Pares.length; i++) {
			Pares [i] = 2 * i;
		}
		
		// Bucle para mostrar los números
		for (int i = 0; i < Pares.length; i++) {
			System.out.println("Los número pares son: " +Pares [i]);
		}
	}

}
