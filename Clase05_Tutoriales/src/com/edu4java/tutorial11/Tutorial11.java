package com.edu4java.tutorial11;

// Clase: molde para crear objetos o instancias
// Objeto: es la instancia de una clase

public class Tutorial11 {

	public static void main(String[] args) {
		
		/* variables locales
		String nombre = "Coco";
		String color = "marron";
		double peso = 1.5;*/
		
		Perro perro1 = new Perro(); // perro1 es un objeto de la clase Perro
		perro1.nombre = "Coco";
		perro1.color = "marron";
		perro1.peso = 1.5;
		perro1.imprimirPorConsola();
		
		Perro perro2 = new Perro(); // perro2 es un objeto de la clase Perro
		perro2.nombre = "Sultan";
		perro2.color = "nergo";
		perro2.peso = 75;
		perro2.imprimirPorConsola();
		
//		imprimirPorConsula (perro1);
//		imprimirPorConsula (perro2);
 
	}

//	private static void imprimirPorConsula(Perro perro) {
//		System.out.println();
//		System.out.println("nombre = " + perro.nombre);
//		System.out.println("color = " + perro.color);
//		System.out.println("peso = " + perro.peso);
//	}

}