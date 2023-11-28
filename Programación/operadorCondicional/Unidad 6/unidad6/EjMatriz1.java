package unidad6;

public class EjMatriz1 {

	public static void main(String[] args) {
		
		// Array declarado
		String arrayMatriz1 [][] = {{"mesa", "vitrina", "estanteria", "comoda"}, {"silla", "sofa", "cuna", "sillon"}, {"lampara", "cama", "mesilla", "biombo"}, {"armario", "mecedora", "divan", "trinchero"}};
		
		
		for (int i = 0; i < arrayMatriz1.length; i++) {
			System.out.print(arrayMatriz1 [i] [0]+ "\t");
			System.out.print(arrayMatriz1 [i] [1]+ "\t");
			System.out.print(arrayMatriz1 [i] [2]+ "\t");
			System.out.print(arrayMatriz1 [i] [3]+ "\t");
			System.out.println("\n");

		}
		
	}

}
