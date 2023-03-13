package Model.Pagamento;

import java.io.Serializable;

abstract public class Pagamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1754313687784460475L;
	private String codigoNota;
	
	public Pagamento() {
		// TODO Auto-generated constructor stub
	}
	public Pagamento(String codigoNota) {
		this.codigoNota = codigoNota;
	}
	public String getCodigoNota() {
		return codigoNota;
	}
	public void setCodigoNota(String codigoNota) {
		this.codigoNota = codigoNota;
	}
	@Override
	//abstract
	public String toString() {
		return "Pagamento [codigoNota=" + codigoNota + "]";
	}
	
	

}
