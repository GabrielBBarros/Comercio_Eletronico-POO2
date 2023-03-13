package Model.Pagamento;

import java.io.Serializable;

public class Pix extends Pagamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8559579260858113982L;
	private String codigoPix;
	public Pix() {
		// TODO Auto-generated constructor stub
	}

	public Pix(String codigoNota, String codigoPix) {
		super(codigoNota);
		this.codigoPix = codigoPix;
		// TODO Auto-generated constructor stub
	}

	public String getCodigoPix() {
		return codigoPix;
	}

	public void setCodigoPix(String codigoPix) {
		this.codigoPix = codigoPix;
	}

	@Override
	public String toString() {
		return "Pix";
	}

}
