package Model.Produto;

import java.io.Serializable;
import java.time.LocalDate;

import Model.Fabricante.Fabricante;

public class Eletrodomesticos extends Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 122891429630859638L;

	public Eletrodomesticos() {
		// TODO Auto-generated constructor stub
	}

	public Eletrodomesticos(String codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
			Fabricante fabricante ) {
		super(codigo, nome, descricao, dataFabricacao, valor, fabricante);
		this.valor = calcularValor();
	}

	@Override
	public float calcularValor() {
		return (float) (valor + valor*0.035);
	}

	

}
