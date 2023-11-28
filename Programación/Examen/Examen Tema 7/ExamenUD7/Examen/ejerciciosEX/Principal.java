package ejerciciosEX;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Aitor Ramos Sánchez
 *
 */

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Principal> datosFichero = new ArrayList<>();
		
		int menu;
		
		do {
			
			System.out.println("#- Menú -#");
			System.out.println("1.- Guardar datos en el fichero.");
			System.out.println("2.- Leer datos fichero.");
			System.out.println("3.- Mostrar datos ArrayList.");
			System.out.println("4.- Serializar.");
			System.out.println("5.- Deserializar.");
			System.out.println("6.- Mostrar datos fichero texto.");
			System.out.println("Para salir del menú introduce -1.");
			menu = sc.nextInt();
			sc.nextLine();
			
			
			switch (menu) {
			
				case 1:
					guardarDatosFichero();
					break;
				case 2:
					leerDatosFichero(datosFichero);
					break;
				case 3:
					mostrarDatos(datosFichero);
					break;
				case 4:
					serializar(datosFichero);
					break;
				case 5:
					deserializar();
					break;
				case 6:
					break;
			}
			
		} while (menu == -1);
		
			System.err.println("Fin del menú..");
	}

	public static void guardarDatosFichero () {
		
		Scanner gdf = new Scanner (System.in);
		String gdfMatricula;
		String gdfColor;
		int gdfNumPlazas;
		String gdfNombConductor;
		int gdfAnyosExperiencia;
		
		
		
		try {			
			
			FileWriter fw1 = new FileWriter("/home/diurno/ExamenUD7/datosFichero.txt");
			
			BufferedWriter bfw1 = new BufferedWriter(fw1);
			
			for (int i = 0; i <= 4; i++ ) {
				
				System.out.println("Introduce la matrícula del vehículo: ");
				gdfMatricula = gdf.nextLine();
				
				System.out.println("Introduce el color del vehículo: ");
				gdfColor = gdf.nextLine();
				
				System.out.println("Introduce el número de plazas del vehículo: ");
				gdfNumPlazas = gdf.nextInt();
				gdf.nextLine();
				
				System.out.println("Introduce el nombre del conductor del vehículo: ");
				gdfNombConductor = gdf.nextLine();
				
				System.out.println("Introduce los años de experiencia del conductor del vehículo: ");
				gdfAnyosExperiencia = gdf.nextInt();
				gdf.nextLine();
			}
			
			
		} catch (IOException e) {
			
			System.err.println("Error..." +e.getMessage());
			
			System.exit(0);

			
		}		
	}
	
	public static void leerDatosFichero (ArrayList<Principal> datosFichero) {
		
		try {
		
			FileReader fr1 = new FileReader("/home/diurno/ExamenUD7/datosFichero.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			
			
			
		} catch (IOException ex) {
			
			System.err.println("Error..." +ex.getMessage());
			System.exit(0);
		}
			
	}
	
	public static void mostrarDatos (ArrayList<Principal> datosFichero) {
		
		int cont = 0;
		
        for (Principal p : datosFichero) {
        	
        	cont ++;
        	
        	System.out.println("Vehículo: " +cont);
            System.out.println( datosFichero+ "\n");
        	
        }
	}
	
	
	public static void serializar (ArrayList<Principal> datosFichero) {
			
			try {

				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/diurno/ExamenUD7/datosFichero.txt"));

				oos.writeObject(datosFichero);
				oos.close();

				System.out.println("Se ha serializado el archivo correctamente.\n");
				
			} catch (IOException iex) {

				System.err.println("Error al serializar.. " + iex.getMessage());

				System.exit(0);

			}
			
		}
	
	public static void deserializar () {
		
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/diurno/ExamenUD7/datosFichero"));
			
				ArrayList<Principal> deserializar = new ArrayList<>();
			
			 	deserializar = (ArrayList<Principal>) ois.readObject();
				ois.close();
				
				mostrarDatos(deserializar);
				
			System.out.println("Se ha deserializado correctamente el archivo.\n");
			
		} catch (IOException | ClassNotFoundException dex) {
			
			System.err.println("Error al deserializar.. " + dex.getMessage());
			
			System.exit(0);
			
		}
		
	}
	
	public static void mostrarDatosFicheroText () {
		
		System.out.println("El nombre del fichero es: ");
		System.out.println("La ruta absoluta del fichero es: ");
		System.out.println("La última vez modificada es: ");
		
	}
	
}