package View.Cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorUsuario;

import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class Cad_Cliente extends JDialog {

	private ControladorUsuario controle;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_Nome;
	private JTextField textField_CPF;
	private JTextField textField_DiaNascimento;
	private JTextField textField_MesNascimento;
	private JTextField textField_AnoNascimento;
	private JTextField textField_RG;
	private JTextField textField_Endereco;
	private JTextField textField_CEP;
	private JTextField textField_Email;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Cliente dialog = new Cad_Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Cliente() {
		controle = ControladorUsuario.getInstancia();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNome.setBounds(52, 88, 86, 61);
		contentPanel.add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setColumns(10);
		textField_Nome.setBounds(125, 103, 676, 25);
		contentPanel.add(textField_Nome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCpf.setBounds(52, 138, 121, 61);
		contentPanel.add(lblCpf);
		
		textField_CPF = new JTextField();
		textField_CPF.setColumns(10);
		textField_CPF.setBounds(123, 154, 269, 25);
		contentPanel.add(textField_CPF);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDataDeNascimento.setBounds(52, 241, 197, 61);
		contentPanel.add(lblDataDeNascimento);
		
		textField_DiaNascimento = new JTextField();
		textField_DiaNascimento.setColumns(10);
		textField_DiaNascimento.setBounds(259, 257, 63, 25);
		contentPanel.add(textField_DiaNascimento);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setForeground(Color.WHITE);
		lblDia.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblDia.setBounds(275, 241, 47, 25);
		contentPanel.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblMes.setBounds(360, 241, 47, 25);
		contentPanel.add(lblMes);
		
		JLabel lblValor_1 = new JLabel(" /");
		lblValor_1.setForeground(Color.WHITE);
		lblValor_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1.setBounds(323, 259, 34, 33);
		contentPanel.add(lblValor_1);
		
		textField_MesNascimento = new JTextField();
		textField_MesNascimento.setColumns(10);
		textField_MesNascimento.setBounds(344, 257, 63, 25);
		contentPanel.add(textField_MesNascimento);
		
		JLabel lblValor_1_1 = new JLabel(" /");
		lblValor_1_1.setForeground(Color.WHITE);
		lblValor_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1_1.setBounds(408, 257, 34, 39);
		contentPanel.add(lblValor_1_1);
		
		textField_AnoNascimento = new JTextField();
		textField_AnoNascimento.setColumns(10);
		textField_AnoNascimento.setBounds(428, 257, 63, 25);
		contentPanel.add(textField_AnoNascimento);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblAno.setBounds(444, 241, 47, 25);
		contentPanel.add(lblAno);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setForeground(Color.WHITE);
		lblRg.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblRg.setBounds(52, 189, 63, 61);
		contentPanel.add(lblRg);
		
		textField_RG = new JTextField();
		textField_RG.setColumns(10);
		textField_RG.setBounds(125, 205, 170, 25);
		contentPanel.add(textField_RG);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEndereco.setBounds(52, 287, 197, 61);
		contentPanel.add(lblEndereco);
		
		textField_Endereco = new JTextField();
		textField_Endereco.setColumns(10);
		textField_Endereco.setBounds(174, 306, 252, 25);
		contentPanel.add(textField_Endereco);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.WHITE);
		lblCep.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCep.setBounds(52, 341, 112, 61);
		contentPanel.add(lblCep);
		
		textField_CEP = new JTextField();
		textField_CEP.setColumns(10);
		textField_CEP.setBounds(108, 352, 236, 25);
		contentPanel.add(textField_CEP);
		
		JLabel lblTitulo = new JLabel("Cadastro Cliente");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.BOLD, 28));
		lblTitulo.setBounds(344, 25, 269, 68);
		contentPanel.add(lblTitulo);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		btnCadastrarCliente.setBackground(new Color(60, 179, 113));
		btnCadastrarCliente.setBounds(786, 563, 121, 39);
		contentPanel.add(btnCadastrarCliente);
		
		JLabel lblDataDeCadastro = new JLabel("Email:");
		lblDataDeCadastro.setForeground(Color.WHITE);
		lblDataDeCadastro.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDataDeCadastro.setBounds(52, 392, 197, 61);
		contentPanel.add(lblDataDeCadastro);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(124, 403, 550, 25);
		contentPanel.add(textField_Email);

		
		JLabel lblClienteOuro = new JLabel("Cliente Ouro:");
		lblClienteOuro.setForeground(Color.WHITE);
		lblClienteOuro.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblClienteOuro.setBounds(52, 436, 138, 61);
		contentPanel.add(lblClienteOuro);

		JCheckBox clienteOuro = new JCheckBox("Sim");
		clienteOuro.setBounds(187, 447, 157, 25);
		clienteOuro.setBackground(new Color(75, 101, 173));
		contentPanel.add(clienteOuro);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(786, 527, 145, 25);
		contentPanel.add(lblAviso);



		btnCadastrarCliente.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				try {
					lblAviso.setText("");
					String nome = textField_Nome.getText().trim();
					String cpf = textField_CPF.getText().trim();
					String rg = textField_RG.getText().trim();
					int dia = Integer.parseInt(textField_DiaNascimento.getText().trim());
					int mes = Integer.parseInt(textField_MesNascimento.getText().trim());
					int ano = Integer.parseInt(textField_AnoNascimento.getText().trim());
					LocalDate nascimento = LocalDate.parse(setData(dia, mes, ano));
					String endereco = textField_Endereco.getText().trim();
					String cep = textField_CEP.getText().trim();
					String email = textField_Email.getText().trim();
					controle.cadCliente(nome, cpf, rg, nascimento, endereco, cep, email, LocalDate.now(), clienteOuro.isSelected());
					lblAviso.setText("Cadastro Efetuado!");
					cleanCampos();
				} catch (Exception e2) {
					lblAviso.setText("Erro no cadastro");
				}
			}           
		});

	}


	public String setData(int dia, int mes, int ano) {
		if(dia >= 10) {
			if(mes >= 10) {
				return Integer.toString(ano) + "-" + Integer.toString(mes) + "-" + Integer.toString(dia);
			}
			else {
				return Integer.toString(ano) + "-0" + Integer.toString(mes) + "-" + Integer.toString(dia);
			}
		}
		else {
			if(mes >= 10) {
				return Integer.toString(ano) + "-" + Integer.toString(mes) + "-0" + Integer.toString(dia);
			}
			else {
				return Integer.toString(ano) + "-0" + Integer.toString(mes) + "-0" + Integer.toString(dia);
			}
		}
	}
	
	public void cleanCampos() {
		String nula = "";
		textField_AnoNascimento.setText(nula);
		textField_CEP.setText(nula);
		textField_CPF.setText(nula);
		textField_DiaNascimento.setText(nula);
		textField_Email.setText(nula);
		textField_Endereco.setText(nula);
		textField_MesNascimento.setText(nula);
		textField_Nome.setText(nula);
		textField_RG.setText(nula);
	}
}
