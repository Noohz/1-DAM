/*
 * Realiza un programa que pida una cadena al usuario y un número entero entre 1 y 3.
 * Si el número es 1 mostrará un mensaje con la longitud de la cadena
 * Si el número es el 2 mostrará la cadena en mayúsculas
 * Si el número es 3 en minúsculas. En los demás casos se mostrará un mensaje de error.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String cadena;
		int num1;

		System.out.println("Introduce una cadena..");
		cadena = teclado.nextLine();
		int caracter = cadena.replace(" ", "").length();
		System.out.println("Introduce un número comprendido entre 1 y 3..");
		num1 = teclado.nextInt();
		
		switch (num1) {
		case 1:
			System.out.println("La longitud de la cadena es: " +caracter);
			break;
		case 2:
			System.out.println(cadena.toUpperCase());
			break;
		case 3:
			System.out.println(cadena.toLowerCase());
			break;
		default: System.out.println("Número incorrecto..");
		}
		
		teclado.close();
	}

}
