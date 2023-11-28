/*
 * Realizar un programa que pida al usuario un número e indicar si es positivo o negativo. 
 * El proceso se repetirá hasta que se introduzca un 0.
 */

package ejerciciosUD3;

import java.util.*;
public class Ejercicio2pag15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		while (num1!=0) {
			if (num1>0) {
				System.out.println("El número es positivo.");
				System.out.println("Introduce otro número: ");
				num1 = teclado.nextInt();
			}
			else if (num1<0) {
				System.out.println("El número es negativo.");
				System.out.println("Introduce otro número: ");
				num1 = teclado.nextInt();
			}
		}
		System.out.println("Fin del bucle.");
		
		teclado.close();
	}

}
