/*
 * Realizar un juego para adivinar un número. Para ello pedir un número N,
 * Luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
 * El proceso termina cuando el usuario acierta.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		int N = (int)(Math.random()*11);
		
		//Esto sería solo indicativo para saber que funciona.
		System.out.println("El número escogido aleatoriamentes es: " +N);

		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		while (num1!=N) {
			if (num1>N) {
				System.out.println("El número introducido es mayor con respecto a N..");
				System.out.println("Introduce otro número: ");
				num1 = teclado.nextInt();
			}
			else if (num1<N) {
				System.out.println("El número introducido es menor con respecto a N..");
				System.out.println("Introduce otro número: ");
				num1 = teclado.nextInt();
			}
		}
		
		System.out.println("¡Has acertado el número!");
		
		teclado.close();
	}

}
