package com.empresa.registro.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.empresa.registro.vo.DatosRegistroVO;

public class DatosFormView implements ActionListener{
	
	// Ventana principal
	private JFrame vp;
	
	// Titulo
	private JLabel title;
	
	// Nombre
	private JLabel name;
	private JTextField tname;
	
	// Teléfono
	private JLabel tfno;
	private JTextField ttfno;
	
	// Género
	private JLabel gender; 
	private JRadioButton Masculino;
	private JRadioButton Femenino;
	private ButtonGroup grupoGeneros;
	
	// Año de nacimiento
	private JLabel dNacimiento;
	private JComboBox dia;
	private JComboBox mes;
	private JComboBox anio;
	
	// Dirección
	private JLabel dir;
	private JTextArea tdir;
	
	// Condiciones de uso
	private JCheckBox term;
	
	// Boton de envio
	private JButton envio;
	
	// Boton de reset
	private JButton limpiar;
	
	// Ventana de salida
	private JTextArea tSalida;
	
	private String [] vDias = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	
	private String [] vMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre",};
	
	private String [] vAnnios = {"2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023",};
	
	// Constructor
	public DatosFormView () {
		
		// Datos sobre la ventana
		vp = new JFrame();
		
		title = new JLabel();
		
		name = new JLabel();
		tname = new JTextField();
		
		tfno = new JLabel();
		ttfno = new JTextField();
		
		gender = new JLabel();
		Masculino = new JRadioButton();
		Femenino = new JRadioButton();
		grupoGeneros = new ButtonGroup();
		
		dNacimiento = new JLabel();
		dia = new JComboBox(vDias);
		mes = new JComboBox(vMeses);
		anio = new JComboBox(vAnnios);
		
		dir = new JLabel();
		tdir = new JTextArea();
		
		term = new JCheckBox();
		
		envio = new JButton();
		
		limpiar = new JButton();
		
		tSalida = new JTextArea();
	}
	
	public void mostrar () {
		
		// Añadir los elementos para que se muestren.
		vp.add(title);
		vp.add(name);
		vp.add(tname);
		vp.add(tfno);
		vp.add(ttfno);
		vp.add(gender);
		vp.add(Masculino);
		vp.add(Femenino);
		vp.add(dNacimiento);
		vp.add(dia);
		vp.add(mes);
		vp.add(anio);
		vp.add(dir);
		vp.add(tdir);
		vp.add(term);
		vp.add(envio);
		vp.add(limpiar);
		vp.add(tSalida);
		
		// Ventana principal
		vp.setBounds(300, 90, 900, 600);
		vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vp.setResizable(false);
		vp.setLayout(null);
		vp.setTitle("Formulario de registro");
		
		// Título de la ventana
		title.setText("Formulario de registro");
		title.setFont(new Font(Font.SERIF, Font.PLAIN, 22 ));
		title.setBounds(300, 30, 300, 30);
		
		// Nombre
		name.setFont(new Font("Arial", Font.PLAIN, 15));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		name.setText("Nombre");
		
		// Recuadro del nombre
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		
		// Teléfono
		tfno.setFont(new Font("Arial", Font.PLAIN, 15));
		tfno.setSize(100, 20);
		tfno.setLocation(100, 150);
		tfno.setText("Teléfono");
		
		// Recuadro del teléfono
		ttfno.setFont(new Font("Arial", Font.PLAIN, 15));
		ttfno.setSize(150, 20);
		ttfno.setLocation(200, 150);
		
		// Género
		gender.setFont(new Font("Arial", Font.PLAIN, 15));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		gender.setText("Género");
		
		// Opción de género Masculino
		Masculino.setFont(new Font("Arial", Font.PLAIN, 15));
		Masculino.setSize(100, 20);
		Masculino.setLocation(200, 200);
		Masculino.setSelected(true);
		Masculino.setText("Masculino");
		
		// Opción de género Femenino
		Femenino.setFont(new Font("Arial", Font.PLAIN, 15));
		Femenino.setSize(100, 20);
		Femenino.setLocation(305, 200);
		Femenino.setSelected(false);
		Femenino.setText("Femenino");
		
		// grupoGeneros
		grupoGeneros.add(Masculino);
		grupoGeneros.add(Femenino);
		
		// Fecha de nacimiento
		dNacimiento.setFont(new Font("Arial", Font.PLAIN, 15));
		dNacimiento.setSize(160, 20);
		dNacimiento.setLocation(100, 250);
		dNacimiento.setText("Fecha de nacimiento");
				
		// Dia | Fecha de nacimiento
		dia.setFont(new Font("Arial", Font.PLAIN, 15));
		dia.setSize(50, 20);
		dia.setLocation(260, 250);
		
		// Mes | Fecha de nacimiento
		mes.setFont(new Font("Arial", Font.PLAIN, 15));
		mes.setSize(115, 20);
		mes.setLocation(315, 250);
		
		// Año | Fecha de nacimiento
		anio.setFont(new Font("Arial", Font.PLAIN, 15));
		anio.setSize(65, 20);
		anio.setLocation(435, 250);
		
		// Dirección
		dir.setFont(new Font("Arial", Font.PLAIN, 15));
		dir.setSize(100, 20);
		dir.setLocation(100, 300);
		dir.setText("Dirección");
		
		// Area de texto de dirección
		tdir.setFont(new Font("Arial", Font.PLAIN, 15));
		tdir.setSize(200, 75);
		tdir.setLocation(200, 300);
		tdir.setLineWrap(true);
		
		// Terminos y Servicios
		term.setText("Aceptar los terminos y servicios");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(260, 20);
		term.setLocation(150, 400);
		
		// Boton Enviar
		envio.setText("Enviar");
		envio.setFont(new Font("Arial", Font.PLAIN, 15));
		envio.setSize(100, 20);
		envio.setLocation(150, 450);
		
		// Boton limpiar
		limpiar.setText("Limpiar");
		limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		limpiar.setSize(100, 20);
		limpiar.setLocation(270, 450);
		limpiar.addActionListener(this);
		
		// Salida
		tSalida.setFont(new Font("Arial", Font.PLAIN, 15));
		tSalida.setSize(300, 400);
		tSalida.setLocation(510, 100);
		tSalida.setLineWrap(true);
		tSalida.setEditable(false);
				
		
		vp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == limpiar) {
			
			this.limpiarFormulario();
			
		} else if (e.getSource() == envio) {
			
			if (this.validarFormulario()) {
				
				DatosRegistroVO datosUsuario = new DatosRegistroVO();
				datosUsuario.setNombre(tname.getText());
				datosUsuario.setdNac(vDias[dia.getSelectedIndex()]);
				datosUsuario.setmNac(vMeses[mes.getSelectedIndex()]);
				datosUsuario.setaNac(vAnnios[anio.getSelectedIndex()]);
				datosUsuario.setDireccion(tdir.getText());
				datosUsuario.setTfno(ttfno.getText());
				
			} else {
				JOptionPane.showMessageDialog(vp, "Se deben aceptar los terminos y condiciones");
			}
						
		}
		
	}
	
	private void limpiarFormulario () {
		
		tname.setText("");
		ttfno.setText("");
		dia.setSelectedIndex(0);
		mes.setSelectedIndex(0);
		anio.setSelectedIndex(0);
		Masculino.setSelected(true);
		Femenino.setSelected(false);
		tdir.setText("");
		term.setSelected(false);
		tSalida.setText("");
	}
	
	private boolean validarFormulario () {
		
		boolean valorRetorno = true;
		
		if (!term.isSelected()) {
			valorRetorno = false;
		}
		
		return valorRetorno;		
	}
	
}
