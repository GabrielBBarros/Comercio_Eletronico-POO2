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
import Model.Transportadora.Transportadora;



public class Rel_Transportadoras extends JDialog {

	private ControladorProduto controle;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private String [][] dados;
	private String [] titulos = {"Codigo", "CNPJ", "Nome", "Email", "Telefone", "Endereco", "Tempo de entrega" };
	private int linha;
	private int coluna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			 Rel_Transportadoras dialog = new  Rel_Transportadoras();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public  Rel_Transportadoras() {
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadostransportadoras();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
	}
	
	public void setTamDadostransportadoras(){
		this.dados = new String[controle.getTamanhoTransportadoras()][11];
	}
	
	public void setTable() {
		
		Iterator<Transportadora> transportadora = controle.getTransportadoras();
		this.linha = 0;
		
		while(transportadora.hasNext()) {
			this.coluna = 0;
			Transportadora transport = (Transportadora) transportadora.next();
			
			String codigo =transport.getCodigo();
			String cnpj = transport.getCnpj();
			String nome = transport.getNome();
			String email = transport.getEmail();
			String telefone = transport.getTelefone();
			String endereco = transport.getEndereco();
			String tempo_de_entrega = Integer.toString(transport.getTempoDeEntrega());

			
			
			
			
			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = cnpj; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = email; this.coluna++;
			dados[this.linha][this.coluna] = telefone; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
			dados[this.linha][this.coluna] = tempo_de_entrega; this.coluna++;

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
		
		setTamDadostransportadoras();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		
	}
}
