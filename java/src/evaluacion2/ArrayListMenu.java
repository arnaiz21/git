package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra;
		ArrayList<String> diccionario = new ArrayList<String>();
		int opcion;
		
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//escribo el menu
		System.out.println("1. Añadir Palabra");
		System.out.println("2. Buscar Palabra");
		System.out.println("3. Borrar Palabra");
		System.out.println("4. Listar diccionario");
		System.out.println("5. Salir");
		
		//pido la opcion
		System.out.println("Opcion");
		opcion = teclado.nextInt();
		
		while (opcion != 0) {
			//con cada opcion
			switch (opcion) {
			case 1:
			//pido una palabra
			System.out.println("Introduce una palabra");
			palabra = teclado.nextLine();
			//si todabia no existe
			if(diccionario.contains(palabra)) {
				//añado la palabra
				diccionario.add(palabra);
			}
			break;
			
			case 2:
				//pido una palabra
				palabra = teclado.nextLine();
				System.out.println("Introduce una palabra");
				//busca la palabra en el diccionario
				if(diccionario.contains(palabra)) {
					//si la encuentra la borra
					diccionario.remove(palabra);
					System.out.println("la palabra " + palabra + "ha sido borrada del diccionario");
				}
				else {
					//si no la encuentra muestra un mensaje de error
					System.out.println("Error. La palabra " + palabra + "no esta en el diccionario.");
				}
				break;
			
			case 4:
				//muestra los elementos por pantalla
				Collections.sort(diccionario);
				for(int posicion = 0; posicion < diccionario.size(); posicion++) {
					System.out.println(diccionario.get(posicion));
				break;
				}
			}
			
			//pido otra opcion
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
			
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
