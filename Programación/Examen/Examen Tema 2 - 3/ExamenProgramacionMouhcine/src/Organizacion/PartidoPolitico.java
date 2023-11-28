package Organizacion;

/**
 * 
 * @author MOuhcine EL Qaddoury
 *
 */
public class PartidoPolitico {
	private String nombre;
	private String componentes;
	private Double presupuesto;

	public PartidoPolitico() {

	}

	public PartidoPolitico(String nom, String compone, Double presup) {
		this.nombre = nom;
		this.componentes = compone;
		this.presupuesto = presup;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

}
