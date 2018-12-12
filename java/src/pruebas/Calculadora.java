package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

	public static void main (String []args) {
		
		float op1 = 0, op2 = 0;
		double res = 0;
		String operacion="";
		
		Calculadora calc = new Calculadora();
			
		try{
			
			//primer operando
	        op1 = calc.pedirNum();
	        
	        //segundo operando
	        op2 = calc.pedirNum();
	        
	        //operacion
	        System.out.println("Inserta la operacion (+, -, /, *) por teclado");
	        operacion = bufferRead.readLine();

	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
		
		//hacemos la operacion correspondiente
		switch(operacion) {
		case "+":
			res = calc.suma (op1, op2);
			break;
		case "-":
			res = calc.resta(op1, op2);
			break;
		case "/":
			res = calc.division(op1, op2);
			break;
		case "*":
			res = calc.multiplicacion(op1, op2);
			break;
			default:
		}
		
		System.out.println("El resultado es: " + res);
		
		
	}
	
	public float pedirNum() {
		float num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num = teclado.nextFloat();
		return num;
	}

	public double suma (float num1, float num2) {
		return num1 + num2;
	}
	
	public double resta (float num1, float num2) {
		return num1 - num2;
	}
	
	public double division (float num1, float num2) {
		return num1 / num2;
	}
	
	public double multiplicacion (float num1, float num2) {
		return num1 * num2;
	}
	
}