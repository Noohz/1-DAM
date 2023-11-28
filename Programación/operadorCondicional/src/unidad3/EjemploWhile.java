package unidad3;

import java.util.*;
public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int suma=0, num;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		while (num>=0) {
			suma = suma + num;
			System.out.println("Introduce un número: ");
			num = teclado.nextInt();
		}
		
		System.out.println("La suma es: " +suma);
		
		teclado.close();
	}

}
