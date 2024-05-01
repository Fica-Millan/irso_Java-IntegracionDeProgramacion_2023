package ejercicio4;

public class Funciones extends Variables {

	public Funciones () {
		
	}
	
	public Funciones (int num_1, int num_2) {
		super(num_1, num_2);
	}

	public int suma () {
		int suma = this.getNum_1() + this.getNum_2();
		return suma;
	}
		
	public int resta () {
		int resta = this.getNum_1() - this.getNum_2();
		return resta;
	}
	
	public int multiplicacion () {
		int multi = this.getNum_1() * this.getNum_2();
		return multi;
	}
	
	public double division () {
		double divi = (double) this.getNum_1() / (double) this.getNum_2();
		return divi;
	}
	
	public void mensaje () {
		System.out.print("Se va a realizar la siguiente operacion:  ");
	}
}