package org.iesab.damdaw1.ed.ev2;

public class EconomiaException extends Exception{

	private String msg;
	
	public EconomiaException(String msg) {
		super ();
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}
}
