/*
 * Realizar un programa que pida al usuario una cadena y muestre el número de vocales que tiene.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String cadena;
		int vocales = 0;
		
		do {
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
			
			for (int c=0; c<cadena.length(); c++) { 
				char vocal = cadena.toLowerCase().charAt(c);
					if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
						vocales++;
					}
			}
			
		}while(vocales == 0);
		
		System.out.println("La cadena introducida tiene: " +vocales+ " vocales");
		
		teclado.close();
	}

}
