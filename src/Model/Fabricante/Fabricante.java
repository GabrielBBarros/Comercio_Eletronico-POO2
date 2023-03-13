package Model.Fabricante;

import java.io.Serializable;

public class Fabricante implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4545487269115166174L;
	private String codigo;
	private String cnpj;
	private String nome;
	private String descricao;
	private String email;
	private String telefone;
	private String endereco;
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	public Fabricante(String codigo, String cnpj, String nome, String descricao, String email, String telefone, String endereco) {
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nome = nome;
		this.descricao = descricao;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	@Override
	public String toString() {
		return this.nome;
	}
	
	

}
