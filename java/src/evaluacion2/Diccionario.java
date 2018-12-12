package evaluacion2;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena;
		int elementos, posicion;
		String diccionario[] = new String[10];
		
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		elementos=0;
		
		while (!cadena.isEmpty() && elementos < 10) {
			//añado la cadena al diccionario
			//de manera ordenada
		
		
		//buscar la posicion
		posicion = 0;
		
		while(posicion < elementos) {
			//compruebo si es la posicion
			if (cadena.compareTo(diccionario[posicion]) < 0) {
				break;
			}
			posicion = posicion + 1;
		}
		
		//desplazo los elementos
		for (int posmov = elementos; posmov > posicion; posmov--) {
			diccionario[posmov] = diccionario[posmov - 1];
		}
		
		//insertar la cadena en la posicion
		diccionario[posicion] = cadena;
		
		//incremento el numero de elementos
		elementos = elementos + 1;
		
		//leo otra cadena
		System.out.println("Introduce una cadena:");
		cadena = teclado.nextLine();
		
	}
		
		//libero la memoria 
		teclado.close();
		
		//muestro el contenido del diccionario
		for(posicion = 0; posicion < elementos; posicion++) {
			System.out.println(diccionario[posicion]);
		}
		
	}

}
