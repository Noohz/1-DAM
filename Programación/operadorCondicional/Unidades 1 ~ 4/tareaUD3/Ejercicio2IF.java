/*
 * Realiza un programa que pida el día, mes y año de una fecha e indica si la fecha es correcta. 
 * Suponiendo todos los meses son de 30 días.
 */
package tareaUD3;

//Aitor Ramos Sánchez
import java.util.*;
public class Ejercicio2IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int dia,mes,año;
		
		System.out.println("Introduce el día: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el mes: ");
		mes = teclado.nextInt();
		System.out.println("Introduce el año: ");
		año = teclado.nextInt();
		
		if (dia >=0 && dia <=30) {
			if (mes >=0 && mes <=12) {
				if (año >0) {
					System.out.println("La fecha: " +dia+"/"+mes+"/"+año+ " es correcta.");
				}
			}
			
		}else
			System.out.println("Error..");
		
		teclado.close();
	}

}
