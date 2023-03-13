package Model.Produto;

import java.io.Serializable;
import java.time.LocalDate;

import Model.Fabricante.Fabricante;

abstract public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4356622548097925180L;
	protected String codigo;
	protected String nome;
	protected String descricao;
	protected LocalDate dataFabricacao;
	protected float valor;
	protected Fabricante fabricante;
	protected boolean disponivel;
	
	protected Produto() {
		
	}

	protected Produto(String codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
			Fabricante fabricante) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
		this.valor = valor;
		this.fabricante = fabricante;
		this.disponivel = true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	//M�todos
	
	//Colocar abstract
	public float calcularValor() {
		return valor;
	}
	
	//Por enquanto return true
	public boolean estaDisponivel() {
		return true;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.valor;
	}	

}
