/*
 * Programa que pida números al usuario hasta introducir un 0, para cada número indicar si es par o impar.
 */

package aUD3;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num;
		
		do {
			
			System.out.println("Introduce un número, el número 0 terminará el bucle. ");
			System.out.print("Numero: ");
			num = teclado.nextInt();
			teclado.nextLine();
			
			if (num %2 == 0) {
				System.out.println("El número introducido es PAR.");
			} else if (num %2 != 0) {
				System.out.println("El número introducido es IMPAR");
			}
			
		} while (num != 0);
		teclado.close();
	}

}
