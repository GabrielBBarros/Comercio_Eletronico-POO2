package Model.Venda;

import java.io.Serializable;

import Model.Produto.*;

public class ItemVenda implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1479920602784210283L;
	private Produto produto;
	private float valor;
	private long quantidade;

	public ItemVenda() {
		// TODO Auto-generated constructor stub
	}

	public ItemVenda(Produto produto, long quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = calcularTotal();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long qualidade) {
		this.quantidade = qualidade;
	}

	public float calcularTotal() {
		return this.produto.getValor() * this.quantidade;
	}
	

}
