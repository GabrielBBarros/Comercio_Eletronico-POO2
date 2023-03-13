package Model.Produto;

import java.io.Serializable;
import java.time.LocalDate;

import Model.Fabricante.Fabricante;

public class Eletronicos extends Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1366666717070447636L;

	public Eletronicos() {
		// TODO Auto-generated constructor stub
	}

	public Eletronicos(String codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
			Fabricante fabricante ) {
		super(codigo, nome, descricao, dataFabricacao, valor, fabricante);
		this.valor = calcularValor();
	}

	@Override
	public float calcularValor() {
		return (float) (valor + valor*0.0525);
	}
	
	

}
