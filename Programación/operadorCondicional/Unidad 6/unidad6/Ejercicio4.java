/*
 * Programa Java que obtenga 10 números aleatorios entre 1 y 50 y los guarde en un array para ello hacer un método de inicializar.
 * Hacer otro método que calcule y muestre la media de los números que estén en las posiciones pares del array.
 * Considera la primera posición del array (posición 0) como par. Llamar a este método en el principal.
 * Hay que estructurar el programa en funciones o métodos.
 */

package unidad6;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Array declarado
		int [] Array_Ejer4 = new int [10]; 
		
		inicializar(Array_Ejer4);
		calcularPares(Array_Ejer4);		
	}
	
	public static void inicializar (int Array_Ejer4 []) {
		for (int i = 0; i < Array_Ejer4.length; i++) {
			int numAleatorio = (int) (Math.random()*50+1);
			Array_Ejer4 [i] = numAleatorio;
			System.out.println(+Array_Ejer4 [i]);
		}
	}
	
	public static void calcularPares (int Array_Ejer4 []) {
		int pares = 0;
		for (int i = 0; i < Array_Ejer4.length; i++) {			
			if (i % 2 == 0) {
				pares = pares + Array_Ejer4 [i];
			}
		}
		System.out.println("La media es: " + pares/(Array_Ejer4.length / 2));		
	}
}

