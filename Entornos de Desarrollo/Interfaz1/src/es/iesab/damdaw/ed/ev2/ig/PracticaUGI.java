package es.iesab.damdaw.ed.ev2.ig;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PracticaUGI implements ActionListener{

	private JFrame ventana;
	private JTextField t1;
	private JButton b1, b2;
	
	public PracticaUGI () {
		// Inicialización de ventana principal.
		ventana = new JFrame();
		
		// Inicialización de componentes.
		t1 = new JTextField();
		b1 = new JButton();
		b2 = new JButton();
	}
	
	public void mostrar () {
		// Parámetros de la ventana.
		ventana.setSize(800, 800); // Dar tamaño a la ventana.
		ventana.setLayout(null);
		ventana.setResizable(false); // Por defecto es false.
		ventana.setVisible(true); // Por defecto es false. Si no es true la ventana no aparecerá.
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // El sistema operativo cerrará la aplicación cuando cerremos la ventana principal.
		
		// Añadir componentes a la ventana.
		ventana.add(t1); // Si no ejecutamos esta linea el texto no aparecerá.
		ventana.add(b1);
		ventana.add(b2);
		
		// Parámetros del texto (t1).
		t1.setText("afskasfoaskas");
		t1.setBounds(50, 150, 200, 30); // Especifica donde va a estar colocado el texto. (Horizontal, Vertical, Ancho, Alto).
		// t1.setEditable(false); // Decide si el texto será editable o no.
		t1.addActionListener(this);
		
		// Parámetros del boton (b1).
		
		b1.setBounds(80, 200, 100, 20);
		b1.setText("Click here!");
		b1.addActionListener(this); // Cuando el boton reciba un evento se va a ejecutar el metodo "actionPerformed"
		
		// Parámetros del boton (b2).
		b2.setBounds(80, 220, 135, 20);
		b2.setText("Rellenar texto");
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Si el evento que se produce lo ha recogido b1 se ejecuta el if.
		if (e.getSource() == b1) {
			JOptionPane.showConfirmDialog(ventana, t1.getText());
		} else if (e.getSource() == t1) {
			JOptionPane.showMessageDialog(ventana, "Un mensaje");
		} else if (e.getSource() == b2) { // Al hacer click en el segundo boton añadirá el texto:
			t1.setText("Aitor");
		}
		
	}
	
}
