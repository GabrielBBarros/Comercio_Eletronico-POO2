package Model.Transportadora;

import java.io.Serializable;

public class Transportadora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5067797797444270541L;
	private String codigo;
	private String cnpj;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private int tempoDeEntrega;
	
	public Transportadora() {
		// TODO Auto-generated constructor stub
	}

	public Transportadora(String codigo, String cnpj, String nome, String email, String telefone, String endereco,
			int tempoDeEntrega) {
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tempoDeEntrega = tempoDeEntrega;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTempoDeEntrega() {
		return tempoDeEntrega;
	}

	public void setTempoDeEntrega(int tempoDeEntrega) {
		this.tempoDeEntrega = tempoDeEntrega;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.tempoDeEntrega + " dias";
	}
	
	

}
