package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Calculadora_Cuadrado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4025754604933348701L;
	private JPanel contentPane;
	private JPanel panelbotones;
	private JTextField textField;
	private JButton btnVolver;
	private JButton btnSuma;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnRetroceso;
	private JButton btnDivision;
	private JButton btnResta;
	private JButton btnMulti;
	private JButton btnNull1;
	private JButton btnArea;
	private JButton btnNull2;
	private JButton btnPerimetro;
	private JButton btnComa;
	private JButton btnMasmenos;
	private JButton btnOK;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JPanel panel;
	private JTextField txtMensaje;
	
	double resultado, lado;  // Declaramos variables para las operaciones
	
	char operacion; // Declaramos variable para almacenar el tipo de oeración 
	
	// boolean nuevaOperacion = true; // DEclaramos e inicializamos nuevaOperacion para revisar si es nueva o no

	

	/**
	 * Launch the application.
	 */
	
	public void run() { // Método run para poder cerrar la ventana actual al abrir otra (se ha sacado del constructor principal para evitar errores).
		try {
			Calculadora_Cuadrado frame = new Calculadora_Cuadrado();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Para cerrar la ventana cuando se solicite en el método del botón pulsado + dispose(); dentro del método
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Cuadrado frame = new Calculadora_Cuadrado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Calculadora_Cuadrado() {
		setResizable(false);
		
		Border dark_grayline;
		dark_grayline = BorderFactory.createLineBorder(Color.DARK_GRAY);
		
		
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setTitle("KALKUKIDZ");
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
		panelbotones.setLayout(new GridLayout(0, 5, 0, 0));
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Dialog", Font.BOLD, 20));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		panelbotones.add(btnVolver);
		btnVolver.setBackground(new Color(128, 128, 128));
		btnVolver.setBorder(dark_grayline);
		btnVolver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Volver();
			}
		});
		
		btnCE = new JButton("CE");
		btnCE.setEnabled(false);
		btnCE.setForeground(new Color(255, 140, 0));
		btnCE.setBackground(new Color(128, 128, 128));
		btnCE.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btnCE);
		btnCE.setBorder(dark_grayline);
	  
		
		btnC = new JButton("C");
		btnC.setBackground(new Color(128, 128, 128));
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btnC);
		btnC.setBorder(dark_grayline);
		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BorrarTodo();
			}
		});
		
	  btnRetroceso = new JButton("\u232B");
	  btnRetroceso.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRetroceso.setForeground(new Color(255, 255, 255));
		btnRetroceso.setBackground(new Color(128, 128, 128));
		panelbotones.add(btnRetroceso);
		btnRetroceso.setBorder(dark_grayline);
		btnRetroceso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BorrarCaracter();
			}
		});
		
		btnDivision = new JButton("\u00F7");
		btnDivision.setEnabled(false);
		btnDivision.setBackground(new Color(128, 128, 128));
		btnDivision.setForeground(new Color(255, 255, 255));
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnDivision);
		btnDivision.setBorder(dark_grayline);
		
		btnNull1 = new JButton("");
		panelbotones.add(btnNull1);
		btnNull1.setBackground(new Color(128, 128, 128));
		btnNull1.setForeground(new Color(153, 50, 204));
		btnNull1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNull1.setBorder(dark_grayline);
		
		btn7 = new JButton("7");
		btn7.setBackground(new Color(128, 128, 128));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn7);
		btn7.setBorder(dark_grayline);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("7"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn8 = new JButton("8");
		btn8.setBackground(new Color(128, 128, 128));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn8);
		btn8.setBorder(dark_grayline);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("8"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(128, 128, 128));
		btn9.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn9);
		btn9.setBorder(dark_grayline);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("9"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btnMulti = new JButton("x");
		btnMulti.setEnabled(false);
		btnMulti.setBackground(new Color(128, 128, 128));
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnMulti);
		btnMulti.setBorder(dark_grayline);
		
		btnNull2 = new JButton("");
		panelbotones.add(btnNull2);
		btnNull2.setBackground(new Color(128, 128, 128));
		btnNull2.setForeground(new Color(255, 0, 0));
		btnNull2.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnNull2.setBorder(dark_grayline);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(128, 128, 128));
		btn4.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn4);
		btn4.setBorder(dark_grayline);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("4"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(128, 128, 128));
		btn5.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn5);
		btn5.setBorder(dark_grayline);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("5"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(128, 128, 128));
		btn6.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn6);
		btn6.setBorder(dark_grayline);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("6"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btnResta = new JButton("-");
		btnResta.setEnabled(false);
		btnResta.setForeground(new Color(255, 255, 255));
		btnResta.setBackground(new Color(128, 128, 128));
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnResta);
		btnResta.setBorder(dark_grayline);
		
		btnArea = new JButton("\u00C1rea");   // Botón de calculo de área del cuadrado sobre dato introducido
		panelbotones.add(btnArea);
		btnArea.setBackground(new Color(128, 128, 128));
		btnArea.setForeground(new Color(50, 205, 50));
		btnArea.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnArea.setBorder(dark_grayline);
		btnArea.addActionListener(new ActionListener() {  // ActioListener del botón de cálculo de área
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('a'); // se pasa un char al método AnyadirFuncion, por que el método debe recoger un char
			}
		});
		
		btn1 = new JButton("1");
		btn1.setBackground(new Color(128, 128, 128));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn1);
		btn1.setBorder(dark_grayline);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("1"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn2 = new JButton("2");
		btn2.setBackground(new Color(128, 128, 128));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn2);
		btn2.setBorder(dark_grayline);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("2"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(128, 128, 128));
		btn3.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn3);
		btn3.setBorder(dark_grayline);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("3"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btnSuma = new JButton("+");
		btnSuma.setEnabled(false);
		btnSuma.setBackground(new Color(128, 128, 128));
		btnSuma.setForeground(new Color(255, 255, 255));
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnSuma);
		btnSuma.setBorder(dark_grayline);
		
		btnPerimetro = new JButton("Per\u00EDmetro");  // Botón de calculo de perímetro del cuadrado sobre dato introducido
		panelbotones.add(btnPerimetro);
		btnPerimetro.setForeground(new Color(0, 0, 205));
		btnPerimetro.setBackground(new Color(128, 128, 128));
		btnPerimetro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPerimetro.setBorder(dark_grayline);
		btnPerimetro.addActionListener(new ActionListener() {  // ActioListener del botón de cálculo de perímetro
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('p'); // se pasa un char al método AnyadirFuncion, por que el método debe recoger un char
			}
		});
		
	  btnMasmenos = new JButton("\u00B1");
	  btnMasmenos.setEnabled(false);
		btnMasmenos.setForeground(Color.WHITE);
		btnMasmenos.setFont(new Font("Arial", Font.PLAIN, 20));
		btnMasmenos.setBackground(Color.GRAY);
		panelbotones.add(btnMasmenos);
		btnMasmenos.setBorder(dark_grayline);
		
		btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(128, 128, 128));
		btn0.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn0);
		btn0.setBorder(dark_grayline);
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("0"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		
		btnComa = new JButton(",");
		btnComa.setForeground(new Color(255, 255, 255));
		btnComa.setBackground(new Color(128, 128, 128));
		btnComa.setFont(new Font("Arial", Font.PLAIN, 30));
		panelbotones.add(btnComa);
		btnComa.setBorder(dark_grayline);
		btnComa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero(","); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		 
		btnOK = new JButton("OK");  // Botón para calcular la operación
		btnOK.setBackground(new Color(50, 205, 50));
		btnOK.setForeground(new Color(255, 255, 255));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnOK);
		btnOK.setBorder(dark_grayline);
		btnOK.addActionListener(new ActionListener() {  // ActionListener para el botón de OK
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OK();  // Llamada al método OK
			}
		});
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setText("0");
		textField.setBackground(new Color(192, 192, 192));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 50));
		textField.setColumns(10);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(textField);
		
		txtMensaje = new JTextField();
		txtMensaje.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMensaje.setForeground(new Color(105, 105, 105));
		txtMensaje.setBackground(new Color(192, 192, 192));
		txtMensaje.setText(" \u25A0 Introduce el lado del cuadrado, luego la funci\u00F3n y después pulsa OK");
		contentPane.add(txtMensaje, BorderLayout.SOUTH);
		txtMensaje.setColumns(10);
		txtMensaje.setBorder(dark_grayline);
		
	}
	
	private void AnyadirANumero(String num) { // método común para añadir un dígito al número / si se pulsa algún botón numérico

		if (num.equals(",")) { // si le pasamos una coma
			
			if (!textField.getText().contains(",")) { // Si el campo a mostrar no tiene coma
				
				textField.setText(textField.getText() + num);  // Añadimos la coma a la dcha
				
			}
			
		}

		
		else { // Para cualquier otra tecla
			
			
			if (textField.getText().equals("0")) { // si el valor actual del campo a mostrar es cero, sin comas
				
				textField.setText(num); // Sustituimos el valor, por lo que se ha pulsado.
										// Esto evita ceros a la izquierda.
				
			}
			else if (textField.getText().equals(String.valueOf(resultado))) { // Si el texto principal contiene resultado
				
				textField.setText(num); // Sustituimos el contenido de la pantalla principal por lo introducido por el usuario
				
			}
			else {  // Si el valor a mostrar no es cero
				
				textField.setText(textField.getText() + num); // se añade el botón pulsado

			}	
				
		}
	}
	
	private void AnyadirFuncion(char funcion) { // método común para registrar una función / si se pulsa algun botçon de función

		// if (!nuevaOperacion) { // Si no es una nueva operación
			
			// Almacenar en y el valor introducido haciendo casting a double 
			lado = Double.parseDouble(textField.getText().replace(',', '.')); // reemplazando coma por punto para el código mostrando en pantalla la coma

			operacion = funcion; // Pasamos el dato del botón a la variable operacion
			
			// realizamos la operación en cola
			switch(operacion) { // Seleccionamos operación y ...
			
			case 'a': { // ... en caso de área
				
				resultado = lado * lado; // lado al cuadrado
				
				break;
				
				}
			
			case 'p': { // ... en caso de perímetro
				
				resultado = 4 * lado; // suma de los 4 lados
				
				break;
				
				}
			
			}
			
			
		// }

}
	
	private void OK() {
		
		textField.setText(String.valueOf(resultado)); // muestra el resultado en el campo de texto principal
		
		if (operacion == 'a') {
			
			txtMensaje.setText("El área del cuadrado es: "+ resultado); // muestra en el mensaje informativo el resultado actual si no se pulsa =
		}
		
		else {
			
			txtMensaje.setText("El perímetro del cuadrado es: "+ resultado); // muestra en el mensaje informativo el resultado actual si no se pulsa =
			
		}		
		
		
		// nuevaOperacion = true;

	}
	
private void Volver() { // Método para volver a la calculadora básica
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.run(); // Llamada al método run de la ventana principal
			
		dispose();  // Elimina el objeto en memoria (cierra la ventana)
		
	}

private void BorrarTodo() { // Método para borrar todas las operaciones
	
	// Reiniciamos la calculadora
	
	lado = 0;
	resultado = 0;
	textField.setText("0");
	txtMensaje.setText(" \u25A0 Introduce el lado del cuadrado, luego la funci\u00F3n y después pulsa OK");
	
}

private void BorrarCaracter() { // Método para borrar el último caracter
	
	String texto = textField.getText(); // Almacenamos en texto el contenido del texto de la pantalla
	
	if (texto.length() == 1)	{ // Si la longitud es 1 (la mímima positiva)
		
		textField.setText("0"); // El texto en pantalla será 0
	}
	
	else { // Para el resto (positivos o negativos más grandes que la long mínima)
		
		textField.setText(texto.substring(0, texto.length() - 1)); // Se quita el último caracter
	}
	
	
}

}

