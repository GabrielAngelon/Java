package br.com.prjGabriel.telas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaUser extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtId;
	private JTextField txtLogin;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtFone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUser frame = new TelaUser();
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
	public TelaUser() {
		setTitle("Tela Usuário");
		setIconifiable(true);
		setMaximizable(true);
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(null);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(TelaUser.class.getResource("/br/com/prjGabriel/icones/save.png")));
		btnSalvar.setBackground(Color.DARK_GRAY);
		btnSalvar.setBounds(50, 360, 80, 80);
		getContentPane().add(btnSalvar);
		
		JButton btnAtualizar = new JButton("");
		btnAtualizar.setIcon(new ImageIcon(TelaUser.class.getResource("/br/com/prjGabriel/icones/recarregar.png")));
		btnAtualizar.setBackground(Color.DARK_GRAY);
		btnAtualizar.setBounds(280, 360, 80, 80);
		getContentPane().add(btnAtualizar);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setIcon(new ImageIcon(TelaUser.class.getResource("/br/com/prjGabriel/icones/deleta.png")));
		btnDeletar.setBackground(Color.DARK_GRAY);
		btnDeletar.setBounds(500, 360, 80, 80);
		getContentPane().add(btnDeletar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaUser.class.getResource("/br/com/prjGabriel/icones/pesquisar2.png")));
		btnNewButton.setBounds(50, 208, 48, 48);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("ID:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(483, 114, 49, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(517, 114, 49, 20);
		getContentPane().add(txtId);
		
		JLabel lblNewLabel_3 = new JLabel("NOME:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(59, 114, 64, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(358, 144, 208, 20);
		getContentPane().add(txtLogin);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(124, 114, 349, 20);
		getContentPane().add(txtNome);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(124, 173, 140, 20);
		getContentPane().add(txtSenha);
		
		txtFone = new JTextField();
		txtFone.setForeground(Color.DARK_GRAY);
		txtFone.setColumns(10);
		txtFone.setBackground(Color.WHITE);
		txtFone.setBounds(124, 144, 140, 20);
		getContentPane().add(txtFone);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblLogin.setBounds(284, 144, 64, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 174, 123, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FONE:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(62, 144, 100, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblPerfil = new JLabel("PERFIL:");
		lblPerfil.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblPerfil.setBounds(284, 175, 64, 14);
		getContentPane().add(lblPerfil);
		
		JComboBox cmbPerfil = new JComboBox();
		cmbPerfil.setFont(new Font("Arial Black", Font.BOLD, 14));
		cmbPerfil.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Usuário"}));
		cmbPerfil.setBounds(358, 175, 208, 22);
		getContentPane().add(cmbPerfil);
		
		JLabel lblNewLabel_6 = new JLabel("Salvar");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6.setBounds(59, 340, 91, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Recarregar");
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(270, 340, 108, 14);
		getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Excluir");
		lblNewLabel_6_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(507, 340, 80, 14);
		getContentPane().add(lblNewLabel_6_2);

	}
}
