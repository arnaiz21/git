package Calculadora;

import java.awt.BorderLayout;

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


public class Calculadora_Binario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4025754604933348701L;
	private JPanel contentPane;
	private JPanel panelbotones;
	private JTextField textField;
	private JButton btnSuma;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnRetroceso;
	private JButton btnDivision;
	private JButton btnResta;
	private JButton btnMulti;
	private JButton btnBinario;
	private JButton btnOR;
	private JButton btnAND;
	private JButton btnXOR;
	private JButton btnComa;
	private JButton btnMasmenos;
	private JButton btnEqual;
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
	private JButton btnVolver;
	private JPanel panel;
	private JTextField txtMensaje;
	
	int resultado, x, y;  // Declaramos variables para las operaciones
	
	char operacion; // Declaramos variable para almacenar el tipo de oeración 
	
	 // Declaramos variable para cambio de signo (los valores son "" o "-" ej. positivo o negativo)

	String signo;  //  Los valores son "" o "-" ej. positivo o negativo. Se deja vacío por eficiencia, ahorro de memoria.
	
	boolean nuevaOperacion = true; // DEclaramos e inicializamos nuevaOperacion para revisar si es nueva o no

	

	public void run() { // Método run para poder cerrar la ventana actual al abrir otra (se ha sacado del constructor principal para evitar errores).
		try {
			Calculadora_Binario frame = new Calculadora_Binario();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Para cerras la ventana cuando se solicite en el método del botón pulsado + dispose(); dentro del método
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 
	 * Launch the application.
	 */
	
	/** ¡¡¡Sólo un main en el programa completo!!!
	 * 
	 * public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Binario frame = new Calculadora_Binario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public Calculadora_Binario() {
		setResizable(false);
		
		Border dark_grayline;
		dark_grayline = BorderFactory.createLineBorder(Color.DARK_GRAY);
		
		// Todos los botones que no se usen estarán desactivados con setEnabled(false);

		
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
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
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
	  btnRetroceso.setEnabled(false);
	  btnRetroceso.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRetroceso.setForeground(new Color(255, 255, 255));
		btnRetroceso.setBackground(new Color(128, 128, 128));
		panelbotones.add(btnRetroceso);
		btnRetroceso.setBorder(dark_grayline);
		
		btnDivision = new JButton("\u00F7");
		btnDivision.setEnabled(false);
		btnDivision.setBackground(new Color(128, 128, 128));
		btnDivision.setForeground(new Color(255, 255, 255));
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnDivision);
		btnDivision.setBorder(dark_grayline);
		
		btnBinario = new JButton("BINARIO");
		btnBinario.setEnabled(false);
		panelbotones.add(btnBinario);
		btnBinario.setBackground(new Color(128, 128, 128));
		btnBinario.setForeground(new Color(153, 50, 204));
		btnBinario.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBinario.setBorder(dark_grayline);
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.setBackground(new Color(128, 128, 128));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn7);
		btn7.setBorder(dark_grayline);
		
		btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.setBackground(new Color(128, 128, 128));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn8);
		btn8.setBorder(dark_grayline);
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(128, 128, 128));
		btn9.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn9);
		btn9.setBorder(dark_grayline);
		
		btnMulti = new JButton("x");
		btnMulti.setEnabled(false);
		btnMulti.setBackground(new Color(128, 128, 128));
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnMulti);
		btnMulti.setBorder(dark_grayline);
		
		btnAND = new JButton("AND");  // Botón para realizar el cálculo lógico AND
		panelbotones.add(btnAND);
		btnAND.setBackground(new Color(128, 128, 128));
		btnAND.setForeground(Color.DARK_GRAY);
		btnAND.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAND.setBorder(dark_grayline);
		btnAND.addActionListener(new ActionListener() {  // Action listener del botón AND
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('a');   // Llamada al método de añadir función. Se le pasa un caracter ya que el método debe recoger un caracter
			}
		});
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(128, 128, 128));
		btn4.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn4);
		btn4.setBorder(dark_grayline);
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(128, 128, 128));
		btn5.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn5);
		btn5.setBorder(dark_grayline);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(128, 128, 128));
		btn6.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn6);
		btn6.setBorder(dark_grayline);
		
		btnResta = new JButton("-");
		btnResta.setEnabled(false);
		btnResta.setForeground(new Color(255, 255, 255));
		btnResta.setBackground(new Color(128, 128, 128));
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnResta);
		btnResta.setBorder(dark_grayline);
		
		btnOR = new JButton("OR"); // Botón para realizar el cálculo lógico OR
		panelbotones.add(btnOR);
		btnOR.setBackground(new Color(128, 128, 128));
		btnOR.setForeground(Color.DARK_GRAY);
		btnOR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOR.setBorder(dark_grayline);
		btnOR.addActionListener(new ActionListener() {  // Action listener del botón OR
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('o');      // Llamada al método de añadir función. Se le pasa un caracter ya que el método debe recoger un caracter
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
				AnyadirANumero("1");
			}
		});
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.setBackground(new Color(128, 128, 128));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn2);
		btn2.setBorder(dark_grayline);
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(128, 128, 128));
		btn3.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn3);
		btn3.setBorder(dark_grayline);
		
		btnSuma = new JButton("+");
		btnSuma.setEnabled(false);
		btnSuma.setBackground(new Color(128, 128, 128));
		btnSuma.setForeground(new Color(255, 255, 255));
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnSuma);
		btnSuma.setBorder(dark_grayline);
		
		btnXOR = new JButton("XOR");  // Botón para realizar el cálculo lógico XOR
		panelbotones.add(btnXOR);
		btnXOR.setForeground(Color.DARK_GRAY);
		btnXOR.setBackground(new Color(128, 128, 128));
		btnXOR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXOR.setBorder(dark_grayline);
		btnXOR.addActionListener(new ActionListener() {  // Action listener del botón XOR
			
			@Override
			public void actionPerformed(ActionEvent e) { 
				// TODO Auto-generated method stub
				AnyadirFuncion('x'); // Llamada al método de añadir función. Se le pasa un caracter ya que el método debe recoger un caracter
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
				AnyadirANumero("0");
			}
		});
		
		btnComa = new JButton(",");
		btnComa.setEnabled(false);
		btnComa.setForeground(new Color(255, 255, 255));
		btnComa.setBackground(new Color(128, 128, 128));
		btnComa.setFont(new Font("Arial", Font.PLAIN, 30));
		panelbotones.add(btnComa);
		btnComa.setBorder(dark_grayline);
		
		btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(50, 205, 50));
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panelbotones.add(btnEqual);
		btnEqual.setBorder(dark_grayline);
		btnEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Igual();
			}
		});
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.WHITE);
		textField.setText("0");
		textField.setBackground(new Color(192, 192, 192));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 50));
		textField.setColumns(10);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(textField);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtMensaje.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtMensaje.setForeground(new Color(105, 105, 105));
		txtMensaje.setBackground(new Color(192, 192, 192));
		txtMensaje.setText("- Operaciones l\u00F3gicas AND, OR y XOR -");
		contentPane.add(txtMensaje, BorderLayout.SOUTH);
		txtMensaje.setColumns(10);
		txtMensaje.setBorder(dark_grayline);
		
	}
	
	private void AnyadirANumero(String num) { // método común para añadir un dígito al número / si se pulsa algún botón numérico

		String textoprincipal = textField.getText();
	
		if (num.equals(",")) { // si le pasamos una coma
			
			if (!textoprincipal.contains(",")) { // Si el campo a mostrar no tiene coma
				
				textField.setText(textoprincipal + num);  // Añadimos la coma a la dcha
				
			}
			
		}

		
		else { // Para cualquier otra tecla
			
			
			if (textoprincipal.equals("0")) { // si el valor actual del campo a mostrar es cero
				
				textField.setText(num); // Sustituimos el valor, por lo que se ha pulsado.
										// Esto evita ceros a la izquierda.
				
			}
			
			else if (textoprincipal.equals("1")) { // si el valor actual del campo a mostrar es uno
				
				textField.setText(num); // Sustituimos el valor, por lo que se ha pulsado.
										// esto evita ceros a la izquierda.
				
			}
			else { // Si es una nueva operación y el texto principal contiene resultado
				
				textField.setText(num); // Sustituimos el contenido de la pantalla principal por lo introducido por el usuario
				
			}	
				
		}
	}
	
	private void AnyadirFuncion(char funcion) { // método común para registrar una función / si se pulsa algun botón de función

		if (!nuevaOperacion) { // Si no es una nueva operación
			
			// Almacenar en y el valor introducido haciendo casting a double 
			y = Integer.parseInt(textField.getText());

			// realizamos la operación en cola
			switch(operacion) {
			
			case 'a': { // Si la operación pasada es AND / pulsan botón AND
				
				if (x == 1 && y == 1) {  // Si x es 1 e y es 1
					
					resultado = 1; // EL resultado será 1
					
				}
				
				else {  // Para cualquier otra opción
					
					resultado = 0; // El resultado será cero
					
				}
				
				break;
				
				}
			
			case 'o': { // Si la operación pasada es OR / pulsan botón OR
				
				
				if (x == 1 || y == 1) { // Si x es 1 o y es 1
					
					resultado = 1; // El resultado será uno
					
				}
				
				else { // Para cualquier otra opción
					
					resultado = 0; // El resultado será cero
					
				}
				
				break;
				
				}

			case 'x': { // Si la operación pasada es XOR / pulsan botón XOR
				
				if (x != y) { // Si x es diferente de y
					
					resultado = 1; // El resultado será 1
					
				}
				
				else {  // Si son iguales
					
					resultado = 0; // El resultado será cero
					
				}
				
				break;

	
				}
			
			}

		}
		
		else { // Si es una nueva operación
			
			// almacenamos en resultado el contenido de la pantalla principal para seguir haciendo cálculos en caso necesario
		 resultado = Integer.parseInt(textField.getText()); // reemplazando coma por punto para el código mostrando en pantalla la coma
		
		}
		
		// Añadimos a la cola la operación siguiente
		operacion = funcion;
		
		nuevaOperacion = false;
		x = resultado; // Almacenar en x el resultado para seguir realizando operaciones con y
		
		textField.setText("0"); // Poner  cero  la nueva entrada
		
		if (resultado == 1) {
			
			txtMensaje.setText("Resultado actual: VERDADERO"); // muestra en el mensaje informativo el resultado actual si no se pulsa =
		}
		
		else {
			
			txtMensaje.setText("Resultado actual: FALSO"); // muestra en el mensaje informativo el resultado actual si no se pulsa =
			
		}
	
	
	}
	
	
private void Igual() {
		
		y = Integer.parseInt(textField.getText());
		
		// realizamos la operación en cola
		switch(operacion) {
		
		case 'a': { // Si la operación pasada es AND / pulsan botón AND
			
			if (x == 1 && y == 1) {  // La misma casuística que en el método de AnyadirFuncion()
				
				resultado = 1;
				
			}
			
			else {
				
				resultado = 0;
				
			}
			
			break;
			
			}
		
		case 'o': { // Si la operación pasada es OR / pulsan botón OR
			
			
			if (x == 1 || y == 1) {   // La misma casuística que en el método de AnyadirFuncion()
				
				resultado = 1;
				
			}
			
			else {
				
				resultado = 0;
				
			}
			
			break;
			
			}

		case 'x': { // Si la operación pasada es XOR / pulsan botón XOR
			
			if (x != y) { // La misma casuística que en el método de AnyadirFuncion()
				
				resultado = 1;
				
			}
			
			else {
				
				resultado = 0;
				
			}
			
			break;


			}
		
		}
			
		x = resultado;  // Almacenamos en x el resultado para seguir haciendo operaciones con y en caso de que el usuario quiera realizar una nueva operación con el dato final
				
		y = 0;  // reseteamos y
		operacion = '='; 
		textField.setText(String.valueOf(resultado)); // muestra el resultado en el campo de texto principal
		
		if (resultado == 1) { // Si esl resultado es 1
			
			txtMensaje.setText("Resultado FINAL: VERDADERO"); // muestra en el mensaje informativo el resultado actual si no se pulsa =
		}
		
		else { // si es cero
			
			txtMensaje.setText("Resultado FINAL: FALSO"); // muestra en el mensaje informativo el resultado actual si no se pulsa =
			
		}
		
		nuevaOperacion = true;  // la próxima será una nueva operación

	}
	
	
	
private void Volver() { // Método para volver a la calculadora básica
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.run(); // Llamada al método run de la ventana principal
				
		dispose();  // Elimina el objeto en memoria (cierra la ventana)
		
	}

private void BorrarTodo() { // Método para borrar todas las operaciones
	
	// Reiniciamos la calculadora
	nuevaOperacion = true;
	
	x = 0;
	y = 0;
	resultado = 0;
	textField.setText("0");
	txtMensaje.setText("Operaciones l\u00F3gicas AND, OR y XOR");
	
}

}

