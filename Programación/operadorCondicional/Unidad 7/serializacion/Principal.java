package serializacion;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		
		// Serializar el objeto
		try {
			
			Alumno a1 = new Alumno ("Aitor", "Ramos", "1º DAMW");
			
				System.out.println("#** Datos del alumno **# \n" +a1);
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/pruebaSerializacion.txt"));
			
			oos.writeObject(a1);
			oos.close();
			
		} catch (IOException e) {
			
			System.err.println("si" +e.getMessage());
			
			System.exit(0);
			
		}

		// Deserialización del objeto
		try {
			
			Alumno a2;
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/pruebaSerializacion.txt"));
			
			a2 = (Alumno)ois.readObject();
			
			ois.close();
			
			System.out.println("#** Datos del alumno **# \n" +a2);
			
		} catch (IOException | ClassNotFoundException e) {
			
			System.err.println(e.getMessage());
			
			System.exit(0);
			
		}
		
	}
	
}