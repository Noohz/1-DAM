package unidad5;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Alumnos {

	public String Nombre;
	String Apellidos; //Puede acceder todo el paquete a él.
	private int Edad;
	char Inicial;
	private float Coste_Matricula;
	
	/**
	 * Constructor por defecto.
	 */
	public Alumnos () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param Nombre -> Identificador que indica el nombre del Alumno.
	 * @param Apellidos -> Identificador que indica el apellido del Alumno.
	 * @param Edad -> Identificador que indica la edad del Alumno.
	 * @param Inicial -> Identificador que indica la inicial del nombre del Alumno.
	 * @param Coste_Matricula -> Identificador que indica el coste de la matrícula.
	 */
	public Alumnos (String Nombre, String Apellidos, int Edad, char Inicial, float Coste_Matricula) {
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Edad = Edad;
		this.Inicial = Inicial;
		this.Coste_Matricula = Coste_Matricula;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public float getCoste_Matricula() {
		return Coste_Matricula;
	}

	public void setCoste_Matricula(float coste_Matricula) {
		Coste_Matricula = coste_Matricula;
	}

	public void Mostrar () {
		System.out.println("**Detalles del Alumno 2** \nEl nombre del alumno es: " +Nombre+ "\nEl apellido del alumno es: " +Apellidos+ 
				"\nLa edad del alumno es: " +getEdad()+ "\nLa inicial del alumno es: " +Inicial+ "\nEl coste de la matrícula es: " +getCoste_Matricula());
	}

	
}
