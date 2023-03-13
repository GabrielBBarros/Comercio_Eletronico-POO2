package Model.Ordenacao;

import java.util.ArrayList;
import java.util.Iterator;

import Model.Produto.Produto;
import Model.Venda.ItemVenda;
import Model.Venda.Venda;

public class StrategyOrdenacaoA extends OrdenacaoStrategy {

	public StrategyOrdenacaoA() {
		// TODO Auto-generated constructor stub
	}

	
	//Ordena pelo insertion short
	@Override
	public ArrayList<Produto> ordenar(ArrayList<Produto> produtos){
		ArrayList<Produto> resultado = new ArrayList<>();
		Produto[] ordenar = new Produto[produtos.size()];
		for(int i = 0; i < produtos.size(); i++) {
			ordenar[i] = produtos.get(i);
		}
		
		int tamanho = produtos.size();
		for(int i = 1; i < tamanho; i++) {
			Produto key = ordenar[i];
			int j = i - 1;
			while ( (j >= 0) && (ordenar[j].getValor() > key.getValor()) ) {
				ordenar[j + 1] = ordenar[j];
				j--;
			}
			ordenar[j+1] = key;
		}
		for( int i = 0; (i < 10) && (i < tamanho); i++) {
			resultado.add(ordenar[tamanho - i - 1]);
		}
		return resultado;
	}

}
