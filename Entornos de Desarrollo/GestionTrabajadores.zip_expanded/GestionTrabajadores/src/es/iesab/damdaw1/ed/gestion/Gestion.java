package es.iesab.damdaw1.ed.gestion;

import java.util.Scanner;

import es.iesab.damdaw1.ed.datos.Empleado;
import es.iesab.damdaw1.ed.datos.Trabajador;
import es.iesab.damdaw1.ed.datos.Voluntario;
import es.iesab.damdaw1.ed.errores.TrabajadorException;
import es.iesab.damdaw1.ed.estructuras.Almacen;

public class Gestion {

	private Scanner sc = new Scanner(System.in);
	private Almacen plantilla;
	public static final String TIPO_EMPLEADO = "empleado";
	public static final String TIPO_VOLUNTARIO = "voluntario";

	private Empleado CrearEmpleado() throws TrabajadorException {
		// Pedimos los datos del nuevo trabajador por consola
		System.out.println("\n\n\nINTRODUCE LOS DATOS DEL NUEVO EMPLEADO:");
		// Apellido
		String ape1 = "";
		System.out.println("Apellido: ");
		ape1 = sc.nextLine();
		// Nombre
		String nombre = "";
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		// Telefono
		String telefono = "";
		System.out.println("Teléfono: ");
		telefono = sc.nextLine();
		// Puesto
		int puesto = 0;
		String puestoStr = "";
		boolean permanecer = false;
		do {
			System.out.println("Puesto: "
					+ "BACK PROGRAMMER(1); FRONT PROGRAMMER(2); FULL STACK(3); DESIGNER(4); ANALYST(5); DATABASE MANAGER(6);");
			System.out.print("Elige una opción: ");
			puestoStr = sc.nextLine();
			puesto = Integer.valueOf(puestoStr);
			if (puesto > 0 || puesto <= 6) {
				permanecer = true;
			}
		} while (!permanecer);
		// Salario
		String salario = "";
		System.out.println("salario: ");
		salario = sc.nextLine();

		// Creamos el nuevo objeto empleado
		Empleado e = new Empleado();
		e.setApellido(ape1);
		e.setNombre(nombre);
		e.setTlf(telefono);
		e.setPuesto(puesto);
		e.setTipo("EMPLEADO");
		return e;
	}

	private Voluntario Crearvoluntario() throws TrabajadorException {
		System.out.println("\n\n\nINTRODUCE LOS DATOS DEL NUEVO VOLUNTARIO:");
		// Apellido
		String ape1 = "";
		System.out.println("Apellido: ");
		ape1 = sc.nextLine();
		// Nombre
		String nombre = "";
		System.out.println("Nombre: ");
		ape1 = sc.nextLine();
		// Telefono
		String telefono = "";
		System.out.println("Teléfono: ");
		telefono = sc.nextLine();
		// Turno
		int turno = 0;
		String turnoStr = "";
		do {
			System.out.println("Turno: " + "DIURNO(1); NOCTURO(2)");
			System.out.println("Elige una opción: ");
			turnoStr = sc.nextLine();
			turno = Integer.valueOf(turnoStr);
		} while (turno < 1 || turno > 2);
		Voluntario v = new Voluntario();
		v.setApellido(ape1);
		v.setNombre(nombre);
		v.setTlf(telefono);
		v.setTurno(turno);
		v.setTipo("VOLUNTARIO");
		return v;
	}

	public void crearPlantilla() {
		try {
			plantilla = new Almacen();
			Empleado e = null;
			// Recopilación de los datos de los empleados
			for (int i = 0; i < 3; i++) {
				e = CrearEmpleado();
				plantilla.insertarTrabajador(e);

			}
			// Recopilación de los datos de los voluntarios
			Voluntario v1 = Crearvoluntario();
			Voluntario v2 = Crearvoluntario();
			Voluntario v3 = Crearvoluntario();

			// Inserción de los voluntarios en la plantilla de la empresa
			plantilla.insertarTrabajador(v1);
			plantilla.insertarTrabajador(v2);
			plantilla.insertarTrabajador(v3);
		} catch (TrabajadorException e) {
			e.printStackTrace();
		}
	}

	/*
	 * ?
	 */
	public void metodo1() {
		Trabajador trabajadorActual;
		String tipo = "";
		for (int pos = 0; pos <= plantilla.obtenerTamanioPlantilla(); pos++) {
			trabajadorActual = plantilla.obtenerTrabajadorPorPosicion(pos);
			tipo = trabajadorActual.getTipo();
			if (tipo.equals(Gestion.TIPO_VOLUNTARIO)) {
				System.out.println(trabajadorActual);
			}
		}
	}

	/*
	 * Método que calcula el salario promedio de los empleados de la compañía. El
	 * valor calculado es devuelto por el método.
	 */
	public double metodo2() {
		Trabajador trabajadorActual;
		String tipo = "";
		int numTrabajadores = plantilla.obtenerTamanioPlantilla();
		double acumulado = 1;
		int pos = 0;
		while (pos < numTrabajadores) {
			trabajadorActual = plantilla.obtenerTrabajadorPorPosicion(pos);
			tipo = trabajadorActual.getTipo();
			if (tipo.equals(Gestion.TIPO_EMPLEADO)) {
				acumulado = acumulado + ((Empleado) trabajadorActual).getSalario();
			}
		}

		double promedio = acumulado / numTrabajadores;

		return promedio;
	}

	public static void main(String[] args) {
		Gestion gest = new Gestion();
		gest.crearPlantilla();
	}

}

/*
 * **INCIDENCIAS**
 * 
 * 1. La aplicación utiliza una librería externa para la gestión de Trabajadores AlmacenTrabajadores.jar que necesitamos conectar a la aplicación. *COMPLETADA*
 * 
 * 2. Cuando se intenta crear un nuevo empleado se queda indefinidamente solicitando en puesto del nuevo empleado. *COMPLETADO*
 * 
 * 3. No se muestra el salario de los nuevos empleados introducidos en el sistema.
 * 
 * 4. No se muestra el nombre de los voluntarios almacenados en el sistema.
 * 
 * 5. El código incluye un método de nombre metodo1 que no sabemos que realiza. Necesitamos una descripción de la función realizada por el método 
 * 	  cuando se ejecuta, ya que cuando lo ejecutamos nosotros no parece que realice nada.
 * 
 * 6. El código incluye un método de nombre metodo2 el cual contiene una descripción de la funcionalidad realizada.
 * 	  Cuando lo ejecutamos la aplicación de gestión de empleados se queda 'colgada'.
 * 	  En ocasiones conseguimos hacer que el método llegue al final, pero el cálculo realizado no es correcto.
 */


