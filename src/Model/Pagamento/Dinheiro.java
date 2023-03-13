package Model.Pagamento;

import java.io.Serializable;

public class Dinheiro extends Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8762199696537710039L;

	public Dinheiro() {
		// TODO Auto-generated constructor stub
	}

	public Dinheiro(String codigoNota) {
		super(codigoNota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dinheiro";
	}

	
	

}
