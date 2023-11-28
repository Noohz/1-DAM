package unidad6;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		// Declarar el ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		
		// Asignar elementos al ArrayList
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println("# ** Bucle con FOR normal ** # \n");
		// Recorrer el contenido de un ArrayList con un bucle FOR normal
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i)+ "\n");
		}
		
		System.out.println("# ** Bucle con FOR-EACH ** # \n");
		// Recorrer el contenido de un ArrayList con un bucle FOR-EACH
		for (String i : cars) {
			System.out.println(i+ "\n");
		} 
		
		System.out.println("# ** Mostrar el contenido del ArrayList ** # \n");
		// Mostrar el contenido del ArrayList
		System.out.println(cars+ "\n");
		
		System.out.println("# ** Mostrar el contenido específico del ArrayList ** # \n");
		// Mostrar el contenido específico del ArrayList
		System.out.println(cars.get(1)+ "\n");
		
		System.out.println("# ** Modificar un elemento específico del ArrayList ** # \n");
		// Modificar un elemento específico del ArrayList
		cars.set(0, "Opel");
		System.out.println(cars+ "\n");
		
		System.out.println("# ** Eliminar un elemento específico del ArrayList ** # \n");
		// Eliminar un elemento específico del ArrayList
		cars.remove(0);
		System.out.println(cars+ "\n");
		
		System.out.println("# ** Para saber cuantos elementos tiene un ArrayList ** # \n");
		// Para saber cuantos elementos tiene un ArrayList
		System.out.println("El contenido del ArrayList es: " +cars+ " y hay " +cars.size()+ " elementos \n");
		
		System.out.println("# ** Eliminar todos los elementos del ArrayList ** # \n");
		// Eliminar todos los elementos del ArrayList
		cars.clear();
		System.out.println(cars+ "\n");
		
	}

}
