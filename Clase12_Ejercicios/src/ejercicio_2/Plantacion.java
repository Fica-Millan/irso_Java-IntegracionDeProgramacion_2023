package ejercicio_2;

public class Plantacion { //atributos de la clase plantacion 
	private int ancho;
    private int largo;
    private String tipo;

    public Plantacion(int ancho, int largo, String tipo) { //Constructor de la clase para inicializar los atributos
        this.ancho = ancho;
        this.largo = largo;
        this.tipo = tipo;
    }

    public void imprimirResumen() { // metodo para imprimir el resumen de lo plantado
        System.out.println("Resumen de la plantacion:\n");
        System.out.println("Ancho: " + ancho + " metros");
        System.out.println("Largo: " + largo + " metros");
        System.out.println("Tipo de cereal: " + tipo);
    }
}
