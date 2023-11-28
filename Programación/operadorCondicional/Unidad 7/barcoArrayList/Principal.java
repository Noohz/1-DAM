package barcoArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import tareaFicheros.ClaseAlumno;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		int menu;
		String bDNI;
		String eDNI;
		String archivo;
		
		do {
			
			System.out.println("## - Menú - ##");
			System.out.println("1.- Cargar datos del fichero.");
			System.out.println("2.- Mostrar usuarios.");
			System.out.println("3.- Buscar un usuario.");
			System.out.println("4.- Eliminar un usuario.");
			System.out.println("5.- Serializar.");
			System.out.println("6.- Deserializar.");
			System.out.println("7.- Salir");

			
			System.out.println("Selecciona una opción:");
			menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println("");
			
			switch (menu) {
			
				case 1:
					insertarUsuarios(usuarios);
					break;
				case 2:
					mostrarUsuarios(usuarios);
					break;
				case 3:
					System.out.println("Introduce el DNI del usuario a buscar: ");
					bDNI = sc.nextLine();
					buscarUsuario(usuarios, bDNI);
					break;
				case 4:
					System.out.println("Introduce el DNI del usuario a eliminar: ");
					eDNI = sc.nextLine();
					eliminarUsuario(usuarios, eDNI);
					break;
				case 5:
					serializar(usuarios);
					break;
				case 6:
					deserializar(usuarios);
					break;
				case 7:
					break;
			}
			
		} while (menu != 7);
		
			sc.close();
	}
	
	/**
	 * Método que introduce los datos del fichero al ArrayList.
	 * @param usuarios
	 */
	public static void insertarUsuarios (ArrayList<Usuario> usuarios) {
		
		try {
			
			FileReader f1 = new FileReader("C:\\Users\\Aitor\\Desktop\\1DAMW\\Programación\\eclipse-workspace\\operadorCondicional\\Unidad 7\\Ficheros\\datosBarcos.txt");
			
			BufferedReader bf1 = new BufferedReader(f1);
			
			String linea;
			
			while ((linea = bf1.readLine()) != null) {
				
				String[] cUsuarios = linea.split("#");
				String nombre = cUsuarios[0];
	            String dni = cUsuarios[1];
	            double eslora = Double.parseDouble(cUsuarios[2]);
	            String matricula = cUsuarios[3];
	            Barco barco = new Barco(eslora, matricula);
	            Usuario usuario = new Usuario(nombre, dni, barco);
	            usuarios.add(usuario);
	            
			}
			
			 System.out.println("* Usuarios insertados correctamente.\n");
			
		} catch (IOException e) {
			
			System.err.println("Error.. " + e.getMessage());
			
			System.exit(0);
			
		}
		
	}
	
	/**
	 * Método que muestra todos los usuarios que hay en el ArrayList con un For-Each.
	 * @param usuarios
	 */
	public static void mostrarUsuarios(ArrayList<Usuario> usuarios) {
		
		int cont = 0;
		
        for (Usuario usuario : usuarios) {
        	cont ++;
        	
        	System.out.println("## - Datos del usuario " +cont+ " - ## \n");
            System.out.println(usuario + "\n");
        }
    }
	
	/**
	 * Método que busca un usuario en el ArrayList con un For-Each.
	 * @param usuarios
	 * @param dni
	 */
	public static void buscarUsuario(ArrayList<Usuario> usuarios, String bDNI ) {
		
        for (Usuario usuario : usuarios) {
        	
            if (usuario.getDni().equals(bDNI)) {
            	
                System.out.println(usuario+ "\n");
                
                return;
            }
        }
        
        System.err.println("No se ha encontrado el usuario con DNI: " +bDNI+ "\n");
    }
	
	/**
	 * Método que elimina un usuario del ArrayList.
	 * @param usuarios
	 * @param eDNI
	 */
	public static void eliminarUsuario(ArrayList<Usuario> usuarios, String eDNI) {
		
        for (Usuario usuario : usuarios) {
        	
            if (usuario.getDni().equals(eDNI)) {
            	
                usuarios.remove(usuario);
                
                System.out.println("Se ha eliminado el usuario con DNI " +eDNI+ " correctamente.\n");
                
                return;
            }
        }
        
        System.err.println("El usuario con DNI " +eDNI+ " no se ha encontrado.\n");
    }
	
	/**
	 * Método para serializar el archivo.
	 * @param usuarios
	 */
	public static void serializar (ArrayList<Usuario> usuarios) {
		
		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aitor\\Desktop\\1DAMW\\Programación\\eclipse-workspace\\operadorCondicional\\Unidad 7\\Ficheros\\datosBarcos.txt"));

			oos.writeObject(usuarios);
			oos.close();

			System.out.println("Se ha serializado el archivo correctamente.\n");
			
		} catch (IOException ex) {

			System.err.println("Error al serializar.. " + ex.getMessage());

			System.exit(0);

		}
		
	}
	
	public static void deserializar (ArrayList<Usuario> usuarios) {
		
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Aitor\\Desktop\\1DAMW\\Programación\\eclipse-workspace\\operadorCondicional\\Unidad 7\\Ficheros\\datosBarcos.txt"));
			
			 	usuarios = (ArrayList<Usuario>) ois.readObject();
				ois.close();
				
			System.out.println("Se ha deserializado correctamente el archivo.\n");
			
		} catch (IOException | ClassNotFoundException ex) {
			
			System.err.println("Error al deserializar.. " + ex.getMessage());
			
			System.exit(0);
			
		}
		
	}
	
}
