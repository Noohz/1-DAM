/*
 * Escribe un programa Java que lee un número entero por teclado y obtiene y muestr
 * por pantalla el doble y el triple de ese número.
 */

package tareasUD2;

import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		
		System.out.println("Introduce el número entero: ");
		num1 = teclado.nextInt();
		
		System.out.println("El doble de: " + num1 + " es: " +2*num1);
		System.out.println("El triple de: " + num1 + " es: " + 3*num1);
		
		teclado.close();
	}

}
