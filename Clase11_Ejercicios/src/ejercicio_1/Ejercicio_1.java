// Declara 2 variables numéricas (con el tipo valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. 
// Y al ir cargando nuevos valores desde teclado se comprobará que funciona correctamente.

package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int valor_1 = 43;
		int valor_2 = 14;
		System.out.println("Primer Valor = " + valor_1 + "      Segundo valor = " + valor_2);
		System.out.println("El primer valor es mayor al segundo valor");
				
		System.out.println("\nPodra cargar nuevos valores para ser comparados.");
		System.out.println("\nPresione 1 si desea continuar?");
		int respuesta = teclado.nextInt();
		
		while (respuesta == 1){
			System.out.println("\nIngrese el primer valor:");
			valor_1 = teclado.nextInt();
		
			System.out.println("Ingrese el segundo valor:");
			valor_2 = teclado.nextInt();
		
			if (valor_1 > valor_2) {
				System.out.println("El primer valor es mayor al segundo valor");
			} else if (valor_2 > valor_1) {
				System.out.println("El segundo valor es mayor al primer valor");
			} else {
				System.out.println("Los valores son iguales");
			}
			
			System.out.println("\nSi desea continuar, vuelva a presionar 1, sino presione cualquier tecla:");
			respuesta = teclado.nextInt();
			
			if ( respuesta != 1) {
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("\nEl programa ha finalizado, muchas gracias.");
			}
		}	
		teclado.close();		
	}
}
