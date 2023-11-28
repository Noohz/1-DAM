/*
 * Realizar un programa que compruebe que el nombre no sea una cadena vacia y que tenga mínimo 6 caracteres (do-while).
 * La contraseña tiene que dar numeros (si introduce carácteres da excepción) mostrar cual es el nombre y la contraseña introducida
 */

package ejerciciosUD3;

import java.util.*;
public class EjercicioExcepciónclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		String nombre;
		int passwd;
		
		do {
			System.out.println("Introduce tu nombre: ");
			nombre = teclado.nextLine();
			
			if (nombre.length() > 0 && nombre.length() <= 6) {
				System.out.println("El nombre es: " +nombre);
			}
			else (nombre.length());
			
		} while (nombre.length() <= 0);
		
		
		teclado.close();
	}

}
