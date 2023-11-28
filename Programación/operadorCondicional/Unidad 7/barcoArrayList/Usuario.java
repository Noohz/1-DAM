package barcoArrayList;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String dni;
    private Barco barco;

    public Usuario(String nombre, String dni, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Barco getBarco() {
        return barco;
    }

    public String toString() {
        return "Nombre del usuario: " + nombre + "\nDNI del usuario: " + dni + "\n\nDatos del Barco de " +getNombre()+ ": " +barco.toString();
    }
}