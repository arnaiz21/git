package evaluacion2;

import java.util.Scanner;

public class NUMVECES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, posicion = 0;
		int[] arrayenteros = new int[10];
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		//antes de leer el valor muestro un mensaje informativo
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		
		while(n >= 0 && n <=9 ) {
			arrayenteros[n] = arrayenteros[n] + 1;
			
			if (n < 9) {
				System.out.println("Introduce numero: ");
				n = teclado.nextInt();
			}
		}
		
		while (posicion < 10) {
			System.out.println(posicion + ":" + arrayenteros[posicion] + " veces");
			posicion = posicion + 1;
		}
		
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
	}

}
