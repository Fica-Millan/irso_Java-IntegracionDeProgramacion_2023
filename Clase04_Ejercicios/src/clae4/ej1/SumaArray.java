// Realizar un programa que lea por teclado 20 valores. 
// Que sólo tome valores entre 2 y 97
// si es mayor o igual de 50 los vaya sumando,
// si es menor los vaya restando
// cargar resultado dentro de una variable llamada “resultado”.

package clae4.ej1;
import java.util.Scanner;

public class SumaArray {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner (System.in)) {
			//DECLARACION E INICIALIZACION DE VARIABLES
			int [] array = new int [20];
			int resultado = 0, i;
			
			//ENTRADA DE DATOS. SE UTILIZA UN BUCLE FOR PARA RECORRER EL ARRAY. EN CADA ITERACIÓN, SE SOLICITA AL USUARIO QUE INGRESE UN VALOR PARA EL ELEMENTO CORRESPONDIENTE DEL ARRAY.
			for (i = 0; i < array.length; i++) {
				System.out.print("Ingresar array [" + i + "]: ");
				array[i] = teclado.nextInt ();
				
				//OPERACIONES CONDICIONALES Y ACTUALIZACIÓN DE RESULTADO. SE EVALÚA CADA ELEMENTO DEL ARRAY CON RESPECTO A DOS CONDICIONES: SI EL ELEMENTO ESTÁ ENTRE 50 Y 97 (INCLUSIVE), SE SUMA AL `RESULTADO` Y SI EL ELEMENTO ESTÁ ENTRE 2 Y 49 (INCLUSIVE), SE RESTA AL `RESULTADO`.

				if (array[i] >= 50 && array [i] <= 97 ) {
					resultado += array[i];
				} else if (array[i] >= 2 && array[i]< 50 ) {
					resultado -= array[i]; 
				}	
			}
			
			//SE IMPRIME EN LA CONSOLA EL RESULTADO FINAL DE LAS OPERACIONES
			System.out.println("El resultado es: " + resultado );
			
			//SE CIERRA EL RECURSO `SCANNER` PARA LIBERAR LOS RECURSOS ASOCIADOS
			teclado.close();
		}
	} 
}
