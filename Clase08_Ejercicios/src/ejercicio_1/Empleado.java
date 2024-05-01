package ejercicio_1;

public class Empleado {
	private String nombre;
	private int legajo;
	private int dependenciaDeTrabajo; 
	private double horasTrabajadas;
	
	public Empleado (String nombre, int legajo, int dependenciaDeTrabajo, double horasTrabajadas) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.dependenciaDeTrabajo = dependenciaDeTrabajo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public void imprimirInformacion () {
		System.out.println("El nombre del empleado es: " + nombre);
		System.out.println("Numero de legajo: " + legajo);
		System.out.println("Dependencia donde trabaja: " + dependenciaDeTrabajo);
		System.out.println("Cantidad de horas trabajadas: " + horasTrabajadas);
	}
}
