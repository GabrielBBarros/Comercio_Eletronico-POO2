package Model;

import java.time.LocalDate;

import Model.Fabricante.Fabricante;
import Model.Produto.Eletrodomesticos;
import Model.Produto.Eletronicos;
import Model.Produto.Moveis;
import Model.Produto.Produto;
import Model.Produto.Vestuario;

public class FactoryProduto {

	public FactoryProduto() {
		
	}
	
	static public Produto factoryMethord(String tipo, String codigo, String nome, String descricao, LocalDate data, float valor, Fabricante fabricante) {
		
		switch (tipo.toLowerCase().trim()) {
		case "moveis":
			return new Moveis(codigo, nome, descricao, data, valor, fabricante); //codigo, nome, descricao, dataFabricacao, valor, fabricante, disponivel
		case "eletrodomesticos":
			return new Eletrodomesticos(codigo, nome, descricao, data, valor, fabricante);
		case "eletronicos":
			return new Eletronicos(codigo, nome, descricao, data, valor, fabricante);
		case "vestuario":
			return new Vestuario(codigo, nome, descricao, data, valor, fabricante);
		default:
			return null;
		}
	}

	
}
