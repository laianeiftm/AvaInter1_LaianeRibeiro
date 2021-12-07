package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;


public class TelaCRUDPessoa<objeto, objeto1> extends JInternalFrame {
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textValorPago;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCRUDPessoa frame = new TelaCRUDPessoa();
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
	public TelaCRUDPessoa() {
		setBounds(100, 100, 610, 300);
		
		JPanel PainelCampos = new JPanel();
		getContentPane().add(PainelCampos, BorderLayout.CENTER);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose ();
			}
		});
		btnFechar.setForeground(Color.RED);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JButton btninserir = new JButton("Inserir");
		btninserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnConsultar = new JButton("Consultar");
			
		JButton btnAlterar = new JButton("Alterar");
		
		JLabel lblTitulo = new JLabel("Menu Pessoa");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		textValorPago = new JTextField();
		textValorPago.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Endere\u00E7o:");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textNome, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblTelefone_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
										.addComponent(textValorPago, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))))
							.addGap(26)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
								.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btninserir, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_PainelCampos.setVerticalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(textCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
								.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNome)
									.addGap(18)
									.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTelefone)
										.addComponent(textValorPago, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelefone_1)))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addComponent(btninserir)
							.addGap(18)
							.addGroup(gl_PainelCampos.createSequentialGroup()
								.addComponent(btnAlterar)
								.addGap(18)
								.addComponent(btnExcluir))
							.addGap(9)
							.addComponent(btnConsultar)
							.addGap(18)
							.addComponent(btnFechar)))
					.addGap(67))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}

}
