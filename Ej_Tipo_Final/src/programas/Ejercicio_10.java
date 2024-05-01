package programas;

import java.util.Scanner;

public class Ejercicio_10 {

	private String marca;
	private String modelo;
	private String patente;
	private String color;
	private int anio;

	// Constructor para inicializar los datos de un vehículo
	public Ejercicio_10(String marca, String modelo, String patente, String color, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.anio = anio;
	}

	// Método para mostrar la información de un vehículo
	public void mostrarInformacion() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Patente: " + patente);
		System.out.println("Color: " + color);
		System.out.println("Anio: " + anio);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese los datos para un vehículo
		System.out.println("Ingrese los datos para el vehiculo:");
		System.out.print("Marca: ");
		String marca = scanner.nextLine();

		System.out.print("Modelo: ");
		String modelo = scanner.nextLine();

		System.out.print("Patente: ");
		String patente = scanner.nextLine();

		System.out.print("Color: ");
		String color = scanner.nextLine();

		System.out.print("Anio: ");
		int anio = scanner.nextInt();

		// Crear el objeto Vehiculo con los datos ingresados
		Ejercicio_10 vehiculo = new Ejercicio_10(marca, modelo, patente, color, anio);

		// Mostrar la información del vehículo
		System.out.println("\nInformacion del vehiculo ingresado:");
		vehiculo.mostrarInformacion();

		// Cerrar el scanner al finalizar la entrada de datos
		scanner.close();
	}
}
