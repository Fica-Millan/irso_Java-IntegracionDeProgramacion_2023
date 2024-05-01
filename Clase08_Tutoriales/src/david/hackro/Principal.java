package david.hackro;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		Alumno a[] = new Alumno[2];
				
		String nombre="";
		int matricula=0;
		char grupo=' ';
		int grado=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Ingresa tu nombre");
			nombre = leer.nextLine(); 
			System.out.println("Ingresa tu matricula");
			matricula = leer.nextInt();
			System.out.println("Ingresa tu grupo");
			grupo = leer.next().charAt(0);
			System.out.println("Ingresa tu grado");
			grado = leer.nextInt();
			leer.nextLine();
			
			a[i]= new Alumno(nombre, matricula,grupo,grado);
		}

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getNombre()+" "+a[i].getMatricula()+" "+a[i].getGrupo()+" "+a[i].getGrado());
		}
		leer.close();
	}
}
