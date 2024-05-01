//Declara un array tipo int denominado numeroDeCoches que contenga 24 variables. 
//Declara una variable tipo int que se llame r. Establece el valor de r=2 y 
//el valor de numeroDeCoches para un localizador de valor r=23. 
//Mostrar en pantalla un mensaje que indique cuál es la hora r y el número de coches para la hora r. 
//Modifica únicamente la asignación de valor a r que en vez de 2 sea 21 y ejecuta de nuevo el programa.

package ejercicio_1;

public class Programa_1 {

	public static void main(String[] args) {
		int [] numeroDeCoches = new int [24];
		int r = 21;
		numeroDeCoches [r] = 23;
		System.out.println("El numero de coches en la hora "+r+" fue "+numeroDeCoches[r]);
	}
}