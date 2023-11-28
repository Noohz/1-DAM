/*
 * Realizar un programa que pida números hasta que se introduzca uno negativo, y calcular la media.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		float num, numeros=0;
		
		System.out.println("Introduce un número, el bucle finalizará al introducir uno negativo..");
		System.out.println("Introduce un número..");
		num = teclado.nextFloat();
		
		
		while (num >0) {
			numeros+=num;

			System.out.println("Introduce otro número más: ");
			num = teclado.nextFloat();
			
			System.out.println("La medía de los números introducidos es: " +num/numeros);
		}
		
		System.out.println("Has introducido un número negativo, fin del bucle..");
		
		teclado.close();
	}

}
