package org.iesab.damdaw1.ed.ev2;

import java.util.Arrays;

/**
 * Clase para almacenar los datos introducidos por el usuario.
 * 
 * @author A bad programmer
 * @Version 0.1
 *
 */
public class DatosUsuario {
	/**
	 * Atributo que almacena la cantidad inicial de la inversion
	 */
	private String inversionInicial;

	/**
	 * Atributo que almacena los flujos futuros de caja de la inversión
	 */
	private String[] flujosFuturoCaja;
	
	/**
	 * Atributo que almacena la tasa de actualización de los flujos futuros de caja
	 */
	private String tasaActualizacion;
	
	/**
	 * Atributo que almacena el resultado previsto de la inversión.
	 * Este valor se calcula a partir del VAN de la inversión.
	 */
	private String resultadoInversion;
	/**
	 * @return the vFlujosFuturoCaja
	 */
	public String[] getFlujosFuturoCaja() {
		return flujosFuturoCaja;
	}
	/**
	 * @param vFlujosFuturoCaja the vFlujosFuturoCaja to set
	 */
	public void setFlujosFuturoCaja(String[] vFlujosFuturoCaja) {
		this.flujosFuturoCaja = vFlujosFuturoCaja;
	}
	/**
	 * @return the inversionInicial
	 */
	public String getInversionInicial() {
		return inversionInicial;
	}
	/**
	 * @param inversionInicial the inversionInicial to set
	 */
	public void setInversionInicial(String inversionInicial) {
		this.inversionInicial = inversionInicial;
	}
	/**
	 * @return the tasaActualizacion
	 */
	public String getTasaActualizacion() {
		return tasaActualizacion;
	}
	/**
	 * @param tasaActualizacion the tasaActualizacion to set
	 */
	public void setTasaActualizacion(String tasaActualizacion) {
		this.tasaActualizacion = tasaActualizacion;
	}
	/**
	 * @return the resultadoInversion
	 */
	public String getResultadoInversion() {
		return resultadoInversion;
	}
	/**
	 * @param resultadoInversion the resultadoInversion to set
	 */
	public void setResultadoInversion(String resultadoInversion) {
		this.resultadoInversion = resultadoInversion;
	}
	
	
	
	@Override
	public String toString() {
		return "DatosUsuario [inversionInicial=" + inversionInicial + ", flujosFuturoCaja="
				+ Arrays.toString(flujosFuturoCaja) + ", tasaActualizacion=" + tasaActualizacion
				+ ", resultadoInversion=" + resultadoInversion + "]";
	}
	
	
	

}
