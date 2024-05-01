//Realizar un programa que permita obtener e imprimir el resultado de la suma de los elementos de un vector Z de longitud k, 
//donde los elementos del vector son reales (considerar k=5).

package ejercicios;
import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner (System.in)) {
			int z [] = new int [5];
			int resultado = 0, k;
			
			for (k=0; k<z.length; k++) {
				System.out.print("Ingresar Z [" + k + "]: ");
				z [k] = teclado.nextInt ();
				resultado += z [k];
			}
			System.out.println("El resultado es: " + resultado );
			teclado.close();
		}
	} 
}