/*
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */
package tareasUD2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Introduce el primer número entero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número entero: ");
		num2 = teclado.nextInt();
		
		System.out.println("El primer número introducido es: " +num1+ " y el segundo es: " +num2);
		
		teclado.close();
	}

}
