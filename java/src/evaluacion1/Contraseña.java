package evaluacion1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Contraseña extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1945635579565468409L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contraseña frame = new Contraseña();
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
	public Contraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 27));
		lblUsuario.setBounds(50, 76, 118, 42);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(205, 76, 377, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblContrasea.setBounds(50, 216, 156, 67);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(216, 227, 366, 42);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		btnNewButton.setBounds(272, 321, 180, 59);
		contentPane.add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object Manolo = arg0.getSource();
		if (Manolo == btnNewButton) {
			if (textField.getText().equals("David")) {
				if (passwordField.getText().equals("Chacon")) {
					this.setVisible(false);
					NumRomanos cambio = new NumRomanos();
					cambio.setVisible(true);
				}
			}
		}
		
	}
}
