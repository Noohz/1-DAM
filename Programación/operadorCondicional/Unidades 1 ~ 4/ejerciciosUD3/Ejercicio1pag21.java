/*
 * Realizar un programa que muestre el producto de los 10 primeros números impares.
 */

package ejerciciosUD3;

public class Ejercicio1pag21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i=10, producto=1;
		
		for (i=0, num=1; i<10; i++, num+=2) {
			producto *= num;
			if (num %2 !=0) {
				System.out.println("El número impar es: " +num+ " y su producto es: " +producto);
			}
		}
		
	}

}
