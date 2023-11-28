/*
 * Programa que pida una nota por teclado y muestre un mensaje si la nota es mayor o igual que 5.
 */

package unidad3;

import java.util.Scanner;

public class EjemploUD3Suspenso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int nota;
		
		System.out.println("Introduce tu nota: ");
		nota = teclado.nextInt();
		
		if (nota <= 4) {
				System.out.println("Lo siento has suspendido.");
		}
				else {
					System.out.println("Enhorabuena, has aprobado.");
		}
		
		teclado.close();
	}

}
