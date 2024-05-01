package tutorial4.edu4java.com;
import java.util.Scanner;

public class Tutorial4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("escanear:");
		String entrada = teclado.next();
		System.out.println("mostrar lo escaneado");
		System.out.println(entrada);
		teclado.close();
	}
}