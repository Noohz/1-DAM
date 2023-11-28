package unidad6;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String [] nombreEmpleado = {"Aitor","Lucía","Pedro","Alejandra","Santiago","Alberto",};
		double [] sueldoEmpleado = {1200, 1420, 1130, 1500, 940, 2010};
		
		
		almacenarNombre(nombreEmpleado);
		mostrarSueldo(sueldoEmpleado);
	}
	
	public static void almacenarNombre (String [] nombreEmpleado) {
		
		System.out.println("Los nombres de los empleados elegidos son: ");
		
		for (int i = 0; i < nombreEmpleado.length; i++) {
		System.out.print(nombreEmpleado [i]+ " ");
		}
	}
	
	public static void mostrarSueldo (double [] sueldoEmpleado) {
		double sueldoMayor = 0;
		
		for (int i = 0; i < sueldoEmpleado.length; i++) {
			if (sueldoEmpleado [i] > sueldoMayor) {
				sueldoMayor = sueldoEmpleado [i];
			}
				
		}
		System.out.println("\nEl sueldo mayor es: " +sueldoMayor);
	}
}