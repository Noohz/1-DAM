package Organizacion;

/**
 * 
 * @author MOUHCINE EL QADDOURY EL QADDOURY
 *
 */
public class Principal {

	public static void main(String[] args) {

		PartidoPolitico part1 = new PartidoPolitico();
		part1.setNombre("Los leones rojos");
		part1.setComponentes("Juan,Javier,Lucia,Marcos,Laura");
		part1.setPresupuesto(10000.76);
		System.out.println("EL nombre del partido es: " + part1.getNombre());
		System.out.println("Los componentes del grupo son: " + part1.getComponentes());
		System.out.println("EL presupuesto es de " + part1.getPresupuesto() + " euros.");

		ComunidadAutonoma com1 = new ComunidadAutonoma("Extremadura", 1000000, false);
		System.out.printf("La comunidad es %s y tiene %d  habitantes  y la sede %b ",com1.nombre,com1.numHabitantes,com1.sede);

	}

}
