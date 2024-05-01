package com.edu4java.tutorial7;
import java.util.Scanner;

public class Tutorial7 {
	public static void main(String[] args) {
/*		int contador = 2;
		while (contador <= 5) {
			System.out.println(contador);
			//contador = contador + 1 ;
			contador++;
		}
	}
}*/
		System.out.println("Programa para sumar varios numeros");
		Scanner teclado = new Scanner (System.in);
		int acumulador = 0;
		int nuevoNumero = 0 ;
		while (nuevoNumero >= 0 ) {
			System.out.print("Ingresar numero a sumar 0 -1 para terminar: ");
			nuevoNumero = teclado.nextInt();
			if (nuevoNumero > 0) {
				acumulador = acumulador + nuevoNumero;
			}	
		}	
		System.out.println("Total = " + acumulador);
		teclado.close();
	}
	
}