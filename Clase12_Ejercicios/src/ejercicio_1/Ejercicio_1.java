// Desarrollar un programa que permita almacenar 10 textos (strings) de a lo sumo 15 caracteres. 
// Los mismos poder almacenarlos dentro de una matriz, pero es determinante que la misma esté encapsulada

package ejercicio_1;

public class Ejercicio_1 {

	public static void main(String[] args) { // desde el main se llama a la clase Matriz
		Matriz textos = new Matriz();

		textos.cargarMatriz(0, 0, "123 Probando");
		textos.cargarMatriz(1, 2, "Otra prueba");
		textos.cargarMatriz(5, 6, "Este texto es mayor a 15 caracteres");

		System.out.println("Los textos cargados son los siguientes:");
		System.out.println(textos.obtenerTexto(0, 0)); 
		System.out.println(textos.obtenerTexto(1, 2)); 
		System.out.println(textos.obtenerTexto(5, 6));
	}
}