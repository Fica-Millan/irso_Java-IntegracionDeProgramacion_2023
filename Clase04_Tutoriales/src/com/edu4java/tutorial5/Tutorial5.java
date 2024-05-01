package com.edu4java.tutorial5;
import java.util.Scanner;

public class Tutorial5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("escanear edad:");
		int edad = teclado.nextInt();
		// boolean puedeBeber = edad >= 18 && edad < 60;
		boolean noPuedeBeber = edad < 18 || edad > 60;
		if (noPuedeBeber) {
			System.out.println("No puede beber");
		} else {
			System.out.println("Puede beber");
		}
		System.out.print("mostrar la edad:");
		System.out.println(edad);
		teclado.close();
	}
}