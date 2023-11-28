package ejercicioMuseoValladolid;

public class Pintura extends Obra{

	private int base;
	private int altura;
	private String tecnicaPintura;
	
	
	public Pintura () {
		
	}
	
	public Pintura(int base, int altura, String tecnicaPintura) {
		super();
		this.base = base;
		this.altura = altura;
		this.tecnicaPintura = tecnicaPintura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getTecnicaPintura() {
		return tecnicaPintura;
	}

	public void setTecnicaPintura(String tecnicaPintura) {
		this.tecnicaPintura = tecnicaPintura;
	}
	
	public double calculaPrecio() {
		double precioPintura = super.getAutor().getPrecioMedioObras();
		
		if (this.base <= 60 && this.altura <= 60) {
			precioPintura = (super.getAutor().getPrecioMedioObras()*super.getFechaCreacion()) +6000;
		} else if ((this.base > 60 && this.altura <= 240) && (this.base > 60 && this.altura <= 240)) {
			precioPintura = (super.getAutor().getPrecioMedioObras()*super.getFechaCreacion()) +12000;
		} else if (this.base > 240 && this.altura > 240) {
			precioPintura = (super.getAutor().getPrecioMedioObras()*super.getFechaCreacion()) +24000;
		}
		
		return precioPintura;
	}

	public void mostrar() {
	
		super.mostrar();
		
		System.out.println("Las dimensiones del cuadro son: " +this.base+ " x " +this.altura);
		System.out.println("La tecnica de pintura es: " +this.tecnicaPintura);
		System.out.println("El precio de la pintura es: " +this.calculaPrecio()+ "€");
		
	}

	
	
}
