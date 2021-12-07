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

import control.PessoaControle;
import model.Pessoa;



public class TelaCRUDPessoa<objeto, objeto1> extends JInternalFrame {
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textEndereco;
    private Pessoa objeto; 
    private PessoaControle controle = new PessoaControle ();

	public void limparTela() {
	    objeto = null;
	    textNome.setText("");
	    textTelefone.setText("");
	    textEndereco.setText("");
	    textCodigo.setText("");
	    
	}
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
				objeto = new Pessoa (null, textNome.getText(), textTelefone.getText(), textEndereco.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso");
			
			}
		});
					
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					controle.excluir(objeto);
			     
					JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso.");
			}else {
					JOptionPane.showMessageDialog(null, "Não há pessoa a ser excluída.");
				}
				   limparTela ();
		
		
			}
		});
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textIDProfissional.getText());
	            objeto =  controle.buscarPorId(valor);
	            if (objeto!=null) {					
	            	textEndereco.setText(String.valueOf(objeto.getEndereço()));
	            	textNome.setText(objeto.getNome());
	            	textTelefone.setText(objeto.getTelefone());
	            	}else {
	            		JOptionPane.showMessageDialog(null, "Não existe Pessoa com esse código");
	            		textCodigo.setText("");
	            	}

			}
		});
			
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					objeto.setEndereço(textEndereco.getText());
					objeto.setNome(textNome.getText());
					objeto.setTelefone(textTelefone.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Pessoa alterada com sucesso.");
				}else {
					JOptionPane.showMessageDialog(null, "Não há Pessoa a ser modificada.");
					limparTela();
				}
	
			}
		});
		
		
		JLabel lblTitulo = new JLabel("Menu Pessoa");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Consolas", Font.BOLD, 16));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		
		JButton btnLimpaATela = new JButton("Limpa a tela");
		btnLimpaATela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTela();
			}
		});
		btnLimpaATela.setForeground(Color.RED);
		GroupLayout gl_PainelCampos = new GroupLayout(PainelCampos);
		gl_PainelCampos.setHorizontalGroup(
			gl_PainelCampos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PainelCampos.createSequentialGroup()
					.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
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
												.addComponent(lblEndereco, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_PainelCampos.createParallelGroup(Alignment.LEADING)
												.addComponent(textEndereco, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
												.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_PainelCampos.createSequentialGroup()
									.addGap(32)
									.addComponent(btnLimpaATela, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
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
										.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_PainelCampos.createParallelGroup(Alignment.BASELINE)
								.addComponent(textEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEndereco))
							.addGap(36)
							.addComponent(btnLimpaATela))
						.addGroup(gl_PainelCampos.createSequentialGroup()
							.addComponent(btninserir)
							.addGap(18)
							.addComponent(btnAlterar)
							.addGap(18)
							.addComponent(btnExcluir)
							.addGap(9)
							.addComponent(btnConsultar)
							.addGap(18)
							.addComponent(btnFechar)))
					.addGap(46))
		);
		PainelCampos.setLayout(gl_PainelCampos);

	}
}
