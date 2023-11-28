package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.iesab.damdaw1.ed.ev2.DatosUsuario;

import controlador.Controlador;

public class vista implements ActionListener{

	private JFrame vp;
	private JLabel titulo;
	private JLabel inversionInicial;
	private JTextField tinversionInicial;
	private JLabel flujosFuturoCaja;
	private JTextField tflujosFuturoCaja;
	private JLabel tasaActualizacion;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private ButtonGroup actualizacion;
	private JButton resultado;
	private Controlador controller;
	
	
	public vista() {
		
		vp=new JFrame();
		vp.setTitle("Calculadora financiera");
		titulo=new JLabel();
		inversionInicial=new JLabel();
		tinversionInicial= new JTextField();
		flujosFuturoCaja=new JLabel();
		tflujosFuturoCaja=new JTextField();
		tasaActualizacion=new JLabel();
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		rb3 = new JRadioButton();
		actualizacion=new ButtonGroup();
		resultado= new JButton();
		controller = new Controlador();
		
	}
	
	public void mostrar() {
		
		//añadimos los componentes a la ventana principal
		
		vp.add(titulo);
		vp.add(inversionInicial);
		vp.add(tinversionInicial);
		vp.add(flujosFuturoCaja);
		vp.add(tflujosFuturoCaja);
		vp.add(tasaActualizacion);
		vp.add(rb1);
		vp.add(rb2);
		vp.add(rb2);
		vp.add(rb3);
		vp.add(resultado);
		
		
		vp.setBounds(300,90,600,900);
		vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vp.setResizable(false);
	
		inversionInicial.setText("Introduce la version inicial");
		flujosFuturoCaja.setText("Introduce el flujo futuro de caja");
		tasaActualizacion.setText("Selecciona la tasa de actualizacion");
		rb1.setText("0.05");
		rb2.setText("0.07");
		rb3.setText("0.1");
		tasaActualizacion.setText("Resultado");
		resultado.addActionListener(this);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==resultado) {
			String InversionInicial =tinversionInicial.getText();
			DatosUsuario vo=new DatosUsuario();
			
			vo.setInversionInicial(tinversionInicial.getText());
			String [] ffuturocaja= new String [4];
			ffuturocaja[0]=tflujosFuturoCaja.getText();
			ffuturocaja[1]=tflujosFuturoCaja.getText();
			ffuturocaja[2]=tflujosFuturoCaja.getText();
			ffuturocaja[3]=tflujosFuturoCaja.getText();
			ffuturocaja[4]=tflujosFuturoCaja.getText();
			
			vo.setFlujosFuturoCaja(ffuturocaja);
			if(rb1.isSelected()) {
				vo.setTasaActualizacion("0.05");
				
			}else if(rb2.isSelected()) {
				vo.setTasaActualizacion("0.07");
			}else if(rb2.isSelected()) {
				vo.setTasaActualizacion("0.1");
			}
			vo.setResultadoInversion(resultado.getText());
			
		}
		
		
	}
	
	

}
