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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextPane;

public class BotonesMensajeMenu extends JFrame implements ActionListener{

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
	private JMenu mnArchivo;
	private JMenuItem mntmHola;
	private JMenuItem mntmAdios;
	private JMenuItem mntmKaixo;
	private JMenuItem mntmAgur;
	private JMenu mnNewMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajeMenu frame = new BotonesMensajeMenu();
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
	public BotonesMensajeMenu() {
		setTitle("Botones de Mensajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmHola = new JMenuItem("Hola");
		mntmHola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mntmHola.addActionListener(this);
		mnArchivo.add(mntmHola);
		
		mntmAdios = new JMenuItem("Adios");
		mntmAdios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mntmAdios.addActionListener(this);
		mnArchivo.add(mntmAdios);
		
		mntmKaixo = new JMenuItem("Kaixo");
		mntmKaixo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		mntmKaixo.addActionListener(this);
		mnArchivo.add(mntmKaixo);
		
		mntmAgur = new JMenuItem("Agur");
		mntmAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mntmAgur.addActionListener(this);
		mnArchivo.add(mntmAgur);
		
		mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
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
		//obtengo el boton que se ha pulsado
		Object o = ae.getSource();
		
		mensaje = o.getClass().getName();
		
		if(mensaje.equals("javax.swing.JButton")) {
			//si es un boton
			//obtengo el texto de ese boton y se lo doy a mensaje
			mensaje = ((JButton)o).getText();
		}
		else if(mensaje.equals("javax.swing.JMenuItem")) {
			//si es una opcion de menu
			//obtengo el texto de esa opcion y se lo doy a mensaje
			mensaje = ((JMenuItem)o).getText();
		}
		
		
		//completo el mensa con el texto
		mensaje = mensaje + "" + textField.getText();
		//muestro el mensaje de la etiqueta
		lblMensaje.setText(mensaje);
		
	}
}
