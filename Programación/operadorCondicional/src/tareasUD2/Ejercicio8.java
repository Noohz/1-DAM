/*
 * Programa que pida por teclado el nombre y la fecha de nacimiento de una persona
 * (día, mes, año) y lo muestre.
 */

package tareasUD2;

import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String nombre;
		String fecha;
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.next();
		
		System.out.println("Introduce tu fecha de nacimiento DD/MM/YYYY: ");
		fecha = teclado.next();
		
		System.out.println("Tu nombre es: " + nombre + " y tu fecha de nacimiento es: " + fecha);
		
		teclado.close();
	}

}
