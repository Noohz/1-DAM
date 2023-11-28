/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado.
 */

package unidad3;

import java.util.*;
public class EjemploBucleAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int filas, columnas;
		
		do{
			System.out.print("Introduce número de filas: ");
			filas = teclado.nextInt();
			}while(filas<1);

			do{
				System.out.print("Introduce número de columnas: ");
				columnas = teclado.nextInt();
				}while(columnas<1);
			
					for(int f = 1; f<=filas; f++){
						
						for(int c = 1; c<=columnas; c++){

							System.out.print(" * ");
						}
						System.out.println();
					}
					teclado.close();
				}
			}
