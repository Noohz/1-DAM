/*
 * Realizar un programa que pida al usuario un número y muestre su cuadrado.
 * Repetir el proceso hasta que se introduzca un número negativo.
 */

package ejerciciosUD3;

import java.util.*;
public class Ejercicio1pag15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1, cuadrado;
		
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		
		while (num1>=0) {
			cuadrado = num1*num1;
			System.out.println("El cuadrado del número introducido es: " +cuadrado);
			System.out.println("Introduce otro número");
			num1 = teclado.nextInt();
		}
		System.out.println("Fin del bucle..");
		
		teclado.close();
	}

}
