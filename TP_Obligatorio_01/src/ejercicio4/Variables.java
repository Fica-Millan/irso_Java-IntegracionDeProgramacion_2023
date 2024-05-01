package ejercicio4;
import java.util.Scanner;

public class Variables {
	
	private int num_1;
	private int num_2;
	
	public Variables() {
			
	}
		
	public Variables (int num_1, int num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}
	
	public int getNum_1() {
		return num_1;
	}

	public void setNum_1(int num_1) {
		this.num_1 = num_1;
	}

	public int getNum_2() {
		return num_2;
	}

	public void setNum_2(int num_2) {
		this.num_2 = num_2;
	}
			
	public void ingresarNum () {
		Scanner teclado = new Scanner (System.in);
		
		try {
			System.out.print("\nIngrese el primer numero: ");
			num_1 = teclado.nextInt();
		
			System.out.print("Ingrese el segundo numero: ");
			num_2 = teclado.nextInt();
		} finally {
			teclado.close();
		}
	}	
}