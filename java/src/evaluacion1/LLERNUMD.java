
package evaluacion1;

import java.util.Scanner;

public class LLERNUMD {

	public static void main(String[] args) {
		/*
		  Pide un número entero por teclado y muestra los
		  números desde 1 hasta él inclusive. Con MIENTRAS. 
				
		 */

		int numero;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//leer nota
	
	

		
		
		//muestra los numeros desde el 1 hasta el inclusive
		//iniciando posicion
		
		
			do {
				System.out.println("Numero: ");
				numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
			} 
			
			while (numero < 0);
			
			teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		System.out.println("El numero introducido es " + numero);
		
	}

}
