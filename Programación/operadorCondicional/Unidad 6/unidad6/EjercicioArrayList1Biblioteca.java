package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList1Biblioteca {

	private static ArrayList<EjercicioArrayList1Libros> libros = new ArrayList<>();
	

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        int menu;

        do {
        	
            System.out.println("# ** Menú ** #");
            System.out.println("1. Introducir un nuevo libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro prestado");
            System.out.println("4. Mostrar los libros de la biblioteca");
            System.out.println("5. Salir de la aplicación");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    agregarLibro(libros);
                    break;
                case 2:
                    prestarLibro(libros);
                    break;
                case 3:
                    devolverLibroPrestado(libros);
                    break;
                case 4:
                    mostrarLibrosBiblioteca(libros);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (menu != 5);
        	teclado.close();
    }

    public static void agregarLibro(ArrayList<EjercicioArrayList1Libros> libros) {
    	
        Scanner agrLibro = new Scanner(System.in);
        
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = agrLibro.nextLine();
        
        System.out.print("Ingrese el título del libro: ");
        String titulo = agrLibro.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        String autor = agrLibro.nextLine();
        
        EjercicioArrayList1Libros libro = new EjercicioArrayList1Libros(isbn, titulo, autor);
        
        if (isbn.isBlank() || titulo.isBlank() || autor.isBlank()) {
        	System.err.println("No puedes dejar campos vacios");
        } else {
        	libros.add(libro);
        	System.out.println("El libro ha sido añadido a la biblioteca \n");
        }
    }
	
	public static void prestarLibro (ArrayList<EjercicioArrayList1Libros> libros) {
		
		Scanner preLibro = new Scanner (System.in);
		int cont = 0;
		boolean verificar = false;
		
		System.out.print("Introduce el ISBN del libro a prestar: ");
		String isbn = preLibro.nextLine();
		
		while (cont < libros.size() && verificar == false) {
			if (libros.get(cont).getIsbn().equalsIgnoreCase(isbn)) {
				if (libros.get(cont).isEstado() == true) {
					System.out.println("Se ha realizado el prestamo. \n");
					
					libros.get(cont).setEstado(false);
					verificar = true;
					
				} else {
					System.err.println("El libro buscado no puede ser prestado. \n");
					verificar = false;
				}
			}
			
			cont ++;
		}
		
		if (verificar == false) {
			System.err.println("No se ha encontrado un libro con el ISBN: " +isbn);
		}
	}
	
	public static void devolverLibroPrestado (ArrayList<EjercicioArrayList1Libros> libros) {
		
		Scanner devLibro = new Scanner (System.in);
		int cont = 0;
		boolean verificar = false;
		
		System.out.print("Introduce el ISBN del libro a devolver: ");
		String isbn = devLibro.nextLine();
		
		while (cont < libros.size() && verificar == false) {
		}
		
	}
	
	public static void mostrarLibrosBiblioteca (ArrayList<EjercicioArrayList1Libros> libros) {
		
		for (int cont = 0; cont < libros.size(); libros.get(cont)) {
			
		}
	}
}