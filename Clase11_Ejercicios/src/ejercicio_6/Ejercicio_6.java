//Investigación (II): Modifica el ejercicio anterior, para qué en lugar de pedir un número, pida un carácter (char) 
// y muestre su código en la tabla ASCII.

package ejercicio_6;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un caracter de la A a la Z (puede usar tanto mayusculas como minusculas): ");
		char caracter = teclado.next().charAt(0);
		System.out.println("Ese numero corresponde al caracter '" + (int) caracter + "' de la tabla ASCII.");
		teclado.close();	
	}
}