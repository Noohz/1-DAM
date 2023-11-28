package juego.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import juego.model.ParesNonesModel;

public class ParesNonesView implements ActionListener {

	private JFrame ventanaPrincipal;
	private JLabel l1;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private ButtonGroup bg;
	private JButton b1;
	
	public static final String TITULO_VENTANA = "Juego Pares o Nones";
	public static final Integer ANCHO_VENTANA = 400;
	public static final Integer ALTO_VENTANA = 400;
	public static final String TEXTO_OK = "¡Correcto, has acertado!";
	
	
	/**
	 * Constructor parametrizado.
	 */
	public ParesNonesView () {
		ventanaPrincipal = new JFrame();
		l1 = new JLabel();
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		bg = new ButtonGroup();
		b1 = new JButton();
	}
	
	public void Mostrar () {
		// Parámetros de la ventana.
		
		ventanaPrincipal.setTitle(TITULO_VENTANA);
		ventanaPrincipal.setSize(ANCHO_VENTANA, ALTO_VENTANA);
		ventanaPrincipal.setLayout(null);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setVisible(true);
		
		// Añadir componentes a la ventana.
		ventanaPrincipal.add(l1);
		ventanaPrincipal.add(rb1);
		ventanaPrincipal.add(rb2);
		ventanaPrincipal.add(b1);
		
		// Parámetros de los componentes.
		l1.setBounds(50, 50, 350, 50);
		l1.setFont(new Font (Font.SANS_SERIF, Font.BOLD, 20));
		l1.setText("¿Pares o Nones?");
		rb1.setBounds(60, 100, 80, 20);
		rb1.setText("Pares");
		rb2.setBounds(135, 100, 100, 20);
		rb2.setText("Impares");
		bg.add(rb1);
		bg.add(rb2);
		b1.setText("Comprobar");
		b1.setBounds(80, 200, 115, 20);
		b1.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg ="";
		if (e.getSource() == b1) {
			
			if (validarForm()) {
		}	
		int n = ParesNonesModel.obtenerNumAleatorio();
		if (e.getSource() == b1) {
			if (ParesNonesModel.comprobarParImpar(n)) {
				// N es PAR.
				
				if (rb1.isSelected()) {
					// Mostrar mensaje de éxito.
					msg = TEXTO_OK;
				} else {
					// Mensaje intnetalo de nuevo.
					msg = "Lo sentimos! Intentalo de nuevo.";
				}
				
			} else {
				// N es IMPAR.
				if (rb2.isSelected()) {
					// Mensaje: Éxito.
				} else {
					// Mensaje: Intentalo de nuevo.
				}
				
			}
			
			this.limpiarPantalla();
			JOptionPane.showMessageDialog(this.ventanaPrincipal, msg);
			 
		}
		
		private boolean validarForm() {
			boolean valorRetorno = true;
			
			if (!rb1.isSelected() && !rb2.isSelected()) {
				
			}
			
			return valorRetorno;
		}
	
		private void limpiarPantalla () {
			bg.clearSelection();
		}
	}
	
}