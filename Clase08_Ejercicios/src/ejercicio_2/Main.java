// Realizar un programa que permita, dado un vector de estructuras / registros cuyos campos son: empresa (cadena de caracteres [30]), 
// domicilio (cadena de caracteres [40]), código postal (cadena de caracteres [10]), localidad (cadena de caracteres [20]), país (cadena de caracteres [15]), 
// imprimir un listado para generar el destinatario de unas cartas. El formato debe ser el correcto.

package ejercicio_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuantos destinatarios va a cargar?: ");
		int cantidad = teclado.nextInt();
		teclado.nextLine();
		Destinatario [] destino = new Destinatario [cantidad];	
		
		for (int f=0; f<destino.length; f++) {
			System.out.println("A quien va dirigido: ");
			String empresa = teclado.nextLine();
			
			System.out.println("Domicilio: ");
			String domicilio = teclado.nextLine();
			
			System.out.println("Codigo Postal: ");
			String codigoPostal = teclado.nextLine();
			
			System.out.println("Localidad: ");
			String localidad = teclado.nextLine();
			
			System.out.println("Pais: ");
			String pais = teclado.nextLine();
			
			destino [f] =new Destinatario (empresa, domicilio, codigoPostal, localidad, pais);
		}	
		
		System.out.println("\nLa informacion del destinatario es la siguiente:");
		System.out.println("--------------------------------------------------");
		for (int f=0; f<destino.length; f++) { 
			destino[f].imprimirDestino();
	    }
		teclado.close();
	}	
}