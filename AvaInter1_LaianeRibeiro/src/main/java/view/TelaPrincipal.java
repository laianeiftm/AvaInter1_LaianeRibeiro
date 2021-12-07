package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JSeparator;


public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDesktopPane desktop = new JDesktopPane();
		frame.getContentPane().add(desktop, BorderLayout.CENTER);
		
		JMenuBar barramenu = new JMenuBar();
		frame.setJMenuBar(barramenu);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		barramenu.add(mnNewMenu);
		
		JMenuItem menuPessoa = new JMenuItem("Pessoa");
		menuPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					TelaCRUDPessoa tela = new TelaCRUDPessoa();
				tela.setVisible(true);
				desktop.add(tela);
		

				
				
				
			}
		});
		mnNewMenu.add(menuPessoa);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem menuSair = new JMenuItem("Sair");
		menuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(menuSair);
		
		JMenu mnNewMenu_1 = new JMenu("Consultas");
		barramenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		barramenu.add(mnNewMenu_2);
	}
}
