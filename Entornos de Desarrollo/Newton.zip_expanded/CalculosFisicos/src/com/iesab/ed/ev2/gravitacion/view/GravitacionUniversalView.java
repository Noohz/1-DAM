package com.iesab.ed.ev2.gravitacion.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.commons.lang3.StringUtils;

import com.iesab.ed.ev2.gravitacion.controller.GravitacionUniversalController;
import com.iesab.ed.ev2.gravitacion.vo.DatosGravitacionalesVo;

public class GravitacionUniversalView implements ActionListener{

	private JFrame vp;
	private JLabel titulo;
	private JLabel masa1;
	private JTextField tMasa1;
	private JLabel masa2;
	private JTextField tMasa2;
	private JLabel distancia;
	private JTextField tDistancia;
	private JTextArea resultado;
	private JButton enviar;
	private JButton limpiar;
	private GravitacionUniversalController controller;

	public GravitacionUniversalView() {
		vp= new JFrame("Cálculos Físicos");
		titulo=new JLabel("Gravitacióin Universal");
		masa1=new JLabel("Masa Cuerpo 1");
		tMasa1=new JTextField();
		masa2=new JLabel("Masa Cuerpo 2");
		tMasa2=new JTextField();
		distancia=new JLabel("Distancia");
		tDistancia=new JTextField();
		resultado=new JTextArea();
		enviar=new JButton("Enviar");
		controller=new GravitacionUniversalController();
		limpiar=new JButton("Limpiar");
		
	}
	
	public void mostrar() {
		vp.add(titulo);
		vp.setSize(500, 500);
		vp.setLayout(null);
		vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vp.setResizable(false);
		vp.setVisible(true);
		
		
		vp.add(masa1);
		vp.add(tMasa1);
		vp.add(masa2);
		vp.add(tMasa2);
		vp.add(distancia);
		vp.add(tDistancia);
		vp.add(resultado);
		vp.add(enviar);
		vp.add(limpiar);
		
		masa1.setBounds(20, 20, 120, 25);
		tMasa1.setBounds(150, 20, 160, 25);
		masa2.setBounds(20, 50, 120, 25);
		tMasa2.setBounds(150, 50, 160, 25);
		distancia.setBounds(20, 80, 120, 25);
		tDistancia.setBounds(150, 80, 160, 25);
		resultado.setBounds(150, 110, 160, 25);
		resultado.setVisible(false); // Inicialmente lo hacemos invisible
		enviar.setBounds(150, 200, 80, 25);
		limpiar.setBounds(250, 200, 80, 25);
		
		enviar.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==enviar) {
			String masa1=tMasa1.getText();
			if (validarEntrada(masa1) &&
					validarEntrada(tMasa2.getText()) &&
					validarEntrada(tDistancia.getText())) {
				// 1.- Llevar datos al VO
				DatosGravitacionalesVo dgVo=new DatosGravitacionalesVo();
				dgVo.setMasa1(masa1);
				dgVo.setMasa2(tMasa2.getText());
				dgVo.setDistancia(tDistancia.getText());
				// 2.- Invocar metodo del controller pasandole el Vo
				DatosGravitacionalesVo resultVo=this.controller.procesarDatos(dgVo);
				// Mostramos el resultado en la ventana
				resultado.setText(resultVo.toString());
				resultado.setVisible(true);
			}
			
		}
	}
	
	private boolean validarEntrada(String entrada) {
		boolean valorRetorno=true;
		if (entrada!=null) {
			String[] vPartes=entrada.split("\\.");
			if ((vPartes.length <= 2) && (vPartes.length > 0)) {
				if (vPartes.length==1) {
					if (!StringUtils.isNumeric(vPartes[0])) {
						valorRetorno=false;
					}
				} else {
					if (!StringUtils.isNumeric(vPartes[0]) ||
							(!StringUtils.isNumeric(vPartes[1]))) {
						valorRetorno=false;
					}					
				}
			} else {
				
			}
			
		}
		
		
		return valorRetorno;
		
	}

	
	
}