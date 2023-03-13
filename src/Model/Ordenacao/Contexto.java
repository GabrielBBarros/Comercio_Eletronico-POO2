package Model.Ordenacao;

import java.util.ArrayList;

import Model.Produto.Produto;

public class Contexto {
	
	private OrdenacaoStrategy ordenacao;

	public Contexto(){
		
	}

	public ArrayList<Produto> ordenar(ArrayList<Produto> produtos, boolean metodo){
		ArrayList<Produto> resultado = new ArrayList<>();
		
		if(metodo == true) {
			ordenacao = new StrategyOrdenacaoA();
			return ordenacao.ordenar(produtos);
		}
		else {
			ordenacao = new StrategyOrdenacaoB();
			return ordenacao.ordenar(produtos);
		}
	}
}
