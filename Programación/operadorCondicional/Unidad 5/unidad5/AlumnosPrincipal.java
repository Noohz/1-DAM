/*
 * Crear un objeto "Alumno2" llamando al constructor por defecto y dar valores a esos atributos o bien directamente si lo permite 
 * o si no a través de un método según lo permitan los modificadores.
 */

package unidad5;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class AlumnosPrincipal {

	public static void main(String[] args) {

		Alumnos Alumno1 = new Alumnos ("Aitor", "Ramos Sánchez", 21, 'A', 4.99f);
		
		Alumnos Alumno2 = new Alumnos ();
		
		System.out.println("**Datos del Alumno 1** \nEl nombre es: " +Alumno1.Nombre+ "\nEl apellido del alumno es: " +Alumno1.Apellidos+ 
				"\nLa edad del alumno es: " +Alumno1.getEdad()+ "\nLa inicial del nombre es: " +Alumno1.Inicial+ 
				"\nEl coste de la matrícula es: " +Alumno1.getCoste_Matricula());
	}

}
