package unidad3;

import java.util.Scanner;
public class Programahora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int hora;
		
		System.out.println("Introduce la hora (En valor entero)");
		hora = teclado.nextInt();
		
		if (hora >= 0 && hora < 12) {
			System.out.println("Buenos Días.");
		}
		else if (hora >=12 && hora < 21) {
			System.out.println("Buenas Tardes.");
		}
		else if (hora >=21 && hora <24) {
			System.out.println("Buenas Noches.");
		}
		else 
			System.out.println("Hora no válida.");
		
		teclado.close();
	}

}
