//Dado un vector B de estructuras / registros de alumnos cuyos campos son: nombre (char) y nota (entero); 
//realizar mediante un programa la impresión de los nombres de los alumnos cuyas notas superen el valor 7. 


package ejercicio_4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuantos alumnos se cargaran?: ");
		int cant = teclado.nextInt();
		teclado.nextLine();
		Alumno [] alumno = new Alumno [cant];
		for (int f=0; f<alumno.length; f++) {
			System.out.println("Nombre y Apellido del alumno: ");
			String nombre = teclado.nextLine();
			System.out.println("Nota obtenida: ");
			int nota = teclado.nextInt();
			alumno[f] = new Alumno (nombre, nota);	
			teclado.nextLine();
		}
		teclado.close();
		for (int f=0; f<alumno.length; f++) {
			if (alumno [f].nota > 7) {
				alumno[f].imprimirAlumno();
			}
		}
	}
}
