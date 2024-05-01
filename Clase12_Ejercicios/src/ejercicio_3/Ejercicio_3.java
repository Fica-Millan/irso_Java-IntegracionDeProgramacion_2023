// Desarrollar un programa que permita, a través del ingreso de valores por teclado, 
// calcular Seno, Coseno y Tangente.

package ejercicio_3;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = teclado.nextDouble();

        double radianes = Math.toRadians(numero);
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);

        System.out.println("\nDe acuerdo al numero ingresado los valores calculados son los siguintes:\n");
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Tangente: " + tangente);

        teclado.close();
    }
}
