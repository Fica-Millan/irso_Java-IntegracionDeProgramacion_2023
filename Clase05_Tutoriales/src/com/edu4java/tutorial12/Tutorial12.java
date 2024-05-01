package com.edu4java.tutorial12;

import com.edu4java.tutorial11.Perro;

public class Tutorial12 {

	public static void main(String[] args) {
		Perro perro1 = new Perro(); 
		perro1.setNombre ("Coco");
		perro1.setColor ("marron");
		perro1.setPeso (1.5);
		//perro1.imprimirPorConsola();
			
		Perro perro2 = new Perro(); 
		perro2.setNombre ("Sultan");
		perro2.setColor ("nergo");
		perro2.setPeso (75);
		//perro2.imprimirPorConsola();
    
		imprimirPorConsola(perro1);
		imprimirPorConsola(perro2);
	}
	
	private static void imprimirPorConsola(Perro perro) {
		System.out.println();
		System.out.println("nombre = " + perro.getNombre());
		System.out.println("color = " + perro.getColor());
		System.out.println("peso = " + perro.getPeso());
	}	
}