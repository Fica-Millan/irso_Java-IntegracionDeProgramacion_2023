// Desarrollar el código para poder leer dos String desde el teclado, concatenarlo (unirlos) y luego imprimirlo por pantalla

package clase3.ej3;
import java.util.Scanner;

public class DosString {
public static void main(String[] args) {
	
		//SE CREA UN OBJETO DE LA CLASE SCANNER LLAMADO TECLADO QUE SE UTILIZARÁ PARA LEER LA ENTRADA DEL USUARIO DESDE LA CONSOLA.
		Scanner teclado = new Scanner (System.in);
		//SE SOLICITA AL USUARIO QUE INGRESE SU NOMBRE Y APELLIDO. EL PROGRAMA IMPRIME MENSAJES EN LA CONSOLA PIDIENDO AL USUARIO QUE INGRESE SU NOMBRE Y APELLIDO, Y LUEGO UTILIZA EL MÉTODO NEXT() DEL OBJETO TECLADO PARA LEER LAS CADENAS DE TEXTO INGRESADAS.		
		System.out.println("Ingrese nombre:");
		String primero = teclado.next();
		System.out.println("Ingrese apellido:");
		String segundo = teclado.next();
		
		//SE CONCATENAN LAS DOS CADENAS (NOMBRE Y APELLIDO) UTILIZANDO EL OPERADOR +. EL PROGRAMA CREA UNA NUEVA CADENA LLAMADA UNION CONCATENANDO LAS CADENAS PRIMERO Y SEGUNDO.
		String union = primero + segundo;
		//SE IMPRIME LA CADENA RESULTANTE
		System.out.println(union);
		//SE CIERRA EL OBJETO SCANNER PARA LIBERAR LOS RECURSOS ASOCIADOS A LA ENTRADA ESTÁNDAR.
		teclado.close();
	}
}
