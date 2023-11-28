package ejercicioClaseyMetodosFinales2;

public class EmpSalariado extends Empleado {
    private double salarioBase;

    public EmpSalariado(String dni, String nombre, String apellidos, int anyosAntiguedad, double salarioBase) {
        super(dni, nombre, apellidos, anyosAntiguedad);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        double salario = salarioBase;
        if (anyosAntiguedad >= 2 && anyosAntiguedad <= 3) {
            salario *= 1.02;
        } else if (anyosAntiguedad >= 4 && anyosAntiguedad <= 7) {
            salario *= 1.05;
        } else if (anyosAntiguedad >= 8 && anyosAntiguedad <= 15) {
            salario *= 1.10;
        } else if (anyosAntiguedad > 15) {
            salario *= 1.15;
        }
        return salario;
    }
}
