/*
 * Realiza un programa que muestre las tablas de multiplicar del 1 al 10.
 */

package ejerciciosUD3;

public class Ejercicio1pag22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Tablas de multiplicar del 1 al 10.\n");
		
		
		for (int t=1; t<=10; t++) {
			for (int m=1; m<=10; m++) {
				System.out.printf("%d x %d = %d \n", t,m,t*m);
			}
			System.out.println();
		}
			
	}

}
