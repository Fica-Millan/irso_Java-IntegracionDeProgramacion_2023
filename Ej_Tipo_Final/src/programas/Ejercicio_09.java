/*Realizar un programa que permita ingresar por teclado información de vehículos en una agencia de automóviles y almacenarla (Marca, Modelo, Patente y Fecha de Ingreso). Luego imprimir lo registrado en pantalla. Aplicar el concepto de encapsulamiento para el almacenamiento.*/

package programas;

import java.util.Scanner;

public class Ejercicio_09 {

	private String marca;
	private String modelo;
	private String patente;
	private String fechaIngreso;

	// Constructor para inicializar los datos de un vehículo
	public Ejercicio_09(String marca, String modelo, String patente, String fechaIngreso) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.fechaIngreso = fechaIngreso;
	}

	// Método para mostrar la información de un vehículo
	public void mostrarInformacion() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Patente: " + patente);
		System.out.println("Fecha de Ingreso: " + fechaIngreso);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Crear un array de vehículos para almacenar múltiples registros
		int cantidadVehiculos = 2; // Puedes cambiar esto según la cantidad que desees
		Ejercicio_09[] vehiculos = new Ejercicio_09[cantidadVehiculos];

		// Leer datos del teclado y cargarlos en el array de vehículos
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println("Ingrese los datos para el vehiculo " + (i + 1) + ":");
			System.out.print("Marca: ");
			String marca = scanner.nextLine();

			System.out.print("Modelo: ");
			String modelo = scanner.nextLine();

			System.out.print("Patente: ");
			String patente = scanner.nextLine();

			System.out.print("Fecha de Ingreso: ");
			String fechaIngreso = scanner.nextLine();

			// Crear el objeto Vehiculo y almacenarlo en el array
			vehiculos[i] = new Ejercicio_09(marca, modelo, patente, fechaIngreso);
		}

		// Mostrar la información de todos los vehículos
		System.out.println("\nInformacion de todos los vehiculos:");
		for (Ejercicio_09 vehiculo : vehiculos) {
			vehiculo.mostrarInformacion();
		}

		// Cerrar el scanner al finalizar la entrada de datos
		scanner.close();
	}
}
