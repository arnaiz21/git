package evaluacion2;

import java.util.Scanner;

public class ComplejoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo r1 = new Complejo();
			r1.escribir();
			
		Complejo r2 = new Complejo(3.0, 6.0);
		r1.escribir();
		
		Complejo r3 = new Complejo(3.0);
		r1.escribir();
		
		Complejo r4 = new Complejo(r2);
		r1.escribir();
	
	//Getters
		double r;
		r =r2.getReal(); //r = 2.0
		System.out.println("Real " + r);
		r4.setReal(4.0);
		
		
	//Setters
		double i;
		i = r2.getImaginario();
		System.out.println("Imaginario " + 1);
		r4.setImaginario(44.0);
		System.out.println(r4);
		
	//comprobacion facil
		if(r4.equals(r2)) {
			//si son iguales
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son diferentes");
		}

		//CompareTo
		if (r4.compareTo(r2) > 0) {
			System.out.println(r4 + " es Mayor que " + r2);
		}
		if (r4.compareTo(r2) < 0) {
			System.out.println(r4 + " es Menor que " + r2);
		}
		else {
			System.out.println(r4 + " es igual que " + r2);
		}
		
		//leer
		Scanner teclado = new Scanner(System.in);
		
		//leo c1
		System.out.println("Complejo: ");
		r1.leer(teclado);
		System.out.println("Complejo Leido: " + r1);
		
		//cierro teclado
		teclado.close();
		
	}
	
}
