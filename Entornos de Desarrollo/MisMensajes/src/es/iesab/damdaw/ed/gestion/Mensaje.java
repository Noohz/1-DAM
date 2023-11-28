package es.iesab.damdaw.ed.gestion;

public class Mensaje {

	private String msg;

	public void mostrarMensaje(String m) {
		msg = m;
		System.out.println(msg);
	}

	/**
	 * @return msg -> Devuelve el valor que contiene "msg"
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg -> the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
