package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasSinterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, valor;
		ArrayList<Integer> arrayListString = new ArrayList<Integer>(10);
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		//antes de leer el valor muestro un mensaje informativo
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); // asigno el valor leido por teclado a la variable n
		
		
		while(n >= 0 && n <=9 ) {
			//cojo el valor que hay en esa posicion en arraylist
			valor = arrayListString.get(n);
			//le sumo 1
			valor = valor + 1;
			//actualizo el valor que hay en esa posicion en arraylist
			arrayListString.set(n, valor);
			
			
		}
		
		
		
		teclado.close(); // libero la emoria asignada al objeto llamado teclado
		
		for (posicion < 10) {
			System.out.println(posicion + ":" + arrayenteros[posicion] + " veces");
			
		}
		
	}

}
