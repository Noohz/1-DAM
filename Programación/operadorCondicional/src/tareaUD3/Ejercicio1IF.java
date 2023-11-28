/*
 * Realiza un programa que pida 3 números al usuario y los muestre ordenados por pantalla.
 */

package tareaUD3;

//Aitor Ramos Sánchez
import java.util.*;
public class Ejercicio1IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("El orden de mayor a menor sería: " +num1+"/"+num2+"/"+num3);
		} else if (num1 > num3 && num3 > num2) {
			System.out.println("El orden de mayor a menor sería: " +num1+"/"+num3+"/"+num2);			
		} else if (num2 > num1 && num1 > num3) {
			System.out.println("El orden de mayor a menor sería: " +num2+"/"+num1+"/"+num3);
		} else if (num2 > num3 && num3 > num1) {
			System.out.println("El orden de mayor a menor sería: " +num2+"/"+num3+"/"+num1);
		} else if (num3 > num1 && num1 > num2) {
			System.out.println("El orden de mayor a menor sería: " +num3+"/"+num1+"/"+num2);
		} else if (num3 > num2 && num2 > num1) {
			System.out.println("El orden de mayor a menor sería: " +num3+"/"+num3+"/"+num1);
		} else
			System.out.println("Error..");
		
		//Aitor Ramos Sánchez
		teclado.close();
	}

}
