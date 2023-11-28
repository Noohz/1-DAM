package ExamenT3;

import java.util.*;

/**
 * 
 * @author Raúl Blázquez Ibáñez
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int n, num = 0, acum1 = 0, acum2 = 0;
		String cadena;
		double decimal, dec1, dec2, dec3, dec4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Se mostrará un menú para elegir");
		System.out.println("1- Cadenas");
		System.out.println("2- Operaciones");
		System.out.println("3- Par/Impar");
		System.out.println("4- Números");
		System.out.println("Por favor introduzca un número del 1 al 4 para elegir opción: ");
		n = sc.nextInt();
		while (n > 0) {
			switch (n) {
			case 1:
				System.out.println("Introduce una cadena: ");
				cadena = sc.nextLine();
				if (cadena.length() > 4) {
					System.out.println(cadena + " Raúl Blázquez Ibáñez");
				}
				break;
			case 2:
				System.out.println("Introduce un número decimal: ");
				decimal = sc.nextDouble();
				System.out.println("El número redondeado es: " + Math.round(decimal));
				System.out.println("La raíz cuadrada es: " + Math.sqrt(decimal));
				break;
			case 3:
				while (num != 0) {
					System.out.println("Introduce un número: ");
					num = sc.nextInt();
					if (num % 2 != 0) {
						System.out.println("Es impar");
						acum1++;
					} else {
						System.out.println("Es par");
						acum2++;
					}
					System.out
							.println("Se han introducido " + acum1 + " números impares y " + acum2 + " números pares");
				}
				break;
			case 4:
				System.out.println("Introduce cuatro números decimales: ");
				dec1 = sc.nextDouble();
				dec2 = sc.nextDouble();
				dec3 = sc.nextDouble();
				dec4 = sc.nextDouble();
				if (dec1 > 0) {

				}
				break;
			}
		}

	}

}
