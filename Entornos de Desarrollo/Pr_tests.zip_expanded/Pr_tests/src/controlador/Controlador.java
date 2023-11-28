package controlador;

import org.iesab.damdaw1.ed.ev2.DatosUsuario;

import modelo.Model;
import vista.vista;

public class Controlador {
	
	private Model registroModel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vista view =new vista();
		
		
		
	}
	public DatosUsuario vo (DatosUsuario vo) {
		DatosUsuario datosretorno = null;
		vista registro= new vista();
		registro.mostrar();
		return datosretorno;
	}
	
	
}
