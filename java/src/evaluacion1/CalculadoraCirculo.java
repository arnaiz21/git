package evaluacion1;

import java.util.Scanner;

public class CalculadoraCirculo {

	public static void main(String[] args) {
		/*
		 *   lee el valor del radio por teclado y muestra el valor del área de un círculo de ese
		radio por pantalla con dos decimales. Para el cálculo podemos usar la constante Java Math.PI.

		 */
		double radio;
		double Resultado;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		radio = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		
		Resultado = Math.PI * radio * radio;
		
		System.out.printf("\nEl valor de la variable es %.2f", Resultado);
	
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
