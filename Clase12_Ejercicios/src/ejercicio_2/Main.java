//Desarrollar un programa que permita a través de la implementación del Polimorfismo leer de teclado 
//tres variables (ancho->entero, largo->entero y tipo->string). 
//Las cuales determinarán el tamaño de una plantación (ancho y largo), como así también el tipo de 
//cereal que se utilizará en tres opciones (trigo, sorgo y soja). 
//Por último, poder imprimir por pantalla un resumen de lo cargado.

package ejercicio_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el ancho de la plantacion: ");
		int ancho = teclado.nextInt();
		
		System.out.print("Ahora el largo: ");
        int largo = teclado.nextInt();

        teclado.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el tipo de cereal plantado (trigo/sorgo/soja): ");
        String tipo = teclado.nextLine();

        Plantacion plantacion = new Plantacion(ancho, largo, tipo); // se crea el objeto plantacion con los valores ingresados por teclado  

        System.out.println(); // Linea en blanco para separar la entrada de datos del resumen
        plantacion.imprimirResumen();

	    teclado.close();
    }
}