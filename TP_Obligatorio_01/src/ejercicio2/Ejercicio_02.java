// Realizar un programa que permita leer de teclado valores reales entre 1 y 9 para cargarlos dentro de una matriz de 6x6, 
// continuar sacando el promedio de todos los valores; y para finalizar imprimir el resultado. 
// Aplicar POO en el desarrollo de la matriz.

package ejercicio2;
import java.util.Scanner;

public class Ejercicio_02 {
	static Scanner teclado;
	static double [] [] matriz_A; 
	static int x = 2;
	
	public static void carga() {
		teclado = new Scanner (System.in);
		matriz_A = new double [x][x];
		System.out.println("Carga valores reales entre 1 y 9 a la matriz A: ");
		for (int f=0; f<x; f++) {
			for (int c=0; c<x; c++) {
				System.out.print("A ["+f+"]["+c+"]: ");
				double valor = teclado.nextDouble();	
				while (valor < 1 || valor >9) { 
				System.out.print("\nValor fuera del rango. \nPor favor vuelva a cargarlo: ");
				valor = teclado.nextDouble();
				}
			matriz_A [f][c]=valor;		
			}
		}
		teclado.close();
	}

	public static double promedio() {
		double suma=0;
		int cantidad = x*x;
		for (int f=0; f<x; f++) {
			for (int c=0; c<x; c++) {
				suma= suma + matriz_A[f][c];
			}
		}
		double promedio = suma/cantidad;
		return promedio;
	}
	
	public static void main(String[] args) {
		carga();
		System.out.println("\nEl promedio de los elementos de la Matriz A es = " +promedio());
	}
}
