/*
 * Lee un número y lo muestra.
 */

package unidad3;

import java.util.*;
public class EjemploMismathException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int n;
		
		do {
			
			try {
				System.out.println("Introduce un número entero mayor que 0: ");
				n = teclado.nextInt();
				System.out.println("Número introducido: " +n);
			} catch (InputMismatchException e) {
				teclado.nextLine();
				n = 0;
				System.out.println("Debe introducir un número entero, error: " +e.toString());
			}
			
		} while (n<=0);
		
		teclado.close();
	}

}
