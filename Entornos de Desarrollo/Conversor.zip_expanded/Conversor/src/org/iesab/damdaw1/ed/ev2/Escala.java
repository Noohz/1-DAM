package org.iesab.damdaw1.ed.ev2;

public enum Escala{
	CELSIUS ("Celsius"),
	KELVIN ("Kelvin"), 
	FAHRENHEIT ("Fahrenheit");
	
	private final String nombre;
		
	private Escala(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return this.nombre;
	}
	
}
