package examen1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Examen1Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -948772531807319438L;
	private JPanel contentPane;
	private JPanel panelbotones;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JPanel panelMensaje;
	private JTextField txtMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Menu frame = new Examen1Menu();
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
	public Examen1Menu() {
		
		setTitle("Examen Aitor Bartolome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 449);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new LineBorder(new Color(64, 64, 64)));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelbotones = new JPanel();
		panelbotones.setBorder(new EmptyBorder(2, 2, 2, 2));
		panelbotones.setForeground(Color.DARK_GRAY);
		panelbotones.setBackground(Color.DARK_GRAY);
		contentPane.add(panelbotones, BorderLayout.CENTER);
		panelbotones.setLayout(new GridLayout(2, 5, 0, 0));
		
		btn4 = new JButton("esPrimo");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(128, 128, 128));
		btn4.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn4);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Primo(Double.parseDouble(textField.getText().replace(',', '.')));

				
			}
		});
		
		btn1 = new JButton("Circunferencia");
		btn1.setBackground(new Color(128, 128, 128));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Circunferencia(Double.parseDouble(textField.getText().replace(',', '.')));

				
			}
		});
		
		btn2 = new JButton("10 Multiplos");
		btn2.setBackground(new Color(128, 128, 128));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Multiplos(Double.parseDouble(textField.getText().replace(',', '.')));

				
			}
		});
		
		btn3 = new JButton("Par o Impar");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(128, 128, 128));
		btn3.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				ParImpar(Integer.parseInt(textField.getText().replace(',', '.')));
				
			}
		});
		
		panelMensaje = new JPanel();
		contentPane.add(panelMensaje, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setText("0");
		textField.setBackground(new Color(192, 192, 192));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 30));
		textField.setColumns(10);
		panelMensaje.setLayout(new GridLayout(0, 1, 0, 0));
		panelMensaje.add(textField);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtMensaje.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMensaje.setForeground(new Color(105, 105, 105));
		txtMensaje.setBackground(new Color(192, 192, 192));
		txtMensaje.setText("Examen menú");
		contentPane.add(txtMensaje, BorderLayout.SOUTH);
		txtMensaje.setColumns(10);
		
	}
	
	private void Primo(Double num) {
		
		
		if (num%2 == 0 && num%num != 0) {
			
			txtMensaje.setText("El número "+num+" no es primo");
			
		}
		
		else  {
			
			txtMensaje.setText("El número "+num+" es primo");
			
		}
		 
		
		
	}
	
	private void Circunferencia(Double num) {
		
		txtMensaje.setText("El valor de la circunferencia de "+num+" es "+2*Math.PI*(num));
		
	}
	
	private void Multiplos(Double num) {
		
		
		
	
		txtMensaje.setText("Los 10 primeros múltiplos de "+num+" son "+num+" "+num*2+" "+num*3+" "+num*4+" "+num*5+" "+num*6+" "+num*7+" "+num*8+" "+num*9+" "+num*10);
		
	}
	
	private void ParImpar(int num) {
		
		
		if (num%2 == 0) {
			
			txtMensaje.setText("El número "+num+" es PAR");
			
		}
		
		else {
			
			txtMensaje.setText("El número "+num+" es IMPAR");
			
		}
		
		
		
	}
	
	

}
