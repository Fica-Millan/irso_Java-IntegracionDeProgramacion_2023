/*Realizar un programa que permitía leer de teclado variable (Nombre, Apellido, Dni, Edad y Estado Civil), luego cargarlos dentro de tabla en la cual se puede almacenar más de una línea. Imprimir la información cargada e indicar los que son mayores o iguales a 18 años y los que son menores de edad. Aplicar POO en todo el desarrollo y aplicar encapsulamiento en el almacenamiento de las variables.*/

package programas;

import java.util.Scanner;

public class Ejercicio_08 {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private String estadoCivil;

	// Constructor para inicializar los datos de una persona
	public Ejercicio_08(String nombre, String apellido, String dni, int edad, String estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
	}

	// Método para mostrar la información de una persona
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("------------------------------");
	}

	// Método para determinar si una persona es mayor de edad
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Crear un array de personas para almacenar múltiples registros
		int cantidadRegistros = 2; 
		Ejercicio_08[] personas = new Ejercicio_08[cantidadRegistros];

		// Leer datos del teclado y cargarlos en el array de personas
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Ingrese los datos para la persona " + (i + 1) + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();

			System.out.print("Apellido: ");
			String apellido = scanner.nextLine();

			System.out.print("DNI: ");
			String dni = scanner.nextLine();

			System.out.print("Edad: ");
			int edad = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea después de nextInt()

			System.out.print("Estado Civil: ");
			String estadoCivil = scanner.nextLine();

			// Crear el objeto Persona y almacenarlo en el array
			personas[i] = new Ejercicio_08(nombre, apellido, dni, edad, estadoCivil);
		}

		// Mostrar la información de todas las personas
		System.out.println("\nInformación de todas las personas:");
		for (Ejercicio_08 persona : personas) {
			persona.mostrarInformacion();
		}

		// Mostrar las personas mayores de edad y las menores de edad
		System.out.println("Personas mayores de edad:");
		for (Ejercicio_08 persona : personas) {
			if (persona.esMayorDeEdad()) {
				persona.mostrarInformacion();
			}
		}

		System.out.println("Personas menores de edad:");
		for (Ejercicio_08 persona : personas) {
			if (!persona.esMayorDeEdad()) {
				persona.mostrarInformacion();
			}
		}

		// Cerrar el scanner al finalizar la entrada de datos
		scanner.close();
	}
}