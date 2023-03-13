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
import Model.Produto.Vestuario;
import Model.Produto.Produto;

public class Rel_Vestuario extends JDialog {

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
			Rel_Vestuario dialog = new Rel_Vestuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Vestuario() {
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosvestuario();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);

}
	public void setTamDadosvestuario(){
		this.dados = new String[controle.getTamanhoVestuarios()][8];
	}
	
public void setTable() {
		
		Iterator<Produto> vestuarios = controle.getVestuarios();
		this.linha = 0;
		
		while(vestuarios.hasNext()) {
			this.coluna = 0;
			Vestuario vestuario = (Vestuario) vestuarios.next();
			
			String codigo = vestuario.getCodigo();
			String nome = vestuario.getNome();
			String descricao = vestuario.getDescricao();
			LocalDate dataFabricacao = vestuario.getDataFabricacao();
			String data = dataFabricacao.getDayOfMonth()+"/"+dataFabricacao.getMonthValue()+"/"+dataFabricacao.getYear();
			String valor = Float.toString(vestuario.getValor());
			String fabricante = vestuario.getFabricante().getNome();
			String disponivel;
				if(vestuario.isDisponivel()) {
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
