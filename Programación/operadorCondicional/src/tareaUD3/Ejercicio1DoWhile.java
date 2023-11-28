/*
 * Realizar un programa que solicite la carga de un número entre 0 y 99, y nos muestre un mensaje de cuantos dígitos tiene el mismo.
 * Finalizar el programa cuando se cargue el valor 0.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num;
		

		do {
			System.out.println("Introduce un número entre 0 y 99: ");
			num = teclado.nextInt();
				if (num>0 & num<99) {
					int digitos = String.valueOf(num).length();
					System.out.println("El número introducido es: " +num+ " y los dígitos son: " +digitos);
				}
		}while (num!=0);
			
		// Aitor Ramos Sánchez
		teclado.close();
	}

}
