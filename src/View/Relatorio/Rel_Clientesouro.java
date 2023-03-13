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
import Model.Usuario.Cliente;
import Model.Usuario.Usuario;




public class Rel_Clientesouro extends JDialog {

	private ControladorUsuario controle;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private String [][] dados;
	private String [] titulos = {"Codigo", "Nome", "CPF", "RG", "Data Nascimento", "Endereco", "CEP", "Email", "Data Cadastro" };
	private int linha;
	private int coluna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Clientesouro dialog = new Rel_Clientesouro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Clientesouro() {
		controle = ControladorUsuario.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosclientesouro();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
	}
	
	public void setTamDadosclientesouro(){
		this.dados = new String[controle.getTamanhoClientesouro()][9];
	}
	
	public void setTable() {
		
		Iterator<Usuario> clientes = controle.getClientesOuro();
		this.linha = 0;
		
		while(clientes.hasNext()) {
			this.coluna = 0;
			Cliente cliente = (Cliente) clientes.next();
			
			String codigo = cliente.getCodigo();
			String nome = cliente.getNome();
			String CPF = cliente.getCpf();
			String RG = cliente.getRG();
			LocalDate dataNascimento = cliente.getDataNascimento();
			String data = dataNascimento.getDayOfMonth()+"/"+dataNascimento.getMonthValue()+"/"+dataNascimento.getYear();
			String endereco = cliente.getEndereco();
			String CEP = cliente.getCep();
			String email = cliente.getEmail();
			LocalDate dataCadastro = cliente.getDataCadastro();
			String cadastro = dataCadastro.getDayOfMonth()+"/"+dataCadastro.getMonthValue()+"/"+dataCadastro.getYear();
			String ouro;
			if(cliente.isClienteOuro())
				ouro = "Sim";
			else 
				ouro = "Nao";
			
			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = CPF; this.coluna++;
			dados[this.linha][this.coluna] = RG; this.coluna++;
			dados[this.linha][this.coluna] = data; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
			dados[this.linha][this.coluna] = CEP; this.coluna++;
			dados[this.linha][this.coluna] = email; this.coluna++;
			dados[this.linha][this.coluna] = cadastro; this.coluna++;
			this.linha++;
		}
	}
	
	public void attPagina() {
		getContentPane().removeAll();
		contentPanel.removeAll();
		controle = ControladorUsuario.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosclientesouro();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		
	}

}