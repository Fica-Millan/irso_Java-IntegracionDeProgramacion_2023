//Realizar un programa que permita, dado un vector A de estructuras / registros, 
//cuyos campos son: producto (cadena de caracteres [10]), código (entero) y precio (real); 
//obtener un nuevo vector B de estructuras / registros que contengan sólo el código y el precio del vector A. 

package ejercicio_3;

public class Articulo {
	public String producto;
	public int codigo;
	public double precio;

	public Articulo (String producto, int codigo, double precio) {
		this.producto = producto;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public void imprimirVector_B () {
		System.out.println("Codigo: " + codigo);
		System.out.println("Precio: " + precio + "\n");
	}
}
