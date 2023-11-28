package unidad6;

public class EjercicioArrayList1Libros {

	private String isbn;
	private String titulo;
	private String autor;
	private boolean estado;
	
	
	// Constructor por defecto.
	public EjercicioArrayList1Libros () {
		
	}
	
	/**
	 * Constructor parametrizado.
	 * @param isbn -> Identificador que almacena el ISBN del libro.
	 * @param titulo -> Identificador que almacena el titulo del libro.
	 * @param autor -> Identificador que almacena el autor del libro.
	 * @param estado -> Identificador que indica si el libro está o no disponible.
	 */
	public EjercicioArrayList1Libros (String isbn, String titulo, String autor) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.estado = true;
		
	}

	/**
	 * @return isbn -> Devuelve un *String* con el valor de isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn isbn -> Define el valor *String* que tendrá isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return titulo -> Devuelve un *String* con el valor de titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo titulo -> Define el valor *String* que tendrá titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return autor -> Devuelve un *String* con el valor de autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor autor -> Define el valor *String* que tendrá autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return estado -> Devuelve un *boolean* con el valor de estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado estado -> Define el valor *boolean* que tendrá estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String toString() {
		return "EjercicioArrayList1Libros [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", estado=" + estado + "]";
	}	
}
