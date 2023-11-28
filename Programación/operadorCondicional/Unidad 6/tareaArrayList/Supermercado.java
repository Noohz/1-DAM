package tareaArrayList;

import java.util.*;

public class Supermercado {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList <Producto> productos = new ArrayList<>();
		
		System.out.println("Indica cuantos productos desea añadir: ");
		int lista = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < lista; i++) {
			
			System.out.println("Introduce el nombre del producto: ");
			String nombre = sc.nextLine();
			
			System.out.println("Introduce la cantidad del producto: ");
			int cantidad = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce el precio del producto: ");
			int precio = sc.nextInt();
			sc.nextLine();
			
			productos.add(new Producto(nombre, cantidad, precio));
			
			System.out.println("\n");
			Thread.sleep(30);
		}
			
		System.out.println("Producto \tCantidad \tPrecio \tTotal");
		
		int total = 0;
		
        for (Producto p : productos) {
            System.out.println(p.getNombre() + "\t" + p.getCantidad() + "\t\t" + p.getPrecio() + "\t" + p.getTotal());
            
            total += p.getTotal();
        }
        
        System.out.println("Precio final: \t\t\t\t" + total);
	}

}
