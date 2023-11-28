package com.iesab.ed.ev2.gravitacion.vo;

public class DatosGravitacionalesVo {
	private String masa1;
	private String masa2;
	private String distancia;
	private String resultadoCalculo;
	@Override
	public String toString() {
		return this.resultadoCalculo + " " + " Newtons";
	}
	/**
	 * @return the masa1
	 */
	public String getMasa1() {
		return masa1;
	}
	/**
	 * @param masa1 the masa1 to set
	 */
	public void setMasa1(String masa1) {
		this.masa1 = masa1;
	}
	/**
	 * @return the masa2
	 */
	public String getMasa2() {
		return masa2;
	}
	/**
	 * @param masa2 the masa2 to set
	 */
	public void setMasa2(String masa2) {
		this.masa2 = masa2;
	}
	/**
	 * @return the distancia
	 */
	public String getDistancia() {
		return distancia;
	}
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	/**
	 * @return the resultadocalculo
	 */
	public String getResultadocalculo() {
		return resultadoCalculo;
	}
	/**
	 * @param resultadocalculo the resultadocalculo to set
	 */
	public void setResultadocalculo(String resultadocalculo) {
		resultadoCalculo = resultadocalculo;
	}
}
