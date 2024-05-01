// Lee un número por teclado e indica si es divisible entre 2 (con resto = 0). Si no lo es, también debemos indicarlo.

package ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Por favor ingrese un numero: ");
		int numero = teclado.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El numero es divisible por el numero 2.");
		} else {
			System.out.println("El numero no es divisible por el numero 2.");
		}
		teclado.close();		
	}
}
