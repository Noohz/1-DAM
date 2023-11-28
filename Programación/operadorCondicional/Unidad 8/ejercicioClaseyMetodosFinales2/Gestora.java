package ejercicioClaseyMetodosFinales2;

import java.util.*;

public class Gestora {

	public static void main(String[] args) {
		
		int menu;
		
		Scanner sc = new Scanner (System.in);

		Empleado [] empleados;
		
		do {
			
			System.out.println("# - MENÚ - #");
			System.out.println("1.- Mostrar empleado con el menor sueldo.");
			System.out.println("2.- Mostrar los datos de todos los empleados.");
			System.out.println("3.- Buscar un empleado.");
			System.out.println("4.- Mostrar el empleado con el mayor año de experiencia.");
			System.out.println("5.- Salir");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1:
					//sueldoMenor();
					break;
				case 2:
					//mostrarTodos();
					break;
				case 3:
					//buscarEmpleado();
					break;
				case 4:
					//mostrarEmpleadoMayorExperiencia();
					break;
				case 5:
					break;
			}
			
			
		} while (menu != 5); 
		
			System.err.println("Has salido del menú...");
	}

}
