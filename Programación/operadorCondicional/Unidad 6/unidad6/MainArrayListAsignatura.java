/*
 * Cree otra clase que contenga el main donde se almacenarán en una estructura ArrayList elementos de tipo Asignatura y tenga un menú 
 * que permita al usuario Introducir Asignatura, Mostrar todas las asignaturas o Buscar Asignatura.
 */

package unidad6;

import java.util.*;

public class MainArrayListAsignatura {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner mainDoWhile = new Scanner (System.in);
		
		ArrayList<AsignaturaArrayList> asignatura = new ArrayList<>();

		int menu;
		
		do {
			
			System.out.println("# ** Menú ** #");
			System.out.println("1.- Introducir asignatura.");
			System.out.println("2.- Mostrar todas las asignaturas.");
			System.out.println("3.- Buscar asignaturas.");
			System.out.println("4.- Salir.");
			System.out.print("Opción: ");
			menu = mainDoWhile.nextInt();
			mainDoWhile.nextLine();
			
				switch (menu) {
				
					case 1:
						introducirAsignatura(asignatura);
						break;
					case 2:
						mostrarAsignaturas(asignatura);
						break;
					case 3:
						buscarAsignaturas(asignatura);
						break;
					case 4:
						break;
					default:
						System.err.println("Opción invalida... \n");
						Thread.sleep(500);
				}
			
		} while (menu != 4); 
		mainDoWhile.close();
	}

	public static void introducirAsignatura (ArrayList<AsignaturaArrayList> asignatura) {
		
		String nombre;
		int numAlumnos;
		String aula;
		
		
	}
	
	public static void mostrarAsignaturas (ArrayList<AsignaturaArrayList> asignatura) {
		
	}

	public static void buscarAsignaturas (ArrayList<AsignaturaArrayList> asignatura) {
		
	}
	
}
