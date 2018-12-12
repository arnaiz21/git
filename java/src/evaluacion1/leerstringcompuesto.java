package evaluacion1;

import java.util.Scanner;

public class leerstringcompuesto {

	public static void main(String[] args) {
		/*
		 * leer un string por teclado y muestra por pantalla el
		 * mensaje "El valor de la variable introducida es".
		 */
		String n;
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		
		System.out.println("Introduce un valor String: ");
		n = teclado.next(); // asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
