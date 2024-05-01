/*3)	Matriz de 2 x 20 en POO que cargue valores y calcule promedio de las variables mayores a 20 y menores a 57.*/

package matrices;

import java.util.Random;

public class Ejercicio_03 {

	private int[][] matriz;

	// Constructor para inicializar la matriz con dimensiones dadas
	public Ejercicio_03(int filas, int columnas) {
		        this.matriz = new int[filas][columnas];
		    }

	// Método para cargar valores aleatorios en la matriz
	public void cargarValoresAleatorios() {
		Random random = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100); // Números aleatorios hasta 99
			}
		}
	}

	// Método para calcular el promedio de valores mayores a 20 y menores a 57
	public double calcularPromedio() {
		int suma = 0;
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valor = matriz[i][j];

				if (valor > 20 && valor < 57) {
					suma += valor;
					contador++;
				}
			}
		}

		// Evitar dividir por cero
		if (contador > 0) {
			return (double) suma / contador;
		} else {
			return 0.0;
		}
	}

	// Método para mostrar la matriz en la consola
	public void mostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Crear una matriz 2x20 y cargar valores aleatorios
		Ejercicio_03 matrizOperaciones = new Ejercicio_03 (2, 20);
		matrizOperaciones.cargarValoresAleatorios();

		// Mostrar la matriz original
		System.out.println("Matriz original:");
		matrizOperaciones.mostrarMatriz();

		// Calcular y mostrar el promedio de valores mayores a 20 y menores a 57
		double promedio = matrizOperaciones.calcularPromedio();
		System.out.println("\nPromedio de valores entre 20 y 57: " + promedio);
	}
}
