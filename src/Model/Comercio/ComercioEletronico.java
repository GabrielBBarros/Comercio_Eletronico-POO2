package Model.Comercio;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Model.Configuracao.Configuracao;
import Model.Fabricante.Fabricante;
import Model.Ordenacao.Contexto;
import Model.Pagamento.CartaoCredito;
import Model.Pagamento.Dinheiro;
import Model.Pagamento.Pagamento;
import Model.Pagamento.Pix;
import Model.Produto.Eletrodomesticos;
import Model.Produto.Eletronicos;
import Model.Produto.Moveis;
import Model.Produto.Produto;
import Model.Produto.Vestuario;
import Model.Transportadora.Transportadora;
import Model.Usuario.*;
import Model.Venda.ItemVenda;
import Model.Venda.Venda;

public final class ComercioEletronico {

	private static ComercioEletronico instancia = null;
	private String nomeLoja;
	private ArrayList<Usuario> clientes;
	private ArrayList<Fabricante> fabricantes;
	private ArrayList<Usuario> gerentes;
	private ArrayList<Produto> produtos;
	private ArrayList<Transportadora> transportadoras;
	private ArrayList<Venda> vendas;
	private Configuracao configuracao;

	
	private ComercioEletronico() {
		this.clientes = new ArrayList<>();
		this.fabricantes = new ArrayList<>();
		this.gerentes = new ArrayList<>();
		this.produtos = new ArrayList<>();
		this.transportadoras = new ArrayList<>();
		this.vendas = new ArrayList<>();
		configuracao = new Configuracao();
		carregarArquivo();
	}

	public static ComercioEletronico getInstancia(){
		if(instancia == null){
			instancia = new ComercioEletronico();
		}
		return instancia;
	}

	
	//metodos
	
	public void carregarArquivo() {
		try {
			carregarArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void carregarArquivos() throws IOException {
		try {
			FileInputStream inn = new FileInputStream(configuracao.getArquivoClientes());
			ObjectInputStream obj = new ObjectInputStream(inn);
			this.clientes = (ArrayList<Usuario>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoFabricantes());
			obj = new ObjectInputStream(inn);
			this.fabricantes = (ArrayList<Fabricante>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoGerentes());
			obj = new ObjectInputStream(inn);
			this.gerentes = (ArrayList<Usuario>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoProdutos());
			obj = new ObjectInputStream(inn);
			this.produtos = (ArrayList<Produto>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoTransportadoras());
			obj = new ObjectInputStream(inn);
			this.transportadoras = (ArrayList<Transportadora>) obj.readObject();
			obj.close();
			inn.close();
			
			inn = new FileInputStream(configuracao.getArquivoVendas());
			obj = new ObjectInputStream(inn);
			this.vendas = (ArrayList<Venda>) obj.readObject();
			obj.close();
			inn.close();
			
		} catch (IOException|ClassNotFoundException e) {
			System.out.println("Erro ao abrir");
		}
		
	}
	
	public void salvarClientes() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoClientes());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.clientes);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void salvarFabricantes() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoFabricantes());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.fabricantes);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void salvarGerentes() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoGerentes());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.gerentes);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void salvarProdutos() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoProdutos());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.produtos);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void salvarTransportadoras() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoTransportadoras());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.transportadoras);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void salvarVendas() {
		try {
			FileOutputStream out = new FileOutputStream(configuracao.getArquivoVendas());
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this.vendas);
			obj.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cadMoveis(Produto movel) {
		produtos.add(movel);
		salvarProdutos();
	}
	
	public void cadEletrodomestico(Produto eletrodomestico) {
		produtos.add(eletrodomestico);
		salvarProdutos();
	}
	
	public void cadEletronicos(Produto eletronico) {
		produtos.add(eletronico);
		salvarProdutos();
	}
	
	public void cadVestuario(Produto vestuario) {
		produtos.add(vestuario);
		salvarProdutos();
	}

	public void cadCliente(String codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
	String cep, String email, LocalDate dataCasatro, boolean clienteOuro){
		clientes.add(new Cliente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, dataCasatro, clienteOuro));
		salvarClientes();
	}

	public void cadGerente(String codigo, String nome, String cpf, String rf, LocalDate dataNascimento, String endereco,
	String cep, String email, float salario, String pis, LocalDate dataAdmissao){
		gerentes.add(new Gerente(codigo, nome, cpf, rf, dataNascimento, endereco, cep, email, salario, pis, dataAdmissao));
		salvarGerentes();
	}

	public void cadVenda(String codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, Pagamento formaPagamento,
            Model.Transportadora.Transportadora transportadora, ArrayList<ItemVenda> itens) {
		
		vendas.add(new Venda(codigo, cliente, gerente, dataVenda, formaPagamento, transportadora, itens));
		salvarVendas();
    }

	public void cadFabricante(String codigo, String cnpj, String nome, String descricao, String email, String telefone, String endereco){
		fabricantes.add(new Fabricante(codigo, cnpj, nome, descricao, email, telefone, endereco));
		salvarFabricantes();
	}

	public void cadTransportadora(String codigo, String cnpj, String nome, String email, String telefone, String endereco,
	int tempoDeEntrega){
		transportadoras.add(new Transportadora(codigo, cnpj, nome, email, telefone, endereco, tempoDeEntrega));
		salvarTransportadoras();
	}

	public int getTamanhoMoveis() {
		int resultado = 0;
		Iterator<Produto> prods = getMoveis();
		while(prods.hasNext()) {
			prods.next();
			resultado++;
		}
		return resultado;
	}
	
	public int getTamanhoEletrodomestico() {
		int resultado = 0;
		Iterator<Produto> prods = getEletrodomesticos();
		while(prods.hasNext()) {
			prods.next();
			resultado++;
		}
		return resultado;
	}
	
	public int getTamanhoEletronico() {
		int resultado = 0;
		Iterator<Produto> prods = getEletronicos();
		while(prods.hasNext()) {
			prods.next();
			resultado++;
		}
		return resultado;
	}
	
	public int getTamanhoVestuario() {
		int resultado = 0;
		Iterator<Produto> prods = getVestuario();
		while(prods.hasNext()) {
			prods.next();
			resultado++;
		}
		return resultado;
	}
	
	
	//Modifiquei aqui os fabricantes
	public int getTamanhoFabricante() {
		int resultado = 0;
		Iterator<Fabricante> prods = getFabricantes();
		while(prods.hasNext()) {
			prods.next();
			resultado++;
		}
		return resultado;
	}

	public int getTamanhoCliente() {
		return clientes.size();
	}

	public int getTamanhoGerente() {
		return gerentes.size();
	}

	public int getTamanhoVenda(){
		return vendas.size();
	}

	public int getTamanhoTransportadora(){
		return transportadoras.size();
	}

	public int getTamanhoFabricantes(){
		return fabricantes.size();
	}
	
	public int getTamanhoProdutos(){
		return produtos.size();
	}

	public ArrayList<Produto> getProdutos(){
		return produtos;
	}

	public Iterator<Produto> getMoveis(){
		ArrayList<Produto> resultado = new ArrayList<>();
		Iterator<Produto> produ = produtos.iterator();
		Produto produto;
		while(produ.hasNext()) {
			produto = produ.next();
			if(produto instanceof Moveis){
				resultado.add(produto);
			}
		}
		return resultado.iterator();
	}

	public Iterator<Produto> getEletrodomesticos(){
		ArrayList<Produto> resultado = new ArrayList<>();
		Iterator<Produto> produ = produtos.iterator();
		Produto produto;
		while(produ.hasNext()) {
			produto = produ.next();
			if(produto instanceof Eletrodomesticos){
				resultado.add(produto);
			}
		}
		return resultado.iterator();
	}

	public Iterator<Produto> getEletronicos(){
		ArrayList<Produto> resultado = new ArrayList<>();
		Iterator<Produto> produ = produtos.iterator();
		Produto produto;
		while(produ.hasNext()) {
			produto = produ.next();
			if(produto instanceof Eletronicos){
				resultado.add(produto);
			}
		}
		return resultado.iterator();
	}

	public Iterator<Produto> getVestuario(){
		ArrayList<Produto> resultado = new ArrayList<>();
		Iterator<Produto> produ = produtos.iterator();
		Produto produto;
		while(produ.hasNext()) {
			produto = produ.next();
			if(produto instanceof Vestuario){
				resultado.add(produto);
			}
		}
		return resultado.iterator();
	}

	public Iterator<Fabricante> getFabricantes(){
		return fabricantes.iterator();
	}

	public Iterator<Usuario> getClientes(){
		return clientes.iterator();
	}

	public Iterator<Usuario> getGerentes(){
		return gerentes.iterator();
	}

	public Iterator<Venda> getVendas(){
		return vendas.iterator();
	}

	public Iterator<Transportadora> getTransportadoras(){
		return transportadoras.iterator();
	}

	public Iterator<Usuario> getClientesOuro(){
		ArrayList<Usuario> resultado = new ArrayList<>();
		Cliente cliente = null;
		Iterator<Usuario> clients = clientes.iterator();
		while(clients.hasNext()) {
			cliente = (Cliente) clients.next();
			if(cliente.isClienteOuro())
				resultado.add(cliente);
		}
		return resultado.iterator();
	}
	
	public int getTamanhoClientesOuro(){
		int resultado = 0;
		Iterator<Usuario> clients = getClientesOuro();
		while(clients.hasNext()) {
			clients.next();
			resultado++;
		}
		return resultado;
	}

	public Iterator<Venda> historicoVendaCliente(Usuario usuario){
		ArrayList<Venda> resultado = new ArrayList<>();
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getCliente().getCpf().equalsIgnoreCase(usuario.getCpf()))
				resultado.add(venda);
		}
		return resultado.iterator();
	}

	public Iterator<Venda> vendaMes(LocalDate data){
		ArrayList<Venda> resultado = new ArrayList<>();
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getDataVenda().getMonthValue() == data.getMonthValue())
				if(venda.getDataVenda().getYear() == data.getYear())
					resultado.add(venda);
		}
		return resultado.iterator();
	}

	public double lucroMes(LocalDate data){
		double resultado = 0;
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getDataVenda().getMonthValue() == data.getMonthValue()){
				if(venda.getCliente().isClienteOuro()){
					resultado += venda.getValorComDesconto();
				} else {
					resultado += venda.getValorTotal();
				}
			}
		}
		return resultado;
	}

	public Iterator<Venda> vendaDinheiro(){
		ArrayList<Venda> resultado = new ArrayList<>();
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getFormaPagamento() instanceof Dinheiro){
				resultado.add(venda);
			}
		}
		return resultado.iterator();
	}

	public Iterator<Venda> vendaCartao(){
		ArrayList<Venda> resultado = new ArrayList<>();
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getFormaPagamento() instanceof CartaoCredito){
				resultado.add(venda);
			}
		}
			return resultado.iterator();
	}

	public Iterator<Venda> vendaPix(){
		ArrayList<Venda> resultado = new ArrayList<>();
		Iterator<Venda> vends = vendas.iterator();
		Venda venda;
		while(vends.hasNext()) {
			venda = vends.next();
			if(venda.getFormaPagamento() instanceof Pix){
				resultado.add(venda);
			}
		}
		return resultado.iterator();
	}

	public void topTransportadoraTreeMap(){
		Map<Transportadora, Integer> map = new TreeMap<>();
		ArrayList<Transportadora> resultado = new ArrayList<>();
		ArrayList<Transportadora> auxiliar = new ArrayList<>();

		for(Transportadora transportadora: transportadoras){
			map.put(transportadora, vendasTransportadora(transportadora));
		}
		
		map = ordenarVendaTransportadora(map);
		map.forEach((k, v) -> auxiliar.add(k));
		int cont = 0;
		for(Transportadora t: auxiliar){
			resultado.add(t);
			cont++;
			if ( cont == 3)
				break;
		}
		
	}

	public static  Map <Transportadora, Integer> ordenarVendaTransportadora(final Map<Transportadora, Integer> map){

		Comparator<Transportadora> compTrans = new Comparator<Transportadora>() {
			@Override
			public int compare(Transportadora t1, Transportadora t2){
				int comp = map.get(t1).compareTo(map.get(t2));
				if (comp == 0)
					return 1;
				return comp;
			}
		};

		Map<Transportadora, Integer> resultado = new TreeMap<Transportadora, Integer>(compTrans);
		resultado.putAll(map);

		return resultado;
	}

	public Iterator<Transportadora> selectionSortTransportadora() {
		int tamanho = transportadoras.size();
		ArrayList<Transportadora> resultado = new ArrayList<>();
		ArrayList<Transportadora> auxiliar = (ArrayList)transportadoras.clone();
		int index = 0;
		int indexMinimo;
		for(Transportadora transportadora: auxiliar){
			indexMinimo = index;
			for(int i = index; i < tamanho; i++){
				if(vendasTransportadora(auxiliar.get(i)) < vendasTransportadora(transportadora)){
					indexMinimo = i;
				}
			}
			swap(indexMinimo, index, auxiliar);
		}
		resultado.add(auxiliar.get(auxiliar.size() - 1 ));
		resultado.add(auxiliar.get(auxiliar.size() - 2));
		resultado.add(auxiliar.get(auxiliar.size() - 3));
		return resultado.iterator();
	}

	public void swap(int i, int j, ArrayList<Transportadora> aux) {
		Transportadora auxiliar = aux.get(i);
		aux.add(i, aux.get(j));
		aux.add(j, auxiliar);
	}

	public Iterator<Transportadora> insertionSortTransportadora(){
		ArrayList<Transportadora> resultado = new ArrayList<>();
		ArrayList<Transportadora> auxiliar = (ArrayList)transportadoras.clone();
		int indexI;
		int indexj;
		for(Transportadora transportadora: auxiliar){
			indexI = 1;
			Transportadora aux = transportadoras.get(indexI);
			indexj = indexI - 1;
			while( (indexj >=0) && ( vendasTransportadora(auxiliar.get(indexj)) > vendasTransportadora(aux) ) ){
				auxiliar.set(indexj + 1, auxiliar.get(indexj));
				indexj--;
			}
			auxiliar.set(indexj, aux);
			indexI++;
		}
		for(int i = 1; i <= 3; i++){
			resultado.add(auxiliar.get(auxiliar.size() - i ));
		}
		return resultado.iterator();
	}
	
	public int vendasTransportadora(Transportadora transportadora){
		int resultado = 0;
		Iterator<Venda> vends = vendas.iterator();
		while(vends.hasNext()) {
			if(vends.next().getTransportadora().getCnpj().equalsIgnoreCase(transportadora.getCnpj())){
				resultado++;
			}
		}
		return resultado;
	}

	public Iterator<Produto> produtosMaisVendidos(){
		ArrayList<Produto> resultado = new ArrayList<>();
		ArrayList<Produto> auxiliar = (ArrayList)produtos.clone();
		int indexI;
		int indexj;
		for(Produto prod: auxiliar){
			indexI = 1;
			Produto aux = auxiliar.get(indexI);
			indexj = indexI -1;
			while( (indexj >=0) && ( vendasProduto(auxiliar.get(indexj)) > vendasProduto(aux) ) ){
				auxiliar.set(indexj + 1, auxiliar.get(indexj));
				indexj--;
			}
			if (indexj > -1)
				auxiliar.set(indexj, aux);
			indexI++;
		}
		int tamanho = auxiliar.size();
		for(int i = 1; i <= 10 && i < tamanho - 1; i++){
			resultado.add(auxiliar.get(auxiliar.size() - i ));
		}
		return resultado.iterator();
	}

	public int vendasProduto(Produto produto){
		int resultado = 0;
		Iterator<Venda> vends = vendas.iterator();
		while(vends.hasNext()) {
			Iterator<ItemVenda> itens = vends.next().getItensVenda().iterator();
			while(itens.hasNext()) {
				if(itens.next().getProduto().getCodigo().equalsIgnoreCase(produto.getCodigo())) {
					resultado++;
				}
			}
		}
		return resultado;
	}

	public Iterator<Fabricante> topFabricantesVolume(){
		ArrayList<Fabricante> resultado = new ArrayList<>();
		ArrayList<Fabricante> auxiliar = (ArrayList)fabricantes.clone();
		int indexI;
		int indexj;
		for(Fabricante fabri: auxiliar){
			indexI = 1;
			Fabricante aux = auxiliar.get(indexI);
			indexj = indexI -1;
			while( (indexj >=0) && ( fabricanteItens(auxiliar.get(indexj)) > fabricanteItens(aux) ) ){
				auxiliar.set(indexj + 1, auxiliar.get(indexj));
				indexj--;
			}
			if (indexj > -1) 
				auxiliar.set(indexj, aux);
			indexI++;
		}
		for(int i = 1; i <= 3; i++){
			resultado.add(auxiliar.get(auxiliar.size() - i ));
		}
		return resultado.iterator();
	}

	public int fabricanteItens(Fabricante fabricante){
		int resultado = 0;
		Iterator<Venda> vends = vendas.iterator();
		
		while(vends.hasNext()) {
			Iterator<ItemVenda> itens = vends.next().getItensVenda().iterator();
			while(itens.hasNext()) {
				ItemVenda item = itens.next();
				if(item.getProduto().getFabricante().getCnpj().equals(fabricante.getCnpj())) {
					resultado += item.getQuantidade();
				}
			}
		}
		return resultado;
	}

	public Iterator<Fabricante> topFabricantesLucro(){
		ArrayList<Fabricante> resultado = new ArrayList<>();
		ArrayList<Fabricante> auxiliar = (ArrayList)fabricantes.clone();
		int indexI;
		int indexj;
		for(Fabricante fabri: auxiliar){
			indexI = 1;
			Fabricante aux = auxiliar.get(indexI);
			indexj = indexI -1;
			while( (indexj >=0) && ( fabricanteLucro(auxiliar.get(indexj)) > fabricanteLucro(aux) ) ){
				auxiliar.set(indexj + 1, auxiliar.get(indexj));
				indexj--;
			}
			if(indexj >-1)
				auxiliar.set(indexj, aux);
			indexI++;
		}
		for(int i = 1; i <= 3; i++){
			resultado.add(auxiliar.get(auxiliar.size() - i ));
		}
		return resultado.iterator();
	}

	public double fabricanteLucro(Fabricante fabricante){
		double resultado = 0;
		Iterator<Venda> vends = vendas.iterator();
		Iterator<ItemVenda> itens;
		while(vends.hasNext()){
			itens = vends.next().getItensVenda().iterator();
			while(itens.hasNext()) {
				ItemVenda item = itens.next();
				if(item.getProduto().getFabricante().getCnpj().equals(fabricante.getCnpj())) {
					resultado += item.getValor();
				}
			}
			
		}
		return resultado;
	}


	public Produto buscaProduto(String codigo){
		Produto resultado;
		Iterator<Produto> prods = produtos.iterator();
		while(prods.hasNext()) {
			resultado = prods.next();
			if(resultado.getCodigo().equalsIgnoreCase(codigo)) {
				return resultado;
			}
		}
		return null;
	}

	public Transportadora buscaTransportadora(String cnpj){
		Iterator<Transportadora> transports = transportadoras.iterator();
		Transportadora resultado;
		while(transports.hasNext()) {
			resultado = transports.next();
			if(resultado.getCnpj().equalsIgnoreCase(cnpj))
				return resultado;
		}
		return null;
	}

	public Fabricante buscaFabricante(String cnpj){
		Iterator<Fabricante> fabris = fabricantes.iterator();
		Fabricante resultado;
		while(fabris.hasNext()) {
			resultado = fabris.next();
			if(resultado.getCnpj().equalsIgnoreCase(cnpj))
				return resultado;
		}
		return null;
	}

	public Usuario buscaCliente(String cpf){
		Iterator<Usuario> clients = clientes.iterator();
		Usuario resultado;
		while(clients.hasNext()) {
			resultado = clients.next();
			if(resultado.getCpf().equalsIgnoreCase(cpf))
				return resultado;
		}
		return null;
	}

	public Usuario buscaGerente(String cpf){
		Iterator<Usuario> clients = gerentes.iterator();
		Usuario resultado;
		while(clients.hasNext()) {
			resultado = clients.next();
			if(resultado.getCpf().equalsIgnoreCase(cpf))
				return resultado;
		}
		return null;
	}
	
	public Iterator<Produto> ordenarProdutos(boolean metodo){
		ArrayList<Produto> resultado = new ArrayList<>();
		Contexto contexto = new Contexto();
		resultado = contexto.ordenar(this.produtos, metodo);
		return resultado.iterator();
	}



}
