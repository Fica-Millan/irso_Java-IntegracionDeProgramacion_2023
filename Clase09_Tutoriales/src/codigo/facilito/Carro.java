package codigo.facilito;

public class Carro {
	// variables nativas
	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	boolean encendido=false;
	String modelo;
	
	//constructores
	public Carro() {
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 4;
	}
	
	//metodos
	public double obtenerPeso( ) {
		return this.peso;
	}
	
	public void encender() {
		this.encendido = true;
		System.out.println("El carro esta encendido");
	}
	
	public void apagar() {
		this.encendido = false;
		System.out.println("El carro esta apagado");
	}
	
	public void estado() {
		if (this.encendido == true)
			System.out.println("EL carro esta encendido");
		else
			System.out.println("El carro esta apagado");
	}	
}
