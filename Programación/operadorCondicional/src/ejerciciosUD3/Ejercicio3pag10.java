/*
 * Realiza un programa que pida un número al usuario y me indique si es positivo o negativo.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class Ejercicio3pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		
		System.out.println("Introduce un número");
		num1 = teclado.nextInt();
		
		if (num1 >=0) {
			System.out.println("Tu número es positivo.");
		}
		else if (num1 <0) {
			System.out.println("Tu número es negativo.");
		}
		
		else 
			System.out.println("El número introducido no es valido.");
		
		teclado.close();
	}

}
