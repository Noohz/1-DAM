/**
 * Realizar un programa que contenga una clase Persona que tenga como atributos el nombre y la edad. Definir un método que cargue los datos personales y otro que los imprima. 
 * Hacer una segunda clase Empleado que herede de la clase Persona.
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Por último en una clase principal crear un objeto de la clase Persona y llamar a sus métodos. También crear uno objeto de la clase Empleado y llamar a sus métodos.
 */

package ejercicio1HerenciaMultiple;

import java.util.*;

public class Empleado extends Persona {
	
	private double sueldo;
	
	public Empleado () {
		
	}
	
	public Empleado (String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	/*
	 * Método para cargar el sueldo del Empleado.
	 */
	public void cargarSueldo () {
		double cSueldo;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\nIntroduce el sueldo del Empleado: ");
		cSueldo = sc.nextDouble();
		setSueldo(cSueldo);
		
		sc.close();
	}
	
	/*
	 * Método para imprimir el sueldo.
	 */
	public void Mostrar () {
		super.Mostrar();
		System.out.println("Sueldo: " +this.sueldo);
	}
}
