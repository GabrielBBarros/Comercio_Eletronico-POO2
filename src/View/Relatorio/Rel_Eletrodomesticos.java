package View.Relatorio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.Iterator;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.*;
import Model.Produto.Eletrodomesticos;
import Model.Produto.Produto;

public class Rel_Eletrodomesticos extends JDialog {

	private ControladorProduto controle;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private String [][] dados;
	private String [] titulos = {"Codigo", "Nome", "Descricao", "Data Fabricacao", "Valor", "Fabricante", "Disponivel" };
	private int linha;
	private int coluna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Eletrodomesticos dialog = new Rel_Eletrodomesticos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Eletrodomesticos() {
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadoseletrodomestico();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);

}
	public void setTamDadoseletrodomestico(){
		this.dados = new String[controle.getTamanhoEletrodomesticos()][8];
	}
	
public void setTable() {
		
		Iterator<Produto> eletrodomesticos = controle.getEletrodomesticos();
		this.linha = 0;
		
		while(eletrodomesticos.hasNext()) {
			this.coluna = 0;
			Eletrodomesticos eletrodomestico = (Eletrodomesticos) eletrodomesticos.next();
			
			String codigo = eletrodomestico.getCodigo();
			String nome = eletrodomestico.getNome();
			String descricao = eletrodomestico.getDescricao();
			LocalDate dataFabricacao = eletrodomestico.getDataFabricacao();
			String data = dataFabricacao.getDayOfMonth()+"/"+dataFabricacao.getMonthValue()+"/"+dataFabricacao.getYear();
			String valor = Float.toString(eletrodomestico.getValor());
			String fabricante = eletrodomestico.getFabricante().getNome();
			String disponivel;
				if(eletrodomestico.isDisponivel()) {
					disponivel = "Sim";
				}
				else {
					disponivel = "Nao";
				}
			
			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = descricao; this.coluna++;
			dados[this.linha][this.coluna] = data; this.coluna++;
			dados[this.linha][this.coluna] = valor; this.coluna++;
			dados[this.linha][this.coluna] = fabricante; this.coluna++;
			dados[this.linha][this.coluna] = disponivel; this.coluna++;
			
			this.linha++;
		}
	}

	
}
