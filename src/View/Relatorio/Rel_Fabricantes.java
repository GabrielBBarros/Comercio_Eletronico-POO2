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
import Model.Fabricante.Fabricante;





public class Rel_Fabricantes extends JDialog {

	private ControladorProduto controle;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private String [][] dados;
	private String [] titulos = {"Codigo", "CNPJ", "Nome", "Descricao", "Email", "Telefone", "Endereco"};
	private int linha;
	private int coluna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Fabricantes dialog = new Rel_Fabricantes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Fabricantes() {
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosfabricantes();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
	}
	
	public void setTamDadosfabricantes(){
		this.dados = new String[controle.getTamanhoFabricantes()][7];
	}
	
	public void setTable() {
		
		Iterator<Fabricante> fabricantes = controle.getFabricantes();
		this.linha = 0;
		
		while(fabricantes.hasNext()) {
			this.coluna = 0;
			Fabricante fabricante = (Fabricante) fabricantes.next();
			
			String codigo = fabricante.getCodigo();
			String cnpj = fabricante.getCnpj();
			String nome = fabricante.getNome();
			String descricao = fabricante.getDescricao();
			String email = fabricante.getEmail();
			String telefone = fabricante.getTelefone();
			String endereco = fabricante.getEndereco();
			
			
			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = cnpj; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = descricao; this.coluna++;
			dados[this.linha][this.coluna] = email; this.coluna++;
			dados[this.linha][this.coluna] = telefone; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
		
			

			this.linha++;
		}
	}
	
	public void attPagina() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosfabricantes();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		
	}

}