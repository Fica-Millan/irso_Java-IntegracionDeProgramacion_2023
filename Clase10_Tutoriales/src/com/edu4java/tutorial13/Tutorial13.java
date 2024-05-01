package com.edu4java.tutorial13;

public class Tutorial13 {
	public static void main(String[] args) {
		Perro2[] perros = ingresarPerros();
		mostrarPerrosPorConsola (perros);
		darlesDeComer(perros);
		System.out.println("Despues de comer ------------------------");
		mostrarPerrosPorConsola(perros);
	}
	
	private static void darlesDeComer(Perro2[] perros) {
		for (int i=0; i<perros.length; i++) {
			double pesoAntesDeComer = perros[i].getPeso();
			perros[i].setPeso(pesoAntesDeComer+ perros[i].getRacion());
		}
	}

	private static void mostrarPerrosPorConsola (Perro2[] perros) {
		for (int i=0; i<perros.length; i++) {
			perros[i].imprimirPorConsola();
		}
	}
	
	private static Perro2[] ingresarPerros() {
		Perro2[] perros = new Perro2[4];
		
		String[] nombres = { "Coco", "Sultan", "Boby", "Drak"};
		String[] colores = { "marron", "negro", "blanco", "negro"};
		double[] pesos = { 1.5, 75, 3.5, 45.1};
		double[] raciones = { 0.2, 1, 0.2, 0.8};
		
		for (int i=0; i<perros.length; i++) {
			Perro2 perro = new Perro2();
			perro.setNombre(nombres[i]);
			perro.setColor(colores[i]);
			perro.setPeso(pesos[i]);
			perro.setRacion(raciones[i]);
			perros[i]=perro;
		}
		return perros;
	}
}
