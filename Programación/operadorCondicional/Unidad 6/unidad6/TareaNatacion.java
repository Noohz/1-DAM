package unidad6;

import java.util.*;

public class TareaNatacion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		// Vector que almacena los días de la semana.
		String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		
		// Vector que almacena las horas de clase.
		String [] horas = {"1ª", "2ª", "3ª", "4ª"};
		
		int[][] alumnosPorDiaYhora = {{15, 19, 20, 12}, {16, 14, 12, 11},{17, 20, 11, 10}, {11, 12, 13, 18}, {18, 19, 20, 19}};
		
		int menu;
		
		do {
			System.out.println("# -- Menú -- #");
			System.out.println("1.- Mostrar los valores almacenados.");
			System.out.println("2.- Mostrar el total de alumnos por día.");
			System.out.println("3.- Mostrar el total de alumnos por hora.");
			System.out.println("4.- Mostrar la media de alumnos de cada día");
			System.out.println("5.- Mostrar día/s y hora/s con un número determinado de alumnos");
			System.out.println("6.- Salir");
			
			menu = teclado.nextInt();
			teclado.nextLine();
			
			switch (menu) {
				case 1:
					mostrarValoresAlmacenados(dias, alumnosPorDiaYhora, horas);
					break;
				case 2:
					//mostrarAlumnosPorDia();
					break;
				case 3:
					//mostrarAlumnosPorHora();
					break;
				case 4:
					//mostrarMediaPorDia();
					break;
				case 5:
					//mostrarDiaHoraAlumnoEspecifico();
					break;
				case 6:
					break;
				default:
					System.out.println("La opción introducida no está entre las opciones solicitadas..");
			}
			
		} while (menu != 0);
				
	}

	public static void mostrarValoresAlmacenados (String [] dias, int [][] alumnosPorDiaYhora, String [] horas) {
		for (int i = 0; i < 5; i++) {
		      System.out.print(dias [i] + ": ");
		      for (int h = 0; h < 5; h++) {
		    	  System.out.println(horas [i] + " ");
		      }
		     	for (int j = 0; j < 4; j++) {
		     		System.out.print(alumnosPorDiaYhora[i][j] + " ");
		      }
		      System.out.println("\n");
		    }
	}
	
}
