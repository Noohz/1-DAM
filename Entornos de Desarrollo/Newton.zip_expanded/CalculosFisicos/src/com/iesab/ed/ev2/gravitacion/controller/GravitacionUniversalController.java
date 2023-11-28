package com.iesab.ed.ev2.gravitacion.controller;

import com.iesab.ed.ev2.gravitacion.model.GravitacionUniversalModel;
import com.iesab.ed.ev2.gravitacion.view.GravitacionUniversalView;
import com.iesab.ed.ev2.gravitacion.vo.DatosGravitacionalesVo;

public class GravitacionUniversalController {

	private static GravitacionUniversalView guV;
	private static GravitacionUniversalModel guM;
	
	public static void main(String[] args) {
		guV=new GravitacionUniversalView();
		guM=new GravitacionUniversalModel();
		guV.mostrar();
		
	}
	
	public DatosGravitacionalesVo procesarDatos(DatosGravitacionalesVo datos) {
		DatosGravitacionalesVo voAux = guM.calcularFuerza(datos);
		return voAux;
	}

}




