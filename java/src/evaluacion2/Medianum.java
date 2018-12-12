package evaluacion2;

import java.util.Scanner;

public class Medianum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, posicion, elementos;
		int[] arrayenteros = new int[5];
		double media;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//antes de leer el valor muestro un mensaje informativo
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		elementos=0;
		
		while(elementos < 5 && n >=0) {
			arrayenteros[elementos] = n;
			elementos = elementos +1;
			if (elementos < 5 ) {
			//leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		}
		}
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
		posicion = 0;
		media =0.0;
		
		while (posicion < elementos) {
			media = media + arrayenteros[posicion];
			posicion = posicion + 1;
		}
		
		media = media / elementos;
		System.out.println("La media es " + media);

	}

}
