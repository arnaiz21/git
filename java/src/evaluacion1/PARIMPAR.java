package evaluacion1;

import java.util.Scanner;

public class PARIMPAR {

	public static void main(String[] args) {
		/*
		 * Lee el valor de un número entero por teclado y muestra su valor absoluto por pantalla. 
		 */

		int n;
		int resultado;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//lee cantidad
		System.out.println("Cantidad: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		if(n>0) {
			//si n es positivo
			resultado = n;
		}

		else {
			//si n es negativo
			resultado = -n;
		}
		
		//mostrar el resultado
		System.out.println("El valor absoluto de " + n + " es " + resultado);
		
	}

}
