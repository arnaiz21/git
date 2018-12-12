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

public class VentanaHola extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JLabel lblNmero;
	private JTextField txtNumero;
	private JTextField txtNumero_1;
	private JLabel lblResultado;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHola frame = new VentanaHola();
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
	public VentanaHola() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblResultado = new JLabel("No se ha introducido ningun n\u00FAmer");
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
		
		lblNmero = new JLabel("N\u00FAmero:");
		panelDatos.add(lblNmero);
		
		txtNumero_1 = new JTextField();
		txtNumero_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNumero_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero_1.setText("0");
		panelDatos.add(txtNumero_1);
		txtNumero_1.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setForeground(Color.BLACK);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//acciones a realizar al pulsar el boton
				 String mensaje;
				 mensaje = "El numero introducido es el " + txtNumero.getText();
				lblResultado.setText(mensaje);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDatos.add(btnOk);
		
		}
	}

