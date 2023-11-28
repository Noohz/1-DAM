package unidad3;

public class EjemploExcepciones {

	/*
	 * Si se usa static no hace falta inicializarla
	 * public static int numerador = 10;
	 * public static Integer denominador = null;
	 * public static float division;
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerador =10;
		Integer denominador = null;
		float division = 0;
		
		System.out.println("ANTES DE HACER LA DIVISIÓN");
		
		try {
			division = numerador / denominador;

		} catch (ArithmeticException ex) {
			division = 0; // Si hay una excepción se dará el valor 0 a División.
			System.out.println("Error: " +ex.getMessage());
		} catch (NullPointerException ex) {
			division = 1; // Si la excepción es Null doy valor 1 al atributo División.
			System.out.println("Error: " +ex.getMessage());
		}finally {
			System.out.println("Resultado de la división: " +division);
			System.out.println("DESPUES DE HACER LA DIVISIÓN");

		}
				
	}

}
