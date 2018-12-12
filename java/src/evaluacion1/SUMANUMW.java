package evaluacion1;

import java.util.Scanner;

public class SUMANUMW {

	public static void main(String[] args) {
		/*
		  Pide un número entero por teclado y muestra los
		  números desde 1 hasta él inclusive. Con MIENTRAS. 
				
		 */

		int numero, posicion, suma;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//leer nota
		System.out.println("Cantidad: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		//muestra los numeros desde el 1 hasta el inclusive
		//iniciando posicion
		posicion = 1;
		suma = 0;
		
		while (posicion <= numero) {
			//escribir posicion
			System.out.println(posicion);
			//actualizar posicion
			suma = suma + posicion;
			posicion = posicion + 1;
		}
		
		System.out.println("La suma de los " + numero + " primeros numeros es " + suma);
		
	}

}
