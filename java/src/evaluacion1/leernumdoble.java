package evaluacion1;

import java.util.Scanner;

public class leernumdoble {

	public static void main(String[] args) {
		/*
		 * leer un numero entero por teclado, le suma 1 y muestra por pantalla
		 */
		int n;
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		//le suma 1
		n = 2 * n;
		System.out.println("El valor de la variable es " + n);
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
