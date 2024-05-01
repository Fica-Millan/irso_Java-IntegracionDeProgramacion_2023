//Realizar un programa que permita obtener la suma de dos matrices X y J de dimensión axb (a=3 y b=4). 
//Los elementos de la matriz son reales. El resultado debe ser impreso. Realizar la suma componente a componente.

package ejercicios;
import java.util.Scanner;

public class Ejercicio_6 {
	private Scanner teclado;
    private int[][] matriz_X;
    private int[][] matriz_J;
    private int[][] matriz_suma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        matriz_X = new int[3][4];
        matriz_J = new int[3][4];
        System.out.println("Cargar la matriz X:");
        for(int f=0;f<matriz_X.length;f++) {
        	for(int c=0;c < matriz_X[f].length;c++) {
        		System.out.print("X [" +f+ "][" +c+"]: " );
        		matriz_X[f][c]=teclado.nextInt();
        	}
        }	
        System.out.println("Cargar la matriz J:");
        for(int f=0;f<matriz_J.length;f++) {
        	for(int c=0;c<matriz_J[f].length;c++) {
        		System.out.print("J [" +f+ "][" +c+"]: " );
        		matriz_J[f][c]=teclado.nextInt();
        	}	
        }        
    }    
    
    public void matriz_suma() {
    	matriz_suma=new int[3][4];
        for(int f=0;f<matriz_suma.length;f++) {
        	for(int c=0;c<matriz_suma[f].length;c++) {
        		matriz_suma[f][c] = matriz_X [f][c] + matriz_J [f][c];
        	}
        }	
        System.out.println("Matriz suma:");
        for(int f=0;f<matriz_suma.length;f++) {
        	for(int c=0;c<matriz_suma[f].length;c++) {
        		System.out.print(matriz_suma[f][c]+"  ");
        	}
        	System.out.println();
        }	
    }

	public static void main(String[] args) {
		Ejercicio_6 sm=new Ejercicio_6();
        sm.cargar();
        sm.matriz_suma();
	}
}
