package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PRUEBA extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7215850882845697479L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRUEBA frame = new PRUEBA();
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
	public PRUEBA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(65, 25, 272, 65);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(165, 156, 91, 40);
		panel.add(lblNewLabel);
		
		JLabel lblRespuesta = new JLabel("respuesta -->");
		lblRespuesta.setBounds(65, 169, 91, 14);
		panel.add(lblRespuesta);
		
		JButton btnNota = new JButton("nota");
		btnNota.setBounds(144, 112, 89, 23);
		panel.add(btnNota);
		btnNota.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		String nota = textField.getText();
		String resultado = null;
		
		lblNewLabel.setText(resultado);
		
	}
}
