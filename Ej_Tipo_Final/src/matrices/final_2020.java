/*Dentro de una matriz en POO formada por 4 columnas (Código, Nombre, Costo, Venta), y por 30 posiciones, con información previamente cargada de una marca de productos. Se desea desarrollar un programa de búsqueda que pueda encontrar a través del código, ingresado por teclado, un producto y luego brinda como respuesta impresa en la pantalla su Código, Nombre, Costo y Precio. Luego de esto que continúe el ciclo hasta que se ingresa el valor “1111”.*/

package matrices;

import java.util.Scanner;

public class final_2020 {

	public static void main(String[] args) {

		// Definir la matriz para almacenar la información de productos
		String[][] productos = new String[30][4];

		// Llenar la matriz con datos de ejemplo
		cargarDatos(productos);

		// Crear un objeto Scanner para la entrada de teclado
		Scanner scanner = new Scanner(System.in);

		// Realizar la búsqueda hasta que se ingrese "1111"
		String codigoBuscado;
		do {
			System.out.print("Ingrese el codigo del producto (o 1111 para salir): ");
			codigoBuscado = scanner.nextLine();

			if (!codigoBuscado.equals("1111")) {
				// Realizar la búsqueda y mostrar la información del producto
				buscarProducto(productos, codigoBuscado);
			}

		} while (!codigoBuscado.equals("1111"));

		// Cerrar el Scanner
		scanner.close();
	}

	// Método para cargar datos en la matriz
	private static void cargarDatos(String[][] productos) {
		for (int i = 0; i < productos.length; i++) {
			productos[i][0] = "P" + (i + 1); // Código
			productos[i][1] = "Fideos Tallarines"; // Nombre
			productos[i][2] = String.valueOf(300); // Costo
			productos[i][3] = String.valueOf(500); // Venta
		}
	}

	// Método para buscar un producto por su código y mostrar la información
	private static void buscarProducto(String[][] productos, String codigoBuscado) {
		boolean encontrado = false;

		// Buscar el producto en la matriz
		for (int i = 0; i < productos.length; i++) {
			if (productos[i][0].equals(codigoBuscado)) {
				// Mostrar la información del producto
				System.out.println("Producto encontrado:");
				System.out.println("Código: " + productos[i][0]);
				System.out.println("Nombre: " + productos[i][1]);
				System.out.println("Costo: " + productos[i][2]);
				System.out.println("Venta: " + productos[i][3]);
				encontrado = true;
				break; // Terminar la búsqueda una vez encontrado el producto
			}
		}

		// Mostrar mensaje si el producto no fue encontrado
		if (!encontrado) {
			System.out.println("Producto no encontrado. Verifica el código ingresado.");
		}
	}
}