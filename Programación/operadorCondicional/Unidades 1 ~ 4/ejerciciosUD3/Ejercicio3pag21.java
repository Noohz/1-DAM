/*
 * Realizar un programa que pida un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
 */

package ejerciciosUD3;

import java.util.*;
public class Ejercicio3pag21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num;
		
		do {
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
		}while (num <0 || num>10);
		for (int i=0; i<=10; i++) {
			System.out.printf("%d x %d = %d, ", num,i,num*i);
		}
		teclado.close();
	}

}
