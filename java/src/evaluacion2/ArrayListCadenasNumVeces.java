package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasNumVeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena;
		ArrayList<String> arrayListString = new ArrayList<String>();
		
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce palabra: ");
		cadena = teclado.nextLine();
		
		
		while (!cadena.isEmpty()) {
			//a�adir la cadena al arraylist
			arrayListString.add(cadena);
			
			//leer cadena
			System.out.println("Introduce palabra: ");
			cadena = teclado.nextLine();
			
	}
		
		//libero la memoria 
		teclado.close();
		
		//muestro el contenido del diccionario
		for(int posicion = 0; posicion < arrayListString.size(); posicion++) {
			System.out.println(arrayListString.get(posicion));
		}
		
	}

}
