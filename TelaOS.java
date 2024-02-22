package br.com.prjGabriel.telas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class TelaOS extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOS frame = new TelaOS();
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
	public TelaOS() {
		setIconifiable(true);
		setTitle("Tela OS");
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(null);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(TelaOS.class.getResource("/br/com/prjGabriel/icones/save.png")));
		btnSalvar.setBackground(Color.DARK_GRAY);
		btnSalvar.setBounds(88, 360, 80, 80);
		getContentPane().add(btnSalvar);
		
		JButton btnPrint = new JButton("");
		btnPrint.setIcon(new ImageIcon(TelaOS.class.getResource("/br/com/prjGabriel/icones/imprimir.png")));
		btnPrint.setBackground(Color.DARK_GRAY);
		btnPrint.setBounds(466, 360, 80, 80);
		getContentPane().add(btnPrint);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setIcon(new ImageIcon(TelaOS.class.getResource("/br/com/prjGabriel/icones/deleta.png")));
		btnDeletar.setBackground(Color.DARK_GRAY);
		btnDeletar.setBounds(340, 360, 80, 80);
		getContentPane().add(btnDeletar);
		
		JButton btnAtualizar = new JButton("");
		btnAtualizar.setIcon(new ImageIcon(TelaOS.class.getResource("/br/com/prjGabriel/icones/recarregar.png")));
		btnAtualizar.setBackground(Color.DARK_GRAY);
		btnAtualizar.setBounds(214, 360, 80, 80);
		getContentPane().add(btnAtualizar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 180, 490, 20);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 210, 490, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 240, 490, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 270, 240, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(494, 270, 126, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_3 = new JLabel("*Equipamento:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 180, 118, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("*Defeito:");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(56, 210, 100, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("*Serviço:");
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(54, 240, 100, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("*Técnico:");
		lblNewLabel_3_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_3.setBounds(51, 270, 100, 14);
		getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Valor total:");
		lblNewLabel_3_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_4.setBounds(400, 270, 89, 14);
		getContentPane().add(lblNewLabel_3_4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 267, 113);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nº OS:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(24, 11, 82, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(180, 11, 49, 14);
		panel.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 36, 96, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(155, 36, 96, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Orçamento");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(71, 63, 128, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ordem de serviço");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBounds(52, 83, 177, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(298, 11, 322, 144);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(68, 41, 49, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelaOS.class.getResource("/br/com/prjGabriel/icones/pesquisar2.png")));
		lblNewLabel_5.setBounds(10, 11, 48, 48);
		panel_1.add(lblNewLabel_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(98, 41, 62, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(68, 11, 240, 20);
		panel_1.add(textField_8);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(10, 66, 302, 67);
		panel_1.add(table);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Situação:");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 135, 100, 14);
		getContentPane().add(lblNewLabel_3_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Entrega OK!", "Orçamento REPROVADO!", "Aguardando Aprovação", "Aguardando Peças", "Não retirado 90 dias", "Em Manutenção", "Retorno"}));
		comboBox.setBounds(98, 135, 179, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_6_1 = new JLabel("Recarregar");
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(202, 340, 108, 14);
		getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Excluir");
		lblNewLabel_6_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(347, 340, 80, 14);
		getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6 = new JLabel("Salvar");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6.setBounds(97, 340, 91, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Imprimir");
		lblNewLabel_6_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_2_1.setBounds(468, 340, 80, 14);
		getContentPane().add(lblNewLabel_6_2_1);

	}
}
