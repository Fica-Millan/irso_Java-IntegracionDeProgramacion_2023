//Realizar un programa que permita leer de teclado cinco valores reales entre 100 y -200; Luego realizar el siguiente cálculo 
//resultado = ((valor1 * valor2) – (valor3 * valor4)) / valor5; y por último imprimir en pantalla el resultado.

package ejercicio1;
import java.util.Scanner;

public class Ejercicio_01 {
	
	public static double numero (Scanner teclado) {
		double valor;
		do {
			valor = teclado.nextDouble();
			if (valor < -200 || valor >100) {
				System.out.print("Cargar otro numero, esta fuera del rango: ");
			}
		} while (valor < -200 || valor >100);
		return valor;
	}	

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Por favor ingrese 5 numeros reales entre -200 y 100 para poder iniciar con el calculo:");
		double valor1 = numero(teclado); 
		double valor2 = numero(teclado);
		double valor3 = numero(teclado);
		double valor4 = numero(teclado);
		double valor5 = numero(teclado);
		double resultado = ((valor1 * valor2) - (valor3 * valor4)) / valor5;
		System.out.println("\nSe hara el siguiente calculo: (( "+valor1+ " x "+valor2+" ) - ( "+valor3+" x "+valor4+" )) / "+valor5);
		System.out.println("El resultado es = " +resultado);
		teclado.close();
	}
}