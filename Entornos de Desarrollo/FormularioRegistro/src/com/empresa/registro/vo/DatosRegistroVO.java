package com.empresa.registro.vo;

public class DatosRegistroVO {

	private String nombre;
	private String tfno;
	private String dNac;
	private String mNac;
	private String aNac;
	private String direccion;
	private String aceptarCondiciones;
	
	@Override
	public String toString() {
		return "DatosRegistroVO [nombre=" + nombre + ", tfno=" + tfno + ", dNac=" + dNac + ", mNac=" + mNac + ", aNac="
				+ aNac + ", direccion=" + direccion + ", aceptarCondiciones=" + aceptarCondiciones + "]";
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tfno
	 */
	public String getTfno() {
		return tfno;
	}
	/**
	 * @param tfno the tfno to set
	 */
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	/**
	 * @return the dNac
	 */
	public String getdNac() {
		return dNac;
	}
	/**
	 * @param dNac the dNac to set
	 */
	public void setdNac(String dNac) {
		this.dNac = dNac;
	}
	/**
	 * @return the mNac
	 */
	public String getmNac() {
		return mNac;
	}
	/**
	 * @param mNac the mNac to set
	 */
	public void setmNac(String mNac) {
		this.mNac = mNac;
	}
	/**
	 * @return the aNac
	 */
	public String getaNac() {
		return aNac;
	}
	/**
	 * @param aNac the aNac to set
	 */
	public void setaNac(String aNac) {
		this.aNac = aNac;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the aceptarCondiciones
	 */
	public String getAceptarCondiciones() {
		return aceptarCondiciones;
	}
	/**
	 * @param aceptarCondiciones the aceptarCondiciones to set
	 */
	public void setAceptarCondiciones(String aceptarCondiciones) {
		this.aceptarCondiciones = aceptarCondiciones;
	}
	
}
