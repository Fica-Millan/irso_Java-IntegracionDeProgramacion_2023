/*Realizar un programa que permita leer de teclado 20 variables decimales que sean mayores e iguales a -100 y menores de -8, almacenarlas dentro de un Vector en POO, para luego obtener el valor máximo y mínimo de estos. El resultado deberá imprimirse por pantalla. Aplicar POO en el desarrollo del vector, y también Encapsulamiento en la carga de los valores al vector.*/

package programas;

import java.util.Scanner;

public class Ejercicio_07 {

	private double[] vector;
	private double valorMaximo;
	private double valorMinimo;

	// Constructor para inicializar el vector con un tamaño dado
	public Ejercicio_07(int tamano) {
		this.vector = new double[tamano];
		this.valorMaximo = Double.NEGATIVE_INFINITY;
		this.valorMinimo = -8.0; // Se establece el valor mínimo permitido directamente
	}

	// Método para cargar valores al vector con encapsulamiento
	public void cargarValores() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Ingrese un num entre -100 y -8 para la posición "+(i+1)+": ");
			double numero = scanner.nextDouble();

			// Validar que el número esté en el rango especificado
			while (numero < -100 || numero >= -8) {
				System.out.println("Error: Ingrese un numero entre -100 y -8.");
				System.out.print("Ingrese un numero para la posicion " + (i + 1) + ": ");
				numero = scanner.nextDouble();
			}

			vector[i] = numero;

			// Actualizar el valor máximo y el valor mínimo
			valorMaximo = Math.max(valorMaximo, numero);
			valorMinimo = Math.min(valorMinimo, numero);
		}

		// Cerrar el scanner al finalizar la entrada de datos
		scanner.close();
	}

	// Método para mostrar la información del vector y los cálculos
	public void mostrarInformacion() {
		System.out.println("Valores del vector:");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + "\t");
		}

		System.out.println("\nValor Maximo: " + valorMaximo);
		System.out.println("Valor Minimo: " + valorMinimo);
	}

	public static void main(String[] args) {
		// Crear un vector de 20 elementos y cargar valores
		Ejercicio_07 vectorOperaciones = new Ejercicio_07(20);
		vectorOperaciones.cargarValores();

		// Mostrar la información del vector y los cálculos
		vectorOperaciones.mostrarInformacion();
	}
}
