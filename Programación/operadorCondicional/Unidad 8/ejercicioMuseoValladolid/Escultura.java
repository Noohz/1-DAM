package ejercicioMuseoValladolid;

public class Escultura extends Obra {
    private String materialConstruccion;
    private double peso;

    public Escultura () {
    	
    }
    
    public Escultura(String nombre, Autor autor, String materialConstruccion, double peso) {
        super(nombre, autor);
        this.materialConstruccion = materialConstruccion;
        this.peso = peso;
    }

    public String getMaterialConstruccion() {
        return materialConstruccion;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrar() {
        System.out.println("Obra: " + nombre);
        System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellidos());
        System.out.println("Material de construcción: " + materialConstruccion);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Código de catalogación: " + codigoCatalogacion);
        System.out.println("Precio: " + calculaPrecio() + " euros");
    }

    public double calculaPrecio() {
        
        return autor.getPrecioMedioObras() * (anosObra + peso / 2);
    }
}
