package tareaArrayList;

public class Producto {

	String nombre;
	int cantidad;
	double precio;
	
	public Producto () {
		
	}
	
	public Producto (String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	/**
	 * @return nombre -> Devuelve un *String* con el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre nombre -> Define el valor *String* que tendrá nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return cantidad -> Devuelve un *int* con el valor de cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad cantidad -> Define el valor *int* que tendrá cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return precio -> Devuelve un *double* con el valor de precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio precio -> Define el valor *double* que tendrá precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return cantidad * precio;
	}	
}
