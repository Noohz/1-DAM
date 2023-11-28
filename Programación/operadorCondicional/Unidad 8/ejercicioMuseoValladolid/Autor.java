package ejercicioMuseoValladolid;

public class Autor {
    private String nombre;
    private String apellidos;
    private double precioMedioObras;

    public Autor () {
    	
    }
    
    public Autor(String nombre, String apellidos, double precioMedioObras) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.precioMedioObras = precioMedioObras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getPrecioMedioObras() {
        return precioMedioObras;
    }

    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + apellidos);
        System.out.println("Precio medio de obras: " + precioMedioObras + " euros");
    }
}