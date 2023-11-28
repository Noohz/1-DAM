/**
 * Realizar un programa que contenga una clase Persona que tenga como atributos el nombre y la edad. Definir un método que cargue los datos personales y otro que los imprima. 
 * Hacer una segunda clase Empleado que herede de la clase Persona.
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Por último en una clase principal crear un objeto de la clase Persona y llamar a sus métodos. También crear uno objeto de la clase Empleado y llamar a sus métodos.
 */

package ejercicio1HerenciaMultiple;

public class Principal {

	public static void main(String[] args) {
		
		Persona pe1 = new Persona ();
		pe1.cargarDatosPersonales();
		System.out.println("#- Datos de la clase Persona -#");
		pe1.Mostrar();
		
		Empleado emp1 = new Empleado ();
		emp1.cargarSueldo();
		emp1.setNombre("Pedro");
		emp1.setEdad(34);
		System.out.println("#- Datos de la clase Empleado -#");
		emp1.Mostrar();
		
	}

}
