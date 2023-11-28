package ejercicioClaseyMetodosFinales2;

public abstract class Empleado {

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected int anyosAntiguedad;
	
	public Empleado () {
		
	}
	
	public Empleado (String dni, String nombre, String apellidos, int anyosAntiguedad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anyosAntiguedad = anyosAntiguedad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}

	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}
	
	// Método Mostrar
	public void mostrar () {
		
		System.out.println("#- Datos del Empleado/a");
		
		System.out.println("El nombre es: " +nombre);
		System.out.println("El apellido es: " +apellidos);
		System.out.println("El DNI es: " +dni);
		System.out.println("Los años de antiguedad son: " +anyosAntiguedad);
	}
	
	public abstract double calcularSalario ();
	
}
