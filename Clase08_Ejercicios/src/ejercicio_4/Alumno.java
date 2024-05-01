package ejercicio_4;

public class Alumno {
	private String nombre;
	public int nota;
	
	public Alumno (String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public void imprimirAlumno () {
		System.out.print("Alumno: " + nombre + " - Nota: " + nota);	
	}
}
