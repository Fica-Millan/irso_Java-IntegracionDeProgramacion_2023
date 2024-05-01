//Sobre el programa anterior mantén el número de elementos de numeroDeCoches en 24. 
//Declara dos variables a y b de tipo int(entero). Establece a=8, b=4 y r=a/b. Ejecuta el programa.

package ejercicio_2;

public class Programa_2 {
	public static void main(String[] args) {
		int [] numeroDeCoches = new int [24];
		int a = 8;
		int b = 4;
		int r = a/b;
		numeroDeCoches [r] = 23;
		System.out.println("El numero de coches en la hora "+r+" fue "+numeroDeCoches[r]);
		}
}