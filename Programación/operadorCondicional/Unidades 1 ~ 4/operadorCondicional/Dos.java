/* Programa que pida al usuario 2 decimales (float), con el operador "?", comparar si los 2 decimales son iguales.
 * Si son iguales mostrará por pantalla el caracter I y si son distintos D por pantalla.
 */

package operadorCondicional;

import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float d1,d2;
		
		System.out.println("Introduce el primer decimal: ");
		d1 = teclado.nextFloat();
		
		System.out.println("Introduce el segundo decimal: ");
		d2 = teclado.nextFloat();
		
		System.out.println(d1 == d2 ? 'I':'D');
		
		teclado.close();
	}

}
