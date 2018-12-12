package evaluacion1;

public class mostrarreal3 {

	public static void main(String[] args) {
		/*
		 * coge el valor de una variable de tipo real con decimales (double) y lo muestra
			por pantalla.
		 */
		double n;
		n = Math.PI;
		String cadena ="Hola Mundo";
		System.out.println("El valor de la veriable es " + n + " y el valor de cadena es " + cadena);
		System.out.printf("El valor de la veriable es %.2f y el valor de cadena es %s ", n,cadena);
	}

}
