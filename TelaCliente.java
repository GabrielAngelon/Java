package br.com.prjGabriel.telas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelasClientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCliMail;
	private JTextField txtCliFone;
	private JTextField txtCliId;
	private JTextField txtCliEnd;
	private JTextField txtCliPesquisar;
	private JTextField txtCliNome;
	private JTable tabela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasClientes frame = new TelasClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelasClientes() {
		setTitle("Tela Cliente");
		setMaximizable(true);
		setIconifiable(true);
		getContentPane().setBackground(SystemColor.controlHighlight);
		getContentPane().setForeground(Color.BLACK);
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(null);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setBackground(Color.DARK_GRAY);
		btnSalvar.setIcon(new ImageIcon(TelasClientes.class.getResource("/br/com/prjGabriel/icones/save.png")));
		btnSalvar.setBounds(50, 358, 80, 80);
		getContentPane().add(btnSalvar);
		
		JButton btnAtualizar = new JButton("");
		btnAtualizar.setBackground(Color.DARK_GRAY);
		btnAtualizar.setIcon(new ImageIcon(TelasClientes.class.getResource("/br/com/prjGabriel/icones/recarregar.png")));
		btnAtualizar.setBounds(278, 358, 80, 80);
		getContentPane().add(btnAtualizar);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setBackground(Color.DARK_GRAY);
		btnDeletar.setIcon(new ImageIcon(TelasClientes.class.getResource("/br/com/prjGabriel/icones/deleta.png")));
		btnDeletar.setBounds(500, 358, 80, 80);
		getContentPane().add(btnDeletar);
		
		JLabel lblNewLabel = new JLabel(" EMAIL:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(56, 287, 64, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" TELEFONE:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 257, 123, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENDEREÇO:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 227, 100, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOME:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(63, 197, 64, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(94, 167, 49, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtCliMail = new JTextField();
		txtCliMail.setForeground(Color.DARK_GRAY);
		txtCliMail.setBackground(new Color(255, 255, 255));
		txtCliMail.setBounds(127, 287, 277, 20);
		getContentPane().add(txtCliMail);
		txtCliMail.setColumns(10);
		
		txtCliFone = new JTextField();
		txtCliFone.setBounds(127, 257, 189, 20);
		getContentPane().add(txtCliFone);
		txtCliFone.setColumns(10);
		
		txtCliId = new JTextField();
		txtCliId.setEnabled(false);
		txtCliId.setBounds(128, 167, 49, 20);
		getContentPane().add(txtCliId);
		txtCliId.setColumns(10);
		
		txtCliEnd = new JTextField();
		txtCliEnd.setBounds(127, 227, 442, 20);
		getContentPane().add(txtCliEnd);
		txtCliEnd.setColumns(10);
		
		txtCliPesquisar = new JTextField();
		txtCliPesquisar.setBounds(20, 11, 542, 28);
		getContentPane().add(txtCliPesquisar);
		txtCliPesquisar.setColumns(10);
		
		txtCliNome = new JTextField();
		txtCliNome.setColumns(10);
		txtCliNome.setBounds(127, 197, 442, 20);
		getContentPane().add(txtCliNome);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelasClientes.class.getResource("/br/com/prjGabriel/icones/pesquisar2.png")));
		lblNewLabel_5.setBounds(572, 11, 48, 48);
		getContentPane().add(lblNewLabel_5);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		tabela.setBounds(20, 58, 542, 98);
		getContentPane().add(tabela);
		
		JLabel lblNewLabel_6 = new JLabel("Salvar");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6.setBounds(58, 340, 91, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Recarregar");
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(265, 340, 108, 14);
		getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Excluir");
		lblNewLabel_6_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(507, 340, 80, 14);
		getContentPane().add(lblNewLabel_6_2);

	}
}
