// Investigación (I): Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
// Por ejemplo: si introduzco un 97, me muestre una a.

package ejercicio_5;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un numero en el rango de 65 a 122 por favor: ");
		int numero = teclado.nextInt();
		System.out.println("Ese numero corresponde al caracter '" + (char) numero + "' de la tabla ASCII.");
		teclado.close();
	}
}