package View.Cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorProduto;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cad_Fabricante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private ControladorProduto controlador;
	private JTextField textField_CNPJ;
	private JTextField textField_Nome;
	private JTextField textField_Email;
	private JTextField textField_Telefone;
	private JTextField textField_Endereco;
	private JTextField textField_Descricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Fabricante dialog = new Cad_Fabricante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Fabricante() {
		controlador = ControladorProduto.getInstancia();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCadastroDeFabricante = new JLabel("Cadastro de Fabricante");
		lblCadastroDeFabricante.setForeground(Color.WHITE);
		lblCadastroDeFabricante.setFont(new Font("Yu Gothic Medium", Font.BOLD, 28));
		lblCadastroDeFabricante.setBounds(336, 10, 386, 68);
		contentPanel.add(lblCadastroDeFabricante);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setForeground(Color.WHITE);
		lblCnpj.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCnpj.setBounds(94, 73, 86, 61);
		contentPanel.add(lblCnpj);
		
		textField_CNPJ = new JTextField();
		textField_CNPJ.setColumns(10);
		textField_CNPJ.setBounds(167, 88, 676, 25);
		contentPanel.add(textField_CNPJ);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNome.setBounds(94, 144, 121, 61);
		contentPanel.add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setColumns(10);
		textField_Nome.setBounds(167, 160, 676, 25);
		contentPanel.add(textField_Nome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEmail.setBounds(94, 288, 86, 61);
		contentPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(167, 303, 676, 25);
		contentPanel.add(textField_Email);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblTelefone.setBounds(94, 359, 121, 61);
		contentPanel.add(lblTelefone);
		
		textField_Telefone = new JTextField();
		textField_Telefone.setColumns(10);
		textField_Telefone.setBounds(203, 375, 640, 25);
		contentPanel.add(textField_Telefone);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEndereco.setBounds(94, 432, 109, 61);
		contentPanel.add(lblEndereco);
		
		textField_Endereco = new JTextField();
		textField_Endereco.setColumns(10);
		textField_Endereco.setBounds(203, 447, 640, 25);
		contentPanel.add(textField_Endereco);
		
		
		JLabel lblDescricao = new JLabel("Descricao:");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDescricao.setBounds(94, 217, 121, 61);
		contentPanel.add(lblDescricao);
		
		textField_Descricao = new JTextField();
		textField_Descricao.setColumns(10);
		textField_Descricao.setBounds(203, 233, 640, 25);
		contentPanel.add(textField_Descricao);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(757, 517, 121, 20);
		contentPanel.add(lblAviso);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//String codigo, String cnpj, String nome, String descricao, String email, String telefone, String endereco
					lblAviso.setText("");
					String cnpj = textField_CNPJ.getText().trim();
					String nome = textField_Nome.getText().trim();
					String descricao = textField_Descricao.getText().trim();
					String email = textField_Email.getText().trim();
					String telefone = textField_Telefone.getText().trim();
					String endereco = textField_Endereco.getText().trim();
					controlador.cadFabricante(cnpj, nome, descricao, email, telefone, endereco);
					cleanCampos();
					lblAviso.setText("Cadastro concluido.");
				} catch (Exception e2) {
					lblAviso.setText("Erro no cadastro.");
				}
			}
		});
		btnCadastrar.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		btnCadastrar.setBackground(new Color(60, 179, 113));
		btnCadastrar.setBounds(757, 548, 121, 39);
		contentPanel.add(btnCadastrar);
	}
	
	public void cleanCampos() {
		String nula = "";
		textField_CNPJ.setText(nula);
		textField_Nome.setText(nula);
		textField_Descricao.setText(nula);
		textField_Email.setText(nula);
		textField_Telefone.setText(nula);
		textField_Endereco.setText(nula);
	}
}
