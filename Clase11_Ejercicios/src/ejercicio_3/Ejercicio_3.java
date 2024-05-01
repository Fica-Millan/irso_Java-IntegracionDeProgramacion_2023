//Declara una variable del tipo String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco
// “Fernando”, me aparezca “Bienvenido Fernando !”.
//Modifica, para que nos pida el nombre que queremos introducir.

package ejercicio_3;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Por favor ingrese su nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Bienvenid@ " + nombre + "!");
		teclado.close();
	}
}
