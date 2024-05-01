//Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.

package ejercicio_7;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		System.out.println("Por favor ingrese un dia de la semana, en letras minusculas:");
		String dia = teclado.next();
				
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			String tipo = "Es un dia laboral";
			System.out.println(tipo);
			break;
		case "sabado":
		case "domingo":
			tipo = "No es un dia laboral";
			System.out.println(tipo);
			break;
		default:
			tipo = "Por favor vuelva a escribirlo, tenga presente que debe ser en letras minusculas:";
			System.out.println(tipo);
			break;
		}
		teclado.close();	
	}
}
