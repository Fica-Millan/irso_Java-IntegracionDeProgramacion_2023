//Realizar un programa que permita hacer nulos (cargarles valor 0) los elementos de un vector Q de enteros, 
//con n componentes (donde n es una constante que vale 10).O sea, al hacer un barrido de lectura por un vector 
//buscando el valor 10, el encontrarlo reemplazarlo por el valor0 (nulo).

package ejercicios;
import java.util.Scanner;

public class Ejercicio_1 {
	private Scanner teclado;
	private int [] Q;
	
	public void cargar() {
		teclado = new Scanner (System.in);
		Q = new int [10];
		for (int n=0; n<Q.length; n++) {
			System.out.print("Ingresar Q [" + n + "]: ");
			Q [n] = teclado.nextInt();
		}
	}
	
	public void imprimir () {
		for (int n=0; n<Q.length; n++) {
			if (Q [n] == 10) {
				Q [n] = 0;
			} else {
				Q [n] = Q [n];
			}
			System.out.println("Q [" + n + "]: " + Q[n]);
		}
	}
	
	public static void main(String[] args) {
		Ejercicio_1 Q1=new Ejercicio_1();
		Q1.cargar();
		Q1.imprimir();
	} 
}
