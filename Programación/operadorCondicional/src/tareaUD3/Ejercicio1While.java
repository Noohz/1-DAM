/*
 * Realiza un programa que pida números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		while (num1>=0) {
			System.out.println("El número introducido " +num1+ " es positivo..");
			System.out.println("Introduce otro número, si es negativo terminará el bucle..");
			num1 = teclado.nextInt();
			
		}
		System.out.println("Bucle finalizado..");
		//Aitor Ramos Sánchez
		teclado.close();
	}

}
