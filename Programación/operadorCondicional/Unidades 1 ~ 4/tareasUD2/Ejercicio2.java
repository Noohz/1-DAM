/*
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos días nombre_introducido”.
 */

package tareasUD2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String saludo;
		
		System.out.println("Introduce tu nombre: ");
		saludo = teclado.next();
		
		System.out.printf("Buenos días %s ", saludo);

		
		teclado.close();

	}

}
