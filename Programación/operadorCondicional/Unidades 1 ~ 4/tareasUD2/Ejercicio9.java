/*
 * Diseña un programa Java que pida dos números por teclado, determine si el primero
 * es múltiplo del segundo y muestre el resultado.
 */

package tareasUD2;

import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.println(num1 % num2 == 0 ? "Es multiplo":"No es multiplo");
		
		teclado.close();
	}

}
