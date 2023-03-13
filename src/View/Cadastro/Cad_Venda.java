package View.Cadastro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorProduto;
import Controller.ControladorUsuario;
import Controller.ControladorVenda;
import Model.Pagamento.CartaoCredito;
import Model.Pagamento.Dinheiro;
import Model.Pagamento.Pagamento;
import Model.Pagamento.Pix;
import Model.Produto.Produto;
import Model.Transportadora.Transportadora;
import Model.Usuario.Cliente;
import Model.Usuario.Gerente;
import Model.Usuario.Usuario;
import Model.Venda.ItemVenda;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Cad_Venda extends JDialog {
	
	private ControladorVenda controleVenda;
	private ControladorUsuario controleUsuario;
	private ControladorProduto controleProduto;
	private final JPanel contentPanel = new JPanel();
	private JTextField textQuantidade;
	private ButtonGroup grupo;
	private Pagamento pagamento;
	private ArrayList<ItemVenda> itens;
	private JTextField textBandeira;
	private JTextField textNumero;
	private JTextField textNome;
	private JRadioButton rdDinheiro;
	private JRadioButton rdbtnCartaoDeCredito;
	private JRadioButton rdbtnPix;
	private JTextField textCodigoPix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cad_Venda dialog = new Cad_Venda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cad_Venda() {
		controleVenda = ControladorVenda.getInstancia();
		controleUsuario = ControladorUsuario.getInstancia();
		controleProduto = ControladorProduto.getInstancia();
		itens =  new ArrayList<>();
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(75, 101, 173));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setForeground(Color.WHITE);
		lblCliente.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblCliente.setBounds(40, 95, 100, 30);
		contentPanel.add(lblCliente);
		
		JComboBox<Usuario> comboBoxCliente = new JComboBox<Usuario>();
		comboBoxCliente.setBounds(127, 97, 350, 22);
		Iterator<Usuario> clientes = controleUsuario.getClientes();
		
		while(clientes.hasNext()) {
			comboBoxCliente.addItem(clientes.next());
		}
		contentPanel.add(comboBoxCliente);
		
		JLabel lblGerente = new JLabel("Gerente");
		lblGerente.setForeground(Color.WHITE);
		lblGerente.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblGerente.setBounds(40, 174, 100, 30);
		contentPanel.add(lblGerente);
		
		JComboBox<Usuario> comboBoxGerente = new JComboBox<Usuario>();
		comboBoxGerente.setBounds(127, 176, 350, 22);
		Iterator<Usuario> gerentes = controleUsuario.getGerente();
		while(gerentes.hasNext()) {
			comboBoxGerente.addItem(gerentes.next());
		}
		contentPanel.add(comboBoxGerente);
		
		JLabel lblTransportadora = new JLabel("Transportadora");
		lblTransportadora.setForeground(Color.WHITE);
		lblTransportadora.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblTransportadora.setBounds(40, 269, 147, 30);
		contentPanel.add(lblTransportadora);
		
		JComboBox<Transportadora> comboBoxTransportadora = new JComboBox<Transportadora>();
		comboBoxTransportadora.setBounds(197, 269, 350, 22);
		Iterator<Transportadora> transportadoras = controleProduto.getTransportadoras();
		while(transportadoras.hasNext()) {
			comboBoxTransportadora.addItem(transportadoras.next());
		}
		contentPanel.add(comboBoxTransportadora);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setForeground(Color.WHITE);
		lblProduto.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblProduto.setBounds(40, 360, 100, 30);
		contentPanel.add(lblProduto);
		
		JComboBox<Produto> comboBoxProduto = new JComboBox<Produto>();
		comboBoxProduto.setBounds(127, 362, 294, 22);
		Iterator<Produto> produtos = controleProduto.getProdutos();
		while(produtos.hasNext()) {
			Produto auxiliar = produtos.next();
			if(auxiliar.isDisponivel())
				comboBoxProduto.addItem(auxiliar);
		}
		contentPanel.add(comboBoxProduto);
		
		JLabel lblQuantidade = new JLabel("Quant");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblQuantidade.setBounds(447, 360, 65, 30);
		contentPanel.add(lblQuantidade);
		
		textQuantidade = new JTextField();
		textQuantidade.setBounds(511, 363, 86, 20);
		contentPanel.add(textQuantidade);
		textQuantidade.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar ao carrinho");
		btnAdicionar.setBounds(636, 362, 170, 23);
		contentPanel.add(btnAdicionar);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Venda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(185, 29, 567, 37);
		contentPanel.add(lblNewLabel);
		
		JLabel lblPagamento = new JLabel("Pagamento");
		lblPagamento.setForeground(Color.WHITE);
		lblPagamento.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblPagamento.setBounds(27, 442, 160, 30);
		contentPanel.add(lblPagamento);
		
		rdDinheiro = new JRadioButton("Dinheiro");
		rdDinheiro.setBounds(27, 466, 125, 23);
		rdDinheiro.setBackground(new Color(75, 101, 173));
		contentPanel.add(rdDinheiro);
		
		rdbtnCartaoDeCredito = new JRadioButton("Cartao de Credito");
		rdbtnCartaoDeCredito.setBounds(27, 489, 125, 23);
		rdbtnCartaoDeCredito.setBackground(new Color(75, 101, 173));
		contentPanel.add(rdbtnCartaoDeCredito);
		
		rdbtnPix = new JRadioButton("Pix");
		rdbtnPix.setBounds(27, 512, 125, 23);
		rdbtnPix.setBackground(new Color(75, 101, 173));
		contentPanel.add(rdbtnPix);
		
		grupo = new ButtonGroup();
		grupo.add(rdbtnCartaoDeCredito);
		grupo.add(rdbtnPix);
		grupo.add(rdDinheiro);
		
		JLabel lblAvisoCarrinho = new JLabel("");
		lblAvisoCarrinho.setBounds(636, 333, 170, 22);
		contentPanel.add(lblAvisoCarrinho);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCadastrar.setBounds(755, 613, 137, 37);
		contentPanel.add(btnCadastrar);
		
		JLabel lblAvisoCadastro = new JLabel("");
		lblAvisoCadastro.setBounds(755, 586, 137, 20);
		contentPanel.add(lblAvisoCadastro);
		
		JLabel lblDadosCartao = new JLabel("Dados Cartao");
		lblDadosCartao.setForeground(Color.WHITE);
		lblDadosCartao.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDadosCartao.setBounds(182, 442, 137, 30);
		contentPanel.add(lblDadosCartao);
		
		textBandeira = new JTextField();
		textBandeira.setColumns(10);
		textBandeira.setBounds(281, 498, 209, 20);
		contentPanel.add(textBandeira);
		
		JLabel lblBandeira = new JLabel("Bandeira");
		lblBandeira.setForeground(Color.WHITE);
		lblBandeira.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblBandeira.setBounds(217, 495, 65, 25);
		contentPanel.add(lblBandeira);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNumero.setBounds(217, 531, 65, 25);
		contentPanel.add(lblNumero);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(281, 530, 209, 20);
		contentPanel.add(textNumero);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNome.setBounds(217, 468, 65, 25);
		contentPanel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(281, 467, 209, 20);
		contentPanel.add(textNome);
		
		JLabel lblDadosPix = new JLabel("Dados pix");
		lblDadosPix.setForeground(Color.WHITE);
		lblDadosPix.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		lblDadosPix.setBounds(540, 442, 137, 30);
		contentPanel.add(lblDadosPix);
		
		JLabel lblCodigoDoPix = new JLabel("Codigo do Pix");
		lblCodigoDoPix.setForeground(Color.WHITE);
		lblCodigoDoPix.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblCodigoDoPix.setBounds(579, 468, 100, 25);
		contentPanel.add(lblCodigoDoPix);
		
		textCodigoPix = new JTextField();
		textCodigoPix.setColumns(10);
		textCodigoPix.setBounds(687, 467, 209, 20);
		contentPanel.add(textCodigoPix);
		
		btnAdicionar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					lblAvisoCarrinho.setText("");
					Produto selectedItem = (Produto) comboBoxProduto.getSelectedItem();
					ItemVenda item = new ItemVenda(selectedItem, Long.parseLong(textQuantidade.getText().trim()));
					itens.add(item);
					textQuantidade.setText("");
					lblAvisoCarrinho.setText("Item Adicionado.");
				} catch (Exception e2) {
					lblAvisoCarrinho.setText("Erro ao Adicionar.");
				}
			}
		});
		
		btnCadastrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					lblAvisoCadastro.setText("");
					if(itens.size() > 0) {
						Cliente cliente = (Cliente) comboBoxCliente.getSelectedItem();
						Gerente gerente = (Gerente) comboBoxGerente.getSelectedItem();
						LocalDate data = LocalDate.now();
						Transportadora transportadora = (Transportadora) comboBoxTransportadora.getSelectedItem();
						Pagamento pagamento = getPagamento();
						controleVenda.cadVenda(cliente, gerente, data, pagamento, transportadora, itens);
						lblAvisoCadastro.setText("Venda Concluida");
					} else {
						lblAvisoCadastro.setText("Selecione Produtos.");
					}
					
				} catch (Exception e2) {
					lblAvisoCadastro.setText("Erro nos dados.");
				}
			}
		});
		
		//String codigoNota, String nome, String bandeira, String numero
	}
	
	public Pagamento getPagamento() {
		Pagamento pagamento;
		int numeroMinimo = 0;
		int numeroMaximo = 100;
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;
		String codigo = "PG" + Integer.toString(numeroAleatorio);
		if(rdbtnCartaoDeCredito.isSelected()) {
			pagamento = new CartaoCredito(codigo, textNome.getText().trim(), textBandeira.getText().trim(), textNumero.getText().trim());
		}
		else if (rdbtnPix.isSelected()) {
			pagamento = new Pix(codigo, textCodigoPix.getText().trim());
		}
		else {
			pagamento = new Dinheiro(codigo);
		}
		return pagamento;
	}
}
