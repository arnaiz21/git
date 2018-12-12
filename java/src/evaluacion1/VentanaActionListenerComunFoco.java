package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VentanaActionListenerComunFoco extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JLabel lblNmero;
	private JTextField txtNumero;
	private JTextField txtUsuario;
	private JLabel lblResultado;
	private JButton btnOk;
	private JLabel lblContrasea;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComunFoco frame = new VentanaActionListenerComunFoco();
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
	public VentanaActionListenerComunFoco() {
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblResultado = new JLabel("An\u00F3nimo");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblResultado, BorderLayout.SOUTH);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setText("0");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//acciones a realizar al pulsar enter
				 String mensaje;
				 mensaje = "El numero introducido es el " + txtNumero.getText();
				lblResultado.setText(mensaje);
			}
		});
		
		panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		lblNmero = new JLabel("Usuario:");
		panelDatos.add(lblNmero);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUsuario.select(0, txtUsuario.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtUsuario.select(0, 0);
			}
		});
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		panelDatos.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setForeground(Color.BLACK);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e){
				 
			//defino los datos correctos
				 String nombrecorrecto = "1dw3";
				 String contrasenacorrecta = "1dw3";
				 // compruebo los datos
			//acciones a realizar al pulsar el boton
			//compruebo el usuario y la password
				String contrasena = new String(pwdPassword.getPassword());
				if (true) {
					//si los datos coinciden
	
				    if(nombrecorrecto.equals(txtUsuario.getText()) && contrasenacorrecta.equals(contrasena)){
				    	 lblResultado.setText("Bienvenido");
				       
				    } 
				    else {
				        lblResultado.setText("Datos incorrectos");
				    }
									
			}
			}});
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		panelDatos.add(lblContrasea);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdPassword.select(0, pwdPassword.getPassword().length);
			}
			@Override
			public void focusLost(FocusEvent e) {
				pwdPassword.select(0, 0);
			}
		});
	
		pwdPassword.setText("Password");
		panelDatos.add(pwdPassword);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDatos.add(btnOk);
		
		}
	
	}
