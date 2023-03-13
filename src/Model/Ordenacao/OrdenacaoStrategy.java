package Model.Ordenacao;

import java.util.ArrayList;

import Model.Produto.Produto;

public abstract class OrdenacaoStrategy {

	public OrdenacaoStrategy() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Produto>ordenar(ArrayList<Produto> produtos){
		ArrayList<Produto> resultado = new ArrayList<>();
		return resultado;
	}
	
}
