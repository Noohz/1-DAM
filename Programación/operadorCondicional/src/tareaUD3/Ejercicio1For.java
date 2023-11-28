/*
 * Realizar un programa que pida las edades y alturas de 5 personas, mostrar la edad y la estatura media, la cantidad de personas mayores de 30 años y la 
 * cantidad de personas que miden más de 1.80.
 */

package tareaUD3;

//Aitor Ramos Sánchez
import java.util.*;
public class Ejercicio1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int edad, sumed = 0, mayore = 0;
		float altura, altued=0, mayora = 0;
		
		for (int e=0; e<5; e++) {
			System.out.println("Introduce tu edad: ");
			edad = teclado.nextInt();
			if (edad >=30) {
				mayore++;
			}
			System.out.println("Introduce tu altura: ");
			altura = teclado.nextFloat();
			if (altura >=1.80) {
				mayora++;
			}
			sumed = sumed+edad;
			altued = altued+altura;
		}
		
		System.out.println("Edad media: " +sumed/5+ "\nAltura media: " +altued/5+ ""
				+ "\nCantidad de personas mayores a 30: " +mayore+ "\nCantidad de personas con mayor altura de 1.80: " +mayora);
		
		teclado.close();
	}

}
