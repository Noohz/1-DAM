package leerBytes;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploLeerByte {

	public static void main(String[] args) {
		
		bytes();

	}

	public static void bytes () {
		
		try {
			
			FileInputStream archivo_lectura = new FileInputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/bufferLectura.txt");
			
			boolean final_ar = false;
			
			while (!final_ar) { // Siempre que se use "!" delante equivale a usar "final_ar == false".
				
				int byte_entrada = archivo_lectura.read();
				
				if (byte_entrada == -1)
					
					final_ar = true;
				
				System.out.println(byte_entrada);
			}
			
			archivo_lectura.close();
			
		} catch (IOException e) {
		
			System.err.println("No se tienen permisos de lectura o escritura o si el archivo está dañado.");
			
		}		
	}
	
}
