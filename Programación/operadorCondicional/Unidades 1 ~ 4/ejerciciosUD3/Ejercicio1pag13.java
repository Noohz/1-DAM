/*
 * Realizar el programa de indicar la nota con su correspondiente texto 
 * (sobresaliente,notable...) con la estructura switch.
 */

package ejerciciosUD3;

import java.util.Scanner;
public class Ejercicio1pag13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num = (int)(Math.random()*10+1);
		
		System.out.println("El número escogido aleatoriamente es: " +num);
		
		/*switch (num) {
		case 0:
			System.out.println("Tienes un insuficiente.");
			break;
		case 1:
			System.out.println("Tienes un insuficiente.");
			break;
		case 2: 
			System.out.println("Tienes un insuficiente.");
			break;
		case 3:
			System.out.println("Tienes un insuficiente.");
			break;
		case 4:
			System.out.println("Tienes un insuficiente.");
			break;
		case 5:
			System.out.println("Tienes un suficiente.");
			break;
		case 6:
			System.out.println("Tienes un suficiente.");
			break;
		case 7:
			System.out.println("Tienes un bien.");
			break;
		case 8:
			System.out.println("Tienes un notable.");
			break;
		case 9:
			System.out.println("Tienes un notable.");
			break;
		case 10:
			System.out.println("Tienes un sobresaliente.");
		}*/
		
		switch (num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Tienes un insuficiente.");
			break;
		case 5:
		case 6:
			System.out.println("Tienes un suficiente.");
			break;
		case 7:
			System.out.println("Tienes un bien.");
			break;
		case 8:
		case 9:
			System.out.println("Tienes un notable.");
			break;
		case 10:
			System.out.println("Tienes un sobresaliente.");
		}
		teclado.close();
	}
}
