package com.edu4java.tutorial9;
import java.util.Scanner;

public class Tutorial9 {
	static Scanner scanner = new Scanner (System.in);
	static int [] array = new int [5];
	
	public static void main(String[] args) {
		ingresaElContenidoDelArray ();
		sumaElArray ();
		acumulaElMaximoDelArray();
		calculaElPromedioDelArray();	
	}

	private static void calculaElPromedioDelArray() {
		System.out.print ("Promedio: ");
		double promedio = 0;
		for (int i = 0; i < array.length; i++) {
			promedio = promedio + array[i];	
		}
		promedio = promedio / array.length;
		System.out.println (promedio);		
	}

	private static void acumulaElMaximoDelArray() {
		System.out.print ("Maximo: ");
		int max = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array [i];	
			}
		}	
		System.out.println (max);		
	}

	private static void sumaElArray() {
		System.out.print("Suma: ");
		int acumulador = 0;
		for (int i = 0; i < array.length; i++) {
			acumulador = acumulador + array [i];
			System.out.print("+" + array [i]);		
		}
		System.out.println(" = " + acumulador);
	}

	private static void ingresaElContenidoDelArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingresar array[" + i + "]: ");
			array [i] = scanner.nextInt ();
		}		
	}
}

// Codigo sin usar programas:

/*
public class Tutorial9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] array = new int [5];
		
		//Ingresa el contenido del array
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingresar array[" + i + "]: ");
			array [i] = scanner.nextInt ();
		}

		// Suma el array
		System.out.print("Suma: ");
		int acumulador = 0;
		for (int i = 0; i < array.length; i++) {
			acumulador = acumulador + array [i];
			System.out.print("+" + array [i]);		
		}
		System.out.println(" = " + acumulador);
		
		//Acumula el maximo del array
		System.out.print ("Maximo: ");
		int max = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array [i];	
			}
		}	
		System.out.println (max);
		
		//Calcula el promedio del array
		System.out.print ("Promedio: ");
		double promedio = 0;
		for (int i = 0; i < array.length; i++) {
			promedio = promedio + array[i];	
		}
		promedio = promedio / array.length;
		System.out.println (promedio);
		
	}
}*/

