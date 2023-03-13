package Model.Pagamento;

import java.io.Serializable;

public class CartaoCredito extends Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3604698773083458479L;
	private String nome;
	private String bandeira;
	private String numero;
	
	public CartaoCredito() {
		// TODO Auto-generated constructor stub
	}

	public CartaoCredito(String codigoNota, String nome, String bandeira, String numero) {
		super(codigoNota);
		this.nome = nome; 
		this.bandeira = bandeira;
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "CartaoCredito";
	}
	
	

}
