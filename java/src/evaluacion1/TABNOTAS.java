package evaluacion1;

import java.util.Scanner;

public class TABNOTAS {

	public static void main(String[] args) {
		/*
		  Lee la nota de un alumno por teclado y muestra por pantalla la calificación 
		  que le corresponde sabiendo que si (TABNOTAS)
				NOTA		CALIFICACION 
					>=0 y <3	MD
					>=3 Y <5	INS
					>=5 Y <6	SUF
					>=6 Y <7	BIEN
					>=7 Y <9	NOT
					>=9 Y <10	SOBRE 
		 */

		double nota;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//leer nota
		System.out.println("Cantidad: ");
		nota = teclado.nextDouble(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		if(nota >= 0) {
			if(nota < 3) {
				System.out.println("MD");
			}
			else if(nota < 5) {
				System.out.println("INS");
			}
			else if(nota < 6) {
				System.out.println("SUF");
			}
			else if(nota < 7) {
				System.out.println("BIEN");
			}
			else if(nota < 9) {
				System.out.println("NOT");
			}
			else if(nota < 10) {
				System.out.println("SOBRE");
			}
		}
			
		
	}

}
