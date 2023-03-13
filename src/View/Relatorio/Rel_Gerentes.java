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
import Model.Usuario.Gerente;
import Model.Usuario.Usuario;

public class Rel_Gerentes extends JDialog {

	private ControladorUsuario controle;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private String [][] dados;
	private String [] titulos = {"Codigo", "Nome", "CPF", "RG", "Data Nascimento", "Endereco", "CEP", "Email", "Salario", "PIS", "Data Admissao" };
	private int linha;
	private int coluna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Gerentes dialog = new Rel_Gerentes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Gerentes() {
		controle = ControladorUsuario.getInstancia();
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		setTamDadosgerentes();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
	}
	
	public void setTamDadosgerentes(){
		this.dados = new String[controle.getTamanhoGerentes()][11];
	}
	
	public void setTable() {
		
		Iterator<Usuario> gerentes = controle.getGerente();
		this.linha = 0;
		
		while(gerentes.hasNext()) {
			this.coluna = 0;
			Gerente gerente = (Gerente) gerentes.next();
			
			String codigo = gerente.getCodigo();
			String nome = gerente.getNome();
			String CPF = gerente.getCpf();
			String RG = gerente.getRG();
			LocalDate dataNascimento = gerente.getDataNascimento();
			String data = dataNascimento.getDayOfMonth()+"/"+dataNascimento.getMonthValue()+"/"+dataNascimento.getYear();
			String endereco = gerente.getEndereco();
			String CEP = gerente.getCep();
			String email = gerente.getEmail();
			String salario = Float.toString(gerente.getSalario());
			String pis = gerente.getPis();
			LocalDate dataAdmissao = gerente.getDataAdmissao();
			String cadastro = dataAdmissao.getDayOfMonth()+"/"+dataAdmissao.getMonthValue()+"/"+dataAdmissao.getYear();
			
			
			
			
			
			dados[this.linha][this.coluna] = codigo; this.coluna++;
			dados[this.linha][this.coluna] = nome; this.coluna++;
			dados[this.linha][this.coluna] = CPF; this.coluna++;
			dados[this.linha][this.coluna] = RG; this.coluna++;
			dados[this.linha][this.coluna] = data; this.coluna++;
			dados[this.linha][this.coluna] = endereco; this.coluna++;
			dados[this.linha][this.coluna] = CEP; this.coluna++;
			dados[this.linha][this.coluna] = email; this.coluna++;
			dados[this.linha][this.coluna] = salario; this.coluna++;
			dados[this.linha][this.coluna] = pis; this.coluna++;
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
		
		setTamDadosgerentes();
		setTable();
		
		table = new JTable(dados, titulos);
		table.setEnabled(false);
		
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		
	}
}
