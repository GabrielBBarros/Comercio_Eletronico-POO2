package View.Cadastro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorProduto;
import Model.Fabricante.Fabricante;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
public class Cad_Produto extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	private JTextField textField_Nome;
	private JTextField textField_Descricao;
	private JTextField textField_Valor;
	private JTextField textField_Dia;
	private JTextField textField_Mes;
	private JTextField textField_Ano;
	private ControladorProduto controle;
	private JRadioButton JRMovel;
	private JRadioButton JREletrodomestico;
	private JRadioButton JREletronico;
	private JRadioButton JRVestuario;

	private ButtonGroup grupo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Produto dialog = new Cad_Produto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Produto() {
		controle = ControladorProduto.getInstancia();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Produto");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Yu Gothic Medium", Font.BOLD, 28));
		lblTitulo.setBounds(305, 45, 386, 68);
		contentPanel.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblNome.setBounds(63, 108, 86, 61);
		contentPanel.add(lblNome);
		
		JLabel lblDescricao = new JLabel("Descricao:");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDescricao.setBounds(63, 179, 121, 61);
		contentPanel.add(lblDescricao);
		
		JLabel lblDataDeFabricacao = new JLabel("Data de fabricacao:");
		lblDataDeFabricacao.setForeground(Color.WHITE);
		lblDataDeFabricacao.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDataDeFabricacao.setBounds(63, 250, 197, 61);
		contentPanel.add(lblDataDeFabricacao);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblValor.setBounds(63, 321, 63, 61);
		contentPanel.add(lblValor);

				
		JRMovel = new JRadioButton("Movel");
		JRMovel.setBounds(63, 479, 120, 25);
		JRMovel.setActionCommand("Movel");
		JRMovel.setBackground(new Color(75, 101, 173));
		JRMovel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		JRMovel.setFocusPainted(false);
		
		JREletrodomestico = new JRadioButton("Eletrodomestico");
		JREletrodomestico.setBounds(63, 504, 170, 25);
		JREletrodomestico.setActionCommand("Eletrodomestico");
		JREletrodomestico.setBackground(new Color(75, 101, 173));
		JREletrodomestico.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		JREletrodomestico.setFocusPainted(false);


		JREletronico = new JRadioButton("Eletronico");
		JREletronico.setBounds(63, 529, 120, 25);
		JREletronico.setActionCommand("Eletronico");
		JREletronico.setBackground(new Color(75, 101, 173));
		JREletronico.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		JREletronico.setFocusPainted(false);


		JRVestuario = new JRadioButton("Vestuario");
		JRVestuario.setBounds(63, 554, 120, 25);
		JRVestuario.setActionCommand("Vestuario");
		JRVestuario.setBackground(new Color(75, 101, 173));
		JRVestuario.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		JRVestuario.setFocusPainted(false);

		grupo = new ButtonGroup();
		grupo.add(JRMovel);
		grupo.add(JREletrodomestico);
		grupo.add(JREletronico);
		grupo.add(JRVestuario);
		
		contentPanel.add(JRMovel);
		contentPanel.add(JREletrodomestico);
		contentPanel.add(JREletronico);
		contentPanel.add(JRVestuario);

		
		
		JLabel lblFabricacao = new JLabel("Fabricante:");
		lblFabricacao.setForeground(Color.WHITE);
		lblFabricacao.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblFabricacao.setBounds(63, 392, 197, 61);
		contentPanel.add(lblFabricacao);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(136, 123, 676, 25);
		contentPanel.add(textField_Nome);
		textField_Nome.setColumns(10);
		
		textField_Descricao = new JTextField();
		textField_Descricao.setColumns(10);
		textField_Descricao.setBounds(172, 195, 640, 25);
		contentPanel.add(textField_Descricao);
		
		textField_Valor = new JTextField();
		textField_Valor.setColumns(10);
		textField_Valor.setBounds(129, 337, 170, 25);
		contentPanel.add(textField_Valor);
		
		textField_Dia = new JTextField();
		textField_Dia.setColumns(10);
		textField_Dia.setBounds(270, 266, 63, 25);
		contentPanel.add(textField_Dia);
		
		textField_Mes = new JTextField();
		textField_Mes.setColumns(10);
		textField_Mes.setBounds(355, 266, 63, 25);
		contentPanel.add(textField_Mes);
		
		textField_Ano = new JTextField();
		textField_Ano.setColumns(10);
		textField_Ano.setBounds(439, 266, 63, 25);
		contentPanel.add(textField_Ano);
		
		JLabel lblBarra1 = new JLabel(" /");
		lblBarra1.setForeground(Color.WHITE);
		lblBarra1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblBarra1.setBounds(334, 268, 34, 33);
		contentPanel.add(lblBarra1);
		
		JLabel lblBarra2 = new JLabel(" /");
		lblBarra2.setForeground(Color.WHITE);
		lblBarra2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblBarra2.setBounds(419, 266, 34, 39);
		contentPanel.add(lblBarra2);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setForeground(Color.WHITE);
		lblDia.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblDia.setBounds(286, 250, 47, 25);
		contentPanel.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblMes.setBounds(371, 250, 47, 25);
		contentPanel.add(lblMes);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblAno.setBounds(455, 250, 47, 25);
		contentPanel.add(lblAno);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(60, 179, 113));
		btnCadastrar.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		btnCadastrar.setBounds(797, 583, 121, 39);
		contentPanel.add(btnCadastrar);
		
		JComboBox<Fabricante> comboBox = new JComboBox<Fabricante>();
		comboBox.setBounds(183, 409, 185, 22);
		contentPanel.add(comboBox);
		
		JLabel lblAviso = new JLabel("  ");
		lblAviso.setBounds(797, 554, 121, 17);
		contentPanel.add(lblAviso);
		
		Iterator<Fabricante> fabricantes = controle.getFabricantes();
		while(fabricantes.hasNext()) {
			Fabricante fabricante = fabricantes.next();
			comboBox.addItem(fabricante);
		}
		
		btnCadastrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					lblAviso.setText("");
					String tipo = getTipo();
					String nome = textField_Nome.getText().trim();
					String descricao = textField_Descricao.getText().trim();
					float valor =  Float.parseFloat(textField_Valor.getText().trim());
					Object selectedItem = comboBox.getSelectedItem();
					Fabricante fabricante = (Fabricante) selectedItem;
					System.out.println(fabricante.getCnpj());
					int dia, mes, ano;
					dia = Integer.parseInt(textField_Dia.getText().trim());
					mes = Integer.parseInt(textField_Mes.getText().trim());
					ano = Integer.parseInt(textField_Ano.getText().trim());
					LocalDate dataFabricacao = LocalDate.parse(setData(dia, mes, ano));
					controle.cadProduto(tipo, nome, descricao, dataFabricacao, valor, fabricante);
					lblAviso.setText("Cadastro concluido!");
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

	public String getTipo() {
		if(JRMovel.isSelected()) {
			return "moveis";
		} else if(JREletrodomestico.isSelected()) {
			return  "eletrodomesticos";
		} else if(JREletronico.isSelected()) {
			return  "eletronicos";
		} else {
			return "vestuario";
		}
	}

}
