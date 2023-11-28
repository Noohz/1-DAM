package org.iesab.damdaw1.ed.ev2;

public class TemperaturaVo {
	private static int id=0;
	private float valor;
	private float valorConvertido;
	private Escala escalaOrigen;
	private Escala escalaDestino;
	
	public TemperaturaVo(float valor, String escalaOrigen, String escalaDestino) {
		this.valor=valor;
		if (escalaOrigen.compareToIgnoreCase(Escala.CELSIUS.getNombre())==0) {
			this.escalaOrigen=Escala.CELSIUS;
		} else if (escalaOrigen.compareToIgnoreCase(Escala.KELVIN.getNombre())==0) {
			this.escalaOrigen=Escala.KELVIN;
		} else {
			this.escalaOrigen=Escala.FAHRENHEIT;
		}
		if (escalaDestino.compareToIgnoreCase(Escala.CELSIUS.getNombre())==0) {
			this.escalaDestino=Escala.CELSIUS;
		} else if (escalaDestino.compareToIgnoreCase(Escala.KELVIN.getNombre())==0) {
			this.escalaDestino=Escala.KELVIN;
		} else {
			this.escalaDestino=Escala.FAHRENHEIT;
		}
		id++;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Escala getEscalaOrigen() {
		return escalaOrigen;
	}
	public void setEscala(Escala escala) {
		this.escalaOrigen = escala;
	}
	public Escala getEscalaDestino () {
		return this.escalaDestino;
	}
	public void setEscalaDestino(Escala escala) {
		this.escalaDestino=escala;
	}
	public float getValorConvertido() {
		return valorConvertido;
	}
	public void setValorConvertido(float valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	
	public int getId() {
		return id;
	}

	public String toString() {
		return (new StringBuffer().append(valor).append(" ").
				append(escalaOrigen.getNombre()).append(" = ").
				append(valorConvertido).append(" ").append(escalaDestino.getNombre())).toString();
	}
}
