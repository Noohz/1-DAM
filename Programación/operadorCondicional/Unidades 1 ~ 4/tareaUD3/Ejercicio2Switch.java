/*
 * Realiza un programa que pida un número entero al usuario y otro número entre el 1 y el 4.
 * Si es 1 se realizará la raíz cuadrada del número
 * Si es 2 la potencia
 * Si es 3 el coseno
 * Si es 4 el valor absoluto del número. 
 * Además, añadir otras dos opciones donde utilices la función ceil y round.
 */
package tareaUD3;

import java.util.*;
public class Ejercicio2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1;
		int num2 = (int)(Math.random()*7+1);
		
		System.out.println("Introduce un número entero: ");
		num1 = teclado.nextInt();
		
		System.out.println("El número escogido aleatoriamente es: " +num2);
		
		switch (num2) {
		case 1:
			System.out.println(Math.sqrt(num1)); // Raiz Cuadrada
			break;
		case 2:
			System.out.println(Math.pow(num1, num2)); // Potencia
			break;
		case 3:
			System.out.println(Math.cos(num1)); // Coseno
			break;
		case 4:
			System.out.println(Math.abs(num1)); // Valor Absoluto
			break;
		case 5:
			System.out.println(Math.ceil(num1)); // Ceil
			break;
		case 6:
			System.out.println(Math.round(num1)); // Round
			break;
		default: System.out.println("Expresión incorrecta.."); 
		}
		//Aitor Ramos Sánchez
		teclado.close();
	}

}
