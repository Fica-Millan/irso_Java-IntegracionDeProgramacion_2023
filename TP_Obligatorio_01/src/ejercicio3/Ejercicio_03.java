// Realizar un programa que permita leer de teclado diez valores enteros positivos; Y que permita, 
// cada vez que se ingrese uno de los mismos, imprimir en pantalla si es par, si es impar e identificar el cero.

package ejercicio3;
import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int cantidad=1;
		System.out.println("Se le va a solicitar que cargue 10 numeros, en cada caso se le informara \nsi se trata de un numero par, impar o nulo.");
		while (cantidad<11) {
			System.out.print("\nPor favor ingrese el valor #"+cantidad+ ": ");
			int valor = teclado.nextInt();
			if (valor == 0) {
				System.out.println("El numero ingresado es nulo");
			} else if (valor % 2 == 0) {
				System.out.println("El numero ingresado es par");
			} else {
				System.out.println("El numero ingresado es impar");
			}
			cantidad++;
		}
		System.out.println("\nHemos finalizado, muchas gracias.");
		teclado.close();	
	}
}
