package com.edu4java.tutorial8;

public class Tutorial8 {
	public static void main(String[] args) {
/*		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i++;
		}
		
		// Otra opciono para resolver lo mismo:
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println(i);
		}*/
		
		// Opcion con array:
		
		int[] array = {2,3,5,7,1};
		for (int i = 0; i < array.length; i++) {
			//System.out.println (array[i]);
			System.out.print(array[i] + ",");
		}
		System.out.println("Incrementamos en uno.");
		for (int i = 0; i < array.length; i++) {
			array [i]++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}