package pruebas;

import java.util.Scanner;

public class Calculadora2 {

	public static void main (String []args) {
		
		double op1 = 0, res = 0;
		
		
		
		Calculadora2 calc = new Calculadora2();
		
		res = calc.pedirnum(op1);
		
		System.out.println("El resultado es: " + res);
		
		
	}

	private double pedirnum(double num1) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inserta un numero: ");
		num1 = teclado.nextDouble();
		
		teclado.close();
		
		return num1;
	}

	
}