package Model.Produto;

import java.io.Serializable;
import java.time.LocalDate;

import Model.Fabricante.Fabricante;

public class Moveis extends Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239745409399223033L;

	public Moveis() {
		
	}

	public Moveis(String codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
			Fabricante fabricante) {
		super(codigo, nome, descricao, dataFabricacao, valor, fabricante);
		this.valor = calcularValor();
	}

	@Override
	public float calcularValor() {
		return (float) (valor + valor*0.075);
	}

	
	

}
