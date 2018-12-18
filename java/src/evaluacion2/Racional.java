package evaluacion2;

public class Racional {
	//defino la clase Racional con sus propiedades
	private int numerador;
	private int denominador;
	
	//Metodos
	// creacion de un constructor publico por defecto
	Racional(){
		this.numerador=0;
		this.denominador=1;
	}
	
	//creacion de un constructor publico con dos valores enteros
	public Racional(int n, int d ) {
		this.numerador=n;
		this.denominador=d;
	}
	
	//creacion de un constructor publico con un valor entero
	public Racional(int n) {
		this.numerador=n;
		this.denominador=1;
	}
	
	//creacion de un constructor publico copiado de otro constructor
	public Racional(Racional r2) {
		this.numerador= r2.numerador;
		this.denominador= r2.denominador;
	}

	
//toString
	@Override
	public String toString() {
		//return "Racional [numerador=" + numerador + ", denominador=" + denominador + "]";
		return (this.numerador + "/" + this.denominador);
	}
	
}
