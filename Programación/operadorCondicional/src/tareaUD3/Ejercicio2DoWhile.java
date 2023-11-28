/*
 * Realizar un programa que solicite ingresar N notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 8 y cuántos menores.
 * El programa termina cuando se ingrese un valor de 0.
 */

package tareaUD3;

import java.util.*;
public class Ejercicio2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int nota=0, almayor8=0, almenor8=0;
		
		do {
			System.out.println("Introduce tu nota (El proceso finalizará con un 0): ");
			nota = teclado.nextInt();
			
			if(nota>=8) {
				almayor8+=1;				
			}
			else if (nota<8){
				almenor8+=1;
			}
		}while (nota!=0);
		
		System.out.println("Notas mayores o iguales a 8: " +almayor8);
		System.out.println("Notas menores de 8: " +almenor8);
		
		teclado.close();
	}

}
