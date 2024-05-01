package com.edu4java.tutorial6;
import java.util.Scanner;

public class Tutorial6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Menu de opciones");
		System.out.println("1. Sumar dos numeros (x+y)");
		System.out.println("2. Restar dos numeros (x-y)");
		System.out.println("3. Multiplicar dos numeros (x*y)");
		System.out.println("4. Dividir un numero por otro (x/y)");
		System.out.println();
		System.out.print("Ingresar opcion: ");
		int opcion = teclado.nextInt();
		
		System.out.print("Ingresar el primer numero: ");
		int x = teclado.nextInt();
		System.out.print("Ingresar el segundo numero: ");
		int y = teclado.nextInt();
		
		int resultado=0;
		
		/*if (opcion==1) {
			resultado = x + y;
		} else {
			if (opcion==2) {
				resultado = x - y;
			} else {
				if (opcion==3) {
					resultado = x * y;
				} else {
					resultado = x / y;
				}
			}
			
		}*/
		
		switch (opcion) {
		case 1:
			resultado = x + y;
			break;
		case 2:
			resultado = x - y;
			break;
		case 3:
			resultado = x * y;
			break;
		case 4:
			resultado = x / y;
			break;
		default:
			System.out.println("Error en opcion.");
			break;
		}		
		System.out.print("Mostrar el resultado: ");
		System.out.println(resultado);
		teclado.close();
	}
}
