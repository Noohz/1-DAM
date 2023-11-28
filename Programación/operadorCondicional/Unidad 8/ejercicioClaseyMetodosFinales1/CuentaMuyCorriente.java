/*
 * La clase CuentaMuyCorriente será una clase derivada de la clase CuentaCorriente.
 */

package ejercicioClaseyMetodosFinales1;

public class CuentaMuyCorriente extends CuentaCorriente {

	public void pagarInteres () {
		super.saldo = super.saldo + (super.saldo * 0.05);
	}
	
}
