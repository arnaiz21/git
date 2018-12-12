package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		/*
		 * lee una cantidad en euros por teclado y muestra por separado el número de
			euros y el número de céntimos de euro.
		 */
		double cantidad;
		int euros;
		int centimos;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//lee cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		//calculo euros
		euros = (int) cantidad;
		
		//Calculo centimos
		centimos = (int) ((cantidad - euros) * 100);
		
		//mostrar el resultado
		System.out.println("Euro: " + euros + " Centimos: " + centimos);
		
	}

}
