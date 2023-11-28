/*
 * Realiza un programa que pida por teclado el nombre del usuario y si es igual a "admin",
 * mostrará un mensaje indicando que es el administrador del programa.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class Ejercicio2UD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String usr;
		
		System.out.println("Introduce tu nombre de usuario: ");
		usr = teclado.nextLine();
		
		if (usr.equalsIgnoreCase("admin")) {
			System.out.println("Eres el administrador del programa.");
		}
		else {
			System.out.println("No eres el administrador del programa.");
		}
		teclado.close();
	}

}
