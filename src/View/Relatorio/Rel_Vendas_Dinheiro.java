package View.Relatorio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Controller.ControladorVenda;
import Model.Venda.Venda;

public class Rel_Vendas_Dinheiro extends JDialog {

	private ControladorVenda controle;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rel_Vendas_Dinheiro dialog = new Rel_Vendas_Dinheiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rel_Vendas_Dinheiro() {
		controle = ControladorVenda.getInstancia();
		setBounds(100, 100, 700, 600);
	
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(75, 101, 173));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		JTextArea textArea = new JTextArea();
		String resultado = "";
		Iterator<Venda> vendas = controle.vendaDinheiro();
		while(vendas.hasNext()) {
			Venda venda = vendas.next();
			resultado += venda.toString();
			resultado += "\n\n\n";
		}
			
		textArea.setText(resultado);
		textArea.setEditable(false);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		contentPanel.add(scrollPane, BorderLayout.CENTER);
	}
}
