package ControlCentral;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ControlDelnucleo {

	private static final int ULTIMO_DIA_SEMANA = 7;
	private static final int EFECTIVIDAD_REFRIGERACION = 85;
	public static final int TIEMPO_ESPERA_REFRIGERACION_POR_AIRE = 4000;
	public static final int TEMPERATURA_MINIMA = 1000;
	public static final int TEMPERATURA_FUNCIONAMIENTO_OK = 2500;
	public static final int TEMPERATURA_PRECAUCION_1 = 3000;
	public static final int TEMPERATURA_PRECAUCION_2 = 3500;
	public static final int TEMPERATURA_MAXIMA_PELIGRO = 4000;
	public static final int TEMPERATURA_FUSION_NUCLEO = 5000;
	public static final int TEMPERATURA_DECREMENTO = 800;

	private double temperaturaNucleo;

	private long horaActual() {
		int horaRetorno = 0;
		Calendar calendario = new GregorianCalendar();
		horaRetorno = calendario.get(Calendar.HOUR_OF_DAY);
		return horaRetorno;
	}

	private double temperaturaActual() {
		temperaturaNucleo = Math.random() * TEMPERATURA_FUSION_NUCLEO + TEMPERATURA_MINIMA;
		return temperaturaNucleo;
	}

	private boolean refrigeracionEfectiva() {
		boolean efectividadRetorno;
		int efectividad = (int) (Math.random() * 100 + 1);
		if (efectividad <= EFECTIVIDAD_REFRIGERACION) {
			efectividadRetorno = true;
		} else {
			efectividadRetorno = false;
		}

		return efectividadRetorno;
	}

	private void refrigerarPorAire() throws InterruptedException {
		System.out.println("\n\n\n\t\tPRECAUCIÓN!!!");
		System.out.println("\t\tLA TEMPERATURA ACTUAL DEL NUCLEO ES: " + temperaturaNucleo);
		System.out.println("\t\tPERMITIENDO LA ENTRADA DE AIRE AL REACTOR...");
		if (refrigeracionEfectiva()) {
			temperaturaNucleo = temperaturaNucleo - TEMPERATURA_DECREMENTO;
		}
		Thread.sleep(TIEMPO_ESPERA_REFRIGERACION_POR_AIRE);
		System.out.println("\t\tLA TEMPERATURA ACTUAL DEL NUCLEO ES: " + temperaturaNucleo);
	}

	private void refrigerarPorLiquido() throws InterruptedException {
		System.out.println("\n\n\n\t\tPELIGRO!!!");
		System.out.println("\t\tLA TEMPERATURA ACTUAL DEL NUCLEO ES: " + temperaturaNucleo);
		System.out.println("\t\tPERMITIENDO LA ENTRADA DE AGUA AL REACTOR...");
		if (!refrigeracionEfectiva()) {
			temperaturaNucleo = temperaturaNucleo - TEMPERATURA_DECREMENTO;
		}
		Thread.sleep(4000);
		System.out.println("\t\tLA TEMPERATURA ACTUAL DEL NUCLEO ES: " + temperaturaNucleo);
	}

	private void superRefrigeracion() throws InterruptedException {
		refrigerarPorLiquido();
		refrigerarPorAire();
	}

	public int diaDeLaSemana(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	public void desastreNuclear() {
		System.out.print("\n\n\n");
		System.out.println("\t********************************");
		System.out.println("\t********************************");
		System.out.println("\t*** ¡¡¡¡DESASTRE NUCLEAR!!!! ***");
		System.out.println("\t********************************");
		System.out.println("\t********************************");
	}

	private void controlarNucleo() throws InterruptedException {
		long h = 0; // 12:00 Horas
		int d = 0; // Primer día de la semana.
		boolean salir = false;
		do {
			h = horaActual();
			temperaturaNucleo = temperaturaActual();
			d = diaDeLaSemana(new Date());
			if (temperaturaNucleo < TEMPERATURA_MAXIMA_PELIGRO) {

				if (((d == ULTIMO_DIA_SEMANA) || (d == 1)) || ((h >= 1) || (h <= 6))) {
					if (temperaturaNucleo > TEMPERATURA_PRECAUCION_2) {
						refrigerarPorAire();
					}
				} else if (((d >= 1) && (d <= 5)) || ((h >= 7) && (h <= 23))) {
					if (temperaturaNucleo > TEMPERATURA_PRECAUCION_2) {
						refrigerarPorLiquido();
					}
					if (temperaturaNucleo > TEMPERATURA_PRECAUCION_1) {
						refrigerarPorAire();
					}
				}
			} else {
				superRefrigeracion();
			}
			if (temperaturaNucleo >= TEMPERATURA_FUSION_NUCLEO) {
				desastreNuclear();
				salir = true;
			}
		} while (!salir);

	}

	public static void main(String[] args) throws InterruptedException {
		ControlDelnucleo ctrl = new ControlDelnucleo();
		ctrl.controlarNucleo();
	}

}

/*
 * RESPONDE A LAS SIGUIENTES PREGUNTAS EN UN DOC:
 * =====================================================================================================
 * 1) Modifica el código de la clase para que cumpla con las buenas práticas de codificación Java.
 * Las buenas prácticas mínimas a tener en cuenta en este ejercicio son las siguientes:
 * 1.- Toda clase Java debe estar en un paquete diferente al paquete por defecto
 * 2.- Nombre de la clase, de los métodos y los campos en 'Camelcase'
 * 3.- Nombre de las constantes en 'SNAKE_CASE'
 * 4.- En el código no deben existir 'números mágicos'
 * 5.- El código debe estar convenientemente formateado
 * 
 * NOTA: Si no sabes que son los 'números mágicos' o 'SNAKE_CASE', investiga sobre ellos en internet
 * =====================================================================================================
 * 2) Las especificaciones de funcionamiento del sistema de refrigeración del núcleo son las siguientes:
 * La refrigeración por aire debe entrar en funcionamiento los fines de semana entre la 1 y las 6 de la
 * mañana. Los días de diario entre 7 de la mañana y las 11 de la noche y siempre que el nucleo tenga una temperatura
 * al menos de 3000 grados centígrados. Cuando exista peligro de fusión del núcleo.
 * 
 * Por su parte, La refrigeración líquida debe entrar en funcionamiento los días de diario entre las 7 y las 11 de la
 * noche, cuando la temperatura sea superior a 3500 grados centígrados. Cuando exista peligro de fusión del núcleo.
 * 
 * Teniendo en cuenta las especificaciones anteriores, detecta con ayuda de la herramienta de depuración de Eclipse
 * los errores lógicos que impiden el correcto funcionamiento del sistema de refrigeración del reactor nuclear.
 * =====================================================================================================
 * 3) ¿Qué pasa cuando...
 * 	a) t=3500, d=x, h=y?
 * 	b) t=3000, d=[1, 2, 3, 4, 5], h=5?
 * 	c) t=4000, d=x, h=18?
 *	d) t=3900, d=[1, 2, 3, 4, 5], h=10?
 * 
 * Para cada uno de los casos anteriores con ayuda de la herramienta de depuración indica (suponiendo que la 
 * refrigeración es siempre efectiva) qué refrigeración es la que entra en funcionamiento y cómo queda finalmente
 * la temperatura del nucleo después del funcionamiento de la refrigeración.
 * a)
 * b)
 * c)
 * d)
 * Copia un pantallazo en el que se vean los valores de las variables antes y después de la refrigeración
 * =====================================================================================================
 * 4) Para el código:  "int efectividad = (int) (Math.random() * 100 + 1)":
 * 	a) ¿Qué fallo lógico detectas en esa línea?
 * 	b) Modifica la línea anterior para evitar el fallo detectado y además cumpliendo con las buenas prácticas
 * de codificación Java.
 * =====================================================================================================
 * 5) ¿El bucle do-while es infinito? ¿En que condiciones se sale del bucle? Fuerza el valor de las variables para salir del bucle.
 * Demuestralo con un pantallazo en el que se muestre la posición de la traza de ejecución y el valor de las vaiables
 * =====================================================================================================
 * 
 * Entrega la tarea en classroom en un PDF.
 *  
 */

