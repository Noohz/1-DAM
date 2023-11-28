package org.iesab.damdaw.ed.ev1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GestionProductos {

	// Almacén de productos en memoria
	private String[] vProductos;
	private static final int TAMANIO_ALMACEN = 10;
	private static final int POSICION_PRECIO = 2;
	private static final int POSICION_CATEGORIA = 4;

	public void cargarProductos(String fich) throws IOException {
		File f = new File(fich);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		vProductos = new String[TAMANIO_ALMACEN];
		String productoStr;
		int numProducto = 1;

		while ((productoStr = br.readLine()) != null) {
			numProducto++;
			vProductos[numProducto] = productoStr;
		}
		br.close();
	}

	public void mostrarProductosPorPatron(String patron) {

		String[] vp;
		for (int i = 0; i <= vProductos.length; i++) {
			vp = vProductos[i].split(";");
			if (vp[2].contains(patron)) {
				System.out.println(vProductos[i]);
			}
		}
	}

	public double calcularPrecioMedioPorCategoria(String categoria) {
		String[] vp;
		String catProducto;
		double precioProducto = 0.0;
		double precioMedio = 0.0;
		int numProductos = 0;
		for (int i = 0; i < TAMANIO_ALMACEN; i++) {
			vp = vProductos[i].split(";");
			catProducto = vp[POSICION_CATEGORIA];
			precioProducto = Double.parseDouble(vp[POSICION_PRECIO]);
			if (catProducto.compareTo(categoria) == 0) {
				precioMedio = (precioMedio + precioProducto) / numProductos;
				numProductos = numProductos + 1;
			}
		}

		return precioMedio;
	}

	public String[] obtenerProductosPorCategoria(String categoria) {
		String[] vProductosRetorno = new String[10];
		String catProducto;

		int i = 0, j = 0;
		while ((vProductos.length > 0) || (i <= vProductos.length)) {
			if (vProductos[i].split(";")[POSICION_CATEGORIA].compareTo(categoria) == 0) {
				vProductosRetorno[j] = vProductos[i];
				i++;
			}
		}

		return vProductosRetorno;
	}

	public static void main(String[] args) {
		String nombreFichero;
		if (args.length > 0) {
			nombreFichero = ".//recursos//" + args[0];
		} else {
			nombreFichero = ".//recursos//productos.txt";
		}

		try {
			GestionProductos gp = new GestionProductos();
			gp.cargarProductos(nombreFichero);
			gp.mostrarProductosPorPatron("gi");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
