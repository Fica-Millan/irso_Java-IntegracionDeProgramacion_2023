package com.edu4java.tutorial11;

public class Perro {
	 // Varable de objeto
	String nombre;
	String color;
	double peso;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void imprimirPorConsola() {
		System.out.println();
		System.out.println("nombre = " + this.nombre);
		System.out.println("color = " + this.color);
		System.out.println("peso = " + this.peso);
	}	
}