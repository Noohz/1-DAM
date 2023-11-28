/**
 * Realizar un programa que contenga una clase Persona que tenga como atributos el nombre y la edad. Definir un método que cargue los datos personales y otro que los imprima. 
 * Hacer una segunda clase Empleado que herede de la clase Persona.
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Por último en una clase principal crear un objeto de la clase Persona y llamar a sus métodos. También crear uno objeto de la clase Empleado y llamar a sus métodos.
 */

package ejercicio1HerenciaMultiple;

import java.util.*;

public class Persona {
	
	private String nombre;
	private int edad;
	
	
	public Persona () {
		
	}
	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*
	 * Método para cargar los datos.
	 */
	public void cargarDatosPersonales () {
		String mNombre;
		int mEdad;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el nombre de la Persona: ");
		mNombre = sc.nextLine();
		setNombre(mNombre);
		
		System.out.println("Introduce la edad de la Persona: ");
		mEdad = sc.nextInt();
		sc.nextLine();
		setEdad(mEdad);
		
		sc.close();
	}
	
	/*
	 * Método para imprimir los datos.
	 */
	public void Mostrar () {
		System.out.println("Nombre: " +this.nombre+ "\nEdad: " +this.edad);
	}
}
