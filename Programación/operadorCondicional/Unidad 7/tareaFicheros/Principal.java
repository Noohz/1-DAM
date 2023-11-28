package tareaFicheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

public class Principal {

	public static void main(String[] args) {
		
		try {
			
			FileReader f1 = new FileReader("/home/diurno/Escritorio/Unidad 7 - Programacion/tareaFicheros.txt");
			
			BufferedReader bf1 = new BufferedReader(f1);
			
			String linea;
			
			while ((linea = bf1.readLine()) != null) {
				
				String[] cAlumno = linea.split("#");
				String a1 = cAlumno[0];
				int a2 = Integer.parseInt(cAlumno[1]);
	            double a3 = Double.parseDouble(cAlumno[2]);
	            boolean a4 = Boolean.parseBoolean(cAlumno[3]);
				
	            ClaseAlumno ca1 = new ClaseAlumno (a1, a2, a3, a4);
                System.out.println(ca1);
                
	            Serializar(ca1);
	            Deserializar(ca1);
                
			}
			
			
		} catch (IOException e) {
			
			System.err.println("Error.. " + e.getMessage());
			
			System.exit(0);
			
		}	
	}
	
	public static void Serializar (ClaseAlumno ca) {
		
		// Serialización
		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/tareaFicheros.txt"));

			oos.writeObject(oos);
			oos.close();

		} catch (IOException ex) {

			System.err.println("Error al serializar.. " + ex.getMessage());

			System.exit(0);

		}
		
	}
	
	public static void Deserializar (ClaseAlumno ca) {
		
		// Deserialización
		try {
			
			ClaseAlumno a2;
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/tareaFicheros"));
			
				a2 = (ClaseAlumno)ois.readObject();
				ois.close();
				
			System.out.println("Objeto 2: " +a2);
			
		} catch (IOException | ClassNotFoundException ex) {
			
			System.err.println("Error al deserializar.. " + ex.getMessage());
			
			System.exit(0);
			
		}		
		
	}
}
