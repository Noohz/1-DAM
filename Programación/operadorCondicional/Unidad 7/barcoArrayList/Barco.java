package barcoArrayList;

import java.io.Serializable;

public class Barco implements Serializable {
    private double eslora;
    private String matricula;

    public Barco(double eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return "\nEslora del barco: " + eslora + "\nMatrícula del barco: " + matricula;
    }
}
