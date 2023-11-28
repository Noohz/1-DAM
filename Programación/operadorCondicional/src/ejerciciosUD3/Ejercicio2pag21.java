/*
 * Realiza un programa que pida un número y calcule su factorial.
 */

package ejerciciosUD3;

import java.util.*;
public class Ejercicio2pag21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num, factorial;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		for (factorial=1; num>0; num--) {
			factorial *= num;
		}
		System.out.println("El factorial del número introducido es: " +factorial);
	}

}
