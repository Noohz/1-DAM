package com.iesab.ed.ev2.gravitacion.model;

import com.iesab.ed.ev2.gravitacion.vo.DatosGravitacionalesVo;

public class GravitacionUniversalModel {

	public static final Double G=0.0000000000667;
	
	public DatosGravitacionalesVo calcularFuerza(DatosGravitacionalesVo vo) {
		Double fuerza=0.0;
		fuerza= G*(Double.parseDouble(vo.getMasa1())*
				Double.parseDouble(vo.getMasa2()))/
				Math.pow(Double.parseDouble(vo.getDistancia()),2);
		vo.setResultadocalculo(Double.toString(fuerza));
		
		return vo;
	}
}