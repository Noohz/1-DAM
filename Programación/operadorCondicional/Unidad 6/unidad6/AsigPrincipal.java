package unidad6;

import java.util.Scanner;

public class AsigPrincipal {
	
	// Contador que almacena el número de asignaturas de forma global.
	public static int contAsig = 0;
	
	public static void main(String[] args) {
		
		Asignatura [] ArrayAsig = new Asignatura [10];
		Scanner principal = new Scanner (System.in);
		int menu;
		
		do {
			System.out.println("Selecciona la opción deseada.");
			System.out.println("1.- Introducir asignatura.");
			System.out.println("2.- Mostrar asignatura.");
			System.out.println("3.- Buscar asignatura.");
			System.out.println("4.- Salir.");
			menu = principal.nextInt();
			principal.nextLine();
			
			switch (menu) {
				case 1:
					introducirAsignatura(ArrayAsig);
					break;
				case 2:
					mostrarAsignatura(ArrayAsig);
					break;
				case 3:
					buscarAsignatura(ArrayAsig);
					break;
				case 4:
					break;
				default:
					System.out.println("Has introducido una opción no valida.");
			}
			
		} while (menu != 4);
		principal.close();
	}
	
	public static void introducirAsignatura (Asignatura [] ArrayAsig) {
					
			Scanner teclado = new Scanner (System.in);
			
			if (contAsig < ArrayAsig.length) {
				System.out.println("Introduce el nombre de la asignatura: ");
				String nombre = teclado.nextLine();
				
				System.out.println("Introduce el número de alumnos: ");
				int alumnos = teclado.nextInt();
				teclado.nextLine();
				
				System.out.println("Introduce el aula: ");
				String aula = teclado.nextLine();
				
				ArrayAsig [contAsig] = new Asignatura (nombre, alumnos, aula);
				contAsig++;
				
			} else {
				System.out.println("No es posible almacenar más asignaturas..");
			}
			
	}
	
	public static void mostrarAsignatura (Asignatura [] ArrayAsig) {
		
		for (int i = 0; i < ArrayAsig.length; i++) {
			if (ArrayAsig [i] != null) {
				ArrayAsig[i].Mostrar();
				System.out.println();

			}
		}
	}
	
	public static void buscarAsignatura (Asignatura ArrayAsig []) {
		
		Scanner mAsignatura = new Scanner (System.in);
		String bAsignatura;
		boolean dur = false;
		int i = 0;
		
		System.out.println("Introduce el nombre de la asignatura que quieras buscar: ");
		bAsignatura = mAsignatura.nextLine();
		
		while (i < contAsig && dur == false) {
			if (ArrayAsig [i].getNombre().equalsIgnoreCase(bAsignatura)) {
				ArrayAsig [i].Mostrar();
				dur = true;
			}
			i++;
		}
		if (dur == false) {
			System.out.println("Asignatura no encontrada..");
		}
	}
	
}
