//utilizar el mismo programa desarrollado y “ajustarlo” para que en éste caso permita realizar 
//las mismas dos operaciones pero con un carácter (sólo una letra de nuestro alfabeto).

package ejercicios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una letra del abecedario: ");
		String contenido = teclado.next();
			
		FileWriter fw = new FileWriter ("Ejercicio_2.txt");
		
		BufferedWriter bw = new BufferedWriter (fw);
			
		bw.write(contenido);
		bw.newLine();
			
		bw.close();
		teclado.close();
		System.out.println("Finalizado");
		}
}