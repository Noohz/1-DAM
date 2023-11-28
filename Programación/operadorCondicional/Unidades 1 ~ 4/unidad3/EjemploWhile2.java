/*
 * Programa que lee un número entero N y muestra N asteriscos.
 */

package unidad3;

import java.util.*;
public class EjemploWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int n, contador = 0;
		
		System.out.println("Introduce un número: ");
		n = teclado.nextInt();
		
		while (contador < n) {
			System.out.print("*");
			contador++;
		}
		
		teclado.close();
	}

}
