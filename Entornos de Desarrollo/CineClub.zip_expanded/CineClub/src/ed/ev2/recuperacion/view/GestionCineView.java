package ed.ev2.recuperacion.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import ed.ev2.recuperacion.cine.GestionCine;
import ed.ev2.recuperacion.vo.ButacaVo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class GestionCineView {

	private JFrame frmCine;
	private JTextField txtFila;
	private JTextField txtAsiento;
    private static final int NUM_FILAS = GestionCine.FILAS;
    private static final int NUM_ASIENTOS = GestionCine.ASIENTOS;
    private GestionCine gestionCine;
    private JLabel[][] asientos;
    
	public GestionCineView() {
		gestionCine = new GestionCine();
        asientos = new JLabel[NUM_FILAS][NUM_ASIENTOS];
        mostrar();
	}

	public void mostrar() {
		frmCine = new JFrame();
		frmCine.setTitle("Cine");
		frmCine.setBounds(100, 100, 250, 288);
		frmCine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCine.getContentPane().setLayout(null);
		frmCine.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Introduce la fila");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 11, 89, 14);
		frmCine.getContentPane().add(lblNewLabel);
		
		txtFila = new JTextField();
		txtFila.setBounds(149, 8, 22, 20);
		frmCine.getContentPane().add(txtFila);
		txtFila.setColumns(10);
		
		JLabel lblIntroduceElAsiento = new JLabel("Introduce el asiento");
		lblIntroduceElAsiento.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntroduceElAsiento.setBounds(10, 41, 119, 14);
		frmCine.getContentPane().add(lblIntroduceElAsiento);
		
		txtAsiento = new JTextField();
		txtAsiento.setColumns(10);
		txtAsiento.setBounds(149, 39, 22, 20);
		frmCine.getContentPane().add(txtAsiento);
		
		/* Boton "Reservar" y su actionListener */
		JButton btnNewButton = new JButton("Reservar");
		btnNewButton.setBounds(10, 170, 89, 23);
		frmCine.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int fila = Integer.parseInt(txtFila.getText());
				int asiento = Integer.parseInt(txtAsiento.getText());
				ButacaVo butaca = new ButacaVo();
				butaca.setFila(fila);
				butaca.setAsiento(asiento);
				boolean reservada = GestionCine.reservarButaca(butaca);
				if (reservada) {
					JOptionPane.showMessageDialog(null, "Butaca reservada con éxito");
				} else {
					JOptionPane.showMessageDialog(null, "La butaca ya está ocupada");
				}
			}
		});
		
		/* Boton "Devolver" y su actionListener */ 
		JButton btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(139, 170, 89, 23);
		frmCine.getContentPane().add(btnDevolver);
		btnDevolver.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int fila = Integer.parseInt(txtFila.getText());
				int asiento = Integer.parseInt(txtAsiento.getText());
		        ButacaVo butacaSeleccionada = new ButacaVo();
		        butacaSeleccionada.setFila(fila);
		        butacaSeleccionada.setAsiento(asiento);
		        boolean devuelta = gestionCine.devolverButaca(butacaSeleccionada);
		        if (devuelta) {
		            JOptionPane.showMessageDialog(null, "La butaca ha sido devuelta con éxito.");
		        } else {
		            JOptionPane.showMessageDialog(null, "La butaca no se puede devolver.");
		        }
		    }
		});
		
		/* Boton "Mostrar Reservadas" y su actionListener */
		JButton btnMostrarOcupacion = new JButton("Mostrar Reservadas");
		btnMostrarOcupacion.setBounds(42, 204, 151, 23);
		frmCine.getContentPane().add(btnMostrarOcupacion);
		btnMostrarOcupacion.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String[][] matrizOcupacion = gestionCine.generarMatrizOcupacion();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < NUM_FILAS; i++) {
					for (int j = 0; j < NUM_ASIENTOS; j++) {
						sb.append(matrizOcupacion[i][j]).append("  ");
					}
					sb.append("\n");
				}
				JOptionPane.showMessageDialog(null, sb.toString(), "Ocupación del cine",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCineView window = new GestionCineView();
					window.frmCine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
