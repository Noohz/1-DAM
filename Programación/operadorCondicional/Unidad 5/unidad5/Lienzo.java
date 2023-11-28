package unidad5;

public class Lienzo {

	
	public void pintar (int entero) {
		
		System.out.println("Estoy pintando el número: " +entero);

	}
	
	public void pintar (double real) {
		
		System.out.println("Estoy pintando el double: " +real);

	}
	
	public void pintar (String cadena) {
		
		System.out.println("Estoy pintando la cadena: " +cadena);

	}
	
	public void pintar (int entero, String cadena) {
		
		System.out.println("Estoy pintando el entero: " +entero+ " y la cadena: " +cadena);
		
	}
}
