//les propongo que comiencen a desarrollar un programa que simplemente les permita almacenar 
//un valor entero (sólo un número del 0 al 9) el cual es introducido por teclado; 
//Y, como segundo paso, lograr poder leer ese mismo valor, para luego podre imprimirlo en pantalla.

package ejercicios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero del 0 al 9: ");
		int contenido = teclado.nextInt();
			
		FileWriter fw = new FileWriter ("Ejercicio_1.txt");
		
		BufferedWriter bw = new BufferedWriter (fw);
			
		bw.write(Integer.toString(contenido));
		bw.newLine();
			
		bw.close();
		teclado.close();
		System.out.println("Finalizado");
		}
}