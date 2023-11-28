package ejercicioLeerficheroBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerficheroBuffer {

	public static void main(String[] args) {
		
		leer();

	}

	
	public static void leer () {
		
		int cont = 0;
		
		try {
			
			FileReader entrada = new FileReader("/home/diurno/Escritorio/Unidad 7 - Programacion/bufferLectura.txt");
			
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea="";
			
				while (linea != null) {
					
					linea = mibuffer.readLine();
					
					
					if (linea != null)
						System.out.println((cont+1) + " ---> " + linea);
					cont++;
					
				}
			
					entrada.close();
				
		} catch (IOException e) {
			System.err.println("No se tienen permisos de lectura o escritura o si el archivo está dañado.");
		}
		
	}
	
}
