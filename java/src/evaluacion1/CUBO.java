package evaluacion1;

import java.util.Scanner;

public class CUBO {

	public static void main(String[] args) {
		/*
		 *  lee un número por teclado y calcula el cubo de ese número.
		 */
		double n;
		double resultado;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n
		
		
		resultado = n * n * n;
		
		System.out.println("El valor del cubo es " + resultado);
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
