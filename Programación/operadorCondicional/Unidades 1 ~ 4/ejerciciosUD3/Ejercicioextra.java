/*
 * Escribir un programa que le pida al usuario una frase. 
 * Si esa frase está entre 3 y 6 carácteres la mostramos en mayusculas.
 * Si esta entre 7 y 10 la mostramos en minúscula.
 * Si no devolvemos el tamaño de la cadena por pantalla.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class Ejercicioextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String frase;

				
		System.out.println("Introduce tu frase: ");
		frase = teclado.next();
		int caracter = frase.replace(" ", "").length();
		
		
		if (caracter >=3 && caracter <=6 ) {
			System.out.println(frase.toUpperCase());
		}
		
		else if (caracter >=7 && caracter <=10) {
			System.out.println(frase.toLowerCase());
		}
		else 
			System.out.println(+caracter);
		teclado.close();
	}

}
