/*
 * Realiza un programa que pida al usuario un número entre el 0 y el 10 y 
 * muestre la calificación en formato texto
 */

package ejerciciosUD3;


import java.util.Scanner;
public class Ejercicio1pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num = (int)(Math.random()*10);
		
		System.out.println("El número escogido aleatoriamente es: " +num);
		
		//System.out.println("Introduce un número entero: ");
		//num = teclado.nextInt();
		
		if (num >=10) {
			System.out.println("Tienes una matricula de honor.");
		}
		
		else if (num >=9 && num <10) {
			System.out.println("Tienes un sobresaliente.");
		}
		
		else if (num >=7 && num <9) {
			System.out.println("Tienes un notable.");
		}
		
		else if (num >=6 && num <7) {
			System.out.println("Tienes un bien.");
		}
		
		else if (num >=5 && num <6) {
			System.out.println("Tienes un suficiente.");
		}
		
		else if (num <5) {
			System.out.println("Tienes un insuficiente.");
		}
		
		else
			System.out.println("Nota no valida...");
		
		teclado.close();
	}

}
