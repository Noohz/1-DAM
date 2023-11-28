package ejercicioResueltoPolimorfismo;

public class Ciudadano extends Humano {
	
	protected String documento;
	
	public Ciudadano () {
		
	}
	
	public Ciudadano (String nombre, String apellido, String documento) {
		super (nombre, apellido);
		this.documento = documento;
	}
	
	public void mostrar () {
		System.out.println("Ciudadano");
	}
	
	public String identificacion () {
		return super.identificacion() + ", documento: " +this.documento;
	}
}
