package org.iesab.damdaw.ed.ev1;

public class Producto {

		private double precio;
		private String nombre;
		private int codProducto;
		private String descripcion;
		private String categoria;
		private String codProveedor;
		private int stock;
		private double ranking;
		
		/**
		 * Constructor Parametrizado.
		 * @param precio
		 * @param nombre
		 */
		public Producto(double precio, String nombre) {
			this.precio = precio;
			this.nombre = nombre;
		}
		
		
		
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			if (precio > 0)
				this.precio = precio;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getCodProducto() {
			return codProducto;
		}
		public void setCodProducto(int codProducto) {
			this.codProducto = codProducto;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public String getCodProveedor() {
			return codProveedor;
		}
		public void setCodProveedor(String codProveedor) {
			this.codProveedor = codProveedor;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public double getRanking() {
			return ranking;
		}
		public void setRanking(double ranking) {
			this.ranking = ranking;
		}
		
}
