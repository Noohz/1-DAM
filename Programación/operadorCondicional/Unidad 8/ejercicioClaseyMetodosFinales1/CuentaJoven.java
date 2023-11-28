/*
 * La clase CuentaJoven dispondrá del método pagarIntereses que incrementará el saldo de la cuenta en un 5%. ¿Puedes modificar el saldo con la información que tienes hasta ahora?
 * No podrán crearse clases derivadas de la clase CuentaJoven.
 */

package ejercicioClaseyMetodosFinales1;

public final class CuentaJoven extends Cuenta{
	
	public void pagarInteres () {
		super.saldo = super.saldo + (super.saldo * 0.05);
	}
}
