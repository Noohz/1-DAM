package tareasUD4;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class ClienteBancoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Objeto que instancia al constructor por defecto.
		 */
		ClienteBanco cb1 = new ClienteBanco ();
		
		/**
		 * Objeto que instancia al constructor con todos los parámetros con mis datos.
		 */
		ClienteBanco cb2 = new ClienteBanco (531, "Aitor", 1320, 340);
		
		/**
		 * Objeto que instancia al constructor con los 2 primeros parámetros.
		 */
		ClienteBanco cb3 = new ClienteBanco (112, "Pedro Moreno");
		
		/**
		 * Objeto que instancia al constructor con los 2 últimos parámetros.
		 */
		ClienteBanco cb4 = new ClienteBanco (10000, 5000);
		
		System.out.println("Datos de Banco (Por defecto) \nEl número de cuenta del cliente es: " +cb1.getNumeroCuenta()+
				"\nEl nombre del dueño de la cuenta es: " +cb1.getNombreCliente()+ "\nEl deposito ingresado en la cuenta es: " +cb1.getDeposito()+ 
				"\nEl saldo disponible en la cuenta es: " +cb1.getSaldo());
		
		System.out.println("\nDatos de Banco (Con todos los parámetros) \nEl número de cuenta del cliente es: " +cb2.getNumeroCuenta()+
				"\nEl nombre del dueño de la cuenta es: " +cb2.getNombreCliente()+ "\nEl deposito ingresado en la cuenta es: " +cb2.getDeposito()+ 
				"\nEl saldo disponible en la cuenta es: " +cb2.getSaldo());
		
		System.out.println("\nDatos de Banco (Con los 2 primeros parámetros) \nEl número de cuenta del cliente es: " +cb3.getNumeroCuenta()+
				"\nEl nombre del dueño de la cuenta es: " +cb3.getNombreCliente());
		
		System.out.println("\nDatos de Banco (Con los 2 últimos parámetros) \nEl deposito ingresado en la cuenta es: " +cb4.getDeposito()+ 
				"\nEl saldo disponible en la cuenta es: " +cb4.getSaldo());
	}

}