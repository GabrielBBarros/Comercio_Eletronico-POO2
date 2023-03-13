package View.Relatorio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Controller.ControladorVenda;
import Model.Venda.Venda;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Rel_Vendas_Mes extends JDialog {

	private ControladorVenda controle;
	private final JPanel contentPanel = new JPanel();
	private JTextField textMes;
	private JTextField textAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Vendas_Mes dialog = new Rel_Vendas_Mes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Vendas_Mes() {
		controle = ControladorVenda.getInstancia();
		setBounds(100, 100, 700, 600);
	
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JPanel painelMes = new JPanel();
		painelMes.setBounds(5, 5, 674, 91);
		contentPanel.add(painelMes);
		painelMes.setLayout(null);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(385, 35, 89, 23);
		painelMes.add(btnProcurar);
		
		textMes = new JTextField();
		textMes.setBounds(184, 36, 40, 20);
		painelMes.add(textMes);
		textMes.setColumns(10);
		
		JLabel lblMesAno = new JLabel("Mes/Ano");
		lblMesAno.setBounds(125, 39, 76, 14);
		painelMes.add(lblMesAno);
		
		textAno = new JTextField();
		textAno.setBounds(251, 36, 51, 20);
		painelMes.add(textAno);
		textAno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setBounds(234, 39, 13, 14);
		painelMes.add(lblNewLabel_1);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setBounds(385, 21, 215, 14);
		painelMes.add(lblAviso);
		
		JPanel painelTabela = new JPanel();
		painelTabela.setBounds(5, 95, 674, 466);
		contentPanel.add(painelTabela);
		painelTabela.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 559, 674, -455);
		JTextArea textArea = new JTextArea();
		btnProcurar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				try {
					lblAviso.setText("");
					int mes = Integer.parseInt(textMes.getText().trim());
					int ano = Integer.parseInt(textAno.getText().trim());
					LocalDate data = LocalDate.parse(setData(1 , mes, ano));
					Iterator<Venda> vendas = controle.vendasMes(data);
					String resultado = "";
					while(vendas.hasNext()) {
						Venda venda = vendas.next();
						resultado += venda.toString();
						resultado += "\n\n\n";
					}
					if(resultado.length() == 0)
						lblAviso.setText("Não há historico neste mes.");
					else 
						lblAviso.setText("Historico encontrado!");
					textMes.setText("");
					textAno.setText("");
					textArea.setText(resultado);
				} catch (Exception e2) {
					lblAviso.setText("Erro na procura");
					textMes.setText("");
					textAno.setText("");
				}
			}
		});
		
		textArea.setEditable(false);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		painelTabela.add(scrollPane);
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
}
