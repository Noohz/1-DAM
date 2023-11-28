/*
 * Realizar un programa que pida un número al usuario, y ese número indicará las veces que tienes que pedir sueldos al usuario. 
 * Se mostrará el mayor sueldo de todos.
 */
package tareaUD3;

import java.util.*;
public class Ejercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num, sueldos = 0, sueldom = 0;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		for (int i = 0; num != i; i++) {
			System.out.println("Introduce tu sueldo: ");
			sueldos = teclado.nextInt();
				if (sueldos > sueldom ) {
					sueldom = sueldos;
				}

		}
		System.out.println("El sueldo mayor es: " +sueldom);
		// Aitor Ramos Sánchez
		teclado.close();
	}

}
