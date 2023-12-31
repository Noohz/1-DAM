/*
 * Programa que simula el comportamiento de un pájaro.
 */
package unidad4;

public class Pajaro {
	
		String nombre;
		int posX, posY;
		
		public Pajaro() {
		
		}
		
		public Pajaro(String nombre, int posX, int posY) {
			this.nombre=nombre;
			this.posX=posX;
			this.posY=posY;
		}
		
		double volar (int posX, int posY) {
			double desplazamiento = Math.sqrt(posX*posX + posY*posY);
				this.posX = posX;
				this.posY = posY;
				
				return desplazamiento;
		}

		public static void main (String[] args) {
			Pajaro loro = new Pajaro("Lucy",50,50);
			double d = loro.volar(50,50);
			System.out.println("El desplazamiento ha sido " +d);
		}
}
