/* Dentro de una matriz en POO formada por 4 columnas (Código, Nombre, Costo, Venta), y por 30 posiciones, con información previamente cargada de una marca de productos. Se desea desarrollar un programa de búsqueda que pueda encontrar a través del código, ingresado por teclado, un producto y luego brinda como respuesta impresa en la pantalla su Código, Nombre, Costo y Precio. Luego de esto que continúe el ciclo hasta que se ingresa el valor “1111”.*/

package matrices;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// Crear una matriz para almacenar la información de los productos
		String[][] productos = new String[30][4];

		// Iniciar el ciclo de búsqueda
		buscarProducto(productos);
	}

	public static void buscarProducto(String[][] productos) {
		Scanner scanner = new Scanner(System.in);

		// Iniciar el ciclo de búsqueda hasta que se ingresa el valor "1111"
		while (true) {
			System.out.print("Ingrese el código del producto (o 1111 para salir): ");
			String codigoBuscado = scanner.nextLine();

			// Salir del bucle si se ingresa "1111"
			if (codigoBuscado.equals("1111")) {
				break;
			}

			// Buscar el producto en la matriz
			boolean productoEncontrado = false;
			for (int i = 0; i < productos.length; i++) {
				if (productos[i][0] != null && productos[i][0].equals(codigoBuscado)) {
					// Producto encontrado, imprimir la información
					productoEncontrado = true;
					System.out.println("Producto encontrado:");
					System.out.println("Código: " + productos[i][0]);
					System.out.println("Nombre: " + productos[i][1]);
					System.out.println("Costo: " + productos[i][2]);
					System.out.println("Venta: " + productos[i][3]);
					break; // No es necesario buscar más
				}
			}

			// Mensaje si el producto no se encuentra
			if (!productoEncontrado) {
				System.out.println("Producto no encontrado. Intente nuevamente.");
			}
		}

		// Cerrar el scanner al salir del programa
		scanner.close();
	}
}
