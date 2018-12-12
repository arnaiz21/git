package evaluacion1;

import java.util.Scanner;

public class loncircu {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra el valor de la circunferencia de ese
		radio por pantalla con dos decimales
		 */
		double radio;
		double resultado;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//lee el valor del radio por teclado
		
		System.out.println("Introduce un valor para el radio: ");
		radio = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		
		resultado = 2 * Math.PI * radio;
		System.out.println("\nEl valor de la circunferencia es " + resultado);
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
