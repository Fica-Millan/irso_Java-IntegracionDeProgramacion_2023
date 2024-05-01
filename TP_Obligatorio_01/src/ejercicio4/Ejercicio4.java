package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Funciones operacion = new Funciones ();
		
		System.out.println("Iniciando la calculadora...");
		System.out.println("Solo se podra realizar operaciones basicas entre 2 numeros enteros.\n\nDesea continuar? si/no");
		String continuar = teclado.nextLine();
						
		while (continuar.equals("si")) {
			System.out.println("\nElija el numero de la opcion a elegir: \n[1] Sumar \n[2] Restar \n[3] Multiplicar \n[4] Dividir");
			int eleccion = teclado.nextInt();	
			teclado.nextLine();
			
			switch (eleccion) {
			case 1: 
				operacion.ingresarNum();
				operacion.mensaje();
				System.out.println(+operacion.getNum_1()+ " + " +operacion.getNum_2()+ " = " +operacion.suma());
				break;
			case 2: 
				operacion.ingresarNum();
				operacion.mensaje();
				System.out.println(+operacion.getNum_1()+ " - " +operacion.getNum_2()+ " = " +operacion.resta());
				break;
			case 3: 
				operacion.ingresarNum();
				operacion.mensaje();
				System.out.println(+operacion.getNum_1()+ " x " +operacion.getNum_2()+ " = " +operacion.multiplicacion());
				break;
			case 4: 
				operacion.ingresarNum();
				if (operacion.getNum_2()==0) {
					System.out.println("Un numero dividido por cero es una indeterminacion matematica.\nNo se puede realizar la operacion.");
				} else {
					operacion.mensaje();
					System.out.println(+operacion.getNum_1()+ " % " +operacion.getNum_2()+ " = " +operacion.division());
				}
				break;
			default:
				System.out.println("\nError en la opcion elegida. \nSeleccionar 1, 2, 3 o 4 para poder realizar la operacion.");
				break;
			}
			System.out.println("\nDesea continuar? si/no");
			continuar = teclado.nextLine();
		}
		System.out.println("\nPrograma finalizado.");
		teclado.close();
	}
}
