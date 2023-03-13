package Model.Produto;

import java.io.Serializable;
import java.time.LocalDate;

import Model.Fabricante.Fabricante;

public class Vestuario extends Produto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2159776842088235928L;

	public Vestuario() {
		
	}
	
	public Vestuario(String codigo, String nome, String descricao, LocalDate dataFabricacao, float valor,
			Fabricante fabricante ) {
		super(codigo, nome, descricao, dataFabricacao, valor, fabricante);
		this.valor = calcularValor();
	}
	

	@Override
	public float calcularValor() {
		return (float) (valor + valor*0.0115);
	}
	

}
