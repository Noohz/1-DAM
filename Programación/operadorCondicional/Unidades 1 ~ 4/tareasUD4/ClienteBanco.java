package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class ClienteBanco {

	int numeroCuenta;
	double deposito, saldo;
	String nombreCliente;
	
	/**
	 * Constructor por defecto.
	 */
	public ClienteBanco () {
		
	}
	/**
	 * Constructor con todos los parámetros.
	 * @param numeroCuenta -> Identificador que muestra el número de cuenta del dueño.
	 * @param nombreCliente -> Identificador que muestra el nombre del dueño de la cuenta.
	 * @param deposito -> Identificador que indica el deposito realizado en la cuenta.
	 * @param saldo -> Identificador que indica el saldo disponible en la cuenta.
	 */
	public ClienteBanco (int numeroCuenta, String nombreCliente, double deposito, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.deposito = deposito;
		this.saldo = saldo;
	}
	
	/**
	 * Constructor con los 2 primeros parámetros.
	 * @param numeroCuenta -> Identificador que muestra el número de cuenta del dueño.
	 * @param nombreCliente -> Identificador que muestra el nombre del dueño de la cuenta.
	 */
	public ClienteBanco (int numeroCuenta, String nombreCliente) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
	}
	
	/**
	 * Constructor con los parámetros Deposito y Saldo.
	 * @param deposito -> Identificador que indica el deposito realizado en la cuenta.
	 * @param saldo -> Identificador que indica el saldo disponible en la cuenta.
	 */
	public ClienteBanco (double deposito, double saldo) {
		this.deposito = deposito;
		this.saldo = saldo;
	}
	
	/**
	 * Metodo get's
	 * @return numeroCuenta -> Devuelve un int con el valor de numeroCuenta.
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	/**
	 * Metodo set's
	 * @param numeroCuenta -> Define el valor int que tendrá numeroCuenta.
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * Metodo get's
	 * @return deposito -> Devuelve un double con el valor de deposito.
	 */
	public double getDeposito() {
		return deposito;
	}
	
	/**
	 * Metodo set's
	 * @param deposito -> Define el valor int que tendrá deposito.
	 */
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	/**
	 * Metodo get's
	 * @return saldo -> Devuelve un double con el valor de saldo.
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Metodo set's
	 * @param saldo -> Define el valor int que tendrá saldo.
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Metodo get's
	 * @return nombreCliente -> Devuelve el valor String que tendrá nombreCliente.
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	/**
	 * Metodo set's
	 * @param nombreCliente -> Define el valor String que tendrá nombreCliente.
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
}