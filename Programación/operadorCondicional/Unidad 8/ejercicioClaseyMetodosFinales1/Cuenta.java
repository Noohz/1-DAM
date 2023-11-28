/*
 * La clase "Cuenta" tendrá tres atributos: numeroCuenta, saldo y contador. El contador se utilizará para almacenar el número de cuentas que se han creado.
 * La clase "Cuenta" además tendrá un constructor por defecto y uno con tres parámetros. No tendrá métodos get y set de los atributos correspondientes. ¿Son necesarios?
 * Además, tendrá definido un método pagarIntereses que deberá ser redefinido en las clases derivadas.
 * No se podrán instanciar objetos de tipo Cuenta.
 */

package ejercicioClaseyMetodosFinales1;

public abstract class Cuenta {

	protected int numeroCuenta;
	protected double saldo;
	protected int contador = 0;
	
	public Cuenta () {
		this.contador++;
	}
	
	public Cuenta (int numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.contador++;
	}
	
	protected abstract void pagarInteres ();
}
