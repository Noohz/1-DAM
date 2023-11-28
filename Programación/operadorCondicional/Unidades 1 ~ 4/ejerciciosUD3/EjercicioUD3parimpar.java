/*
 * Realiza un programa que me indique si un número es par o impar. Para ello pide al usuario un número entero
 * y muestra un mensaje indicando si es par o impar.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class EjercicioUD3parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		
		System.out.println("Introduce un número entero: ");
		num1 = teclado.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("Es par.");
		}
		else {
			System.out.println("Es impar.");
		}
		teclado.close();
		
	}

}
