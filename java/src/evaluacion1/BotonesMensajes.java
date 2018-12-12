package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JMenuBar;

public class BotonesMensajes extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773609308452833633L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblMensaje;
	private JPanel panel;
	private JButton btnHola;
	private JButton btnAdios;
	private JButton btnKaixo;
	private JButton btnAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajes frame = new BotonesMensajes();
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
	public BotonesMensajes() {
		setTitle("Botones de Mensajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}
			
		});
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		lblMensaje = new JLabel("No hay Mensaje");
		lblMensaje.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnHola = new JButton("Hola");
		btnHola.addActionListener(this);
		panel.add(btnHola);
		
		btnAdios = new JButton("Adios");
		btnAdios.addActionListener(this);
		panel.add(btnAdios);
		
		btnKaixo = new JButton("Kaixo");
		btnKaixo.addActionListener(this);
		panel.add(btnKaixo);
		
		btnAgur = new JButton("Agur");
		btnAgur.addActionListener(this);
		panel.add(btnAgur);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String mensaje = "";
		//cojo el tecto del boton que se ha pulsado
		Object o = ae.getSource();
		//obtengo el texto de ese boton y se lo doy a mensaje
		mensaje = ((JButton)o).getText();
		//completo el mensa con el texto
		mensaje = mensaje + "" + textField.getText();
		lblMensaje.setText(mensaje);
		
	}
}
