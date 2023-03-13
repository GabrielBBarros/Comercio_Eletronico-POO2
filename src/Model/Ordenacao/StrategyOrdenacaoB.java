package Model.Ordenacao;

import java.util.ArrayList;

import Model.Produto.Produto;
import Model.Transportadora.Transportadora;

public class StrategyOrdenacaoB extends OrdenacaoStrategy {
	
	public StrategyOrdenacaoB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Produto>ordenar(ArrayList<Produto> produtos){
		ArrayList<Produto> resultado = new ArrayList<>();
		Produto[] ordenar = new Produto[produtos.size()];
		for(int i = 0; i < produtos.size(); i++) {
			ordenar[i] = produtos.get(i);
		}
		
		int indexI;
		int indexj;
		 for (int i = 0; i < ordenar.length - 1; i++) {
		        int minIndex = i;
		        for (int j = i + 1; j < ordenar.length; j++) {
		            if (ordenar[j].getValor() < ordenar[minIndex].getValor()) {
		                minIndex = j;
		            }
		        }
		        Produto temp = ordenar[minIndex];
		        ordenar[minIndex] = ordenar[i];
		        ordenar[i] = temp;
		    }
		 int tamanho = produtos.size();
		 for( int i = 0; (i < 10) && (i < tamanho); i++) {
				resultado.add(ordenar[tamanho - i - 1]);
			}
		return resultado;
	}
}
