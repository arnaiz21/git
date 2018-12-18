package evaluacion2;

import java.util.Scanner;

public class Complejo implements Comparable<Complejo>{
		private double real;
		private double imaginario;
		
		Complejo(){
			this.real = 1.0;
			this.imaginario = 2.0;
		}
		
		public Complejo(double r, double i) {
			this.real = r;
			this.imaginario = i;
		}
		
		public Complejo(double r) {
			this.real = r;
			this.imaginario = 2.0;
		}
		
		public Complejo(Complejo r2) {
			this.real = r2.real;
			this.imaginario = r2.imaginario;
		}
		

		@Override
		public String toString() {
			return (real + " + " + imaginario + "i");
		}
		
		void escribir() {
			System.out.println(real + "+" + imaginario + "i");
		}
		
		
		//getters y setters
		public double getReal() {
			return real;
		}
		
		public void setReal (double real) {
			this.real = real;
		}
		
		public double getImaginario() {
			return imaginario;
		}
		
		public void setImaginario (double imaginario) {
			this.imaginario = imaginario;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(imaginario);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(real);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				//si es el mismo objeto
				return true;
			if (obj == null)
				//si el objeto que recibo no existe
				return false;
			if (getClass() != obj.getClass())
				//si los objetos NO son de la misma clase
				return false;
			//comparo las propiedades de los objetos
			//convierto el objeto a la clase a comparar
			Complejo other = (Complejo) obj;
			if (this.real == other.real && this.imaginario == other.imaginario) {
				//si los valores de las propiedades son iguales
				return false;
			}
				return false;
		}

		@Override
		public int compareTo(Complejo other) {
			if(this.real >  other.real)
			return 1;
		}
		else if(this.real < other.real) {
			return -1;
		}
		else {		
		//si la parte real es igual
		if(this.imaginario > other.imaginario) {
			return 1;
		}
		else {		
			//si la parte real es igual
			if(this.imaginario < other.imaginario) {
				
			}
			}
		
		return 0;	
	}
		public void leer(Scanner teclado) {
			// TODO Auto-generated method stub
			
		}
}
}
