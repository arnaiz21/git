package Calculadora;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculadora extends JFrame {

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
	private JButton btnTriangulo;
	private JButton btnCirculo;
	private JButton btnCuadrado;
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
	private JPanel panel;
	private JTextField txtMensaje;
	
	double resultado, x, y;  // Declaramos variables para las operaciones
	
	char operacion; // Declaramos variable para almacenar el tipo de oeración 
	
	 // Declaramos variable para cambio de signo (los valores son "" o "-" ej. positivo o negativo)

	String signo;  //  Los valores son "" o "-" ej. positivo o negativo. Se deja vacío por eficiencia, ahorro de memoria.
	
	boolean nuevaOperacion = true; // DEclaramos e inicializamos nuevaOperacion para revisar si es nueva o no

	/**
	 * Launch the application.
	 */
	public void run() { // Método run para poder cerrar la ventana actual al abrir otra (se ha sacado del constructor principal para evitar errores).
		try {
			Calculadora frame = new Calculadora();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** public static void main(String[] args) {  // se ha generado una nueva clase para el método main ya que no se va a modificar
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.run();
		
		/** try {
			Calculadora frame = new Calculadora();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	*/


	public Calculadora() {
		
		
		
		
		// Inicializamos a cero las variables reales
		resultado = 0;
			
		x = 0;
				
		y = 0;
		
		// Inicializamos vacía la variable de signo para iundicar que es positivo si no se realiza nada
		signo = "";
		
		// Inicializamos operación
		operacion = '+'; // la primera operación será siempre una suma con respecto a cero
				
		Border dark_grayline;
		dark_grayline = BorderFactory.createLineBorder(Color.DARK_GRAY);
		setResizable(false);
		
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		panelbotones.add(btnNewButton);
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBorder(dark_grayline);
		
		btnCE = new JButton("CE");
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
		
	  btnRetroceso = new JButton("\u232B");
	  btnRetroceso.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRetroceso.setForeground(new Color(255, 255, 255));
		btnRetroceso.setBackground(new Color(128, 128, 128));
		panelbotones.add(btnRetroceso);
		btnRetroceso.setBorder(dark_grayline);
		
		btnDivision = new JButton("\u00F7");
		btnDivision.setBackground(new Color(128, 128, 128));
		btnDivision.setForeground(new Color(255, 255, 255));
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnDivision);
		btnDivision.setBorder(dark_grayline);
		
		btnBinario = new JButton("BINARIO");
		panelbotones.add(btnBinario);
		btnBinario.setBackground(new Color(128, 128, 128));
		btnBinario.setForeground(new Color(153, 50, 204));
		btnBinario.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBinario.setBorder(dark_grayline);
		
		btn7 = new JButton("7");
		btn7.setBackground(new Color(128, 128, 128));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn7);
		btn7.setBorder(dark_grayline);
		
		btn8 = new JButton("8");
		btn8.setBackground(new Color(128, 128, 128));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn8);
		btn8.setBorder(dark_grayline);
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(128, 128, 128));
		btn9.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn9);
		btn9.setBorder(dark_grayline);
		
		
		btnMulti = new JButton("x");
		btnMulti.setBackground(new Color(128, 128, 128));
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnMulti);
		btnMulti.setBorder(dark_grayline);
		
		btnCirculo = new JButton("\u25CF");
		panelbotones.add(btnCirculo);
		btnCirculo.setBackground(new Color(128, 128, 128));
		btnCirculo.setForeground(new Color(255, 0, 0));
		btnCirculo.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnCirculo.setBorder(dark_grayline);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(128, 128, 128));
		btn4.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn4);
		btn4.setBorder(dark_grayline);
		
		btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(128, 128, 128));
		btn5.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn5);
		btn5.setBorder(dark_grayline);
		
		btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(128, 128, 128));
		btn6.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn6);
		btn6.setBorder(dark_grayline);
		
		btnResta = new JButton("-");
		btnResta.setForeground(new Color(255, 255, 255));
		btnResta.setBackground(new Color(128, 128, 128));
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnResta);
		btnResta.setBorder(dark_grayline);
		
		btnTriangulo = new JButton("\u25B2");
		panelbotones.add(btnTriangulo);
		btnTriangulo.setBackground(new Color(128, 128, 128));
		btnTriangulo.setForeground(new Color(50, 205, 50));
		btnTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnTriangulo.setBorder(dark_grayline);
		
		btn1 = new JButton("1");
		btn1.setBackground(new Color(128, 128, 128));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn1);
		btn1.setBorder(dark_grayline);
		
		btn2 = new JButton("2");
		btn2.setBackground(new Color(128, 128, 128));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn2);
		btn2.setBorder(dark_grayline);
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(128, 128, 128));
		btn3.setFont(new Font("Arial", Font.PLAIN, 24));
		panelbotones.add(btn3);
		btn3.setBorder(dark_grayline);
		
		btnSuma = new JButton("+");
		btnSuma.setBackground(new Color(128, 128, 128));
		btnSuma.setForeground(new Color(255, 255, 255));
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelbotones.add(btnSuma);
		btnSuma.setBorder(dark_grayline);
		
		btnCuadrado = new JButton("\u25A0");
		panelbotones.add(btnCuadrado);
		btnCuadrado.setForeground(new Color(0, 0, 205));
		btnCuadrado.setBackground(new Color(128, 128, 128));
		btnCuadrado.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnCuadrado.setBorder(dark_grayline);
		
		btnMasmenos = new JButton("\u00B1");
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
		
		btnComa = new JButton(",");
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
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setEditable(false); // No será editable para evitar que se intruduzca por teclado valores no permitidos (no numéricos, o 2+ en binario).
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
		txtMensaje.setText("- Introduce la operaci\u00F3n o elige la funci\u00F3n -");
		contentPane.add(txtMensaje, BorderLayout.SOUTH);
		txtMensaje.setColumns(10);
		txtMensaje.setBorder(dark_grayline);
		

		btnCE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BorrarOperacion();
			}
		});
		

		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BorrarTodo();
			}
		});
		

		btnRetroceso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BorrarCaracter();
			}
		});
		

		btnDivision.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('/'); // se pasa un char al método AnyadirFuncion, por que el método debe recoger un char
			}
		});
		

		btnBinario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Binario();
			}
		});
		

		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("7"); // se pasa un String al método AnyadirANumero por que el método debe recoger un String
			}
		});
		

		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("8");
			}
		});
		

		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("9");
			}
		});
		

		btnMulti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('*');
			}
		});
		

		btnCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Circulo();
			}
		});
		

		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("5");
			}
		});
		

		btnResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('-');
			}
		});
		

		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("4");
			}
		});
		

		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("6");
			}
		});
		

		btnTriangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Triangulo();
			}
		});
		

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("1");
			}
		});
		

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("2");
			}
		});
		

		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("3");
			}
		});
		

		btnSuma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirFuncion('+');
			}
		});
		

		btnCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cuadrado();
			}
		});
		

		btnMasmenos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CambiarSigno();
			}
		});
		

		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero("0");
			}
		});
		

		btnComa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnyadirANumero(",");
			}
		});
		

		btnEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Igual();
			}
		});
	}
	
	private void AnyadirANumero(String num) { // método común para añadir un dígito al número / si se pulsa algún botón numérico
		String textoPrincipal = textField.getText(); // Inicializamos variable paa recoger el texto de la pantalla y simplificar el código sustituyendo textField.getText() por ella
		if (num.equals(",")) { // si le pasamos una coma
			
			if (!textoPrincipal.contains(",")) { // Si el campo a mostrar no tiene coma
				
				textField.setText(textoPrincipal + num);  // Añadimos la coma a la dcha
				
			}
			
		}

		
		else { // Para cualquier otra tecla
			
			
			if (textoPrincipal.equals("0")) { // si el valor actual del campo a mostrar es cero, sin comas
				
				textField.setText(num); // Sustituimos el valor, por lo que se ha pulsado.
										// Esto evita ceros a la izquierda.
				
			}
			
			else if (textoPrincipal.equals("-0")) { // si el valor actual del campo a mostrar es menos cero, sin comas
				
				textField.setText("-"+num); // Sustituimos el valor, por lo que se ha pulsado.
										// esto evita ceros a la izquierda.
				
			}
			else if (nuevaOperacion && textoPrincipal.equals(String.valueOf(resultado))) { // Si es una nueva operación y el texto principal contiene resultado
				
				textField.setText(num); // Sustituimos el contenido de la pantalla principal por lo introducido por el usuario
				signo = ""; // reseteamos el signo a positivo
				
			}
			else {  // Si el valor a mostrar no es cero
				
				textField.setText(textoPrincipal + num); // se añade el botón pulsado

			}	
				
		}
	}
	
	private void AnyadirFuncion(char funcion) { // método común para registrar una función / si se pulsa algun botçon de función

			if (!nuevaOperacion) { // Si no es una nueva operación
				
				// Almacenar en y el valor introducido haciendo casting a double 
				y = Double.parseDouble(textField.getText().replace(',', '.')); // reemplazando coma por punto para el código mostrando en pantalla la coma

				// realizamos la operación en cola
				switch(operacion) {
				
				case '+': {
					
					resultado = x + y;
					
					break;
					
					}
				
				case '-': {
					
					resultado = x - y;
					
					break;
					
					}

				case '*': {
					
					resultado = x * y;
					
					break;

		
					}

				case '/': {
					
					resultado = x / y;
					
					break;

		
					}
				
				}

			}
			
			else { // Si es una nueva operación
				
				// almacenamos en resultado el contenido de la pantalla principal para seguir haciendo cálculos en caso necesario
			 resultado = Double.parseDouble(textField.getText().replace(',', '.')); // reemplazando coma por punto para el código mostrando en pantalla la coma
			
			}
			
			// Añadimos a la cola la operación siguiente
			operacion = funcion;
			
			nuevaOperacion = false;
			x = resultado; // Almacenar en x el resultado para seguir realizando operaciones con y
			
			textField.setText("0"); // Poner  cero  la nueva entrada
			signo = ""; // Establecemos de nuevo el signo a positivo
			
			txtMensaje.setText("Resultado actual: "  +resultado); // muestra en el mensaje informativo el resultado actual si no se pulsa =
		
		
		}
	
	private void Igual() {
		
		y = Double.parseDouble(textField.getText().replace(',', '.'));
		
		// realizamos la operación en cola
		switch(operacion) {
		
		case '+': {
			
			resultado = x + y;
			
			break;
			
			}
		
		case '-': {
			
			resultado = x - y;
			
			break;
			
			}

		case '*': {
			
			resultado = x * y;
			
			break;


			}

		case '/': {
			
			resultado = x / y;
			
			break;


			}
		
		}
			
		x = resultado;
				
		y = 0;
		signo = "";
		operacion = '='; 
		textField.setText(String.valueOf(resultado)); // muestra el resultado en el campo de texto principal
		
		txtMensaje.setText("Resultado final: "+resultado); // muestra en el mensaje informativo el resultado final si se pulsa =
		
		nuevaOperacion = true;

	}
	
	private void CambiarSigno() { // si se pulsa Masmenos	
		
		String textoprincipal = textField.getText();
		
		switch(signo) {
		
		case "": { // Si el dato presente en el campo visible es positivo
			
			signo = "-"; // pasa a ser negativo
			
			textField.setText(signo+textoprincipal); // se muestra el signo menos en pantalla una vez cambiado
			
			break;
			
		}
		
		case "-": { // Si el dato presente en el campo visible es negativo
			
			signo = ""; // pasa a ser positivo
			
			textField.setText(signo+textoprincipal.substring(1)); // Quita el primer carácter del texto mostrado, que será en este caso el signo menos
			
			break;
		}
		
		}
		
		}
	
	private void BorrarOperacion() { // Método para borrar la última operación al pulsar CE
		
		// Revertir la operación a su estado anterior
		nuevaOperacion = true;
		x = resultado;
		
		textField.setText(String.valueOf(resultado)); // Mantiene en pantalla el resultado actual	
		txtMensaje.setText("Introduce la operación o elige la función");
		
	}

	
	private void BorrarTodo() { // Método para borrar todas las operaciones
		
		// Reiniciamos la calculadora
		nuevaOperacion = true;
		
		x = 0;
		y = 0;
		resultado = 0;
		textField.setText("0");
		txtMensaje.setText("Introduce la operación o elige la función");
		
	}

	private void BorrarCaracter() { // Método para borrar el último caracter
		
		String textoprincipal = textField.getText(); // Almacenamos en texto el contenido del texto de la pantalla
		
		if (textoprincipal.length() == 1)	{ // Si la longitud es 1 (la mímima positiva)
			
			textField.setText("0"); // El texto en pantalla será 0
		}
		
		else if (textoprincipal.length() == 2 && signo == "-") { // Si la longitud es 2 y negativo (la mímima negativa)
			
			textField.setText("-0"); // El texto será menos cero para que siga siendo negativo
		}
		
		else { // Para el resto (positivos o negativos más grandes que la long mínima)
			
			textField.setText(textoprincipal.substring(0, textoprincipal.length() - 1)); // Se quita el último caracter
		}
		
		
	}
	
	private void Cuadrado() {
		
		Calculadora_Cuadrado calCuadrado = new Calculadora_Cuadrado();
		
		calCuadrado.run(); // Mostrar la pantalla de cuadrado
		
		dispose(); // Elimina el objeto en memoria (cierra la ventana)
	}
	
	private void Circulo() {
		
		Calculadora_Circulo calCirculo = new Calculadora_Circulo();
		
		calCirculo.run(); // Mostrar la pantalla de círculo
		
		dispose(); // Elimina el objeto en memoria (cierra la ventana)
		
	}
	
	private void Triangulo() {
		
		Calculadora_Triangulo calTriangulo = new Calculadora_Triangulo();
		
		calTriangulo.run(); // Mostrar la pantalla de triángulo
		
		dispose(); // Elimina el objeto en memoria (cierra la ventana)
		
	}
	
	private void Binario() {
		
		Calculadora_Binario calBinario = new Calculadora_Binario();
		
		calBinario.run(); // Mostrar la pantalla de binario
		
		// en el momento de generar run en otras, cambiar a  calBinario.run();
		
		dispose();  // Elimina el objeto en memoria (cierra la ventana)
		
	}
	
}

	// Realmente se podría implementar en una sola ventana, modificando el 
	// contenido dependiendo del modo de la calculadora, 
	// ya que no hay tanta direfencia de formato en cada una de los modos de la calculadora).
