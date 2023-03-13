package View.Cadastro;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorUsuario;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Cad_Gerente extends JDialog {
	
	private ControladorUsuario controle;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_Nome;
	private JTextField textField_CPF;
	private JTextField textField_RG;
	private JTextField textField_DiaNascimento;
	private JTextField textField_MesNascimento;
	private JTextField textField_AnoNascimento;
	private JTextField textField_Endereco;
	private JTextField textField_CEP;
	private JTextField textField_diaAdmissao;
	private JTextField textField_MesAdmissao;
	private JTextField textField_AnoAdmissao;
	private JTextField textField_Salario;
	private JTextField textField_Pis;
	private JTextField textField_Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Gerente dialog = new Cad_Gerente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Gerente() {
		controle = ControladorUsuario.getInstancia();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro Gerente");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.BOLD, 28));
		lblTitulo.setBounds(367, 25, 269, 68);
		contentPanel.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNome.setBounds(75, 88, 86, 61);
		contentPanel.add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setColumns(10);
		textField_Nome.setBounds(148, 103, 676, 25);
		contentPanel.add(textField_Nome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCpf.setBounds(75, 138, 121, 61);
		contentPanel.add(lblCpf);
		
		textField_CPF = new JTextField();
		textField_CPF.setColumns(10);
		textField_CPF.setBounds(146, 154, 269, 25);
		contentPanel.add(textField_CPF);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setForeground(Color.WHITE);
		lblRg.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblRg.setBounds(75, 189, 63, 61);
		contentPanel.add(lblRg);
		
		textField_RG = new JTextField();
		textField_RG.setColumns(10);
		textField_RG.setBounds(148, 205, 170, 25);
		contentPanel.add(textField_RG);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDataDeNascimento.setBounds(75, 241, 197, 61);
		contentPanel.add(lblDataDeNascimento);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setForeground(Color.WHITE);
		lblDia.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblDia.setBounds(298, 241, 47, 25);
		contentPanel.add(lblDia);
		
		textField_DiaNascimento = new JTextField();
		textField_DiaNascimento.setColumns(10);
		textField_DiaNascimento.setBounds(282, 257, 63, 25);
		contentPanel.add(textField_DiaNascimento);
		
		JLabel lblValor_1 = new JLabel(" /");
		lblValor_1.setForeground(Color.WHITE);
		lblValor_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1.setBounds(346, 259, 34, 33);
		contentPanel.add(lblValor_1);
		
		textField_MesNascimento = new JTextField();
		textField_MesNascimento.setColumns(10);
		textField_MesNascimento.setBounds(367, 257, 63, 25);
		contentPanel.add(textField_MesNascimento);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblMes.setBounds(383, 241, 47, 25);
		contentPanel.add(lblMes);
		
		JLabel lblValor_1_1 = new JLabel(" /");
		lblValor_1_1.setForeground(Color.WHITE);
		lblValor_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1_1.setBounds(431, 257, 34, 39);
		contentPanel.add(lblValor_1_1);
		
		textField_AnoNascimento = new JTextField();
		textField_AnoNascimento.setColumns(10);
		textField_AnoNascimento.setBounds(451, 257, 63, 25);
		contentPanel.add(textField_AnoNascimento);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblAno.setBounds(467, 241, 47, 25);
		contentPanel.add(lblAno);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEndereco.setBounds(75, 287, 197, 61);
		contentPanel.add(lblEndereco);
		
		textField_Endereco = new JTextField();
		textField_Endereco.setColumns(10);
		textField_Endereco.setBounds(197, 306, 252, 25);
		contentPanel.add(textField_Endereco);
		
		textField_CEP = new JTextField();
		textField_CEP.setColumns(10);
		textField_CEP.setBounds(131, 352, 236, 25);
		contentPanel.add(textField_CEP);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setForeground(Color.WHITE);
		lblCep.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCep.setBounds(75, 341, 112, 61);
		contentPanel.add(lblCep);
		
		JLabel lblDataDeCadastro = new JLabel("Data de Admissao:");
		lblDataDeCadastro.setForeground(Color.WHITE);
		lblDataDeCadastro.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDataDeCadastro.setBounds(75, 476, 197, 61);
		contentPanel.add(lblDataDeCadastro);
		
		JLabel lblDia_1 = new JLabel("Dia");
		lblDia_1.setForeground(Color.WHITE);
		lblDia_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblDia_1.setBounds(298, 476, 47, 25);
		contentPanel.add(lblDia_1);
		
		textField_diaAdmissao = new JTextField();
		textField_diaAdmissao.setColumns(10);
		textField_diaAdmissao.setBounds(282, 492, 63, 25);
		contentPanel.add(textField_diaAdmissao);
		
		JLabel lblValor_1_2 = new JLabel(" /");
		lblValor_1_2.setForeground(Color.WHITE);
		lblValor_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1_2.setBounds(346, 494, 34, 33);
		contentPanel.add(lblValor_1_2);
		
		JLabel lblMes_1 = new JLabel("Mes");
		lblMes_1.setForeground(Color.WHITE);
		lblMes_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblMes_1.setBounds(383, 476, 47, 25);
		contentPanel.add(lblMes_1);
		
		textField_MesAdmissao = new JTextField();
		textField_MesAdmissao.setColumns(10);
		textField_MesAdmissao.setBounds(367, 492, 63, 25);
		contentPanel.add(textField_MesAdmissao);
		
		JLabel lblValor_1_1_1 = new JLabel(" /");
		lblValor_1_1_1.setForeground(Color.WHITE);
		lblValor_1_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor_1_1_1.setBounds(431, 492, 34, 39);
		contentPanel.add(lblValor_1_1_1);
		
		textField_AnoAdmissao = new JTextField();
		textField_AnoAdmissao.setColumns(10);
		textField_AnoAdmissao.setBounds(451, 492, 63, 25);
		contentPanel.add(textField_AnoAdmissao);
		
		JLabel lblAno_1 = new JLabel("Ano");
		lblAno_1.setForeground(Color.WHITE);
		lblAno_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblAno_1.setBounds(467, 476, 47, 25);
		contentPanel.add(lblAno_1);
		
		JLabel lblClienteOuro = new JLabel("Salario:");
		lblClienteOuro.setForeground(Color.WHITE);
		lblClienteOuro.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblClienteOuro.setBounds(75, 386, 138, 61);
		contentPanel.add(lblClienteOuro);
		
		textField_Salario = new JTextField();
		textField_Salario.setColumns(10);
		textField_Salario.setBounds(160, 402, 157, 25);
		contentPanel.add(textField_Salario);
		
		JButton btnCadastrarGerente = new JButton("Cadastrar");
		btnCadastrarGerente.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		btnCadastrarGerente.setBackground(new Color(60, 179, 113));
		btnCadastrarGerente.setBounds(797, 611, 121, 39);
		contentPanel.add(btnCadastrarGerente);
		
		JLabel lblPis = new JLabel("Pis:");
		lblPis.setForeground(Color.WHITE);
		lblPis.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblPis.setBounds(75, 429, 138, 61);
		contentPanel.add(lblPis);
		
		textField_Pis = new JTextField();
		textField_Pis.setColumns(10);
		textField_Pis.setBounds(130, 445, 187, 25);
		contentPanel.add(textField_Pis);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblEmail.setBounds(75, 524, 57, 61);
		contentPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(148, 540, 318, 25);
		contentPanel.add(textField_Email);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(797, 580, 121, 20);
		contentPanel.add(lblAviso);


		btnCadastrarGerente.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				//(String codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
				//String cep, String email, float salario, String pis, LocalDate dataAdmissao
				
				try {
					lblAviso.setText("");
					String nome = textField_Nome.getText().trim();
					String cpf = textField_CPF.getText().trim();
					String rg = textField_RG.getText().trim();
					int dia = Integer.parseInt((textField_DiaNascimento.getText().trim()));
					int mes = Integer.parseInt((textField_MesNascimento.getText().trim()));
					int ano = Integer.parseInt((textField_AnoNascimento.getText().trim()));
					LocalDate datanascimento = LocalDate.parse(setData(dia, mes, ano));
					String endereço = textField_Endereco.getText().trim();
					String cep = textField_CEP.getText().trim();
					float salario = Float.parseFloat(textField_Salario.getText().trim());
					String pis = textField_Pis.getText().trim();
					int dia2 = Integer.parseInt((textField_diaAdmissao.getText().trim()));
					int mes2 = Integer.parseInt((textField_diaAdmissao.getText().trim()));
					int ano2 = Integer.parseInt((textField_diaAdmissao.getText().trim()));
					LocalDate dataAdmissao = LocalDate.parse(setData(dia2, mes2, ano2));
					String email = textField_Email.getText().trim();
					controle.cadGerente(nome, cpf, rg, datanascimento, endereço, cep, email, salario, pis, dataAdmissao);
					clearCampos();
					lblAviso.setText("Cadastro concluido.");
				} catch (Exception e2) {
					lblAviso.setText("Erro no cadastro.");
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
	
	public void clearCampos() {
		String nula = "";
		textField_Nome.setText(nula);
		textField_CPF.setText(nula);
		textField_RG.setText(nula);
	    textField_DiaNascimento.setText(nula);
	    textField_MesNascimento.setText(nula);
	    textField_AnoNascimento.setText(nula);
	    textField_Endereco.setText(nula);
	    textField_CEP.setText(nula);
	    textField_diaAdmissao.setText(nula);
	    textField_MesAdmissao.setText(nula);
	    textField_AnoAdmissao.setText(nula);
	    textField_Salario.setText(nula);
  	    textField_Pis.setText(nula);
	    textField_Email.setText(nula);
	}
	
	
	
	
	
	
	
	
	
	
}
