/*
 * Programa Java que lea por teclado 10 números enteros y los guarde en un array.
 * A continuación calcula y muestra por separado la media de los valores positivos y la de los valores negativos.
 */

package unidad6;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		// Array declarado
		int [] Array_Ejer3 = new int [10];
		
		// Atributos
		int positivos = 0, negativos = 0;
		
		// Bucle for para añadir los números enteros.
		for (int i = 0; i < Array_Ejer3.length; i++) {
			System.out.println("Introduce un entero para la posición: " +i);
			Array_Ejer3 [i] = teclado.nextInt();
		}
		
		// Bucle para comprobar si es positivo o negativo.
		for (int i = 0; i < Array_Ejer3.length; i++) {
			if (Array_Ejer3 [i] < 0) {
				negativos++;
			} else if (Array_Ejer3 [i] > 0) {
				positivos++;
			}
		}
		
		System.out.println("La media de los positivos son: " +positivos+ " y la media de los negativos son: " +negativos);
		
		teclado.close();
	}

}
