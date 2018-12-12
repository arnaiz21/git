package evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		/*
		 *lee un número real por teclado y muestra por separado su parte entera y su
			parte real.
		 */
		double n;
		int parteentera;
		double partereal;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//lee n
		System.out.println("N: ");
		n = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
		//calculo parteentera
		parteentera = (int) n;
		
		//Calculo partereal
		partereal = n - parteentera;
		
		//mostrar el resultado
		System.out.println("Parte entera: " + parteentera + " Parte Real: " + partereal);
		
	}

}
