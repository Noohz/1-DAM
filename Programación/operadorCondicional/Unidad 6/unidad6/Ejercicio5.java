package unidad6;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numAlumnos;
		
		System.out.println("Introduce el número de alúmnos que hay en clase: ");
		numAlumnos = teclado.nextInt();
		
		double [] Array_Ejer5 = new double [numAlumnos];
		
		asignarNotas(Array_Ejer5);
		sumarNotas(Array_Ejer5);
		mostrarAlumnos(Array_Ejer5, numAlumnos);
		
	}

	public static void asignarNotas (double [] Array_Ejer5) {
		for (int i = 0; i < Array_Ejer5.length; i++) {
			
			Scanner anotas = new Scanner (System.in);
			double nota;
			
			System.out.println("Introduce la nota del alumno: " +i);
			nota = anotas.nextDouble();
			
			Array_Ejer5 [i] = nota;
			
		}		
	}
	
	public static void sumarNotas (double [] Array_Ejer5) {
		double sNotas = 0;
		
		for (int i = 0; i < Array_Ejer5.length; i++) {
			
			sNotas = sNotas + Array_Ejer5 [i];
			
		}
		System.out.println("La media de las notas introducidas: " +sNotas/(Array_Ejer5.length / 2));
	}
	
	public static void mostrarAlumnos (double [] Array_Ejer5, double sNotas) {
		for (int i = 0; i < Array_Ejer5.length; i++) {
			if (Array_Ejer5 [i] > sNotas ) {
				System.out.println("Alumnos con notas superiores a la media: " +(Array_Ejer5 [i] +1));
			}
		}
	}
	
}
