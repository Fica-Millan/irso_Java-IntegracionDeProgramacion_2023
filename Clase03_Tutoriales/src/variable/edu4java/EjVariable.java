package variable.edu4java;

public class EjVariable {

	public static void main(String[] args) {
		
		//SE DECLARAN Y ASIGNAN VALORES A TRES VARIABLES DE TIPO STRING
		String s = "Hola Mundo ";
		String palabra2 = "Chau";
		//SE REALIZA LA CONCATENACIÓN DE LAS DOS CADENAS ANTERIORES Y SE ALMACENA EL RESULTADO EN UNA NUEVA VARIABLE:
		String resultado = s + palabra2 ; 
		//SE DECLARAN Y ASIGNAN VALORES A TRES VARIABLES DE TIPO INT
		int a = 1;
		int b = 2;
		int c = a + b;
		
		//SE IMPRIMEN POR CONSOLA LOS VALORES DE LAS VARIABLES Y ALGUNAS CADENAS DE TEXTO
		System.out.println(resultado);
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("Fin");
	}
}
