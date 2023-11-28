package tarea;

public class CVPrincipal {

	public static void main(String[] args) {

		Conductor c1 = new Conductor ();
		Vehiculo v1 = new Vehiculo (c1);
		v1.setMatricula("120sdc");
		v1.setColor("Verde");
		v1.setnPlazas(4);
		v1.c1.setNombre("Pedro");
		v1.c1.setaExperiencia(3);
		v1.mostrar();
		
		Vehiculo v2 = new Vehiculo (c1);
		v2.setMatricula("1032dl");
		v2.setColor("Azul");
		v2.setnPlazas(4);
		v2.c1.setNombre("Alejandro");
		v2.c1.setaExperiencia(8);
		v2.mostrar();
		
		Vehiculo v3 = new Vehiculo (c1);
		v3.setMatricula("10hl1");
		v3.setColor("Rojo");
		v3.setnPlazas(4);
		v3.c1.setNombre("Lucia");
		v3.c1.setaExperiencia(5);
		v3.mostrar();
		
		
	}

}
