package View.Relatorio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorVenda;
import Model.Usuario.Usuario;
import Model.Venda.Venda;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Rel_Historico_Cliente extends JDialog {
	private JTextField textCPF;
	
	private ControladorVenda controle;
	private JTextArea textArea;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Historico_Cliente dialog = new Rel_Historico_Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Historico_Cliente() {
		controle = ControladorVenda.getInstancia();
		setBounds(100, 100, 700, 700);
		getContentPane().setLayout(null);
		
		JPanel panelBusca = new JPanel();
		panelBusca.setBounds(0, 0, 984, 81);
		panelBusca.setBackground(new Color(75, 101, 173));
		panelBusca.setLayout(null);
		getContentPane().add(panelBusca);
		
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(51, 23, 39, 33);
		lblCPF.setForeground(Color.WHITE);
		lblCPF.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 20));
		panelBusca.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(104, 27, 245, 20);
		panelBusca.add(textCPF);
		textCPF.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(411, 26, 89, 23);
		panelBusca.add(btnBuscar);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(411, 11, 195, 14);
		panelBusca.add(lblAviso);
		
		JPanel panelResultado = new JPanel();
		panelResultado.setBackground(new Color(75, 101, 173));
		panelResultado.setBounds(0, 80, 984, 581);
		panelResultado.setLayout(null);
		getContentPane().add(panelResultado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 984, 581);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 0, 5, 22);
		
		btnBuscar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				try {
				if(textCPF.getText().trim().length() != 0) {
					Usuario usuario = controle.buscaCliente(textCPF.getText().trim());
					if(usuario != null) {
						Iterator<Venda> vendas = controle.historicoCliente(usuario);
						String resultado = "";
						int cont = 0;
						while(vendas.hasNext()) {
							Venda venda = vendas.next();
							resultado += venda.toString();
							resultado += "\n\n\n";
							cont++;
						}
						if(cont == 0) {
							lblAviso.setText("Não há historico de venda neste cpf.");
						}
						else {
							lblAviso.setText("Historico de venda encontrado!");
						}
						setTexto(resultado);
					} else {
						lblAviso.setText("Cliente não encontrado.");
						setTexto("");
					}
				} else {
					lblAviso.setText("Campo de CPF vazio");
				}
				} catch (Exception e2) {
					lblAviso.setText("Erro no sistema");
					setTexto("");
				}
			}
		});
		
		scrollPane.setViewportView(textArea);
		panelResultado.add(scrollPane);
		
		
	}
	
	
	
	public void setTexto(String texto) {
		textCPF.setText("");
		textArea.setText(texto);
	}
}
