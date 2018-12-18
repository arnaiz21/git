package evaluacion2;

public class RacionalMain {

	public static void main(String[] args) {
		// clase para probar la clase Racional
		Racional r1 = new Racional(); //llamada al constructor racional por defecto
		System.out.println(r1);
		Racional r2 = new Racional(1,2); //llamada al constructor racional con dos valores enteros
		System.out.println(r2);
		Racional r3 = new Racional(3); //llamada al constructor racional con un valor entero
		System.out.println(r3);
		Racional r4 = new Racional(r2); //llamada al constructor racional copiado de otro constructor
		System.out.println(r4);
	}

}
