//Realizar un programa que permita imprimir las componentes de un vector A de longitud g cuyos elementos son caracteres. 
//La impresión deberá indicar el índice del vector y el valor de la componente. Los índices son enteros y g=8.

package ejercicios;
import java.util.Scanner;

public class Ejercicio_3 {
	private Scanner teclado;
	private char [] a;

	public void cargar() {
		teclado = new Scanner (System.in);
		a = new char [8];
		for (int g=0; g<a.length; g++) {
			System.out.print("Ingresar A [" + g + "]: ");
			a [g] = teclado.next().charAt(0);
		}
	}
	
	public void imprimir () {
		for (int g=0; g<a.length; g++) {
			System.out.println("A [" + g + "]: " + a[g]);
		}
	}
	
	public static void main(String[] args) {
		Ejercicio_3 a1=new Ejercicio_3();
		a1.cargar();
		a1.imprimir();
	} 
}