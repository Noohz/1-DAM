package operadorCondicional;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner teclado = new Scanner (System.in);
		int edad;
		String resultado;
		
		System.out.print("Introduce una edad: ");
		edad = teclado.nextInt();
		
		resultado = edad >=18 ? "Mayor de edad": "Menor de edad";
		System.out.println(resultado);
		
		teclado.close();
		
	}

}
