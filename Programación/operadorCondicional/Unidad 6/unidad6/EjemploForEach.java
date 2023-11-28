package unidad6;

public class EjemploForEach {

	public static void main(String[] args) {
		
		String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		String stringMayor = calcularMayor(semana);
		System.out.println("El día de la semana más largo es: " +stringMayor);
		
	}

	public static String calcularMayor (String [] semana) {
		
		String maxSoFar = semana [0];
		
		for (String st : semana) {
			
			if (st.length() > semana.length) {
				maxSoFar = st;
			}
		}
		return maxSoFar;
	}
	
}
