package Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import Model.Comercio.ComercioEletronico;
import Model.Pagamento.*;
import Model.Transportadora.Transportadora;
import Model.Usuario.*;
import Model.Venda.ItemVenda;
import Model.Venda.Venda;

public final class ControladorVenda {
	
	private static ControladorVenda instancia = null;
	private ComercioEletronico comercio;

	private ControladorVenda() {
		this.comercio = ComercioEletronico.getInstancia();
	}

	public static ControladorVenda getInstancia(){
		if (instancia == null){
			instancia = new ControladorVenda();
		}
		return instancia;
	}

	
	
	public Iterator<Venda> getVendas(){
		return comercio.getVendas ();
	}

	public Iterator<Venda> historicoCliente(Usuario cliente){
		return comercio.historicoVendaCliente(cliente);
	}
	
	public Usuario buscaCliente(String cpf) {
		return comercio.buscaCliente(cpf);
	}

	public Iterator<Venda> vendasMes(LocalDate data){
		return comercio.vendaMes(data);
	}
	
	public double lucroMes(LocalDate data){
		return comercio.lucroMes(data);
	}

	public Iterator<Venda> vendaDinheiro(){
		return comercio.vendaDinheiro();
	}

	public Iterator<Venda> vendaCartao(){
		return comercio.vendaCartao();
	}

	public Iterator<Venda> vendaPix(){
		return comercio.vendaPix();
	}

	public void cadVenda(Cliente cliente, Gerente gerente, LocalDate dataVenda, Pagamento formaPagamento, Transportadora transportadora, ArrayList<ItemVenda> itens){
		comercio.cadVenda(tamanhoVenda(), cliente, gerente, dataVenda, formaPagamento, transportadora, itens);
	}

	public String tamanhoVenda() {
		String tamanho = "VN";
		int tam = comercio.getTamanhoVenda();
		if(tam < 10) {
			tamanho = tamanho + "000" + Integer.toString(tam);
		} else if (tam < 100) {
			tamanho = tamanho + "00" + Integer.toString(tam);
		} else if(tam < 1000){
			tamanho = tamanho + "0" + Integer.toString(tam);
		} else {
			tamanho = tamanho + Integer.toString(tam);
		}
		return tamanho;
	}

}
