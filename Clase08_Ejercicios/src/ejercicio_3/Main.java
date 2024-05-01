//Realizar un programa que permita, dado un vector A de estructuras / registros, 
//cuyos campos son: producto (char), código (entero) y precio (real); 
//obtener un nuevo vector B de estructuras / registros que contengan sólo el código y el precio del vector A. 

package ejercicio_3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuantos articulos va a cargar?: ");
		int cant = teclado.nextInt();
		teclado.nextLine();
		Articulo [] art = new Articulo [cant];
		for (int f=0; f<art.length; f++) {
			System.out.println("Producto: ");
			String producto = teclado.nextLine();			
			System.out.println("Codigo: ");
			int codigo = teclado.nextInt();
			System.out.println("Precio: ");
			double precio = teclado.nextDouble();
			teclado.nextLine();
			art [f] =new Articulo (producto, codigo, precio);
		}
		System.out.println("\nLos articulos cargados son:");
		System.out.println("--------------------------");
		for (int f=0; f<art.length; f++) {
			art[f].imprimirVector_B();
		}
		teclado.close();
	}
}
