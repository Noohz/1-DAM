package Usuario;

import java.util.Scanner;

/**
 * 
 * @author MOuhcine EL Qaddoury
 *
 */
public class Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("ELige una opción: \n" + "1-Contar Vocales\n" + "2-Comprobar contraseñia\n"
					+ "3-Medias pares/impares\n" + "4-Números");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Introduce una cadena: ");
				String cadena = sc.nextLine();
				int pos = 0, cont = 0;
				cadena.toLowerCase();
				while (pos < cadena.length()) {
					if (cadena.charAt(pos) == 'a' || cadena.charAt(pos) == 'e' || cadena.charAt(pos) == 'i'
							|| cadena.charAt(pos) == 'o' || cadena.charAt(pos) == 'u') {

						cont++;
					}
					pos++;
				}
				System.out.println("Hay " + cont + " vocales\n");
				break;
			case 2:
				System.out.print("Introduce una contraseña:");
				String contrasenia = sc.nextLine();
				if (contrasenia.length() > 6) {
					if (contrasenia.equals("adminprogramacion")) {
						System.out.println("La contrseña es valida\n");
					} else {
						System.out.println("La contraseña no es valida\n");
					}
				} else {
					System.out.println("La contraseña no es correcta\n");
				}
				break;
			case 3:
				int num, contPar = 0, contImpar = 0, sumaPar = 0, sumaImpar = 0;

				do {
					System.out.println("Introduce un numero >0: ");
					num = sc.nextInt();
					if (num % 2 == 0) {
						sumaPar += num;
						contPar++;
						System.out.println("EL numero " + num + " es par");
					} else if (num % 2 != 0 && num >= 0) {
						sumaImpar += num;
						contImpar++;
						System.out.println("EL numero " + num + " es impar");
					}

				} while (num != -1);
				if (contPar == 0) {
					System.out.println("No hay numeros pares para hacer la media");
				} else {
					System.out.println("La media de los pares es: " + sumaPar / contPar);
				}
				if (contImpar == 0) {
					System.out.println("No hay numeros pares para hacer la media");
				} else {
					System.out.println("La media de los impares es: " + sumaImpar / contImpar);
				}
				break;
			case 4:
				int contCeros = 0;
				double numDecimal, multiplicaion = 1;
				for (int i = 0; i < 5; i++) {
					System.out.println("INtroduce un numero: ");
					numDecimal = sc.nextDouble();
					if (numDecimal < 0) {
						multiplicaion *= numDecimal;
					} else if (numDecimal == 0) {
						contCeros++;
					}

				}
				System.out.println("La multiplicacion de los negativos es " + multiplicaion);
				System.out.println("Hay " + contCeros + " ceros introducidos");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 0);
		System.out.println("Adios");
	}

}
