package ejercicioEscribirficheroBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscribirficheroBuffer {

	public static void main(String[] args) {
		
		escribir();

	}

	
	public static void escribir () {
		
		try {
			
			FileWriter escritura = new FileWriter("/home/diurno/Escritorio/Unidad 7 - Programacion/bufferEscritura.txt");
			
			BufferedWriter mibuffer = new BufferedWriter(escritura);
			
			for (int i = 0; i <= 10; i++) {
				
				String frase ="Linea prueba" + (i +1);

			}
			
			escritura.close();
			
		} catch (IOException e) {
			
			System.err.println("No se tienen permisos de lectura o escritura o si el archivo está dañado.");
			
		}
		
		
	}
	
}
