package evaluacion1;

import java.util.Scanner;

public class leercaracter {

	public static void main(String[] args) {
		/*
		 * leer un caracter por teclado y muestra por pantalla el
		 * mensaje "El valor de la variable introducida es".
		 */
		char n;
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		
		System.out.println("Introduce un valor caracter: ");
		n = teclado.next().charAt(0); // asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
