package ejemploMetodoAbstracto;

public class Principal {

	public static void main(String[] args) {
		
		// Declaración de objetos
		Alumno alumno;
		Profesor profe;
		
		// Creación de objetos
		alumno = new Alumno ("Juan", "Torres", 1980, "1DAM-B", 5);
		profe = new Profesor ("Antonio", "Campos", 1970, 1730.54, "Profesor de Informática");

		
		// Utilización del método mostrar
		System.out.println("\n#- Datos del Alumno -#");
		alumno.Mostrar();
		
		System.out.println("\n#- Datos del Profesor -#");
		profe.Mostrar();
	}
}
