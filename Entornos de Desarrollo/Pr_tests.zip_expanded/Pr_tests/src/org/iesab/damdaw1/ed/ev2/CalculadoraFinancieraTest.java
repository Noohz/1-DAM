package org.iesab.damdaw1.ed.ev2;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class CalculadoraFinancieraTest {

	@Test
	void test1() {
		// Preparación
		CalculadoraFinanciera cf = new CalculadoraFinanciera();
		DatosUsuario datUsr=new DatosUsuario();
		datUsr.setInversionInicial("20000");
		datUsr.setFlujosFuturoCaja(new String[] {"3000", "4000", "100", "5000", "200"});
		datUsr.setTasaActualizacion(CalculadoraFinanciera.TASA_ACTUALIZACION_1);
		// Invocación
		DatosUsuario du = cf.calcularVAN(datUsr);
		// Comprobación
		assertTrue(du.getResultadoInversion().equalsIgnoreCase(CalculadoraFinanciera.INVERSION_NO_RENTABLE));
	}

	@Test
	void test2() {
		// Preparación
		CalculadoraFinanciera cf = new CalculadoraFinanciera();
		DatosUsuario datUserTest2 = new DatosUsuario();
		datUserTest2.setInversionInicial("15000");
		datUserTest2.setFlujosFuturoCaja(new String[] {"3000", "4000", "100", "5000", "200"});
		datUserTest2.setTasaActualizacion(CalculadoraFinanciera.TASA_ACTUALIZACION_2);
		// Invocación
		DatosUsuario du = cf.calcularVAN(datUserTest2);
		// Comprobación
		assertTrue(du.getResultadoInversion().equalsIgnoreCase(CalculadoraFinanciera.INVERSION_NO_RENTABLE));
	}
	
	@Test
	void test3() {
		// Preparación
		CalculadoraFinanciera cf = new CalculadoraFinanciera();
		DatosUsuario datUserTest3 = new DatosUsuario();
		datUserTest3.setInversionInicial("5000");
		datUserTest3.setFlujosFuturoCaja(new String[] {"3000", "4000", "100", "5000", "200"});
		datUserTest3.setTasaActualizacion(CalculadoraFinanciera.TASA_ACTUALIZACION_1);
		// Invocación
		DatosUsuario du = cf.calcularVAN(datUserTest3);
		// Comprobación
		assertTrue(du.getResultadoInversion().equalsIgnoreCase(CalculadoraFinanciera.INVERSION_RENTABLE));
	}
	
}
