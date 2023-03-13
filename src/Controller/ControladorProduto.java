package Controller;

import java.time.LocalDate;
import java.util.Iterator;

import Model.Comercio.ComercioEletronico;
import Model.Fabrica.FactoryProduto;
import Model.Fabricante.Fabricante;
import Model.Produto.Produto;
import Model.Transportadora.Transportadora;

public final class ControladorProduto {

	private static ControladorProduto instancia = null;
	private ComercioEletronico comercio;
	
	
	private ControladorProduto() {
		comercio = ComercioEletronico.getInstancia();
	}

	public static ControladorProduto getInstancia(){
		if (instancia == null){
			instancia = new ControladorProduto();
		}
		return instancia;
	}
	
	//metodos
	
	public boolean cadProduto(String tipo, String nome, String descricao, LocalDate data, float valor, Fabricante fabricante) {
		switch (tipo.toLowerCase().trim()) {
		case "moveis":
			comercio.cadMoveis(FactoryProduto.factoryMethord(tipo, tamanhoMoveis(), nome, descricao, data, valor, fabricante));
			return true;
		case "eletrodomesticos":
			comercio.cadEletrodomestico(FactoryProduto.factoryMethord(tipo, tamanhoEletrodomestico(), nome, descricao, data, valor, fabricante));
			return true;
		case "eletronicos":
			comercio.cadEletronicos(FactoryProduto.factoryMethord(tipo, tamanhoEletronico(), nome, descricao, data, valor, fabricante));
			return true;
		case "vestuario":
			comercio.cadVestuario(FactoryProduto.factoryMethord(tipo, tamanhoVestuario(), nome, descricao, data, valor, fabricante));
			return true;
		default:
			return false;
		}
	}
	
	public void cadFabricante(String cnpj, String nome, String descricao, String email, String telefone,
	String endereco){
		comercio.cadFabricante(tamanhoFabricante(), cnpj, nome, descricao, email, telefone, endereco);

	}

	public void cadTransportadora(String cnpj, String nome, String email, String telefone, String endereco,
	int tempoDeEntrega){
		comercio.cadTransportadora(tamanhoTransportadora(), cnpj, nome, email, telefone, endereco, tempoDeEntrega);
	}

	public String tamanhoMoveis() {
		String tamanho = "MO";
		int tam = comercio.getTamanhoMoveis();
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
	
	public String tamanhoEletrodomestico() {
		String tamanho = "EL";
		int tam = comercio.getTamanhoEletrodomestico();
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
	
	public String tamanhoEletronico() {
		String tamanho = "ET";
		int tam = comercio.getTamanhoEletronico();
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
	
	public String tamanhoVestuario() {
		String tamanho = "VE";
		int tam = comercio.getTamanhoVestuario();
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
	
	public String tamanhoFabricante() {
		String tamanho = "FA";
		int tam = comercio.getTamanhoFabricantes();
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

	public String tamanhoTransportadora() {
		String tamanho = "TR";
		int tam = comercio.getTamanhoTransportadora();
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

	public Transportadora buscaTransportadora(String cnpj){
		return buscaTransportadora(cnpj);
	}

	public Fabricante buscaFabricante(String cnpj){
		return buscaFabricante(cnpj);
	}

	public Produto buscaProduto(String codigo){
		return buscaProduto(codigo);
	}

	public Iterator<Produto> getProdutos(){
		return comercio.getProdutos().iterator();
	}

	public Iterator<Produto> getMoveis(){
		return comercio.getMoveis();
	}

	public Iterator<Produto> getEletrodomesticos(){
		return comercio.getEletrodomesticos();
	}

	public Iterator<Produto> getEletronicos(){
		return comercio.getEletronicos();
	}

	public Iterator<Produto> getVestuarios(){
		return comercio.getVestuario();
	}

	public Iterator<Produto> topProdutos(){
		return comercio.produtosMaisVendidos();
	}

	public Iterator<Fabricante> getFabricantes(){
		return comercio.getFabricantes();
	}

	public Iterator<Fabricante> topFabricantesVolume(){
		return comercio.topFabricantesVolume();
	}

	public Iterator<Fabricante> topFabricantesLucro(){
		return comercio.topFabricantesLucro();
	}
	
	public Iterator<Transportadora> getTransportadoras(){
		return comercio.getTransportadoras();
	}

	public Iterator<Transportadora> topTresTransportadora(){
		return comercio.insertionSortTransportadora();
	}
	
	public int getTamanhoTransportadoras() {
		return comercio.getTamanhoTransportadora();
	}
	public int getTamanhoEletronicos() {
		return comercio.getTamanhoEletronico();
	}
	public int getTamanhoEletrodomesticos() {
		return comercio.getTamanhoEletrodomestico();
	}
	public int getTamanhoVestuarios() {
		return comercio.getTamanhoVestuario();
	}
	public int getTamanhoMoveis() {
		return comercio.getTamanhoMoveis();
	}
	public int getTamanhoProdutos() {
		return comercio.getTamanhoProdutos();
	}
	public int getTamanhoFabricantes() {
		return comercio.getTamanhoFabricante();
	}
	
	
	public Iterator<Produto> ordenarProduto(boolean metodo){
		return comercio.ordenarProdutos(metodo);
	}




}



