package ejercicioLeerficheroByte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerFicheroByte {

	public static void main(String[] args) {
		
		leerYGuardar();

	}

	public static void leerYGuardar() {
		
		try {
			
			FileInputStream leer_imagen = new FileInputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/borrar-fondo-imagen.webp");
			FileOutputStream escribir_imagen = new FileOutputStream("/home/diurno/Escritorio/Unidad 7 - Programacion/borrar-fondo-imagen-copia.webp");
			
			boolean fin = false;
			
			int bytes_totales = 0;
			
			while (!fin) {
				
				int bytes = leer_imagen.read();
				
				if (bytes == -1) {
					
					fin = true;
					
				} else {
					
					bytes_totales += bytes;
					
					escribir_imagen.write(bytes);
					
				}
				
			}
			
			System.out.println("\nNúmero total de Bytes: " + bytes_totales);
			
			leer_imagen.close();
			escribir_imagen.close();
			
			
			
		} catch (IOException e) {
			
			System.err.println("No se tienen permisos de lectura o escritura o si el archivo está dañado.");
			
		}
		
	}
	
}
