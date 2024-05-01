// Realizar un programa que permita leer de teclado y luego imprimir los contenidos de una variable tipo struct cuyos campos son: 
// nombre (cadena de caracteres [10]), legajo (entero), dependencia de trabajo (entero), horas trabajadas (real).

package ejercicio_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	    System.out.print("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese el numero de legajo: ");
        int legajo = teclado.nextInt();
        
        System.out.print("Ingrese la dependencia donde trabaja: ");
	    int dependenciaDeTrabajo = teclado.nextInt();
        
	    System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = teclado.nextDouble();
       
        Empleado empleado = new Empleado (nombre, legajo, dependenciaDeTrabajo, horasTrabajadas);
        
        System.out.println("\nLa informacion cargada es la siguientes: \n ");
        empleado.imprimirInformacion();
        
        teclado.close();
	    }
}
	