package Model.Configuracao;

public class Configuracao {
	private String arquivoClientes;
	private String arquivoFabricantes;
	private String arquivoGerentes;
	private String arquivoProdutos;
	private String arquivoTransportadoras;
	private String arquivoVendas;
	
	
	public Configuracao() {
		this.arquivoClientes = "src/Arquivos/clientes.ser";
		this.arquivoFabricantes = "src/Arquivos/fabricantes.ser";
		this.arquivoGerentes = "src/Arquivos/gerentes.ser";
		this.arquivoProdutos = "src/Arquivos/produtos.ser";
		this.arquivoTransportadoras = "src/Arquivos/transportadoras.ser";
		this.arquivoVendas = "src/Arquivos/vendas.ser";
		
	}

	public String getArquivoClientes() {
		return arquivoClientes;
	}

	public String getArquivoFabricantes() {
		return arquivoFabricantes;
	}

	public String getArquivoGerentes() {
		return arquivoGerentes;
	}

	public String getArquivoProdutos() {
		return arquivoProdutos;
	}

	public String getArquivoTransportadoras() {
		return arquivoTransportadoras;
	}

	public String getArquivoVendas() {
		return arquivoVendas;
	}

}
