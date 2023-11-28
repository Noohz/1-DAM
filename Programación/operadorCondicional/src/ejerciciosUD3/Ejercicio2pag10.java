/*
 * Realiza un programa que pida 2 números al usuario y me indique si son iguales o no.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class Ejercicio2pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los números son iguales.");
		}
		
		else
			System.out.println("Los número no son iguales.");
		
		teclado.close();
	}

}
