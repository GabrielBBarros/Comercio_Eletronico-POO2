package Model.Venda;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import Model.Pagamento.*;
import Model.Transportadora.Transportadora;
import Model.Usuario.*;


public class Venda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 369470975698275773L;
	private String codigo;
	private Cliente cliente;
	private Gerente gerente;
	private LocalDate dataVenda;
	private LocalDate dataEntrega;
	ArrayList<ItemVenda> itensVenda;
	private float valorTotal;
	private float valorComDesconto;
	private Pagamento formaPagamento;
	private Transportadora transportadora;
	
	
	public Venda() {
		this.itensVenda = new ArrayList<>();
	}


	public Venda(String codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, Pagamento formaPagamento, Transportadora transportadora, ArrayList<ItemVenda> itens) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.gerente = gerente;
		this.dataVenda = dataVenda;
		this.itensVenda = itens;
		this.formaPagamento = formaPagamento;
		this.transportadora = transportadora;
		this.valorTotal = calcularValortotal();
		this.valorComDesconto = calcularValorComDesconto();
		this.dataEntrega = dataEntrega();
	}

	public float calcularValortotal() {
		float cont = 0;
		for(ItemVenda iv: itensVenda) {
			cont = cont + iv.getValor();
		}
		if(cliente.isClienteOuro()){
			cont -= (cont*(0.03));
		}
		return cont;
	}
	
	public float calcularValorComDesconto() {
		return (float) (this.valorTotal - this.valorTotal*0.03);
	}
	
	public LocalDate dataEntrega() {
		return dataVenda.plusDays(transportadora.getTempoDeEntrega());
	}
	
	public void addItemVenda(ItemVenda item) {
		itensVenda.add(item);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(float valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public Pagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Pagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	@Override
	public String toString() {
		String resultado = "Codigo: " + this.codigo + "\n";
		resultado += "Nome Cliente:" + this.cliente.getNome() + "\n" + "CPF: " + this.cliente.getCpf() + "\n";
		resultado += "Nome Gerente: " + this.gerente.getNome() + "\n" + "CPF:" + this.gerente.getCpf() + "\n";
		resultado += "Data: " + this.dataVenda.getDayOfMonth() + "/" + this.dataVenda.getMonthValue() + "/" + this.dataVenda.getYear() + "\n";;
		if(this.cliente.isClienteOuro())
			resultado += "Valor: " + this.valorComDesconto + "\n";
		else 
			resultado += "Valor: " + this.valorTotal + "\n";
		resultado += "Forma de pagamento: "+ this.formaPagamento.toString() + "\n";
		resultado += "Transportadora: " + this.transportadora.getNome() + "\n" + "Data de Entrega: " + this.dataEntrega.getDayOfMonth() + "/";
		resultado += this.dataEntrega.getMonthValue() + "/" + this.dataEntrega.getYear() + "\n";
		
		resultado += "********************************************************************************************************************************\n";
		for(ItemVenda item: this.itensVenda) {
			resultado += "Nome do Produto: " + item.getProduto().getNome() + "\n";
			resultado += "Quantidade: " +item.getQuantidade() + "\n";
			resultado += "Valor: " + item.getValor() + "\n";
		}
		resultado += "********************************************************************************************************************************\n";
		return resultado;
	}

}
