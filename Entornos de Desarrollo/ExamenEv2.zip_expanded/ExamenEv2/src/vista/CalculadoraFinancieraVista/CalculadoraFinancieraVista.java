package vista.CalculadoraFinancieraVista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class CalculadoraFinancieraVista implements ActionListener{

	// Ventana Principal
	private JFrame vp;
	
	// Titulo
	private JLabel title;
	
	// Inversion inicial
	private JLabel inversionInicial;
	private JTextField iInicial;
	
	// Flujo de caja
	private JLabel fcaja1;
	private JTextField fc1;
	
	// Flujo de caja 2
	private JLabel fcaja2;
	private JTextField fc2;
	
	// Flujo de caja 3
	private JLabel fcaja3;
	private JTextField fc3;
	
	// Flujo de caja 4
	private JLabel fcaja4;
	private JTextField fc4;
	
	// Flujo de caja 5
	private JLabel fcaja5;
	private JTextField fc5;
	
	// Tasa de actualización
	private JLabel tActualizacion;
	private JComboBox tAct;
	private String [] tA = {"0.05", "0.07", "0.1"};
	
	// Boton Calcular
	private JButton calcular;
	
	public CalculadoraFinancieraVista () {
		
		// Datos de la ventana
		vp = new JFrame();
		
		// Titulo
		title = new JLabel();
		
		// Inversion inicial
		inversionInicial = new JLabel();
		iInicial = new JTextField();
		
		// Flujo de caja 1
		fcaja1 = new JLabel();
		fc1 = new JTextField();
		
		// Flujo de caja 2
		fcaja2 = new JLabel();
		fc2 = new JTextField();
		
		// Flujo de caja 3
		fcaja3 = new JLabel();
		fc3 = new JTextField();
		
		// Flujo de caja 4
		fcaja4 = new JLabel();
		fc4 = new JTextField();
		
		// Flujo de caja 5
		fcaja5 = new JLabel();
		fc5 = new JTextField();
		
		// Tasa de actualización
		tActualizacion = new JLabel();
		tAct = new JComboBox(tA);
		
		// Boton calcular
		calcular = new JButton();
	}
	
	public void Mostrar () {
		
		vp.add(title);
		
		vp.add(inversionInicial);
		vp.add(iInicial);
		
		vp.add(fcaja1);
		vp.add(fc1);
		
		vp.add(fcaja2);
		vp.add(fc2);
		
		vp.add(fcaja3);
		vp.add(fc3);
		
		vp.add(fcaja4);
		vp.add(fc4);
		
		vp.add(fcaja5);
		vp.add(fc5);
		
		vp.add(tActualizacion);
		vp.add(tAct);
		
		vp.add(calcular);
		
		
		// Ventana principal
		vp.setBounds(300, 90, 900, 600);
		vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vp.setResizable(false);
		vp.setLayout(null);
		vp.setTitle("Calculadora VAN");
		
		// Título de la ventana
		title.setText("Calculadora VAN");
		title.setFont(new Font(Font.SERIF, Font.PLAIN, 22 ));
		title.setBounds(300, 30, 300, 30);
		
		// Inversion inicial
		inversionInicial.setFont(new Font("Arial", Font.PLAIN, 15));
		inversionInicial.setSize(100, 20);
		inversionInicial.setLocation(100, 100);
		inversionInicial.setText("Inversion Inicial");
		
		// Flujo de caja 1
		fcaja1.setFont(new Font("Arial", Font.PLAIN, 15));
		fcaja1.setSize(100, 20);
		fcaja1.setLocation(100, 150);
		fcaja1.setText("Flujo de caja 1");
		
		// Flujo de caja 2
		fcaja2.setFont(new Font("Arial", Font.PLAIN, 15));
		fcaja2.setSize(100, 20);
		fcaja2.setLocation(100, 180);
		fcaja2.setText("Flujo de caja 2");
		
		// Flujo de caja 3
		fcaja3.setFont(new Font("Arial", Font.PLAIN, 15));
		fcaja3.setSize(100, 20);
		fcaja3.setLocation(100, 210);
		fcaja3.setText("Flujo de caja 3");
				
		// Flujo de caja 4
		fcaja4.setFont(new Font("Arial", Font.PLAIN, 15));
		fcaja4.setSize(100, 20);
		fcaja4.setLocation(100, 230);
		fcaja4.setText("Flujo de caja 4");
		
		// Flujo de caja 5
		fcaja2.setFont(new Font("Arial", Font.PLAIN, 15));
		fcaja2.setSize(100, 20);
		fcaja2.setLocation(100, 250);
		fcaja2.setText("Flujo de caja 5");
		
		// Tasa de actualización
		tActualizacion.setFont(new Font("Arial", Font.PLAIN, 15));
		tActualizacion.setSize(100, 20);
		tActualizacion.setLocation(100, 280);
		tActualizacion.setText("Tasa de actualización");
		
		tAct.setFont(new Font("Arial", Font.PLAIN, 15));
		tAct.setSize(50, 20);
		tAct.setLocation(260, 300);
		
		vp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}


   