package repasoUD6;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número de alumnos en clase: ");
		int alumnos = sc.nextInt();
		sc.nextLine();
		
		double [] arrayEjer5 = new double [alumnos];
		
		asignarNotas(arrayEjer5);
		

	}

	public static void asignarNotas (double [] arrayEjer5) {
		Scanner scnotas = new Scanner (System.in);
		
		for (int i = 0; i < arrayEjer5.length; i++ ) {
			System.out.println("Introduce la nota del alumno " +(i + 1) + ":");
			double nota = scnotas.nextDouble();
			
			arrayEjer5[i] += nota;
		}
		
	}
	
	public static void calcularMedia (double [] arrayEjer5) {
		
		double suma = 0;
		
		for (int i = 0; i < arrayEjer5.length; i++) {
			suma += arrayEjer5[i];
		}
	}
}
