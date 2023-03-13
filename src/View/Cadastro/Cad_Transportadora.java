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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cad_Transportadora extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_CNPJ;
	private JTextField textField_Nome;
	private JTextField textField_Email;
	private JTextField textField_Telefone;
	private JTextField textField_Endereco;
	private JTextField textField_Tempo_de_Entrega;
	private ControladorProduto controlador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Transportadora dialog = new Cad_Transportadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Transportadora() {
		controlador = ControladorProduto.getInstancia();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Transportadora");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.BOLD, 28));
		lblTitulo.setBounds(323, 10, 386, 68);
		contentPanel.add(lblTitulo);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setForeground(Color.WHITE);
		lblCnpj.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCnpj.setBounds(81, 73, 86, 61);
		contentPanel.add(lblCnpj);
		
		textField_CNPJ = new JTextField();
		textField_CNPJ.setColumns(10);
		textField_CNPJ.setBounds(154, 88, 676, 25);
		contentPanel.add(textField_CNPJ);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNome.setBounds(81, 144, 121, 61);
		contentPanel.add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setColumns(10);
		textField_Nome.setBounds(154, 160, 676, 25);
		contentPanel.add(textField_Nome);
		
		
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEmail.setBounds(81, 205, 86, 61);
		contentPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(154, 220, 676, 25);
		contentPanel.add(textField_Email);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblTelefone.setBounds(81, 276, 121, 61);
		contentPanel.add(lblTelefone);
		
		textField_Telefone = new JTextField();
		textField_Telefone.setColumns(10);
		textField_Telefone.setBounds(190, 292, 640, 25);
		contentPanel.add(textField_Telefone);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEndereco.setBounds(81, 349, 109, 61);
		contentPanel.add(lblEndereco);
		
		textField_Endereco = new JTextField();
		textField_Endereco.setColumns(10);
		textField_Endereco.setBounds(190, 364, 640, 25);
		contentPanel.add(textField_Endereco);
		
		JLabel lblTempoDeEntrega = new JLabel("Tempo de entrega (em dias):");
		lblTempoDeEntrega.setForeground(Color.WHITE);
		lblTempoDeEntrega.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblTempoDeEntrega.setBounds(81, 420, 282, 61);
		contentPanel.add(lblTempoDeEntrega);
		
		textField_Tempo_de_Entrega = new JTextField();
		textField_Tempo_de_Entrega.setColumns(10);
		textField_Tempo_de_Entrega.setBounds(360, 436, 101, 25);
		contentPanel.add(textField_Tempo_de_Entrega);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(744, 517, 121, 20);
		contentPanel.add(lblAviso);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//String codigo, String cnpj, String nome, String email, String telefone, String endereco, int tempoDeEntrega
				try {
					lblAviso.setText("");
					String cnpj = textField_CNPJ.getText().trim();
					String nome = textField_Nome.getText().trim();
					String email = textField_Email.getText().trim();
					String telefone = textField_Telefone.getText().trim();
					String endereco = textField_Endereco.getText().trim();
					int tempo_de_entrega = Integer.parseInt(textField_Tempo_de_Entrega.getText());
					controlador.cadTransportadora(cnpj, nome, email, telefone, endereco, tempo_de_entrega);
					lblAviso.setText("Cadastro Concluido.");
					cleanCampos();
				} catch (Exception e2) {
					lblAviso.setText("Erro no Cadastro");
				}
			}
		});
		btnCadastrar.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		btnCadastrar.setBackground(new Color(60, 179, 113));
		btnCadastrar.setBounds(744, 548, 121, 39);
		contentPanel.add(btnCadastrar);
	}
	
	public void cleanCampos() {
		String nula = "";
		textField_CNPJ.setText(nula);
		textField_Nome.setText(nula);
		textField_Email.setText(nula);
		textField_Telefone.setText(nula);
		textField_Endereco.setText(nula);
		textField_Tempo_de_Entrega.setText(nula);
	}
	
	
}
