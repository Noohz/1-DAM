/**
 * Implementa los métodos mostrar en las 3 clases y haz una clase principal donde crees un objeto de cada clase y muestres sus datos.
 */

package ejercicioRedefinicionConMostrar;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona ps1 = new Persona ();
		System.out.println("#- Datos de la Persona -#");
		ps1.setNombre("Raúl");
		ps1.setApellidos("SS");
		ps1.setFechaNacim(1980);
		ps1.Mostrar();
		
		Alumno al1 = new Alumno ();
		System.out.println("\n#- Datos del Alumno -#");
		al1.setNombre("Aitor");
		al1.setApellidos("RS");
		al1.setFechaNacim(2001);
		al1.setGrupo("1º A");
		al1.setNotaMedia(5);
		al1.Mostrar();
		
		Profesor pr1 = new Profesor ();
		System.out.println("\n#- Datos del Profesor -#");
		pr1.setNombre("Juan");
		pr1.setApellidos("RA");
		pr1.setFechaNacim(1984);
		pr1.setEspecialidad("Profesor de Informática");
		pr1.setSalario(1730.54);
		pr1.Mostrar();
		
	}

}
