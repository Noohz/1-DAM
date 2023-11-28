/*
 * Realizar un programa que lea dos números enteros por teclado y un operador 
 * (de tipo carácter: +, -, *, /) y muestra el resultado de la operación.
 */

package ejerciciosUD3;


import java.util.Scanner;
public class Ejercicio2pag13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1,num2;
		char a;
		
		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce un operador (+,-,*,/): ");
		a = teclado.next().charAt(0);
		
		switch(a) {
		case '+':
			System.out.println("El resultado de num1 + num2 es: " +(num1+num2));
			break;
		case '-':
			System.out.println("El resultado de num1 - num2 es: " +(num1-num2));
			break;
		case '*':
			System.out.println("El resultado de num1 * num2 es: " +(num1*num2));
			break;
		case '/':
			System.out.println("El resultado de num1 / num2 es: " +(num1/num2));
		default: System.out.println("Operación no valida");
		}
		
		
		teclado.close();
	}

}
