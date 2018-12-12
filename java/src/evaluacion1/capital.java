package evaluacion1;

import java.util.Scanner;

public class capital {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra el valor de la circunferencia de ese
		radio por pantalla con dos decimales
		 */
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes;
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//lee cantidad
		System.out.println("Introduce una cantidad: ");
		cantidad = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n

		//lee tipointeres
		System.out.println("Introduce un tipo de interes (3,5%): ");
		tipointeres = teclado.nextDouble();
		
		//lee tiempo
		System.out.println("Introduce el tiempo: ");
		tiempo = teclado.nextInt();
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
		//Calcula el interes
		interes = (cantidad * tipointeres * tiempo)/(360*100);
		System.out.println("El interes es " + interes);
		
		
		
	}

}
