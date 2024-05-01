// Desarrollar el código para leer desde teclado tres variables del tipo flotate,
// luego realizar el siguiente cálculo e imprimir el resultado por pantalla. 
// resultado = (primeraVariable * segundaVariable) / terceraVariable

package clase3.ej2;
import java.util.Scanner;

public class LeerVariableFloat {
		public static void main(String[] args) {
			
			//SE CREA UN OBJETO DE LA CLASE SCANNER LLAMADO TECLADO QUE SE UTILIZARÁ PARA LEER LA ENTRADA DEL USUARIO DESDE LA CONSOLA.
			Scanner teclado = new Scanner (System.in);
			//SE DECLARAN 4 VARIABLES DE TIPO FLOAT (DECIMALES), SE UTILIZARÁN PARA ALMACENAR VALORES INGRESADOS POR EL USUARIO Y EL RESULTADO DEL CÁLCULO.
			float primera, segunda, tercera, resultado;
			//SE SOLICITA AL USUARIO QUE INGRESE TRES VARIABLES. EL PROGRAMA IMPRIME MENSAJES EN LA CONSOLA PIDIENDO AL USUARIO QUE INGRESE VALORES, Y LUEGO UTILIZA EL MÉTODO NEXTFLOAT() DEL OBJETO TECLADO PARA LEER LOS VALORES INGRESADOS COMO NÚMEROS DECIMALES.
			System.out.println("Ingrese la primera variable");
			primera = teclado.nextFloat();
			System.out.println("Ingrese la segunda variable");
			segunda = teclado.nextFloat();
			System.out.println("Ingrese la tercera variable");
			tercera = teclado.nextFloat();
			//SE REALIZA EL CALCULO. 
			resultado = (primera*segunda)/tercera;
			//EL PROGRAMA IMPRIME MENSAJE INDICANDO QUE ESTÁ MOSTRANDO EL RESULTADO Y LUEGO IMPRIME EL VALOR CALCULADO.
			System.out.println("El resultado es: ");
			System.out.println(resultado);
			//SE CIERRA EL OBJETO SCANNER PARA LIBERAR LOS RECURSOS ASOCIADOS A LA ENTRADA ESTÁNDAR.
			teclado.close();
		} 
}