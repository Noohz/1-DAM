package ejercicioClaseyMetodosFinales2;

public class EmpComision extends Empleado {
    private static final double SALARIO_MINIMO = 850.00;
    private static final double CLIENTES_CAPTADOS_MENOR_70 = 10.00;
    private static final double CLIENTES_CAPTADOS_MAYOR_70 = 15.00;
    private int clientesCaptados;

    public EmpComision(String dni, String nombre, String apellidos, int antiguedad, int clientesCaptados) {
        super(dni, nombre, apellidos, antiguedad);
        this.clientesCaptados = clientesCaptados;
    }

	public int getClientesCaptados() {
		return clientesCaptados;
	}

	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}

    public double calcularSalario() {
        double salario = clientesCaptados * (clientesCaptados < 70 ? CLIENTES_CAPTADOS_MENOR_70 : CLIENTES_CAPTADOS_MAYOR_70);
        
        if (salario < SALARIO_MINIMO) {
            salario = SALARIO_MINIMO;
        }
        
        return salario;
    }
}