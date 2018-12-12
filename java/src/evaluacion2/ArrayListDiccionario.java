package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra;
		ArrayList<String> diccionario = new ArrayList<String>();
		
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce palabra: ");
		palabra = teclado.nextLine();
		
		
		while (!palabra.isEmpty()) {
			//añadir la cadena al arraylist
			diccionario.add(palabra);
			
			//leer cadena
			System.out.println("Introduce palabra: ");
			palabra = teclado.nextLine();
			
	}
		
		//libero la memoria asignada
		teclado.close();
		
		//ordeno la arraylist en orden descendente
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(diccionario, comparador);
		
		//muestro el contenido del arraylist
		for(int posicion = 0; posicion < diccionario.size(); posicion++) {
			System.out.println(diccionario.get(posicion));
		}
		
	}
	
}
