/*
 * Diseña un programa Java que calcule la suma, resta, multiplicación y división 
 * de dos números introducidos por teclado.
 */

package tareasUD2;

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		float x,y;
		
		System.out.println("Introduce el primer número: ");
		x = teclado.nextFloat();
		
		System.out.println("Introduce el segundo número: ");
		y = teclado.nextFloat();
		
		System.out.println("El primer número introducido es: " +x);
		System.out.println("El segundo número introducido es: " +y);
		System.out.println("La suma de x + y es: " +(x+y));
		System.out.println("La resta de x - y es: " +(x-y));
		System.out.println("La multiplicación de x * y es: " +(x*y));
		System.out.println("La división de x / y es: " +(x/y));

		teclado.close();
	}

}
