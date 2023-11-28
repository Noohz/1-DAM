package org.iesab.damdaw1.ed.ev2;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;


public class CalculadoraFinanciera {	
	public static final int NUM_MAX_PERIODOS=5;
	public static final String TASA_ACTUALIZACION_1="0.05";
	public static final String TASA_ACTUALIZACION_2="0.07";
	public static final String TASA_ACTUALIZACION_3="0.1";
	public static final String INVERSION_RENTABLE="LA INVERSIÓN ES RENTABLE";
	public static final String INVERSION_NO_RENTABLE="LA INVERSIÓN NO ES RENTABLE";
	public static final String INVERSION_INDIFERENTE="LA INVERIÓN RESULTA INDIFERENTE";

	
	private boolean validarTasa(String tasa) {
		boolean valorRetorno=false;
		
		if ((tasa.compareTo(TASA_ACTUALIZACION_1) == 0) 
				|| (tasa.compareTo(TASA_ACTUALIZACION_2) == 0)
					   || (tasa.compareTo(TASA_ACTUALIZACION_3) == 0)) {
			valorRetorno=true;
		}
	
		StringUtils.isNumeric(tasa);
		return valorRetorno;
	}
	
	public DatosUsuario perdirDatosInversion() {
		DatosUsuario datosLeidos=new DatosUsuario();
		String[] vFlujosFuturosCaja=new String[NUM_MAX_PERIODOS];
		Scanner sc;
		sc=new Scanner(System.in);

		// Se almacena la inversión inicial
		System.out.print("Introduzca la inversión inicial: ");
		datosLeidos.setInversionInicial(sc.nextLine());
		System.out.println("\n\nIntroduzca los flujos de caja futuros:");
		
		// Se almacenan los flujos futuros de caja 
		for(int i=0; i<NUM_MAX_PERIODOS; i++) {
			System.out.print("Flujo de caja futuro periodo "+ i +": ");
			vFlujosFuturosCaja[i]=sc.nextLine();			
		}
		datosLeidos.setFlujosFuturoCaja(vFlujosFuturosCaja);
		
		// Se almacena la tasa de actualización monetaria.
		// Únicamente serán permitidos 3 valores posibles: 0.05, 0,07 o 0,1
		String tasaActualizacion="";
		do {
			System.out.print("\n\nElija la tasa de actualización (" + 
					TASA_ACTUALIZACION_1 + ", " + 
					TASA_ACTUALIZACION_2 + ", " + 
					TASA_ACTUALIZACION_3 + "): ");			
			tasaActualizacion=sc.nextLine();
		} while (!validarTasa(tasaActualizacion));		
		datosLeidos.setTasaActualizacion(tasaActualizacion);
		
		// Todos los datos para calcular el VAN de la inversión han sido leídos.
		sc.close();
		
		return datosLeidos;
	}
	
	public void mostrarResultado(DatosUsuario datosProcesados) {
		System.out.println("\n\n\n\t" + "CON UNA TASA DE ACTUALIZACIÓN DEL: " + datosProcesados.getTasaActualizacion());
		System.out.println("\t\t" + datosProcesados.getResultadoInversion());
	}

	/**
	 * Método que calcula el VAN de una inversión.
	 * El VAN se calcula en función a los flujos futuros de caja
	 * @param datosInversion
	 * 			Objeto que contiene los datos necesarios para calcular el VAN
	 * @return
	 * 			Resultado de la inversión: RENTABLE, NO RENTABLE, INDIFERENTE
	 */
	public DatosUsuario calcularVAN (DatosUsuario datosInversion) {
		String resultadoInversion="";
		double totalFlujosFuturos=0.0;
		double VAN=0.0;
		double[] vFlujosActualizados=new double[NUM_MAX_PERIODOS]; // Almacena los flujos de caja actualizados
		
		int i=0;
		String[] vFlujosFuturos=null;
		vFlujosFuturos=datosInversion.getFlujosFuturoCaja();
		double tasaActualizacion=Double.parseDouble(datosInversion.getTasaActualizacion());
		while(i<NUM_MAX_PERIODOS) {
			vFlujosActualizados[i]=(Double.parseDouble(vFlujosFuturos[i])/Math.pow(1+tasaActualizacion, i));
			i++;
		}
		
		i=0;
		while(i<NUM_MAX_PERIODOS) {
			totalFlujosFuturos=totalFlujosFuturos+vFlujosActualizados[i++];
		}
		
		VAN=totalFlujosFuturos-Double.parseDouble(datosInversion.getInversionInicial());
		if(VAN>0) {
			resultadoInversion=INVERSION_RENTABLE;
		} else if (VAN<0) {
			resultadoInversion=INVERSION_NO_RENTABLE;			
		} else {
			resultadoInversion=INVERSION_INDIFERENTE;
		}		
		datosInversion.setResultadoInversion(resultadoInversion);
		
		return datosInversion;
	}

	
	public static void main(String[] args) {
		CalculadoraFinanciera calc = new CalculadoraFinanciera();
		DatosUsuario datosInversion=new DatosUsuario();
		
		datosInversion=calc.perdirDatosInversion();
		datosInversion=calc.calcularVAN(datosInversion);
		calc.mostrarResultado(datosInversion);
	}
}



/*
 * RECOMENDACIONES:
 * 
 * 1.- Antes de abordar los partados 2 y 3, es recomendable responder al apartado 1.
 * 
 * 2.- Realiza una ejecución del código para verifcar qué datos son requeridos para su ejecución
 * y cúal es el resultado de la ejecución.
 * 
 * 3.- Estudia detenidamente la estructura del código a través de la pestaña "Outline"
 * (Normalmente situada en el panel de la derecha de la perspectiva Java).
 * Lo importante es entender la estructura del código respodiendo a las siguientes cuestiones:
 * ¿Dónde se recogen los datos del usuario? ¿Dónde se procesan los datos? ¿Dónde se muestran los datos?
 * Las cuestiones: 
 * ¿Cómo hace el código para calcular el resultado? ¿Cómo se piden los datos al ususario?
 * Carecen totalmente de relevancia para realizar el ejercicio.
 * Lo realmente relevante en ete sentido es que te fijes en la cantidad y tipo de datos solicitados 
 * al usuario y, el resultado calculado y devuelto al usuario.
 * 
 * 4.- En base al estudio del punto 1, realiza una pequeña relación de los métodos indicando cuáles de ellos encajan 
 * en la Modelo(M), cuáles en la Vista(V) y, cuáles en el Controlador(C).
 * 
 * 5.- Aborda el ejercicio 2 adaptando la E/S por consola a Swing.
 * Ten en cuenta los comentarios de línea incluídos en el método "perdirDatosInversion". 
 * (Puedes aprovechar y crear ya la clase relacionada con la Vista refactorizando en ella toda la parte
 * de la interfaz de usuario).
 *
 * 6.- Los nombres totalmente cualificados de las clases podrían ser los siguientes: 
 * 		modelo.CalculadoraFinancieraModelo
 * 		vista.CalculadoraFinancieraVista
 * 		controlador.CalculadoraFinancieraControlador
 * 
 * 7.- En caso de que necesites crear otras clases, queda a criterio del alumno la elección tanto de la paquetería 
 * elegida como el nombre de la clase.
 * 
 * 8.- Refactoriza el resto de métodos en las clases recomendadas en el punto 5.
 * 
 * 
 */