//Realizar un programa que permita asignar la identidad a una matriz R de dimensiones mxm (considerar m=4). 
//Los índices y las componentes son enteros. La matriz identidad es la que tiene valor 1 en la diagonal principal y 0 en el resto.

package ejercicios;
import java.util.Scanner;

public class Ejercicio_5 {
	
	private Scanner teclado;
    private int[][] matriz_R;
    private int m=4;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        matriz_R = new int[m][m];
        System.out.println("Cargar la matriz R:");
        for(int f=0;f<m ;f++) {
        	for(int c=0; c<m ;c++) {
        		System.out.print("X [" +f+ "][" +c+"]: " );
        		matriz_R[f][c]=teclado.nextInt();
        	}
        }	       
    }    
     
    public void matriz_I() {
    	for(int f=0; f<m; f++) {
        	for(int c=0; c<m; c++) {
        		if(f==c){
        			matriz_R[f][c] = 1;
        		} else {
        			matriz_R[f][c] = 0;
        		}
        	}
        }	
        System.out.println("Matriz Identidad:");
        for(int f=0; f<m; f++) {
        	for(int c=0; c<m; c++) {
        		System.out.print(matriz_R[f][c]+"  ");
        	}
        	System.out.println();
        }     
   }

	public static void main(String[] args) {
		Ejercicio_5 mi=new Ejercicio_5();
        mi.cargar();
        mi.matriz_I();
	}
}