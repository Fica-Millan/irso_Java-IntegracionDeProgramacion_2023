package com.edu4java.tutorial10;
import java.util.Scanner;

public class Tutorial10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] array = new int [5];
					
		ingresaElContenidoDelArray (array, scanner);
		
		sumaElArray(array);
		
		int max = acumulaElMaximoDelArray(array);
		System.out.println("Maximo = " + max);
		
		double promedio = calculaElPromedioDelArray(array);	
		System.out.println("Promedio = " + promedio);
	}

	private static double calculaElPromedioDelArray(int [] parametroArray) {
		double promedio = 0;
		for (int i = 0; i < parametroArray.length; i++) {
			promedio = promedio + parametroArray[i];	
		}
		promedio = promedio / parametroArray.length;
		return promedio;		
	}
	
	private static int acumulaElMaximoDelArray(int [] array) {
		int max = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array [i];	
			}
		}	
		return max;		
	}
	
	private static void sumaElArray(int [] array) {
		System.out.print("Suma = ");
		int acumulador = 0;
		for (int i = 0; i < array.length; i++) {
			acumulador = acumulador + array [i];
			System.out.print("+" + array [i]);		
		}
		System.out.println(" = " + acumulador);
	}
	
	private static void ingresaElContenidoDelArray(int [] array, Scanner scanner) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingresar array[" + i + "]: ");
			array [i] = scanner.nextInt ();
		}		
	}
}