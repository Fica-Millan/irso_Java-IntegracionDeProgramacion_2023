//Realizar un programa que permita obtener el producto de dos vectores A y B componente a componente, guardando el resultado en uno nuevo

package ejercicios;
import java.util.Scanner;

public class Ejercicio_4 {
	private Scanner teclado;
    private int[] vector_A;
    private int[] vector_B;
    private int[] vector_producto;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vector_A=new int[4];
        vector_B=new int[4];
        System.out.println("Cargar vector A:");
        for(int f=0;f<vector_A.length;f++) {
            System.out.print("Ingrese A [" +f+ "]: " );
            vector_A[f]=teclado.nextInt();
        }
        System.out.println("Cargar vector B:");
        for(int f=0;f<vector_B.length;f++) {
            System.out.print("Ingrese B ["+f+"]: ");
            vector_B[f]=teclado.nextInt();
        }        
    }    
    
    public void productoVectores() {
    	vector_producto=new int[4];
        for(int f=0;f<vector_producto.length;f++) {
            vector_producto[f]=vector_A[f]*vector_B[f];
        }
        System.out.println("Vector resultante C:");
        for(int f=0;f<vector_producto.length;f++) {
            System.out.println("C ["+f+ "]: " +vector_producto[f]);
        }
    }

	public static void main(String[] args) {
		Ejercicio_4 pv=new Ejercicio_4();
        pv.cargar();
        pv.productoVectores();
	}
}
