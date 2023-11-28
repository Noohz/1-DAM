package ejercicioMuseoValladolid;

import java.time.LocalDate;

public abstract class Obra {
    protected String nombre;
    protected Autor autor;
    protected String codigoCatalogacion;
    protected static int numeroObras = 0;

    public Obra () {
    	
    }
    
    public Obra(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.codigoCatalogacion = calcularCodigoCatalogacion();
        numeroObras++;
    }

    public String getNombre() {
        return nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getCodigoCatalogacion() {
        return codigoCatalogacion;
    }

    public static int getNumeroObras() {
        return numeroObras;
    }

    private String calcularCodigoCatalogacion() {
        LocalDate fecha = LocalDate.now();
        return nombre + fecha.toString();
    }	

    public abstract double calculaPrecio();

    public abstract void mostrar();
}