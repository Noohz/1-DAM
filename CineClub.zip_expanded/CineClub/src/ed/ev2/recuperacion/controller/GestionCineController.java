package ed.ev2.recuperacion.controller;

import ed.ev2.recuperacion.cine.GestionCine;
import ed.ev2.recuperacion.view.GestionCineView;
import ed.ev2.recuperacion.vo.ButacaVo;

public class GestionCineController {

	private static GestionCineView gcV;
	private static GestionCine gM;
	
	public static void main(String[] args) {
		
		gcV=new GestionCineView();
		gM=new GestionCine();
		gcV.mostrar();

	}	
}
