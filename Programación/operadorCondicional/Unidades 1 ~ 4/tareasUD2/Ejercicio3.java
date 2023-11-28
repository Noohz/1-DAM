/*
 * Diseña un programa Java que cree un tipo enumerado para los meses del año.
 * El programa debe realizar las siguientes operaciones: 
 * Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostra por pantalla su valor.
 */

package tareasUD2;

public class Ejercicio3 {

	public enum M {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M mes = M.Marzo;
		
		System.out.println("El mes indicado es: " + mes);
	}

}
