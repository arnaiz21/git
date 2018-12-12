package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Examen1Login extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6337461788952696511L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdPassword;
	private JLabel lblResultado;
	private JPanel panelDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Login frame = new Examen1Login();
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
	public Examen1Login() {
		
		setTitle("Examen Aitor Bartolome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblResultado = new JLabel("Listo");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblResultado);

		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		panelDatos.add(lblUsuario);
		
		txtUsuario = new JTextField();
		panelDatos.add(txtUsuario);
		txtUsuario.setColumns(10);
		txtUsuario.addActionListener(this);
		
		JLabel lblContrasena = new JLabel("Password: ");
		panelDatos.add(lblContrasena);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		panelDatos.add(pwdPassword);
		pwdPassword.addActionListener(this);
	
	
	}
	
	public void actionPerformed (ActionEvent e) {
		

		String nombrecorrecto = "Aitor";
		String contrasenacorrecta = "Bartolome";
		
		String contrasena = new String(pwdPassword.getPassword());
		
		
			//si los datos coinciden

		    if(nombrecorrecto.equals(txtUsuario.getText()) && contrasenacorrecta.equals(contrasena)){
		    	 lblResultado.setText("Bienvenido");
		       
		    }
		    
		    else {
		    	
		        lblResultado.setText("Datos incorrectos");
		        
		    }
						
		
	}
	
	
	}


