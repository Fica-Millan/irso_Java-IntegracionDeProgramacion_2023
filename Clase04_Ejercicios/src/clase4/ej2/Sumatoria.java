// Realiza un programa que lea de teclado valores entre 32 y 120. Sumarlos uno a uno dentro de la variable “sumatoria”. En el caso que sea fuera de ese rango que no realice ninguna operación.  Si se ingresa el valor cero “0”, debe finalizar el programa.

package clase4.ej2;
import java.util.Scanner;

public class Sumatoria {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int sumatoria = 0, x = 1;
		while (x != 0) {
			System.out.println();
			System.out.print("Ingrese un numero entre 32 y 120, pulse 0 (cero) para finalizar: ");
			x=teclado.nextInt();
			if (x > 31 && x < 121) {
				sumatoria = sumatoria + x;	
				System.out.println ("La sumatoria de los numeros ingresados, dentro del rango requerido, ahora es: " + sumatoria);
			} 
		}
		teclado.close();
	}
}