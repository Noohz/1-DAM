package repasoUD6;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int [] arrayEjer4 = new int [10];

		inicializar(arrayEjer4);
		
		
	}

	public static void inicializar (int [] arrayEjer4) {
		
		for (int i = 0; i < arrayEjer4.length; i++) {
			int num = (int) (Math.random()*50+1);
			arrayEjer4[i] += num;
			
			System.out.println("Los números escogidos son: " + arrayEjer4[i]);
		}
	}
	
	public static void calcularMedia (int [] arrayEjer4) {
		
		int pares = 0;
		
		for (int i = 0; i < arrayEjer4.length; i++) {
			if (i % 2 == 0) {
				pares += arrayEjer4[i];
			}
		}
		System.out.println("La media de los números pares es: " +pares/(arrayEjer4.length / 2));
	}
	
}
