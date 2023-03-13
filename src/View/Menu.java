package View;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;
import View.Cadastro.*;
import View.Relatorio.*;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public final class Menu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static Menu menuInst;
	private static ControladorProduto controlador1;
	private static ControladorUsuario controlador2;
	private static ControladorVenda controlador3;

	

	
	public static void main(String[] args) {
		try {
			Menu dialog = Menu.getInstancia();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static Menu getInstancia() {
		if(menuInst == null) {
			menuInst = new Menu();
		}
		return menuInst;
	}
	
	
	/**
	 * Create the dialog.
	 */
	private Menu() {
		controlador1 = ControladorProduto.getInstancia();
		controlador2 = ControladorUsuario.getInstancia();
		controlador3 = ControladorVenda.getInstancia();
		
		
		
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnCad = new JButton("Cadastro");
		btnCad.setForeground(Color.WHITE);
		
		
		//Redirecionamento
		JButton btnprodutos = new JButton("Produtos");		
		btnprodutos.setBounds(57, 38, 0, 0);
		contentPanel.add(btnprodutos);
	
		
		JButton btncliente = new JButton("Cliente");
		btncliente.setBounds(57, 138, 0, 0);
		contentPanel.add(btncliente);
		
		JButton btngerente = new JButton("Gerente");
		btngerente.setBounds(57, 156, 0, 0);
		contentPanel.add(btngerente);
		
		JButton btntransportadora = new JButton("Transportadora");
		btntransportadora.setBounds(57, 182, 0, 0);
		contentPanel.add(btntransportadora);
		
		JButton btnfabricante = new JButton("Fabricante");
		btnfabricante.setBounds(57, 182, 0, 0);
		contentPanel.add(btnfabricante);
		
		
		JButton btnvenda = new JButton("Venda");
		btnvenda.setBounds(57, 182, 0, 0);
		contentPanel.add(btnvenda);
		
		JButton btnTodosprodutos = new JButton("Todos os produtos");
		btnTodosprodutos.setBounds(213, 38, 0, 0);
		contentPanel.add(btnTodosprodutos);
		
		JButton btnTodosmoveis = new JButton("Todos Moveis");
		btnTodosmoveis.setBounds(213, 68, 0, 0);
		contentPanel.add(btnTodosmoveis);
		
		JButton btnTodoseletrodomesticos = new JButton("Todos Eletrodomesticos");
		btnTodoseletrodomesticos.setBounds(213, 98, 0, 0);
		contentPanel.add(btnTodoseletrodomesticos);
		
		JButton btnTodoseletronicos = new JButton("Todos eletronicos");
		btnTodoseletronicos.setBounds(213, 128, 0, 0);
		contentPanel.add(btnTodoseletronicos);
		
		JButton btnTodosvestuarios = new JButton("Todos Vestuarios");
		btnTodosvestuarios.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosvestuarios);
		
		JButton btnDezmaisvendidos = new JButton("Os 10 mais vendidos");
		btnDezmaisvendidos.setBounds(213, 158, 0, 0);
		contentPanel.add(btnDezmaisvendidos);
		
		JButton btnOrdenacaoa = new JButton("Ordena\u00E7\u00E3o A");
		btnOrdenacaoa.setBounds(213, 158, 0, 0);
		contentPanel.add(btnOrdenacaoa);
		
		JButton btnOrdenacaob = new JButton("Ordena\u00E7\u00E3o B");
		btnOrdenacaob.setBounds(213, 158, 0, 0);
		contentPanel.add(btnOrdenacaob);
		
		JButton btnTodosfabricantes = new JButton("Todos Fabricantes");
		btnTodosfabricantes.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosfabricantes);
		
		JButton btnTodosfabricantesprodutosvendidos = new JButton("Fabricantes vendas");
		btnTodosfabricantesprodutosvendidos.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosfabricantesprodutosvendidos);
		
		JButton btnFabricanteslucro = new JButton("Fabricantes lucro");
		btnFabricanteslucro.setBounds(213, 158, 0, 0);
		contentPanel.add(btnFabricanteslucro);
		
		JButton btnTodostransportadoras = new JButton("Todas Transportadoras");
		btnTodostransportadoras.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodostransportadoras);
		
		JButton btnTransportadorarealizadas= new JButton("Top Transportadoras");
		btnTransportadorarealizadas.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTransportadorarealizadas);
		
		JButton btnTodosgerentes= new JButton("Todos Gerentes");
		btnTodosgerentes.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosgerentes);
		
		JButton btnTodosclientes= new JButton("Todos Clientes");
		btnTodosclientes.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosclientes);
		
		JButton btnTodosclienteouro= new JButton("Clientes ouro");
		btnTodosclienteouro.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodosclienteouro);
		
		
		JButton btnHistoricocliente= new JButton("Historico cliente");
		btnHistoricocliente.setBounds(213, 158, 0, 0);
		contentPanel.add(btnHistoricocliente);
		
		JButton btnTodasvendas= new JButton("Todas vendas");
		btnTodasvendas.setBounds(213, 158, 0, 0);
		contentPanel.add(btnTodasvendas);
		
		JButton btnVendasmeslucro= new JButton("Vendas mes");
		btnVendasmeslucro.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendasmeslucro);
		
		JButton btnVendasdinheiro= new JButton("Vendas dinheiro");
		btnVendasdinheiro.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendasdinheiro);
		
		JButton btnVendascartao= new JButton("Vendas Cartao");
		btnVendascartao.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendascartao);
		
		JButton btnVendaspix= new JButton("Vendas PIX");
		btnVendaspix.setBounds(213, 158, 0, 0);
		contentPanel.add(btnVendaspix);
		
		
		
		JLabel dropdown = new JLabel("");
		dropdown.setIcon(new ImageIcon("src/Arquivos/barra_cad2.jpg"));
		dropdown.setBounds(35, 29, 0, 0);
		contentPanel.add(dropdown);
		
		JLabel lbldropdown2 = new JLabel("");
		lbldropdown2.setIcon(new ImageIcon("src/Arquivos/barra_rel2.png"));
		lbldropdown2.setBounds(203, 29, 0, 0);
		contentPanel.add(lbldropdown2);
		
		
		
		btnCad.setBounds(35, 7, 170, 21);
		btnCad.setBackground(new Color(106,17,132));
		btnCad.setBorder(null);
		btnCad.setFocusPainted(false);
		contentPanel.add(btnCad);
		
		
		
		
		JButton btnRel = new JButton("Relat\u00F3rios");
		btnRel.setForeground(Color.WHITE);
		btnRel.setBounds(350, 7, 170, 21);
		btnRel.setBackground(new Color(107,17,132));
		btnRel.setBorder(null);
		btnRel.setFocusPainted(false);
		contentPanel.add(btnRel);
		{
			JLabel lblBarra = new JLabel("");
			lblBarra.setIcon(new ImageIcon("src/Images/barra.jpg"));
			lblBarra.setBackground(new Color(0, 0, 0));
			
			lblBarra.setBounds(0, 0, 986, 28);
			contentPanel.add(lblBarra);
		}
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 986, 28);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lbldropdown1 = new JLabel("");
		lbldropdown1.setIcon(new ImageIcon("src/Images/barra_cad2.jpg"));
		lbldropdown1.setBounds(35, 31, 37, -11);
		contentPanel.add(lbldropdown1);
		
		JLabel lbldropdpwn_2 = new JLabel("New label");
		lbldropdpwn_2.setIcon(new ImageIcon("src/Images/barra_rel2.png"));
		lbldropdpwn_2.setBounds(275, 22, 0, 0);
		contentPanel.add(lbldropdpwn_2);
		
		JLabel lblaux =new JLabel("");
		lblaux.setBounds(0, 29, 984, 634);
		contentPanel.add(lblaux);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon("src/Images/Logo_final.png"));
		lbllogo.setBounds(83, 138, 867, 402);
		contentPanel.add(lbllogo);
		
		
	
		//Fun��o dropdown Cadastro
		btnCad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdown1.setBounds(35, 20, 170, 250);
				dropdown.setBounds(35, 29, 170, 209);
				lbldropdown2.setBounds(203, 38, 0, 0);
				btnprodutos.setBounds(45, 40, 150, 18);
				btncliente.setBounds(45, 70, 150, 18);
				btngerente.setBounds(45, 100, 150, 18);
				btntransportadora.setBounds(45, 130, 150, 18);
				btnfabricante.setBounds(45, 160, 150, 18);
				btnvenda.setBounds(45, 190, 150, 18);
				
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(213, 38, 0, 0);
				btnTodosmoveis.setBounds(213, 68, 0, 0);
				btnTodoseletrodomesticos.setBounds(213, 98, 0, 0);
				btnTodoseletronicos.setBounds(213, 128, 0, 0);
				btnTodosvestuarios.setBounds(213, 158, 0, 0);
				btnDezmaisvendidos.setBounds(213, 138, 0, 0);
				btnOrdenacaoa.setBounds(213, 158, 0, 0);
				btnOrdenacaob.setBounds(213, 158, 0, 0);
				btnTodosfabricantes.setBounds(213, 158, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(213, 208, 0, 0);
				btnFabricanteslucro.setBounds(213, 158, 0, 0);
				btnTodostransportadoras.setBounds(213, 158, 0, 0);
				btnTransportadorarealizadas.setBounds(213, 158, 0, 0);
				btnTodosgerentes.setBounds(213, 158, 0, 0);
				btnTodosclientes.setBounds(213, 158, 0, 0);
				btnTodosclienteouro.setBounds(213, 158, 0, 0);
				btnHistoricocliente.setBounds(213, 158, 0, 0);
				btnTodasvendas.setBounds(213, 158, 0, 0);
				btnVendasmeslucro.setBounds(213, 158, 0, 0);
				btnVendasdinheiro.setBounds(213, 158, 0, 0);
				btnVendascartao.setBounds(213, 158, 0, 0);
				btnVendaspix.setBounds(213, 158, 0, 0);
				
			}
		});
		
		
		//Fun��o dropdown Cadastro
				lblaux.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dropdown.setBounds(35, 29, 0, 0);
						lbldropdown1.setBounds(35, 20, 0, 0);
						lbldropdown2.setBounds(203, 29, 0, 0);
						btnprodutos.setBounds(57, 38, 0, 0);
						btncliente.setBounds(57, 124, 0, 0);
						btngerente.setBounds(57, 156, 0, 0);
						btntransportadora.setBounds(57, 182, 0, 0);
						btnfabricante.setBounds(45, 190, 0, 0);
						btnvenda.setBounds(57, 220, 0, 0);
						
						lbldropdpwn_2.setBounds(275, 22, 0, 0);
						btnTodosprodutos.setBounds(213, 38, 0, 0);
						btnTodosmoveis.setBounds(213, 68, 0, 0);
						btnTodoseletrodomesticos.setBounds(213, 98, 0, 0);
						btnTodoseletronicos.setBounds(213, 128, 0, 0);
						btnTodosvestuarios.setBounds(213, 158, 0, 0);
						btnDezmaisvendidos.setBounds(213, 138, 0, 0);
						btnOrdenacaoa.setBounds(213, 158, 0, 0);
						btnOrdenacaob.setBounds(213, 158, 0, 0);
						btnTodosfabricantes.setBounds(213, 158, 0, 0);
						btnTodosfabricantesprodutosvendidos.setBounds(213, 208, 0, 0);
						btnFabricanteslucro.setBounds(213, 158, 0, 0);
						btnTodostransportadoras.setBounds(213, 158, 0, 0);
						btnTransportadorarealizadas.setBounds(213, 158, 0, 0);
						btnTodosgerentes.setBounds(213, 158, 0, 0);
						btnTodosclientes.setBounds(213, 158, 0, 0);
						btnTodosclienteouro.setBounds(213, 158, 0, 0);
						btnHistoricocliente.setBounds(213, 158, 0, 0);
						btnTodasvendas.setBounds(213, 158, 0, 0);
						btnVendasmeslucro.setBounds(213, 158, 0, 0);
						btnVendasdinheiro.setBounds(213, 158, 0, 0);
						btnVendascartao.setBounds(213, 158, 0, 0);
						btnVendaspix.setBounds(213, 158, 0, 0);
						
					}
				});
		
		//Relat�rios
		btnRel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dropdown.setBounds(35, 29, 0, 0);
				lbldropdown1.setBounds(35, 20, 0, 0);
				lbldropdown2.setBounds(203, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				
				lbldropdpwn_2.setBounds(275, 22, 330, 248);
				btnTodosprodutos.setBounds(290, 38, 148, 16);
				btnTodosmoveis.setBounds(290, 58, 148, 16);
				btnTodoseletrodomesticos.setBounds(290, 78, 148, 16);
				btnTodoseletronicos.setBounds(290, 98, 148, 16);
				btnTodosvestuarios.setBounds(290, 118, 148, 16);
				btnDezmaisvendidos.setBounds(290, 138, 148, 16);
				btnOrdenacaoa.setBounds(290, 158, 148, 16);
				btnOrdenacaob.setBounds(290, 178, 148, 16);
				btnTodosfabricantes.setBounds(290, 198, 148, 16);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 148, 16);
				btnFabricanteslucro.setBounds(290, 238,  148, 16);
				
				btnTransportadorarealizadas.setBounds(440, 38, 148, 16);
				btnTodosgerentes.setBounds(440, 58, 148, 16);
				btnTodosclientes.setBounds(440, 78, 148, 16);
				btnTodosclienteouro.setBounds(440, 98, 148, 16);
				btnTodostransportadoras.setBounds(440, 118, 148, 16);
				btnHistoricocliente.setBounds(440, 138, 148, 16);
				btnTodasvendas.setBounds(440, 158, 148, 16);
				btnVendasmeslucro.setBounds(440, 178, 148, 16);
				btnVendasdinheiro.setBounds(440, 198, 148, 16);
				btnVendascartao.setBounds(440, 218, 148, 16);
				btnVendaspix.setBounds(440, 238, 148, 16);
			}
			
			
		});
		
		//Cadastrar
		btnprodutos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				//Cad_Produto dialog = Cad_Produto.getInstancia(controlador1);
				Cad_Produto dialog = new Cad_Produto();
				dialog.setVisible(true);
		
				
				
			}
		});
		
		
		
		btncliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				Cad_Cliente dialog = new Cad_Cliente();
				dialog.setVisible(true);
				
				
			}
		});
		
		btngerente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				Cad_Gerente dialog = new Cad_Gerente();
				dialog.setVisible(true);
				
			}
		});
		
		btntransportadora.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				Cad_Transportadora dialog = new Cad_Transportadora();
				dialog.setVisible(true);
				
			}
		});
		
		btnfabricante.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				Cad_Fabricante dialog = new Cad_Fabricante();
				dialog.setVisible(true);
				
			}
		});
		
		btnvenda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbldropdown1.setBounds(35, 20, 0, 0);
				dropdown.setBounds(35, 29, 0, 0);
				btnprodutos.setBounds(57, 38, 0, 0);
				btncliente.setBounds(57, 124, 0, 0);
				btngerente.setBounds(57, 156, 0, 0);
				btntransportadora.setBounds(57, 182, 0, 0);
				btnfabricante.setBounds(45, 190, 0, 0);
				btnvenda.setBounds(57, 220, 0, 0);
				Cad_Venda dialog = new Cad_Venda();
				dialog.setVisible(true);
			}
		});
		
		
		//Em rela��o aos bot�oes de relatorio
		btnTodosprodutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Produtos dialog = new Rel_Produtos();
				dialog.setVisible(true);
			}
		});
		
		btnTodosmoveis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Moveis dialog = new Rel_Moveis();
				dialog.setVisible(true);
			}
		});
		
		btnTodoseletrodomesticos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Eletrodomesticos dialog = new Rel_Eletrodomesticos();
				dialog.setVisible(true);
			}
		});
		
		btnTodoseletronicos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Eletronicos dialog = new Rel_Eletronicos();
				dialog.setVisible(true);
				
			}
		});
		
		btnTodosvestuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vestuario dialog = new Rel_Vestuario();
				dialog.setVisible(true);
			}
		});
		
		btnDezmaisvendidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Dez_mais_Vendidos dialog = new Rel_Dez_mais_Vendidos();
				dialog.setVisible(true);
			}
		});
		
		btnOrdenacaoa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Ordenacao_A dialog = new Rel_Ordenacao_A();
				dialog.setVisible(true);
			}
		});
		
		btnOrdenacaob.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Ordenacao_B dialog = new Rel_Ordenacao_B();
				dialog.setVisible(true);
			}
		});
		
		btnTodosfabricantes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Fabricantes dialog = new Rel_Fabricantes();
				dialog.setVisible(true);
			}
		});
		
		btnTodosfabricantesprodutosvendidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Fabricantes_Produtos_mais_Vendidos dialog = new Rel_Fabricantes_Produtos_mais_Vendidos();
				dialog.setVisible(true);
			}
		});
		
		btnFabricanteslucro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Fabricantes_por_Lucro dialog = new Rel_Fabricantes_por_Lucro();
				dialog.setVisible(true);
			}
		});
		
		btnTransportadorarealizadas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				
			}
		});
		
		btnTodosgerentes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Gerentes dialog = new Rel_Gerentes();
				dialog.setVisible(true);
			}
		});
		
		btnTodosclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Clientes dialog = new Rel_Clientes();
				dialog.setVisible(true);
			}
		});
		
		btnTodosclienteouro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Clientesouro dialog = new Rel_Clientesouro();
				dialog.setVisible(true);
			}
		});
		
		btnTodostransportadoras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Transportadoras dialog = new Rel_Transportadoras();
				dialog.setVisible(true);
			}
		});
		
		btnHistoricocliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Historico_Cliente dialog = new Rel_Historico_Cliente();
				dialog.setVisible(true);
			}
		});
		
		btnTodasvendas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vendas dialog = new Rel_Vendas();
				dialog.setVisible(true);
			}
		});
		
		btnVendasmeslucro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vendas_Mes dialog = new Rel_Vendas_Mes();
				dialog.setVisible(true);
			}
		});
		
		btnVendasdinheiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vendas_Dinheiro dialog = new Rel_Vendas_Dinheiro();
				dialog.setVisible(true);
			}
		});
		
		btnVendascartao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vendas_Cartao dialog = new Rel_Vendas_Cartao();
				dialog.setVisible(true);
			}
		});
		
		btnVendaspix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldropdpwn_2.setBounds(275, 22, 0, 0);
				btnTodosprodutos.setBounds(290, 38, 0, 0);
				btnTodosmoveis.setBounds(290, 58, 0, 0);
				btnTodoseletrodomesticos.setBounds(290, 78, 0, 0);
				btnTodoseletronicos.setBounds(290, 98, 0, 0);
				btnTodosvestuarios.setBounds(290, 118, 0, 0);
				btnDezmaisvendidos.setBounds(290, 138, 0, 0);
				btnOrdenacaoa.setBounds(290, 158, 0, 0);
				btnOrdenacaob.setBounds(290, 178, 0, 0);
				btnTodosfabricantes.setBounds(290, 198, 0, 0);
				btnTodosfabricantesprodutosvendidos.setBounds(290, 218, 0, 0);
				btnFabricanteslucro.setBounds(290, 238,  0, 0);
				
				btnTransportadorarealizadas.setBounds(440, 38, 0, 0);
				btnTodosgerentes.setBounds(440, 58, 0, 0);
				btnTodosclientes.setBounds(440, 78, 0, 0);
				btnTodosclienteouro.setBounds(440, 98, 0, 0);
				btnTodostransportadoras.setBounds(440, 118, 0, 0);
				btnHistoricocliente.setBounds(440, 138, 0, 0);
				btnTodasvendas.setBounds(440, 158, 0, 0);
				btnVendasmeslucro.setBounds(440, 178, 0, 0);
				btnVendasdinheiro.setBounds(440, 198, 0, 0);
				btnVendascartao.setBounds(440, 218, 0, 0);
				btnVendaspix.setBounds(440, 238, 0, 0);
				Rel_Vendas_PIX dialog = new Rel_Vendas_PIX();
				dialog.setVisible(true);
			}
		});
		
		
	}
}
